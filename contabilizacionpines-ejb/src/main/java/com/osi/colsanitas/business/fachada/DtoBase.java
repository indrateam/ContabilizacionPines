package com.osi.colsanitas.business.fachada;

/**
 * Propiedades comunes para los DTO.
 * @author sm
 * 
 */
public class DtoBase implements IDTO {
    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = -3972022949721179623L;

    private String tipoCanal;

    /**
     * @return el valor de la propiedad tipoCanal
     */
    public final String getTipoCanal() {
        return tipoCanal;
    }

    /**
     * @param tipoCanal el valor de la propiedad tipoCanal a establecer
     */
    public final void setTipoCanal(final String tipoCanal) {
        this.tipoCanal = tipoCanal;
    }

}
