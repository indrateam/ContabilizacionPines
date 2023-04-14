package com.osi.colsanitas.bussines.interfaces;

import org.tempuri.ProxyContratoMP_V10Stub.ContratosMP_type1;

public interface IServiceContratoMP {
	
	ContratosMP_type1 consultarContratoMP(String compania, String plan, String numContrato, String familia)
			throws Exception;

}
