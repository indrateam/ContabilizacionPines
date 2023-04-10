package com.osi.colsanitas.persistent.storeProcedures;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

import com.osi.colsanitas.business.fachada.ContabilizacionPinesException;
import com.osi.colsanitas.business.fachada.GenerarDocumentoEquivEntDto;
import com.osi.colsanitas.business.fachada.RespuestaAnulacionDto;

/**
 * Procedimiento almacenado de AnularDocumentoEquivalente en Java usando Spring
 * @author Amonastoque
 * 
 */

public class AnularDocEquivSP extends StoredProcedure {

    public static final String PROC_ANULAR_DOC_EQUIV = "PIN_PG_GESTION_DOC_EQUIVALENTE.pr_anular_doc_equivalente";

    public AnularDocEquivSP(final DataSource ds) {
        super(ds, PROC_ANULAR_DOC_EQUIV);

        // Declaramos los parametros del procedimiento
        // parametros de entrada
        declareParameter(new SqlParameter("codigo_compania", Types.INTEGER));
        declareParameter(new SqlParameter("estacion", Types.INTEGER));
        declareParameter(new SqlParameter("numero_transaccion", Types.VARCHAR));
        // parametros de salida
        declareParameter(new SqlOutParameter("err_code", Types.VARCHAR));
        declareParameter(new SqlOutParameter("err_msg", Types.VARCHAR));
        declareParameter(new SqlOutParameter("transaccion_anulada", Types.VARCHAR));
        declareParameter(new SqlOutParameter("transaccion_anuladora", Types.VARCHAR));
        compile();
    }

    public RespuestaAnulacionDto execute(final GenerarDocumentoEquivEntDto ent) {

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

        final RespuestaAnulacionDto resp = new RespuestaAnulacionDto();
        resp.setTransaccionAnulada((String) resultado.get("transaccion_anulada"));
        resp.setTransaccionAnuladora((String) resultado.get("transaccion_anuladora"));

        return resp;
    }
}
