
/**
 * GenerarFacturaFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.colsanitas.www.contabilizacionpines;

public class GenerarFacturaFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1473113314230L;
    
    private com.colsanitas.gestiondocumentoequivalente.GenerarFacturaFault faultMessage;

    
        public GenerarFacturaFaultException() {
            super("GenerarFacturaFaultException");
        }

        public GenerarFacturaFaultException(java.lang.String s) {
           super(s);
        }

        public GenerarFacturaFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public GenerarFacturaFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.colsanitas.gestiondocumentoequivalente.GenerarFacturaFault msg){
       faultMessage = msg;
    }
    
    public com.colsanitas.gestiondocumentoequivalente.GenerarFacturaFault getFaultMessage(){
       return faultMessage;
    }
}
    