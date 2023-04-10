package com.osi.colsanitas.persistent.storeProcedures;

import java.math.BigDecimal;

public class PinDto {
    private Integer numeroPin;
    private BigDecimal valorTotal;
    private BigDecimal valorImpuesto;

    public Integer getNumeroPin() {
        return numeroPin;
    }

    public void setNumeroPin(final Integer numeroPin) {
        this.numeroPin = numeroPin;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(final BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public BigDecimal getValorImpuesto() {
        return valorImpuesto;
    }

    public void setValorImpuesto(final BigDecimal valorImpuesto) {
        this.valorImpuesto = valorImpuesto;
    }

}
