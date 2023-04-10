package com.osi.colsanitas.business.fachada;

public class RespuestaAnulacionDto {
    private String transaccionAnulada;
    private String transaccionAnuladora;

    public String getTransaccionAnulada() {
        return transaccionAnulada;
    }

    public void setTransaccionAnulada(final String transaccionAnulada) {
        this.transaccionAnulada = transaccionAnulada;
    }

    public String getTransaccionAnuladora() {
        return transaccionAnuladora;
    }

    public void setTransaccionAnuladora(final String transaccionAnuladora) {
        this.transaccionAnuladora = transaccionAnuladora;
    }

}
