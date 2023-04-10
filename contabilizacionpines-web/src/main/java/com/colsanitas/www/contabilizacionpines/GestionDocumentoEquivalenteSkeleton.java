/**
 * GestionDocumentoEquivalenteSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.colsanitas.www.contabilizacionpines;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.osi.colsanitas.business.fachada.GestionDocEquivBeanLocal;
import com.osi.contabilizacionpines.webutil.ContabilizacionPinesFault;
import com.osi.contabilizacionpines.webutil.DtoUtil;
import com.osi.contabilizacionpines.webutil.EjbUtil;
import com.osi.contabilizacionpines.webutil.TypeUtil;

/**
 * GestionDocumentoEquivalenteSkeleton java skeleton for the axisService
 */
public class GestionDocumentoEquivalenteSkeleton {
    /**
     * Logger.
     */
    private static final Logger LOGGER = LoggerFactory
            .getLogger(GestionDocumentoEquivalenteSkeleton.class);

    private transient GestionDocEquivBeanLocal ejb;

    /**
     * Constructor vacío.
     */
    public GestionDocumentoEquivalenteSkeleton() {
        LOGGER.debug("Inicializando InfoSaludSkeleton");
        ejb = (GestionDocEquivBeanLocal) EjbUtil
                .getEjb("contabilizacionpines-ear/GestionDocEquivBean/local");
    }

    /**
     * Auto generated method signature
     * 
     * @param anularDocumentoEquivEnt
     * @return anularDocumentoEquivSal
     * @throws AnularDocumentoEquivalenteFaultException
     */

    public com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivSal anularDocumentoEquivalente(
            final com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivEnt anularDocumentoEquivEnt)
            throws AnularDocumentoEquivalenteFaultException, ContabilizacionPinesFault {
        try {
            return TypeUtil.toAnularDocumentoEquivSal(ejb.anularDocumentoEquivalente(DtoUtil
                    .toDto(anularDocumentoEquivEnt.getAnularDocumentoEquivEnt())));
        } catch (final Exception e) {
            throw new ContabilizacionPinesFault(e);
        }
    }

    /**
     * Auto generated method signature
     * 
     * @param consultarDocumentoEquivEnt
     * @return consultarDocumentoEquivSal
     * @throws ConsultarDocumentoEquivalenteFaultException
     */

    public com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivSal consultarDocumentoEquivalente(
            final com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivEnt consultarDocumentoEquivEnt)
            throws ConsultarDocumentoEquivalenteFaultException, ContabilizacionPinesFault {
        try {
            return TypeUtil.ConsultarDocumentoEquivSal(ejb.consultarDocumentoEquivalente(DtoUtil
                    .toDto(consultarDocumentoEquivEnt.getConsultarDocumentoEquivEnt())));
        } catch (final Exception e) {
            throw new ContabilizacionPinesFault(e);
        }

    }

    /**
     * Auto generated method signature
     * 
     * @param generarDocumentoEquivEnt
     * @return generarDocumentoEquivSal
     * @throws GenerarDocumentoEquivalenteFaultException
     */

    public com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivSal generarDocumentoEquivalente(
            final com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivEnt generarDocumentoEquivEnt)
            throws GenerarDocumentoEquivalenteFaultException, ContabilizacionPinesFault {
        try {
            return TypeUtil.toGenerarDocumentoEquivSal(ejb.generarDocEquivalente(DtoUtil
                    .toDto(generarDocumentoEquivEnt.getGenerarDocumentoEquivEnt())));
        } catch (final Exception e) {
            throw new ContabilizacionPinesFault(e);
        }
    }
    
    /**
     * Auto generated method signature
     * 
     * @param generarFacturaEnt
     * @return generarFacturaSal
     * @throws GenerarFacturaFaultException 
     */
    
     public com.colsanitas.osi.srv.gestiondocequivservice.GenerarFacturaSal generarFactura(
              com.colsanitas.osi.srv.gestiondocequivservice.GenerarFacturaEnt generarFacturaEnt)
        throws GenerarFacturaFaultException, ContabilizacionPinesFault {
    	 try {
    		 return TypeUtil.toGenerarFacturaSal(ejb.generarFactura(DtoUtil.
    				 toDto(generarFacturaEnt.getGenerarFacturaEnt()))); 
    	 } catch (final Exception e) {
             throw new ContabilizacionPinesFault(e);
         }
     }
}
