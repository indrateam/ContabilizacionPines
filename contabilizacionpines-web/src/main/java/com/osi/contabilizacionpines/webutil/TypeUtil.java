package com.osi.contabilizacionpines.webutil;

import org.apache.axiom.om.OMContainer;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.soap.SOAPEnvelope;

import com.colsanitas.osi.recaudo.transaccion.NumFacturaType;
import com.colsanitas.osi.recaudo.transaccion.NumeroTransaccionType;
import com.colsanitas.osi.srv.gestiondocequivservice.AnularDocEquivSalType;
import com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivSal;
import com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocEquivSalType;
import com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivSal;
import com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocEquivSalType;
import com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivSal;
import com.colsanitas.osi.srv.gestiondocequivservice.GenerarFacturaSal;
import com.colsanitas.osi.srv.gestiondocequivservice.GenerarFacturaSalType;
import com.osi.colsanitas.business.fachada.RespuestaAnulacionDto;
import com.osi.colsanitas.business.fachada.RespuestaGenerarFacturaDto;

/**
 * Métodos utilitarios para convertir DTOs a Types.
 * @author sm
 * 
 */
public final class TypeUtil {
    /**
     * Cantidad máxima de registros a enviar en un batch.
     */
    public static final int BATCH_SIZE = 1000;

    /**
     * Constructor privado para evitar instancias.
     */
    private TypeUtil() {
    }

    /**
     * Convierte un Long a string.
     * @param valor el valor
     * @return el string
     */
    public static final String toString(final Object valor) {
        String respuesta;
        if (valor == null) {
            respuesta = null;
        } else {
            respuesta = valor.toString();
        }
        return respuesta;
    }

    public static GenerarDocumentoEquivSal toGenerarDocumentoEquivSal(final String numTrans) {
        final GenerarDocumentoEquivSal sal = new GenerarDocumentoEquivSal();
        final GenerarDocEquivSalType type = new GenerarDocEquivSalType();
        final NumeroTransaccionType type2 = new NumeroTransaccionType();
        type2.setNumeroTransaccionType(numTrans);
        type.setNum_trans_docEquiv(type2);
        sal.setGenerarDocumentoEquivSal(type);
        return sal;
    }

    public static ConsultarDocumentoEquivSal ConsultarDocumentoEquivSal(
            final String consultarDocumentoEquivalente) {
        final ConsultarDocumentoEquivSal sal = new ConsultarDocumentoEquivSal();
        final ConsultarDocEquivSalType type = new ConsultarDocEquivSalType();
        type.setDocEquiv_URL(consultarDocumentoEquivalente);
        sal.setConsultarDocumentoEquivSal(type);
        return sal;
    }

    public static AnularDocumentoEquivSal toAnularDocumentoEquivSal(final RespuestaAnulacionDto dto) {
        final AnularDocumentoEquivSal sal = new AnularDocumentoEquivSal();
        final AnularDocEquivSalType type = new AnularDocEquivSalType();
        final NumeroTransaccionType numTrans = new NumeroTransaccionType();
        numTrans.setNumeroTransaccionType(dto.getTransaccionAnuladora());
        type.setNum_trans(numTrans);

        final NumeroTransaccionType numTrans2 = new NumeroTransaccionType();
        numTrans2.setNumeroTransaccionType(dto.getTransaccionAnulada());
        type.setNum_trans_docEq(numTrans2);
        sal.setAnularDocumentoEquivSal(type);
        return sal;
    }

    public static final void agregarVersion(final SOAPEnvelope envelope) {
        final OMFactory omFactory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();
        OMContainer container = envelope.getBody().getFirstElement();
        if (container == null) {
            container = envelope.getBody();
        }
        omFactory.createOMComment(container, "Versión 1.0.0.8");
    }
    
    public static GenerarFacturaSal toGenerarFacturaSal(final RespuestaGenerarFacturaDto dto){
    	final GenerarFacturaSal sal = new GenerarFacturaSal();
    	final GenerarFacturaSalType type = new GenerarFacturaSalType();
    	final NumFacturaType numFacturaType =  new NumFacturaType();
    	final NumeroTransaccionType numTransType =  new NumeroTransaccionType();
    	numFacturaType.setNumFacturaType(dto.getNumeroFactura().toString());
    	type.setNumFactura(numFacturaType);
    	numTransType.setNumeroTransaccionType(dto.getNumeroTransaccion());
    	type.setNumTransaccion(numTransType);
    	sal.setGenerarFacturaSal(type);
    	return sal;
    }
}
