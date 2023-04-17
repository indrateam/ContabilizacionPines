package com.osi.contabilizacionpines.contratomp;

import org.apache.axis2.AxisFault;
import org.apache.axis2.transport.http.HTTPConstants;
import org.jboss.seam.core.ResourceLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tempuri.ConsultarFault;
import org.tempuri.ProxyContratoMP_V10Stub;
import org.tempuri.ProxyContratoMP_V10Stub.ArrayOfConsultarSalTypeContratosMP;
import org.tempuri.ProxyContratoMP_V10Stub.ConsultarEnt;
import org.tempuri.ProxyContratoMP_V10Stub.ConsultarEntType;
import org.tempuri.ProxyContratoMP_V10Stub.ConsultarSal;
import org.tempuri.ProxyContratoMP_V10Stub.ConsultarType;
import org.tempuri.ProxyContratoMP_V10Stub.ContratosMP_type1;
import org.tempuri.ProxyContratoMP_V10Stub.HeaderRqust;
import org.tempuri.ProxyContratoMP_V10Stub.IdentificacionType;
import org.tempuri.ProxyContratoMP_V10Stub.MessageHeader;
import org.tempuri.ProxyContratoMP_V10Stub.MessageInfo;
import org.tempuri.ProxyContratoMP_V10Stub.RequestHeader;

import com.osi.contabilizacionpines.webutil.MyPropertiesReader;

public class ContratoMPHelper {
	
	public static final String PROP_WS_CONTRATOMP_WSDL_LOCATION = "contabilizacionpines.ws.contratomp.WsdlLocation";
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ContratoMPHelper.class);

    /**
     * Mediador del metodo consultar del servicio de BH
     * 
     * @param tipoDoc
     * @param numDoc
     * @param producto
     * @param plan
     * @param numContrato
     * @param familia
     * @return
     * @throws Exception
     */
    public ContratosMP_type1[] consultar(String tipoDoc, String numDoc, String producto, String plan,
            String numContrato, String familia) throws Exception {
    	
    	ResourceLoader resourceLoader = new ResourceLoader();
    	
    	MyPropertiesReader propertiesReader = new MyPropertiesReader(resourceLoader);
    	
    	String endPoint = propertiesReader.readProperty(PROP_WS_CONTRATOMP_WSDL_LOCATION);
    	
        ProxyContratoMP_V10Stub clienteMP = crearCliente(endPoint);
        
        ContratosMP_type1[] mp_ts = null;
        
        try {
        	
            /*
             * Se agregan los parametros por identificacion
             */
            IdentificacionType iT = new IdentificacionType();
            iT.setTipoIdentificacion(tipoDoc);
            iT.setNumIdentificacion(numDoc);
            
            ConsultarType cT = new ConsultarType();
            
            /*
             * Si llega el parametro de contrato no debe llegar el parametro de
             * identificacion
             */
            
            if (numContrato != null) {
                /*
                 * Se agregan los parametros por informacion del contrato
                 */
                if (producto != null) {
                    cT.setProducto(producto);
                }
                if (plan != null) {
                    cT.setCodigoPlan(plan);
                }
                
                cT.setNumContrato(numContrato);
                
                if (familia != null) {
                    cT.setNumeroFamilia(familia);
                }
            } else {
                /*
                 * Sino llega el contrato debe consultarse por identificacion
                 */
                cT.setIdentificacionContratanteTitFamilia(iT);
            }
            
            /*
             * Se construye la peticion del cliente java
             */
            ConsultarEntType cET = new ConsultarEntType();
            cET.setConsultar(cT);
            ConsultarEnt cE = new ConsultarEnt();
            cE.setConsultarEnt(cET);
            
            // Se ejecuta la peticion al serviciio
            ConsultarSal cS = clienteMP.consultar(cE, getHeaderMP());
            ArrayOfConsultarSalTypeContratosMP res = cS.getConsultarSal();
            
            // Se almacena solo la salida que es una lista de contratos
            mp_ts = res.getContratosMP();
            
            
        } catch (ConsultarFault e) {
            clienteMP = null;
            throw e;
        }
        
        clienteMP = null;
        // retornamos la respuesta
        return mp_ts;
    }
    
    private ProxyContratoMP_V10Stub crearCliente(String endPoint) throws AxisFault  {

    	String message = "MediadorContratoMP(String endPoint = " + endPoint + ")";
    	LOGGER.info(message);
    	
    	try {
    		ProxyContratoMP_V10Stub contratoMPStub = new ProxyContratoMP_V10Stub(endPoint);
    		contratoMPStub._getServiceClient().getOptions().setProperty(HTTPConstants.SO_TIMEOUT, 3000);
    		contratoMPStub._getServiceClient().getOptions().setProperty(HTTPConstants.CONNECTION_TIMEOUT, 3000);
    		return contratoMPStub;
    	} catch (AxisFault e) {
    		throw e;
    	}
    }
    
    /**
     * Encabezados para la peticion a BH
     * 
     * @return
     */
    public static HeaderRqust getHeaderMP() {
        return getHeaderMP("1");
    }
    
    /**
     * Encabezados para la peticion a BH
     * 
     * @return
     */
    public static HeaderRqust getHeaderMP(String tipoConsulta) {

        MessageInfo messageInfo = new MessageInfo();
        messageInfo.setTipoConsulta(tipoConsulta);
        MessageHeader messageHeader = new MessageHeader();
        messageHeader.setMessageInfo(messageInfo);
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setMessageHeader(messageHeader);
        HeaderRqust headerRqust = new HeaderRqust();
        headerRqust.setHeader(requestHeader);
        return headerRqust;
    }

}
