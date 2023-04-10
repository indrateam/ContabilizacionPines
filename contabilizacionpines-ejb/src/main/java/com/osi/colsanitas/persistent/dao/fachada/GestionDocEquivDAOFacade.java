package com.osi.colsanitas.persistent.dao.fachada;

import com.osi.colsanitas.business.fachada.GenerarDocumentoEquivEntDto;
import com.osi.colsanitas.business.fachada.GenerarFacturaDto;
import com.osi.colsanitas.business.fachada.RespuestaAnulacionDto;
import com.osi.colsanitas.business.fachada.RespuestaGenerarFacturaDto;

/**
 * Interface fachada de persistencia y acceso a datos
 * @author amonastoque-Softmanagement
 * @date 15/11/2013
 */

public interface GestionDocEquivDAOFacade {

    public String generarDocEquivalente(final GenerarDocumentoEquivEntDto generarDocE);

    public String consultarDocumentoEquivalente(final GenerarDocumentoEquivEntDto consultarDocEquiv);

    public RespuestaAnulacionDto anularDocumentoEquivalente(
            final GenerarDocumentoEquivEntDto anularDocEquiv);
    
    public RespuestaGenerarFacturaDto generarFactura(final GenerarFacturaDto generarFacturaE);

}
