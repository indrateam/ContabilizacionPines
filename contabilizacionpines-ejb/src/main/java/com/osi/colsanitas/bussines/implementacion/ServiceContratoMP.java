package com.osi.colsanitas.bussines.implementacion;

import javax.ejb.Local;
import javax.ejb.Stateless;

import org.tempuri.ProxyContratoMP_V10Stub.ContratosMP_type1;

import com.osi.colsanitas.bussines.interfaces.IServiceContratoMP;
import com.osi.colsanitas.helper.ContratoMPHelper;

@Stateless
@Local(IServiceContratoMP.class)
public class ServiceContratoMP implements IServiceContratoMP {

	@Override
	public ContratosMP_type1 consultarContratoMP(String compania, String plan,
			String numContrato, String familia) throws Exception {
		ContratoMPHelper contratoMPHelper = new ContratoMPHelper();
		try {
			return contratoMPHelper.consultar("", "", compania, plan, numContrato, familia)[0];
		} catch (Exception e) {
			throw new Exception("::ServiceContratoMP::Error al consultar el contrato.", e);
		}
	}

}
