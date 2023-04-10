package com.osi.colsanitas.business.fachada;

import java.math.BigDecimal;

public class MedioPagoDto {
    private Integer codigo;
    private String tipoMedio;
    private Integer codigoEntFinanciera;
    private String numeroTarjeta;
    private String numeroAprobacion;
    private BigDecimal valor;
    private BigDecimal valorImpuesto;

    /**
     * @return el valor de la propiedad codigo
     */
    public final Integer getCodigo() {
        return codigo;
    }

    /**
     * @param codigo el valor de la propiedad codigo a establecer
     */
    public final void setCodigo(final Integer codigo) {
        this.codigo = codigo;
    }

    /**
     * @return el valor de la propiedad tipoMedio
     */
    public final String getTipoMedio() {
        return tipoMedio;
    }

    /**
     * @param tipoMedio el valor de la propiedad tipoMedio a establecer
     */
    public final void setTipoMedio(final String tipoMedio) {
        this.tipoMedio = tipoMedio;
    }

    /**
     * @return el valor de la propiedad codigoEntFinanciera
     */
    public final Integer getCodigoEntFinanciera() {
        return codigoEntFinanciera;
    }

    /**
     * @param codigoEntFinanciera el valor de la propiedad codigoEntFinanciera a establecer
     */
    public final void setCodigoEntFinanciera(final Integer codigoEntFinanciera) {
        this.codigoEntFinanciera = codigoEntFinanciera;
    }

    /**
     * @return el valor de la propiedad numeroTarjeta
     */
    public final String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * @param numeroTarjeta el valor de la propiedad numeroTarjeta a establecer
     */
    public final void setNumeroTarjeta(final String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    /**
     * @return el valor de la propiedad numeroAprobacion
     */
    public final String getNumeroAprobacion() {
        return numeroAprobacion;
    }

    /**
     * @param numeroAprobacion el valor de la propiedad numeroAprobacion a establecer
     */
    public final void setNumeroAprobacion(final String numeroAprobacion) {
        this.numeroAprobacion = numeroAprobacion;
    }

    /**
     * @return el valor de la propiedad valor
     */
    public final BigDecimal getValor() {
        return valor;
    }

    /**
     * @param valor el valor de la propiedad valor a establecer
     */
    public final void setValor(final BigDecimal valor) {
        this.valor = valor;
    }

    /**
     * @return el valor de la propiedad valorImpuesto
     */
    public final BigDecimal getValorImpuesto() {
        return valorImpuesto;
    }

    /**
     * @param valorImpuesto el valor de la propiedad valorImpuesto a establecer
     */
    public final void setValorImpuesto(final BigDecimal valorImpuesto) {
        this.valorImpuesto = valorImpuesto;
    }

}
