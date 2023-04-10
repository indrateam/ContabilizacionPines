package com.osi.colsanitas.persistent.storeProcedures;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.osi.colsanitas.business.fachada.ContabilizacionPinesException;
import com.osi.colsanitas.business.fachada.GenerarDocumentoEquivEntDto;

/**
 * Procedimiento almacenado de ConsultarDocumentoEquivalente en Java usando Spring
 * @author Amonastoque
 * 
 */
public class ConsultarDocEquivSP extends StoredProcedure {
    /**
     * Logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(ConsultarDocEquivSP.class);

    private static final float FACTOR_CENTIMETROS = 28.3464566929f;
    public static final String PROC_CONSULTAR_DOC_EQUIV = "PIN_PG_GESTION_DOC_EQUIVALENTE.pr_consultar_doc_equivalente";
    private static final Font FUENTE_NORMAL = FontFactory.getFont(FontFactory.COURIER, 11);

    public ConsultarDocEquivSP(final DataSource ds) {
        super(ds, PROC_CONSULTAR_DOC_EQUIV);

        // Declaramos los parametros del procedimiento
        // parametros de entrada
        declareParameter(new SqlParameter("codigo_compania", Types.INTEGER));
        declareParameter(new SqlParameter("estacion", Types.INTEGER));
        declareParameter(new SqlParameter("numero_transaccion", Types.VARCHAR));
        // parametros de salida
        declareParameter(new SqlOutParameter("err_code", Types.VARCHAR));
        declareParameter(new SqlOutParameter("err_msg", Types.VARCHAR));
        declareParameter(new SqlOutParameter("TIRA_AUD_OUT", Types.VARCHAR));
        declareParameter(new SqlOutParameter("ruta_archivo", Types.VARCHAR));
        declareParameter(new SqlOutParameter("url_tira_auditora", Types.VARCHAR));
        declareParameter(new SqlOutParameter("anulada", Types.VARCHAR));
        compile();
    }

    public String execute(final GenerarDocumentoEquivEntDto ent) {

        final Map<String, Object> paramsEntrada = new HashMap<String, Object>();

        paramsEntrada.put("codigo_compania", ent.getCodigoCompania());
        paramsEntrada.put("estacion", ent.getEstacion());
        paramsEntrada.put("numero_transaccion", ent.getNumeroTransaccion());

        final Map<String, Object> resultado = super.execute(paramsEntrada);
        final String codigo = (String) resultado.get("err_code");
        final String descripcion = (String) resultado.get("err_msg");
        if (StringUtils.isNotEmpty(descripcion)) {
            throw new ContabilizacionPinesException(codigo, descripcion);
        }

        final boolean anulada = StringUtils.equals((String) resultado.get("anulada"), "1");
        escribir((String) resultado.get("ruta_archivo"), (String) resultado.get("TIRA_AUD_OUT"),
                anulada);

        return (String) resultado.get("url_tira_auditora");
    }

    private Image leerImagenDesdeClassPath(final String path) throws IOException,
            BadElementException {
        final ClassPathResource resource = new ClassPathResource(path);
        final byte[] bytes = IOUtils.toByteArray(resource.getInputStream());
        return Image.getInstance(bytes);
    }

    private float posCm(final float centimetros) {
        return centimetros * FACTOR_CENTIMETROS;
    }

    private void agregarImagen(final Document document, final String path, final float posX,
            final float posY, final float scalePercent) throws IOException, DocumentException {
        final Image image = leerImagenDesdeClassPath(path);
        image.setAbsolutePosition(posCm(posX), posCm(posY));
        if (scalePercent > 0) {
            image.scalePercent(scalePercent);
        }
        document.add(image);
    }

    private void escribir(final String ruta, final String contenido, final boolean anulada) {
        OutputStream stream = null;
        try {
            final File fileBase = new File(ruta);
            if (!fileBase.exists()) {
                fileBase.createNewFile();
            }
            stream = new FileOutputStream(fileBase);

            final Document document = new Document();
            PdfWriter.getInstance(document, stream);

            document.open();
            if (anulada) {
                agregarImagen(document, "/images/marca-agua-anulada.png", 1.2f, 17.0f, 0);
            }
            document.add(new Paragraph(contenido, FUENTE_NORMAL));

            document.close();

        } catch (final FileNotFoundException e) {
            LOGGER.error("No fue posible escribir en " + ruta, e);
            throw new ContabilizacionPinesException(
                    "No es posible generar el documento en el servidor", e);
        } catch (final DocumentException e) {
            LOGGER.error("No fue posible escribir en " + ruta, e);
            throw new ContabilizacionPinesException(
                    "No es posible generar el documento en el servidor", e);
        } catch (final IOException e) {
            LOGGER.error("No fue posible escribir en " + ruta, e);
            throw new ContabilizacionPinesException(
                    "No es posible generar el documento en el servidor", e);
        } finally {
            IOUtils.closeQuietly(stream);
        }

    }
}
