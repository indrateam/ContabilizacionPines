package com.osi.colsanitas.integration;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.osi.colsanitas.configuration.ConfiguratorServiceLocator;
import org.tempuri.ProxyContratoMP_V10Stub;
import org.tempuri.ProxyPersonaStub;

public class ServiceLocator {
	
	private static ServiceLocator sl;
	
	private final String CONTRATOMP_WSDL_LOCATION = ConfiguratorServiceLocator.getInstance().getConfiguration().getString(ConfiguratorServiceLocator.ConfiguratorSystemKeys.PROP_WS_CONTRATOMP_WSDL_LOCATION);
	private final String PROXYPERSONA_WSDL_LOCATION = ConfiguratorServiceLocator.getInstance().getConfiguration().getString(ConfiguratorServiceLocator.ConfiguratorSystemKeys.PROP_WS_PROXYPERSONA_WSDL_LOCATION);
	
	InitialContext context = null;
	
	private ServiceLocator() {
		try {
			context = new InitialContext();
		} catch(NamingException ne) {
	    	ne.printStackTrace();
	    }
	}
	
	public static ServiceLocator getInstance() {
		if (sl == null) {
			sl = new ServiceLocator();
		}
		return sl;
	}
	
	// contratomp
	public ProxyContratoMP_V10Stub getServiceContratoMP() throws Exception {
		ProxyContratoMP_V10Stub contratoStub = new ProxyContratoMP_V10Stub(CONTRATOMP_WSDL_LOCATION);
		return contratoStub;
	}
	
	//proxypersona
	public ProxyPersonaStub getServiceProxyPersona() throws Exception {
		ProxyPersonaStub proxyPersonaStub = new ProxyPersonaStub(PROXYPERSONA_WSDL_LOCATION);
		return proxyPersonaStub;
	}
	
}
