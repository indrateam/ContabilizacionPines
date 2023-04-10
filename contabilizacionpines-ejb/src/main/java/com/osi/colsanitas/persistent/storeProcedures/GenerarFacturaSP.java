package com.osi.colsanitas.persistent.storeProcedures;

import java.math.BigDecimal;
import java.sql.Types;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.jdbc.support.nativejdbc.SimpleNativeJdbcExtractor;

import com.osi.colsanitas.business.fachada.ContabilizacionPinesException;
import com.osi.colsanitas.business.fachada.GenerarFacturaDto;
import com.osi.colsanitas.business.fachada.OracleSqlArray;
import com.osi.colsanitas.business.fachada.RespuestaGenerarFacturaDto;

public class GenerarFacturaSP extends StoredProcedure {
	
	private final static String PROCEDURE_NAME = "PIN_PG_GESTION_DOC_EQUIVALENTE.pr_generar_factura";
	
	private final String codigo_compania  		= "codigo_compania";
	private final String codigo_plan      		= "codigo_plan";
	private final String numero_contrato  		= "numero_contrato";
	private final String numero_familia   		= "numero_familia";
	private final String categoria        		= "categoria";
	private final String detalle_concepto        = "detalle_concepto";
	private final String cod_id_pagador          = "cod_id_pagador";
	private final String tipo_id_pagador         = "tipo_id_pagador";
	private final String nro_id_pagador          = "nro_id_pagador";
	private final String nombres_pagador         = "nombres_pagador";
	private final String apellidos_pagador       = "apellidos_pagador";
	private final String telefono_pagador        = "telefono_pagador";
	private final String estacion_in             = "estacion_in";
	private final String ciudad_venta            = "ciudad_venta";
	private final String numero_transaccion_ref  = "numero_transaccion_ref";
	private final String valor_total_transaccion = "valor_total_transaccion";
	private final String medios_pago             = "medios_pago";
	private final String err_code                = "err_code";
	private final String err_msg                 = "err_msg";
	private final String numero_transaccion      = "numero_transaccion";
	private final String numero_factura          = "numero_factura";          
	
	public GenerarFacturaSP(final DataSource ds) {
//		super(ds, PROCEDURE_NAME);
		super.setDataSource(ds);
		SimpleNativeJdbcExtractor nje = new SimpleNativeJdbcExtractor();
		nje.setNativeConnectionNecessaryForNativeCallableStatements(true);
		nje.setNativeConnectionNecessaryForNativePreparedStatements(true);
		nje.setNativeConnectionNecessaryForNativeStatements(true);
		JdbcTemplate jt = new JdbcTemplate(ds);
		jt.setNativeJdbcExtractor(nje);
		super.setJdbcTemplate(jt);
		super.setSql(PROCEDURE_NAME);
		
		
		declareParameter(new SqlParameter(codigo_compania, Types.NUMERIC));
		declareParameter(new SqlParameter(codigo_plan, Types.NUMERIC));
		declareParameter(new SqlParameter(numero_contrato, Types.NUMERIC));
		declareParameter(new SqlParameter(numero_familia, Types.NUMERIC));
		declareParameter(new SqlParameter(categoria, Types.VARCHAR));
		declareParameter(new SqlParameter(detalle_concepto, Types.ARRAY, "TAB_CONCEPTOS"));
		declareParameter(new SqlParameter(cod_id_pagador, Types.VARCHAR));
		declareParameter(new SqlParameter(tipo_id_pagador, Types.VARCHAR));
		declareParameter(new SqlParameter(nro_id_pagador, Types.VARCHAR));
		declareParameter(new SqlParameter(nombres_pagador, Types.VARCHAR));
		declareParameter(new SqlParameter(apellidos_pagador, Types.VARCHAR));
		declareParameter(new SqlParameter(telefono_pagador, Types.VARCHAR));
		declareParameter(new SqlParameter(estacion_in, Types.NUMERIC));
		declareParameter(new SqlParameter(ciudad_venta, Types.NUMERIC));
		declareParameter(new SqlParameter(numero_transaccion_ref, Types.VARCHAR));
		declareParameter(new SqlParameter(valor_total_transaccion, Types.NUMERIC));
		declareParameter(new SqlParameter(medios_pago, Types.VARCHAR));
		declareParameter(new SqlOutParameter(err_code, Types.VARCHAR));
		declareParameter(new SqlOutParameter(err_msg, Types.VARCHAR));
		declareParameter(new SqlOutParameter(numero_transaccion, Types.VARCHAR));
		declareParameter(new SqlOutParameter(numero_factura, Types.NUMERIC));
		compile();
	}
	
	public RespuestaGenerarFacturaDto execute(final GenerarFacturaDto ent){
		final Map<String, Object> paramsEntrada = new HashMap<String, Object>();
		paramsEntrada.put(codigo_compania, ent.getCodigoCompania());
		paramsEntrada.put(codigo_plan, ent.getCodigoPlan());
		paramsEntrada.put(numero_contrato, ent.getNumContrato());
		paramsEntrada.put(numero_familia, ent.getNumeroFamilia());
		paramsEntrada.put(categoria, ent.getCategoria());
		paramsEntrada.put(detalle_concepto, new OracleSqlArray(Arrays.asList(ent.getListDetalleConcepto())));
		paramsEntrada.put(cod_id_pagador, ent.getCodIdPagador());
		paramsEntrada.put(tipo_id_pagador, ent.getTipoIdPagador());
		paramsEntrada.put(nro_id_pagador, ent.getNumeroIdPagador());
		paramsEntrada.put(nombres_pagador, ent.getNombresPagador());
		paramsEntrada.put(apellidos_pagador, ent.getApellidosPagador());
		paramsEntrada.put(telefono_pagador, ent.getTelefonoPagador());
		paramsEntrada.put(estacion_in, ent.getEstacion());
		paramsEntrada.put(ciudad_venta, ent.getCiudadVenta());
		paramsEntrada.put(numero_transaccion_ref, ent.getNumeroTransaccion());
		paramsEntrada.put(valor_total_transaccion, ent.getValorTotal());
		if(ent.getMediosPago() != null){
			StringBuilder sb = new StringBuilder();
			if(ent.getMediosPago().getCodigo() != null){
				sb.append(ent.getMediosPago().getCodigo());
			}if(ent.getMediosPago().getValor()!=null){
				sb.append(",").append(ent.getMediosPago().getValor());
			}if(ent.getMediosPago().getCodigoEntFinanciera()!=null){
				sb.append(",").append(ent.getMediosPago().getCodigoEntFinanciera());
			}if(!StringUtils.isEmpty(ent.getMediosPago().getNumeroTarjeta())){
				sb.append(",").append(ent.getMediosPago().getNumeroTarjeta());
			}if(!StringUtils.isEmpty(ent.getMediosPago().getTipoMedio())){
				sb.append(",").append(ent.getMediosPago().getTipoMedio());
			}
			paramsEntrada.put(medios_pago, sb.toString());
		}
		final Map<String, Object> resultado = super.execute(paramsEntrada);
        final String codigo = (String) resultado.get(err_code);
        final String descripcion = (String) resultado.get(err_msg);
        if (StringUtils.isNotEmpty(descripcion)) {
            throw new ContabilizacionPinesException(codigo, descripcion);
        }
        final RespuestaGenerarFacturaDto respuesta = new RespuestaGenerarFacturaDto();
        respuesta.setNumeroTransaccion((String) resultado.get(numero_transaccion));
        respuesta.setNumeroFactura(((BigDecimal)resultado.get(numero_factura)).longValue());
        return respuesta;
	}
}
