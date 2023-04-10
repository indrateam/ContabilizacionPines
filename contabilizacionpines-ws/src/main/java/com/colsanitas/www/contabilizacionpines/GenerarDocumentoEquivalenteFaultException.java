/**
 * GenerarDocumentoEquivalenteFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.colsanitas.www.contabilizacionpines;

public class GenerarDocumentoEquivalenteFaultException extends java.lang.Exception {

    private static final long serialVersionUID = 1390330585050L;

    private com.colsanitas.gestiondocumentoequivalente.GenerarDocumentoEquivalenteFault faultMessage;

    public GenerarDocumentoEquivalenteFaultException() {
        super("GenerarDocumentoEquivalenteFaultException");
    }

    public GenerarDocumentoEquivalenteFaultException(final java.lang.String s) {
        super(s);
    }

    public GenerarDocumentoEquivalenteFaultException(final java.lang.String s,
            final java.lang.Throwable ex) {
        super(s, ex);
    }

    public GenerarDocumentoEquivalenteFaultException(final java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
            final com.colsanitas.gestiondocumentoequivalente.GenerarDocumentoEquivalenteFault msg) {
        faultMessage = msg;
    }

    public com.colsanitas.gestiondocumentoequivalente.GenerarDocumentoEquivalenteFault getFaultMessage() {
        return faultMessage;
    }
}
