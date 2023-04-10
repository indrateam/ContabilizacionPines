package com.osi.colsanitas.business.fachada;

import java.sql.SQLData;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;

public class ConceptoDto implements SQLData{

	private Long cod_concepto;
	private String descrip_concepto;    
	private Long vlr_unit_concepto;     
	private Long vlr_iva_concepto;      
	private Long vlr_descuento_concepto;
	private Long cantidad;
	
	public Long getCod_concepto() {
		return cod_concepto;
	}
	public void setCod_concepto(Long cod_concepto) {
		this.cod_concepto = cod_concepto;
	}
	public String getDescrip_concepto() {
		return descrip_concepto;
	}
	public void setDescrip_concepto(String descrip_concepto) {
		this.descrip_concepto = descrip_concepto;
	}
	public Long getVlr_unit_concepto() {
		return vlr_unit_concepto;
	}
	public void setVlr_unit_concepto(Long vlr_unit_concepto) {
		this.vlr_unit_concepto = vlr_unit_concepto;
	}
	public Long getVlr_iva_concepto() {
		return vlr_iva_concepto;
	}
	public void setVlr_iva_concepto(Long vlr_iva_concepto) {
		this.vlr_iva_concepto = vlr_iva_concepto;
	}
	public Long getVlr_descuento_concepto() {
		return vlr_descuento_concepto;
	}
	public void setVlr_descuento_concepto(Long vlr_descuento_concepto) {
		this.vlr_descuento_concepto = vlr_descuento_concepto;
	}
	public Long getCantidad() {
		return cantidad;
	}
	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String getSQLTypeName() throws SQLException {
		return "TREG_CONCEPTOS";
	}
	@Override
	public void readSQL(SQLInput stream, String typeName) throws SQLException {
		setCod_concepto(Long.valueOf(stream.readLong()));
		setDescrip_concepto(stream.readString());
		setVlr_unit_concepto(Long.valueOf(stream.readLong()));
		setVlr_iva_concepto(Long.valueOf(stream.readLong()));
		setVlr_descuento_concepto(Long.valueOf(stream.readLong()));
		setCantidad(Long.valueOf(stream.readLong()));
		
	}
	@Override
	public void writeSQL(SQLOutput stream) throws SQLException {
		stream.writeLong(getCod_concepto());
		stream.writeString(getDescrip_concepto());
		stream.writeLong(getVlr_unit_concepto());
		stream.writeLong(getVlr_iva_concepto());
		stream.writeLong(getVlr_descuento_concepto());
		stream.writeLong(getCantidad());
	}              
	
}
