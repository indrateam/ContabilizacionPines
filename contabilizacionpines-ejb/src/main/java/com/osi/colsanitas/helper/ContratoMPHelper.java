package com.osi.colsanitas.helper;

import com.osi.colsanitas.integration.ServiceLocator;

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

public class ContratoMPHelper {
	
	public ContratosMP_type1[] consultar(String tipoDoc, String numDoc, String producto, String plan,
            String numContrato, String familia) throws Exception {
		ServiceLocator serviceLocator = ServiceLocator.getInstance();
		ProxyContratoMP_V10Stub clienteMP = serviceLocator.getServiceContratoMP();
		
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
