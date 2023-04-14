package com.osi.colsanitas.persistent.storeProcedures;

import java.math.BigDecimal;
import java.sql.Types;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

import com.osi.colsanitas.business.fachada.ContabilizacionPinesException;
import com.osi.colsanitas.business.fachada.GenerarDocumentoEquivEntDto;
import com.osi.colsanitas.business.fachada.MedioPagoDto;

/**
 * Procedimiento almacenado de GenerarDocumentoEquivalente en Java usando Spring
 * @author Amonastoque
 * 
 */
public class GenerarDocEquivSP extends StoredProcedure {

    public static final String PROC_GENERAR_DOC_EQUIV = "PIN_PG_GESTION_DOC_EQUIVALENTE.pr_generar_doc_equivalente";

    public GenerarDocEquivSP(final DataSource ds) {
        super(ds, PROC_GENERAR_DOC_EQUIV);

        // Declaramos los parametros del procedimiento
        // parametros de entrada
        declareParameter(new SqlParameter("codigo_compania", Types.INTEGER));
        declareParameter(new SqlParameter("codigo_plan", Types.INTEGER));
        declareParameter(new SqlParameter("numero_contrato", Types.BIGINT));
        declareParameter(new SqlParameter("numero_familia", Types.INTEGER));
        declareParameter(new SqlParameter("categoria", Types.VARCHAR));
        declareParameter(new SqlParameter("codigo_concepto", Types.INTEGER));
        declareParameter(new SqlParameter("estacion", Types.INTEGER));
        declareParameter(new SqlParameter("ciudad_venta", Types.INTEGER));
        declareParameter(new SqlParameter("codigo_canal", Types.VARCHAR));
        declareParameter(new SqlParameter("numero_transaccion_ref", Types.VARCHAR));
        declareParameter(new SqlParameter("valor_total_transaccion", Types.DECIMAL));
        declareParameter(new SqlParameter("valor_total_IVA", Types.DECIMAL));
        declareParameter(new SqlParameter("valor_descuento", Types.DECIMAL));
        declareParameter(new SqlParameter("valor_total_pines", Types.DECIMAL));
        declareParameter(new SqlParameter("valor_total_IVA_pines", Types.DECIMAL));
        declareParameter(new SqlParameter("pines", Types.VARCHAR));
        declareParameter(new SqlParameter("valor_total_medios_pago", Types.DECIMAL));
        declareParameter(new SqlParameter("medios_pago", Types.VARCHAR));
        //AQUI SE DECLARA EL EMAIL FACTURACION
        declareParameter(new SqlParameter("email",Types.VARCHAR));
        // parametros de salida
        declareParameter(new SqlOutParameter("err_code", Types.VARCHAR));
        declareParameter(new SqlOutParameter("err_msg", Types.VARCHAR));
        declareParameter(new SqlOutParameter("numero_transaccion", Types.VARCHAR));

        compile();
    }

    public String execute(final GenerarDocumentoEquivEntDto ent) {

        final Map<String, Object> paramsEntrada = new HashMap<String, Object>();

        paramsEntrada.put("codigo_compania", ent.getCodigoCompania());
        paramsEntrada.put("codigo_plan", ent.getCodigoPlan());
        paramsEntrada.put("numero_contrato", ent.getNumContrato());
        paramsEntrada.put("numero_familia", ent.getNumeroFamilia());
        paramsEntrada.put("categoria", ent.getCategoria());
        paramsEntrada.put("codigo_concepto", ent.getCodigoConcepto());
        paramsEntrada.put("estacion", ent.getEstacion());
        paramsEntrada.put("ciudad_venta", ent.getCiudadVenta());
        paramsEntrada.put("codigo_canal", ent.getTipoCanal());
        paramsEntrada.put("numero_transaccion_ref", ent.getNumeroTransaccion());
        paramsEntrada.put("valor_total_transaccion", ent.getValorTotal());
        paramsEntrada.put("valor_total_IVA", ent.getValorImpuesto());
        paramsEntrada.put("valor_descuento", ent.getValorDescuento());

        BigDecimal totalPines = BigDecimal.ZERO;
        BigDecimal totalImpuestoPines = BigDecimal.ZERO;
        final StringBuilder pines = new StringBuilder();
        for (final PinDto pin : ent.getPines()) {
            totalPines = totalPines.add(pin.getValorTotal());
            totalImpuestoPines = totalImpuestoPines.add(pin.getValorImpuesto());
            pines.append(pin.getNumeroPin());
            pines.append(",");
        }

        if (pines.length() > 0) {
            paramsEntrada.put("valor_total_pines", totalPines);
            paramsEntrada.put("valor_total_IVA_pines", totalImpuestoPines);
            pines.setLength(pines.length() - 1);
            paramsEntrada.put("pines", pines.toString());
        } else {
            paramsEntrada.put("valor_total_pines", null);
            paramsEntrada.put("valor_total_IVA_pines", null);
            paramsEntrada.put("pines", null);
        }

        BigDecimal totalMediosPago = BigDecimal.ZERO;
        final StringBuilder mediosPago = new StringBuilder();
        final List<MedioPagoDto> listaMediosPago = ent.getMediosPago();
        Collections.sort(listaMediosPago, new Comparator<MedioPagoDto>() {
            @Override
            public int compare(final MedioPagoDto arg0, final MedioPagoDto arg1) {
                return ObjectUtils.compare(arg0.getCodigo(), arg1.getCodigo());
            }
        });
        for (final MedioPagoDto reg : listaMediosPago) {
            totalMediosPago = totalMediosPago.add(reg.getValor());
            mediosPago.append(reg.getCodigo());
            mediosPago.append(",");
            mediosPago.append(reg.getValor());
            mediosPago.append(",");
            if (reg.getCodigoEntFinanciera() != null) {
                mediosPago.append(reg.getCodigoEntFinanciera());
            }
            mediosPago.append(",");
            mediosPago.append(reg.getNumeroTarjeta());
            mediosPago.append(",");
            mediosPago.append(reg.getTipoMedio());
            mediosPago.append(",");
            mediosPago.append(reg.getValorImpuesto());
            mediosPago.append(",");
            mediosPago.append(reg.getNumeroAprobacion());
            mediosPago.append(";");
        }

        if (mediosPago.length() > 0) {
            mediosPago.setLength(mediosPago.length() - 1);
            paramsEntrada.put("valor_total_medios_pago", totalMediosPago);
            paramsEntrada.put("medios_pago", mediosPago.toString());
        } else {
            paramsEntrada.put("valor_total_medios_pago", null);
            paramsEntrada.put("medios_pago", null);
        }
        //AQUI SE SETEA EL VALOR DEL CORREO
        	paramsEntrada.put("email", ent.getEmailFacturacion());
        final Map<String, Object> resultado = super.execute(paramsEntrada);
        final String codigo = (String) resultado.get("err_code");
        final String descripcion = (String) resultado.get("err_msg");
        if (StringUtils.isNotEmpty(descripcion)) {
            throw new ContabilizacionPinesException(codigo, descripcion);
        }

        return String.valueOf(resultado.get("numero_transaccion"));
    }
}
