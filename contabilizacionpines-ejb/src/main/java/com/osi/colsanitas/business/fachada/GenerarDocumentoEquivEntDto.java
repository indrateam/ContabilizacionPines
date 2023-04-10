package com.osi.colsanitas.business.fachada;

import java.math.BigDecimal;
import java.util.List;

import com.osi.colsanitas.persistent.storeProcedures.PinDto;

public class GenerarDocumentoEquivEntDto extends DtoBase {
    /**
     * 
     */
    private static final long serialVersionUID = 1328028791476793972L;
    private Integer codigoCompania;
    private Integer codigoPlan;
    private Long numContrato;
    private Integer numeroFamilia;
    private String categoria;
    private Integer codigoConcepto;
    private Integer estacion;
    private Integer ciudadVenta;
    private String numeroTransaccion;
    private BigDecimal valorTotal;
    private BigDecimal valorDescuento;
    private BigDecimal valorImpuesto;

    private List<MedioPagoDto> mediosPago;
    private List<PinDto> pines;

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
     * @return el valor de la propiedad codigoPlan
     */
    public final Integer getCodigoPlan() {
        return codigoPlan;
    }

    /**
     * @param codigoPlan el valor de la propiedad codigoPlan a establecer
     */
    public final void setCodigoPlan(final Integer codigoPlan) {
        this.codigoPlan = codigoPlan;
    }

    /**
     * @return el valor de la propiedad numContrato
     */
    public final Long getNumContrato() {
        return numContrato;
    }

    /**
     * @param numContrato el valor de la propiedad numContrato a establecer
     */
    public final void setNumContrato(final Long numContrato) {
        this.numContrato = numContrato;
    }

    /**
     * @return el valor de la propiedad numeroFamilia
     */
    public final Integer getNumeroFamilia() {
        return numeroFamilia;
    }

    /**
     * @param numeroFamilia el valor de la propiedad numeroFamilia a establecer
     */
    public final void setNumeroFamilia(final Integer numeroFamilia) {
        this.numeroFamilia = numeroFamilia;
    }

    /**
     * @return el valor de la propiedad categoria
     */
    public final String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria el valor de la propiedad categoria a establecer
     */
    public final void setCategoria(final String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return el valor de la propiedad codigoConcepto
     */
    public final Integer getCodigoConcepto() {
        return codigoConcepto;
    }

    /**
     * @param codigoConcepto el valor de la propiedad codigoConcepto a establecer
     */
    public final void setCodigoConcepto(final Integer codigoConcepto) {
        this.codigoConcepto = codigoConcepto;
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
     * @return el valor de la propiedad ciudadVenta
     */
    public final Integer getCiudadVenta() {
        return ciudadVenta;
    }

    /**
     * @param ciudadVenta el valor de la propiedad ciudadVenta a establecer
     */
    public final void setCiudadVenta(final Integer ciudadVenta) {
        this.ciudadVenta = ciudadVenta;
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

    /**
     * @return el valor de la propiedad valorTotal
     */
    public final BigDecimal getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal el valor de la propiedad valorTotal a establecer
     */
    public final void setValorTotal(final BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return el valor de la propiedad valorDescuento
     */
    public final BigDecimal getValorDescuento() {
        return valorDescuento;
    }

    /**
     * @param valorDescuento el valor de la propiedad valorDescuento a establecer
     */
    public final void setValorDescuento(final BigDecimal valorDescuento) {
        this.valorDescuento = valorDescuento;
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

    /**
     * @return el valor de la propiedad mediosPago
     */
    public final List<MedioPagoDto> getMediosPago() {
        return mediosPago;
    }

    /**
     * @param mediosPago el valor de la propiedad mediosPago a establecer
     */
    public final void setMediosPago(final List<MedioPagoDto> mediosPago) {
        this.mediosPago = mediosPago;
    }

    /**
     * @return el valor de la propiedad pines
     */
    public final List<PinDto> getPines() {
        return pines;
    }

    /**
     * @param pines el valor de la propiedad pines a establecer
     */
    public final void setPines(final List<PinDto> pines) {
        this.pines = pines;
    }

}
