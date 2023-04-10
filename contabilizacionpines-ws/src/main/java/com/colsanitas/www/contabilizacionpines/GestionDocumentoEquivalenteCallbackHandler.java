/**
 * GestionDocumentoEquivalenteCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.colsanitas.www.contabilizacionpines;

/**
 * GestionDocumentoEquivalenteCallbackHandler Callback class, Users can extend this class and
 * implement their own receiveResult and receiveError methods.
 */
public abstract class GestionDocumentoEquivalenteCallbackHandler {

    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking Web service call
     * is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data that will be
     *            avilable at the time this callback is called.
     */
    public GestionDocumentoEquivalenteCallbackHandler(final Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public GestionDocumentoEquivalenteCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */

    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for anularDocumentoEquivalente method override this
     * method for handling normal response from anularDocumentoEquivalente operation
     */
    public void receiveResultanularDocumentoEquivalente(
            final com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivSal result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling error response from
     * anularDocumentoEquivalente operation
     */
    public void receiveErroranularDocumentoEquivalente(final java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for consultarDocumentoEquivalente method override this
     * method for handling normal response from consultarDocumentoEquivalente operation
     */
    public void receiveResultconsultarDocumentoEquivalente(
            final com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivSal result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling error response from
     * consultarDocumentoEquivalente operation
     */
    public void receiveErrorconsultarDocumentoEquivalente(final java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for generarDocumentoEquivalente method override this
     * method for handling normal response from generarDocumentoEquivalente operation
     */
    public void receiveResultgenerarDocumentoEquivalente(
            final com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivSal result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling error response from
     * generarDocumentoEquivalente operation
     */
    public void receiveErrorgenerarDocumentoEquivalente(final java.lang.Exception e) {
    }
    
    /**
     * auto generated Axis2 call back method for generarFactura method override this
     * method for handling normal response from generarFactura operation
     */
    public void receiveResultgenerarFactura(
            final com.colsanitas.osi.srv.gestiondocequivservice.GenerarFacturaSal result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling error response from
     * generarFactura operation
     */
    public void receiveErrorgenerarFactura(final java.lang.Exception e) {
    }

}
