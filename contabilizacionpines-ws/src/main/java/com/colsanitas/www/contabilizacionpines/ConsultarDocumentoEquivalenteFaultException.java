/**
 * ConsultarDocumentoEquivalenteFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.colsanitas.www.contabilizacionpines;

public class ConsultarDocumentoEquivalenteFaultException extends java.lang.Exception {

    private static final long serialVersionUID = 1390330585061L;

    private com.colsanitas.gestiondocumentoequivalente.ConsultarDocumentoEquivalenteFault faultMessage;

    public ConsultarDocumentoEquivalenteFaultException() {
        super("ConsultarDocumentoEquivalenteFaultException");
    }

    public ConsultarDocumentoEquivalenteFaultException(final java.lang.String s) {
        super(s);
    }

    public ConsultarDocumentoEquivalenteFaultException(final java.lang.String s,
            final java.lang.Throwable ex) {
        super(s, ex);
    }

    public ConsultarDocumentoEquivalenteFaultException(final java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
            final com.colsanitas.gestiondocumentoequivalente.ConsultarDocumentoEquivalenteFault msg) {
        faultMessage = msg;
    }

    public com.colsanitas.gestiondocumentoequivalente.ConsultarDocumentoEquivalenteFault getFaultMessage() {
        return faultMessage;
    }
}
