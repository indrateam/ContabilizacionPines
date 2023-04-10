package com.osi.colsanitas.business.fachada;

import java.math.BigDecimal;

public class GenerarFacturaDto {

	private Integer codigoCompania;
    private Integer codigoPlan;
    private Long numContrato;
    private Integer numeroFamilia;
    private String categoria;
    private ConceptoDto[] listDetalleConcepto;
    private String codIdPagador;
    private String tipoIdPagador;
    private String numeroIdPagador;
    private String nombresPagador;
    private String apellidosPagador;
    private String telefonoPagador;
    private Integer estacion;
    private Integer ciudadVenta;
    private String numeroTransaccion;
    private BigDecimal valorTotal;
    private MedioPagoDto mediosPago;
    
	public Integer getCodigoCompania() {
		return codigoCompania;
	}
	public void setCodigoCompania(Integer codigoCompania) {
		this.codigoCompania = codigoCompania;
	}
	public Integer getCodigoPlan() {
		return codigoPlan;
	}
	public void setCodigoPlan(Integer codigoPlan) {
		this.codigoPlan = codigoPlan;
	}
	public Long getNumContrato() {
		return numContrato;
	}
	public void setNumContrato(Long numContrato) {
		this.numContrato = numContrato;
	}
	public Integer getNumeroFamilia() {
		return numeroFamilia;
	}
	public void setNumeroFamilia(Integer numeroFamilia) {
		this.numeroFamilia = numeroFamilia;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getCodIdPagador() {
		return codIdPagador;
	}
	public void setCodIdPagador(String codIdPagador) {
		this.codIdPagador = codIdPagador;
	}
	public String getTipoIdPagador() {
		return tipoIdPagador;
	}
	public void setTipoIdPagador(String tipoIdPagador) {
		this.tipoIdPagador = tipoIdPagador;
	}
	public String getNumeroIdPagador() {
		return numeroIdPagador;
	}
	public void setNumeroIdPagador(String numeroIdPagador) {
		this.numeroIdPagador = numeroIdPagador;
	}
	public String getNombresPagador() {
		return nombresPagador;
	}
	public void setNombresPagador(String nombresPagador) {
		this.nombresPagador = nombresPagador;
	}
	public String getApellidosPagador() {
		return apellidosPagador;
	}
	public void setApellidosPagador(String apellidosPagador) {
		this.apellidosPagador = apellidosPagador;
	}
	public String getTelefonoPagador() {
		return telefonoPagador;
	}
	public void setTelefonoPagador(String telefonoPagador) {
		this.telefonoPagador = telefonoPagador;
	}
	public Integer getEstacion() {
		return estacion;
	}
	public void setEstacion(Integer estacion) {
		this.estacion = estacion;
	}
	public Integer getCiudadVenta() {
		return ciudadVenta;
	}
	public void setCiudadVenta(Integer ciudadVenta) {
		this.ciudadVenta = ciudadVenta;
	}
	public String getNumeroTransaccion() {
		return numeroTransaccion;
	}
	public void setNumeroTransaccion(String numeroTransaccion) {
		this.numeroTransaccion = numeroTransaccion;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	public MedioPagoDto getMediosPago() {
		return mediosPago;
	}
	public void setMediosPago(MedioPagoDto mediosPago) {
		this.mediosPago = mediosPago;
	}
	public ConceptoDto[] getListDetalleConcepto() {
		return listDetalleConcepto;
	}
	public void setListDetalleConcepto(ConceptoDto[] listDetalleConcepto) {
		this.listDetalleConcepto = listDetalleConcepto;
	}
}
