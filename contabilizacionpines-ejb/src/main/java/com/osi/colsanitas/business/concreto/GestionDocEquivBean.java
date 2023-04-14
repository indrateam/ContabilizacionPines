package com.osi.colsanitas.business.concreto;

import java.io.Serializable;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.sql.DataSource;

import org.jboss.seam.annotations.Name;

import com.osi.colsanitas.business.fachada.GenerarDocumentoEquivEntDto;
import com.osi.colsanitas.business.fachada.GenerarFacturaDto;
import com.osi.colsanitas.business.fachada.GestionDocEquivBeanLocal;
import com.osi.colsanitas.business.fachada.RespuestaAnulacionDto;
import com.osi.colsanitas.business.fachada.RespuestaGenerarFacturaDto;
import com.osi.colsanitas.bussines.interfaces.IServiceProxyPersona;
import com.osi.colsanitas.persistent.dao.concreto.GestionDocEquivDAO;
import com.osi.colsanitas.persistent.dao.fachada.GestionDocEquivDAOFacade;

/**
 * Bean de sesión sin estado que implementa las funciones de negocio definidas para las capacidades
 * del WS GestionDocumentoEquivalente
 * @author amonastoque-Softmanagement
 * @date 15/11/2013
 */

@Stateless
@Name("gestionDocEquivBean")
@TransactionManagement(TransactionManagementType.CONTAINER)
public class GestionDocEquivBean implements GestionDocEquivBeanLocal, Serializable {
    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 4819331498588810953L;

    @Resource(mappedName = "java:/ContabilizacionPinesDatasource")
    private transient DataSource dataSource;

    @EJB
    private IServiceProxyPersona servicioProxyPersona;
    /**
     * Constructor
     */
    public GestionDocEquivDAOFacade getGestionDao() {
        return new GestionDocEquivDAO(dataSource);
    }

    /**
     * Generación del documento equivalente
     */
    @Override
    public String generarDocEquivalente(final GenerarDocumentoEquivEntDto generarDocE) {
    	
    	//se debe implementar la logica.
    	
    	try {
    		//ctafur agregar validacion de tipo contrato
			String emailFacturacion = servicioProxyPersona.consultarProxyPersona("CC", "12345");
			generarDocE.setEmailFacturacion(emailFacturacion);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return getGestionDao().generarDocEquivalente(generarDocE);
    }

    /**
     * Consulta de un documento equivalente
     */
    @Override
    public String consultarDocumentoEquivalente(final GenerarDocumentoEquivEntDto ent) {
        return getGestionDao().consultarDocumentoEquivalente(ent);
    }

    /**
     * Anulación del documento equivalente
     */
    @Override
    public RespuestaAnulacionDto anularDocumentoEquivalente(final GenerarDocumentoEquivEntDto ent) {
        return getGestionDao().anularDocumentoEquivalente(ent);
    }

    @Override
	public RespuestaGenerarFacturaDto generarFactura(GenerarFacturaDto ent) {
		return getGestionDao().generarFactura(ent);
	}
}
