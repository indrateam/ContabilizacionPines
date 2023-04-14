package com.osi.colsanitas.bussines.implementacion;

import javax.ejb.Local;
import javax.ejb.Stateless;

import org.tempuri.ProxyPersonaStub.Personas_type0;

import com.osi.colsanitas.bussines.interfaces.IServiceProxyPersona;
import com.osi.colsanitas.helper.ProxyPersonaHelper;

@Stateless
@Local(IServiceProxyPersona.class)
public class ServiceProxyPersona implements IServiceProxyPersona{
	
	
	public String consultarProxyPersona(String tipoDoc, String numDocumento) throws Exception {
	    ProxyPersonaHelper proxyPersonaHelper = new ProxyPersonaHelper();
	    try {
	        Personas_type0 personaTitular = proxyPersonaHelper.consultar(tipoDoc,numDocumento);
	        if (personaTitular != null) {
	            return personaTitular.getDatosBasicos().getMail();
	        } else {
	            throw new Exception("No se pudo obtener la información de la persona titular.");
	        }
	    } catch (Exception e) {
	        throw new Exception("Error al consultar el proxy de la persona.", e);
	    }
	}


}
