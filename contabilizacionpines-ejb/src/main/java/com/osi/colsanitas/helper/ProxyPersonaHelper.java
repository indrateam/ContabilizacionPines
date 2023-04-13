package com.osi.colsanitas.helper;

import org.tempuri.ProxyContratoMP_V10Stub;
import org.tempuri.ProxyPersonaStub.Personas_type0;

import com.osi.colsanitas.integration.ServiceLocator;

public class ProxyPersonaHelper {
	
	//to do
	public Personas_type0[] consultarContratoMP(String tipoDoc, String numDocumento) throws Exception {
		ServiceLocator serviceLocator = ServiceLocator.getInstance();
		ProxyContratoMP_V10Stub proxyContratoMP_V10Stub = serviceLocator.getServiceContratoMP();
		return null;
	}

}
