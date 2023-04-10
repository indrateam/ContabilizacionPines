package com.osi.colsanitas.business.fachada;


public class RespuestaGenerarFacturaDto {
	
	private String numeroTransaccion;
    private Long numeroFactura;
    
	public String getNumeroTransaccion() {
		return numeroTransaccion;
	}
	public void setNumeroTransaccion(String numeroTransaccion) {
		this.numeroTransaccion = numeroTransaccion;
	}
	public Long getNumeroFactura() {
		return numeroFactura;
	}
	public void setNumeroFactura(Long numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

}
