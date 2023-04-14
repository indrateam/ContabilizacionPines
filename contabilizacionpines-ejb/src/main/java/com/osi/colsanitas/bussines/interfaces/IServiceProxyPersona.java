package com.osi.colsanitas.bussines.interfaces;

import javax.ejb.Local;

@Local
public interface IServiceProxyPersona {

	String consultarProxyPersona(String tipoDoc, String numDocumento)
			throws Exception;
}
