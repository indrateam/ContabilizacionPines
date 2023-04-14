package com.osi.colsanitas.business.concreto;

import java.io.Serializable;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.sql.DataSource;

import org.jboss.seam.annotations.Name;
import org.tempuri.ProxyContratoMP_V10Stub.ContratosMP_type1;

import com.osi.colsanitas.business.fachada.GenerarDocumentoEquivEntDto;
import com.osi.colsanitas.business.fachada.GenerarFacturaDto;
import com.osi.colsanitas.business.fachada.GestionDocEquivBeanLocal;
import com.osi.colsanitas.business.fachada.RespuestaAnulacionDto;
import com.osi.colsanitas.business.fachada.RespuestaGenerarFacturaDto;
import com.osi.colsanitas.bussines.interfaces.IServiceContratoMP;
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
    
    @EJB
    private IServiceContratoMP servicioContratoMP;
    
    private static final String TIPO_CONTRATO_COLECTIVO = "COLECTIVO";
    
    private static final String TIPO_CONTRATO_FAMILIAR = "FAMILIAR";
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
    	
    	String compania = generarDocE.getCodigoCompania().toString();
    	String plan = generarDocE.getCodigoPlan().toString();
    	String numContrato = generarDocE.getNumContrato().toString();
    	String familia = generarDocE.getNumeroFamilia().toString();
    	
    	//setear generarDocE con el correo electronico asociado segun HU08. 14/04/2023 	
    	try {
    		
    		ContratosMP_type1 contrato = servicioContratoMP.consultarContratoMP(compania, plan, numContrato, familia);
    		String tipoContrato = contrato.getCaratula().getTipoContrato().toUpperCase();
    		
            //Que el proceso obtenga el correo electrónico del contratante del sistema BH.
    		if(tipoContrato.equals(TIPO_CONTRATO_FAMILIAR)){
    			String correoContratante = contrato.getCaratula().getMailContratante();
    			generarDocE.setEmailFacturacion(correoContratante);
    		} 
    		
            //Que el proceso obtenga el tipo y numero de documento del titular de la familia.
            //Que el proceso obtenga el correo electrónico del titular de la familia del sistema de BH.
    		else if (tipoContrato.equals(TIPO_CONTRATO_COLECTIVO)){
                String tipoDocumento = contrato.getTitularFamilia().getIdentificacionTitularFamilia().getTipoIdentificacion();
                String numDocumento = contrato.getTitularFamilia().getIdentificacionTitularFamilia().getNumIdentificacion();
                
                String correoTitular = contrato.getTitularFamilia().getMailTitularFamilia() == null ? 
                		servicioProxyPersona.consultarProxyPersona(tipoDocumento, numDocumento):
                            contrato.getTitularFamilia().getMailTitularFamilia();
                generarDocE.setEmailFacturacion(correoTitular);
    		}
    		
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
