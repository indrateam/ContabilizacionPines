package com.osi.colsanitas.business.fachada;

import javax.ejb.Local;

/**
 * Interfaz local del bean de sesión de Gestion de Documento Equivalente
 * @author amonastoque-Softmanagement
 * @date 15/11/2013
 */

@Local
public interface GestionDocEquivBeanLocal {

    public String generarDocEquivalente(GenerarDocumentoEquivEntDto ent);

    public String consultarDocumentoEquivalente(GenerarDocumentoEquivEntDto ent);

    public RespuestaAnulacionDto anularDocumentoEquivalente(final GenerarDocumentoEquivEntDto ent);
    
    public RespuestaGenerarFacturaDto generarFactura(final GenerarFacturaDto ent);

}
