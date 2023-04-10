package com.osi.colsanitas.business.fachada;


public class DocumentoEquivalenteDto {
    private Integer codigoCompania;
    private Integer estacion;
    private String numeroTransaccion;

    /**
     * @return el valor de la propiedad codigoCompania
     */
    public final Integer getCodigoCompania() {
        return codigoCompania;
    }

    /**
     * @param codigoCompania el valor de la propiedad codigoCompania a establecer
     */
    public final void setCodigoCompania(final Integer codigoCompania) {
        this.codigoCompania = codigoCompania;
    }

    /**
     * @return el valor de la propiedad estacion
     */
    public final Integer getEstacion() {
        return estacion;
    }

    /**
     * @param estacion el valor de la propiedad estacion a establecer
     */
    public final void setEstacion(final Integer estacion) {
        this.estacion = estacion;
    }

    /**
     * @return el valor de la propiedad numeroTransaccion
     */
    public final String getNumeroTransaccion() {
        return numeroTransaccion;
    }

    /**
     * @param numeroTransaccion el valor de la propiedad numeroTransaccion a establecer
     */
    public final void setNumeroTransaccion(final String numeroTransaccion) {
        this.numeroTransaccion = numeroTransaccion;
    }

}
