package com.osi.colsanitas.helper;

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

import com.osi.colsanitas.integration.ServiceLocator;

public class ProxyPersonaHelper {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProxyPersonaHelper.class);
	//to do
	public Personas_type0 consultar(String tipoDoc, String numDocumento) throws Exception {
		LOGGER.info("Inicia::ProxyPersonaHelper:consultar");
		ServiceLocator serviceLocator = ServiceLocator.getInstance();
		ProxyPersonaStub proxyPersonaStub = serviceLocator.getServiceProxyPersona();
		
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
			
			//Envio_de_peticion_al_servicio
			LOGGER.info("ProxyPersonaHelper:consultar:se envia peticion para realizar la consulta.");
			ConsultarSal consultarSal = proxyPersonaStub.consultar(consultarEnt, getHeaderProxyPersona());
			ArrayOfConsultarSalTypePersonas arrayOfConsultarSalTypePersonas = consultarSal.getConsultarSal();
		    
			persona = arrayOfConsultarSalTypePersonas.getPersonas()[0];
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		} finally {
			proxyPersonaStub = null;
		}
		LOGGER.info("ProxyPersonaHelper:consultar:se realizó la consulta de la persona sin ningun error.");
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

}
