package com.osi.contabilizacionpines.proxypersona;

import org.apache.axis2.AxisFault;
import org.apache.axis2.transport.http.HTTPConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tempuri.ProxyPersonaStub;
import org.tempuri.ProxyPersonaStub.ArrayOfConsultarSalTypePersonas;
import org.tempuri.ProxyPersonaStub.ConsultarEnt;
import org.tempuri.ProxyPersonaStub.ConsultarEntType;
import org.tempuri.ProxyPersonaStub.ConsultarSal;
import org.tempuri.ProxyPersonaStub.ConsultarType;
import org.tempuri.ProxyPersonaStub.HeaderRqust;
import org.tempuri.ProxyPersonaStub.IdentificacionType;
import org.tempuri.ProxyPersonaStub.MessageHeader;
import org.tempuri.ProxyPersonaStub.MessageInfo;
import org.tempuri.ProxyPersonaStub.Personas_type0;
import org.tempuri.ProxyPersonaStub.RequestHeader;
import org.jboss.seam.core.ResourceLoader;
import com.osi.contabilizacionpines.webutil.MyPropertiesReader;


public class ProxyPersonaHelper {

public static final String PROP_WS_CONTRATOMP_WSDL_LOCATION = "contabilizacionpines.ws.contratomp.WsdlLocation";
// Web Service ProxyPersona
public static final String PROP_WS_PROXYPERSONA_WSDL_LOCATION = "contabilizacionpines.ws.proxypersona.WsdlLocation";

private static final Logger LOGGER = LoggerFactory.getLogger(ProxyPersonaHelper.class);

/**
 * Realiza una consulta de persona a través del servicio web ProxyPersona.
 *
 * @param tipoDoc
 *            El tipo de documento de la persona a consultar.
 * @param numDocumento
 *            El número de documento de la persona a consultar.
 * @return La persona encontrada o null si no se encontró ninguna persona.
 * @throws Exception
 *             Si ocurre un error durante la consulta.
 */
public Personas_type0 consultar(String tipoDoc, String numDocumento)throws Exception {
	LOGGER.info("Inicia::ProxyPersonaHelper:consultar");
	ResourceLoader resourceLoader = new ResourceLoader();
	MyPropertiesReader propertiesReader = new MyPropertiesReader(resourceLoader);
	String endPoint = propertiesReader.readProperty(PROP_WS_PROXYPERSONA_WSDL_LOCATION);
	
	ProxyPersonaStub clienteProxyPersona = this.crearCliente(endPoint);

	Personas_type0 persona = null;

	try {
		IdentificacionType identificacionType = new IdentificacionType();
		identificacionType.setTipoIdentificacion(tipoDoc);
		identificacionType.setNumIdentificacion(numDocumento);

		ConsultarType consultarType = new ConsultarType();
		consultarType.setIdentificacion(identificacionType);

		ConsultarEntType consultarEntType = new ConsultarEntType();
		consultarEntType.setConsultar(consultarType);

		ConsultarEnt consultarEnt = new ConsultarEnt();
		consultarEnt.setConsultarEnt(consultarEntType);

		// Envío de petición al servicio
		LOGGER.info("ProxyPersonaHelper:consultar:se envia peticion para realizar la consulta.");
		ConsultarSal consultarSal = clienteProxyPersona.consultar(consultarEnt, getHeaderProxyPersona());
		ArrayOfConsultarSalTypePersonas arrayOfConsultarSalTypePersonas = consultarSal
				.getConsultarSal();

		persona = arrayOfConsultarSalTypePersonas.getPersonas()[0];
	} catch (Exception e) {
		LOGGER.error(e.getMessage());
	} finally {
		clienteProxyPersona = null;

	}
	return persona;
}

public static HeaderRqust getHeaderProxyPersona() {

	return getHeaderProxyPersona("1");
}

public static HeaderRqust getHeaderProxyPersona(String tipoConsulta) {

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

private ProxyPersonaStub crearCliente(String endPoint) throws AxisFault  {

	String message = "MediadorProxyPersona(String endPoint = " + endPoint + ")";

	LOGGER.info(message);
	try {
		ProxyPersonaStub proxyPersonaStub = new ProxyPersonaStub(endPoint);
		proxyPersonaStub._getServiceClient().getOptions().setProperty(HTTPConstants.SO_TIMEOUT, 3000);
		proxyPersonaStub._getServiceClient().getOptions().setProperty(HTTPConstants.CONNECTION_TIMEOUT,3000);
		return proxyPersonaStub;
	} catch (AxisFault e) {
		throw e;
	}
}
}
