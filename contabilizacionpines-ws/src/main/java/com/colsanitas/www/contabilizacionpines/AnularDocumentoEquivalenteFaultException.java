/**
 * AnularDocumentoEquivalenteFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.colsanitas.www.contabilizacionpines;

public class AnularDocumentoEquivalenteFaultException extends java.lang.Exception {

    private static final long serialVersionUID = 1390330585070L;

    private com.colsanitas.gestiondocumentoequivalente.AnularDocumentoEquivalenteFault faultMessage;

    public AnularDocumentoEquivalenteFaultException() {
        super("AnularDocumentoEquivalenteFaultException");
    }

    public AnularDocumentoEquivalenteFaultException(final java.lang.String s) {
        super(s);
    }

    public AnularDocumentoEquivalenteFaultException(final java.lang.String s,
            final java.lang.Throwable ex) {
        super(s, ex);
    }

    public AnularDocumentoEquivalenteFaultException(final java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
            final com.colsanitas.gestiondocumentoequivalente.AnularDocumentoEquivalenteFault msg) {
        faultMessage = msg;
    }

    public com.colsanitas.gestiondocumentoequivalente.AnularDocumentoEquivalenteFault getFaultMessage() {
        return faultMessage;
    }
}
