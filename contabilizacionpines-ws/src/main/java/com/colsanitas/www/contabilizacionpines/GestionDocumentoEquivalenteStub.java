/**
 * GestionDocumentoEquivalenteStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.colsanitas.www.contabilizacionpines;

/*
 *  GestionDocumentoEquivalenteStub java implementation
 */
@SuppressWarnings({ "unchecked", "unused", "rawtypes" })
public class GestionDocumentoEquivalenteStub extends org.apache.axis2.client.Stub {
    protected org.apache.axis2.description.AxisOperation[] _operations;

    // hashmaps to keep the fault mapping
    private final java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private final java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private final java.util.HashMap faultMessageMap = new java.util.HashMap();

    private static int counter = 0;

    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (counter > 99999) {
            counter = 0;
        }
        counter = counter + 1;
        return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
    }

    private void populateAxisService() throws org.apache.axis2.AxisFault {

        // creating the Service with a unique name
        _service = new org.apache.axis2.description.AxisService("GestionDocumentoEquivalente"
                + getUniqueSuffix());
        addAnonymousOperations();

        // creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[3];

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation
                .setName(new javax.xml.namespace.QName(
                        "http://colsanitas.com/GestionDocumentoEquivalente/",
                        "anularDocumentoEquivalente"));
        _service.addOperation(__operation);

        _operations[0] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://colsanitas.com/GestionDocumentoEquivalente/",
                "consultarDocumentoEquivalente"));
        _service.addOperation(__operation);

        _operations[1] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation
                .setName(new javax.xml.namespace.QName(
                        "http://colsanitas.com/GestionDocumentoEquivalente/",
                        "generarDocumentoEquivalente"));
        _service.addOperation(__operation);

        _operations[2] = __operation;

    }

    // populates the faults
    private void populateFaults() {

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://colsanitas.com/GestionDocumentoEquivalente/",
                        "AnularDocumentoEquivalenteFault"), "AnularDocumentoEquivalente"),
                "com.colsanitas.www.contabilizacionpines.AnularDocumentoEquivalenteFaultException");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://colsanitas.com/GestionDocumentoEquivalente/",
                        "AnularDocumentoEquivalenteFault"), "AnularDocumentoEquivalente"),
                "com.colsanitas.www.contabilizacionpines.AnularDocumentoEquivalenteFaultException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                "http://colsanitas.com/GestionDocumentoEquivalente/",
                "AnularDocumentoEquivalenteFault"), "AnularDocumentoEquivalente"),
                "com.colsanitas.gestiondocumentoequivalente.AnularDocumentoEquivalenteFault");

        faultExceptionNameMap
                .put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                        "http://colsanitas.com/GestionDocumentoEquivalente/",
                        "ConsultarDocumentoEquivalenteFault"), "ConsultarDocumentoEquivalente"),
                        "com.colsanitas.www.contabilizacionpines.ConsultarDocumentoEquivalenteFaultException");
        faultExceptionClassNameMap
                .put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                        "http://colsanitas.com/GestionDocumentoEquivalente/",
                        "ConsultarDocumentoEquivalenteFault"), "ConsultarDocumentoEquivalente"),
                        "com.colsanitas.www.contabilizacionpines.ConsultarDocumentoEquivalenteFaultException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                "http://colsanitas.com/GestionDocumentoEquivalente/",
                "ConsultarDocumentoEquivalenteFault"), "ConsultarDocumentoEquivalente"),
                "com.colsanitas.gestiondocumentoequivalente.ConsultarDocumentoEquivalenteFault");

        faultExceptionNameMap
                .put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                        "http://colsanitas.com/GestionDocumentoEquivalente/",
                        "GenerarDocumentoEquivalenteFault"), "GenerarDocumentoEquivalente"),
                        "com.colsanitas.www.contabilizacionpines.GenerarDocumentoEquivalenteFaultException");
        faultExceptionClassNameMap
                .put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                        "http://colsanitas.com/GestionDocumentoEquivalente/",
                        "GenerarDocumentoEquivalenteFault"), "GenerarDocumentoEquivalente"),
                        "com.colsanitas.www.contabilizacionpines.GenerarDocumentoEquivalenteFaultException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                "http://colsanitas.com/GestionDocumentoEquivalente/",
                "GenerarDocumentoEquivalenteFault"), "GenerarDocumentoEquivalente"),
                "com.colsanitas.gestiondocumentoequivalente.GenerarDocumentoEquivalenteFault");

    }

    /**
     * Constructor that takes in a configContext
     */

    public GestionDocumentoEquivalenteStub(
            final org.apache.axis2.context.ConfigurationContext configurationContext,
            final java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext and useseperate listner
     */
    public GestionDocumentoEquivalenteStub(
            final org.apache.axis2.context.ConfigurationContext configurationContext,
            final java.lang.String targetEndpoint, final boolean useSeparateListener)
            throws org.apache.axis2.AxisFault {
        // To populate AxisService
        populateAxisService();
        populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);

        _serviceClient.getOptions().setTo(
                new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

    }

    /**
     * Default Constructor
     */
    public GestionDocumentoEquivalenteStub(
            final org.apache.axis2.context.ConfigurationContext configurationContext)
            throws org.apache.axis2.AxisFault {

        this(configurationContext,
                "http://localhost:8080/Contabilizacion_Pines/GestionDocumentoEquivalenteSOAP");

    }

    /**
     * Default Constructor
     */
    public GestionDocumentoEquivalenteStub() throws org.apache.axis2.AxisFault {

        this("http://localhost:8080/Contabilizacion_Pines/GestionDocumentoEquivalenteSOAP");

    }

    /**
     * Constructor taking the target endpoint
     */
    public GestionDocumentoEquivalenteStub(final java.lang.String targetEndpoint)
            throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint);
    }

    /**
     * Auto generated method signature
     * 
     * @see com.colsanitas.www.contabilizacionpines.GestionDocumentoEquivalente#anularDocumentoEquivalente
     * @param anularDocumentoEquivEnt64
     * 
     * @param headerRqust65
     * 
     * @throws com.colsanitas.www.contabilizacionpines.AnularDocumentoEquivalenteFaultException :
     */

    public com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivSal anularDocumentoEquivalente(

            final com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivEnt anularDocumentoEquivEnt64,
            final com.colsanitas.gestiondocumentoequivalente.HeaderRqust headerRqust65)

    throws java.rmi.RemoteException

    , com.colsanitas.www.contabilizacionpines.AnularDocumentoEquivalenteFaultException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                    .createClient(_operations[0].getName());
            _operationClient.getOptions().setAction(
                    "http://colsanitas.com/GestionDocumentoEquivalente/AnularDocumentoEquivalente");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(
                    _operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                    "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    anularDocumentoEquivEnt64, optimizeContent(new javax.xml.namespace.QName(
                            "http://colsanitas.com/GestionDocumentoEquivalente/",
                            "anularDocumentoEquivalente")), new javax.xml.namespace.QName(
                            "http://colsanitas.com/GestionDocumentoEquivalente/",
                            "anularDocumentoEquivalente"));

            env.build();

            // add the children only if the parameter is not null
            if (headerRqust65 != null) {

                final org.apache.axiom.om.OMElement omElementheaderRqust65 = toOM(headerRqust65,
                        optimizeContent(new javax.xml.namespace.QName(
                                "http://colsanitas.com/GestionDocumentoEquivalente/",
                                "anularDocumentoEquivalente")));
                addHeader(omElementheaderRqust65, env);

            }

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
                    .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
                    .getEnvelope();

            final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
                    com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivSal.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivSal) object;

        } catch (final org.apache.axis2.AxisFault f) {

            final org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "AnularDocumentoEquivalente"))) {
                    // make the fault by reflection
                    try {
                        final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                        "AnularDocumentoEquivalente"));
                        final java.lang.Class exceptionClass = java.lang.Class
                                .forName(exceptionClassName);
                        final java.lang.reflect.Constructor constructor = exceptionClass
                                .getConstructor(String.class);
                        final java.lang.Exception ex = (java.lang.Exception) constructor
                                .newInstance(f.getMessage());
                        // message class
                        final java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                        "AnularDocumentoEquivalente"));
                        final java.lang.Class messageClass = java.lang.Class
                                .forName(messageClassName);
                        final java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        final java.lang.reflect.Method m = exceptionClass.getMethod(
                                "setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof com.colsanitas.www.contabilizacionpines.AnularDocumentoEquivalenteFaultException) {
                            throw (com.colsanitas.www.contabilizacionpines.AnularDocumentoEquivalenteFaultException) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (final java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (final java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (final java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (final java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (final java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (final java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see com.colsanitas.www.contabilizacionpines.GestionDocumentoEquivalente#startanularDocumentoEquivalente
     * @param anularDocumentoEquivEnt64
     * 
     * @param headerRqust65
     */
    public void startanularDocumentoEquivalente(

            final com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivEnt anularDocumentoEquivEnt64,
            final com.colsanitas.gestiondocumentoequivalente.HeaderRqust headerRqust65,

            final com.colsanitas.www.contabilizacionpines.GestionDocumentoEquivalenteCallbackHandler callback)

    throws java.rmi.RemoteException {

        final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                .createClient(_operations[0].getName());
        _operationClient.getOptions().setAction(
                "http://colsanitas.com/GestionDocumentoEquivalente/AnularDocumentoEquivalente");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                anularDocumentoEquivEnt64, optimizeContent(new javax.xml.namespace.QName(
                        "http://colsanitas.com/GestionDocumentoEquivalente/",
                        "anularDocumentoEquivalente")), new javax.xml.namespace.QName(
                        "http://colsanitas.com/GestionDocumentoEquivalente/",
                        "anularDocumentoEquivalente"));

        // add the soap_headers only if they are not null
        if (headerRqust65 != null) {

            final org.apache.axiom.om.OMElement omElementheaderRqust65 = toOM(headerRqust65,
                    optimizeContent(new javax.xml.namespace.QName(
                            "http://colsanitas.com/GestionDocumentoEquivalente/",
                            "anularDocumentoEquivalente")));
            addHeader(omElementheaderRqust65, env);

        }

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            @Override
            public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
                try {
                    final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
                            .getEnvelope();

                    final java.lang.Object object = fromOM(
                            resultEnv.getBody().getFirstElement(),
                            com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivSal.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultanularDocumentoEquivalente((com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivSal) object);

                } catch (final org.apache.axis2.AxisFault e) {
                    callback.receiveErroranularDocumentoEquivalente(e);
                }
            }

            @Override
            public void onError(final java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    final org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap
                                .containsKey(new org.apache.axis2.client.FaultMapKey(faultElt
                                        .getQName(), "AnularDocumentoEquivalente"))) {
                            // make the fault by reflection
                            try {
                                final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                        .get(new org.apache.axis2.client.FaultMapKey(faultElt
                                                .getQName(), "AnularDocumentoEquivalente"));
                                final java.lang.Class exceptionClass = java.lang.Class
                                        .forName(exceptionClassName);
                                final java.lang.reflect.Constructor constructor = exceptionClass
                                        .getConstructor(String.class);
                                final java.lang.Exception ex = (java.lang.Exception) constructor
                                        .newInstance(f.getMessage());
                                // message class
                                final java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                        .get(new org.apache.axis2.client.FaultMapKey(faultElt
                                                .getQName(), "AnularDocumentoEquivalente"));
                                final java.lang.Class messageClass = java.lang.Class
                                        .forName(messageClassName);
                                final java.lang.Object messageObject = fromOM(faultElt,
                                        messageClass, null);
                                final java.lang.reflect.Method m = exceptionClass.getMethod(
                                        "setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                if (ex instanceof com.colsanitas.www.contabilizacionpines.AnularDocumentoEquivalenteFaultException) {
                                    callback.receiveErroranularDocumentoEquivalente(ex);
                                    return;
                                }

                                callback.receiveErroranularDocumentoEquivalente(new java.rmi.RemoteException(
                                        ex.getMessage(), ex));
                            } catch (final java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErroranularDocumentoEquivalente(f);
                            } catch (final java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErroranularDocumentoEquivalente(f);
                            } catch (final java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErroranularDocumentoEquivalente(f);
                            } catch (final java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErroranularDocumentoEquivalente(f);
                            } catch (final java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErroranularDocumentoEquivalente(f);
                            } catch (final java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErroranularDocumentoEquivalente(f);
                            } catch (final org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErroranularDocumentoEquivalente(f);
                            }
                        } else {
                            callback.receiveErroranularDocumentoEquivalente(f);
                        }
                    } else {
                        callback.receiveErroranularDocumentoEquivalente(f);
                    }
                } else {
                    callback.receiveErroranularDocumentoEquivalente(error);
                }
            }

            @Override
            public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
                final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
                        .getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            @Override
            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (final org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErroranularDocumentoEquivalente(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[0].getMessageReceiver() == null
                && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[0].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see com.colsanitas.www.contabilizacionpines.GestionDocumentoEquivalente#consultarDocumentoEquivalente
     * @param consultarDocumentoEquivEnt67
     * 
     * @param headerRqust68
     * 
     * @throws com.colsanitas.www.contabilizacionpines.ConsultarDocumentoEquivalenteFaultException :
     */

    public com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivSal consultarDocumentoEquivalente(

            final com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivEnt consultarDocumentoEquivEnt67,
            final com.colsanitas.gestiondocumentoequivalente.HeaderRqust headerRqust68)

    throws java.rmi.RemoteException

    , com.colsanitas.www.contabilizacionpines.ConsultarDocumentoEquivalenteFaultException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                    .createClient(_operations[1].getName());
            _operationClient
                    .getOptions()
                    .setAction(
                            "http://colsanitas.com/GestionDocumentoEquivalente/ConsultarDocumentoEquivalente");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(
                    _operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                    "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    consultarDocumentoEquivEnt67, optimizeContent(new javax.xml.namespace.QName(
                            "http://colsanitas.com/GestionDocumentoEquivalente/",
                            "consultarDocumentoEquivalente")), new javax.xml.namespace.QName(
                            "http://colsanitas.com/GestionDocumentoEquivalente/",
                            "consultarDocumentoEquivalente"));

            env.build();

            // add the children only if the parameter is not null
            if (headerRqust68 != null) {

                final org.apache.axiom.om.OMElement omElementheaderRqust68 = toOM(headerRqust68,
                        optimizeContent(new javax.xml.namespace.QName(
                                "http://colsanitas.com/GestionDocumentoEquivalente/",
                                "consultarDocumentoEquivalente")));
                addHeader(omElementheaderRqust68, env);

            }

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
                    .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
                    .getEnvelope();

            final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
                    com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivSal.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivSal) object;

        } catch (final org.apache.axis2.AxisFault f) {

            final org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ConsultarDocumentoEquivalente"))) {
                    // make the fault by reflection
                    try {
                        final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                        "ConsultarDocumentoEquivalente"));
                        final java.lang.Class exceptionClass = java.lang.Class
                                .forName(exceptionClassName);
                        final java.lang.reflect.Constructor constructor = exceptionClass
                                .getConstructor(String.class);
                        final java.lang.Exception ex = (java.lang.Exception) constructor
                                .newInstance(f.getMessage());
                        // message class
                        final java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                        "ConsultarDocumentoEquivalente"));
                        final java.lang.Class messageClass = java.lang.Class
                                .forName(messageClassName);
                        final java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        final java.lang.reflect.Method m = exceptionClass.getMethod(
                                "setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof com.colsanitas.www.contabilizacionpines.ConsultarDocumentoEquivalenteFaultException) {
                            throw (com.colsanitas.www.contabilizacionpines.ConsultarDocumentoEquivalenteFaultException) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (final java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (final java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (final java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (final java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (final java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (final java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see com.colsanitas.www.contabilizacionpines.GestionDocumentoEquivalente#startconsultarDocumentoEquivalente
     * @param consultarDocumentoEquivEnt67
     * 
     * @param headerRqust68
     */
    public void startconsultarDocumentoEquivalente(

            final com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivEnt consultarDocumentoEquivEnt67,
            final com.colsanitas.gestiondocumentoequivalente.HeaderRqust headerRqust68,

            final com.colsanitas.www.contabilizacionpines.GestionDocumentoEquivalenteCallbackHandler callback)

    throws java.rmi.RemoteException {

        final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                .createClient(_operations[1].getName());
        _operationClient.getOptions().setAction(
                "http://colsanitas.com/GestionDocumentoEquivalente/ConsultarDocumentoEquivalente");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                consultarDocumentoEquivEnt67, optimizeContent(new javax.xml.namespace.QName(
                        "http://colsanitas.com/GestionDocumentoEquivalente/",
                        "consultarDocumentoEquivalente")), new javax.xml.namespace.QName(
                        "http://colsanitas.com/GestionDocumentoEquivalente/",
                        "consultarDocumentoEquivalente"));

        // add the soap_headers only if they are not null
        if (headerRqust68 != null) {

            final org.apache.axiom.om.OMElement omElementheaderRqust68 = toOM(headerRqust68,
                    optimizeContent(new javax.xml.namespace.QName(
                            "http://colsanitas.com/GestionDocumentoEquivalente/",
                            "consultarDocumentoEquivalente")));
            addHeader(omElementheaderRqust68, env);

        }

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            @Override
            public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
                try {
                    final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
                            .getEnvelope();

                    final java.lang.Object object = fromOM(
                            resultEnv.getBody().getFirstElement(),
                            com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivSal.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultconsultarDocumentoEquivalente((com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivSal) object);

                } catch (final org.apache.axis2.AxisFault e) {
                    callback.receiveErrorconsultarDocumentoEquivalente(e);
                }
            }

            @Override
            public void onError(final java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    final org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap
                                .containsKey(new org.apache.axis2.client.FaultMapKey(faultElt
                                        .getQName(), "ConsultarDocumentoEquivalente"))) {
                            // make the fault by reflection
                            try {
                                final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                        .get(new org.apache.axis2.client.FaultMapKey(faultElt
                                                .getQName(), "ConsultarDocumentoEquivalente"));
                                final java.lang.Class exceptionClass = java.lang.Class
                                        .forName(exceptionClassName);
                                final java.lang.reflect.Constructor constructor = exceptionClass
                                        .getConstructor(String.class);
                                final java.lang.Exception ex = (java.lang.Exception) constructor
                                        .newInstance(f.getMessage());
                                // message class
                                final java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                        .get(new org.apache.axis2.client.FaultMapKey(faultElt
                                                .getQName(), "ConsultarDocumentoEquivalente"));
                                final java.lang.Class messageClass = java.lang.Class
                                        .forName(messageClassName);
                                final java.lang.Object messageObject = fromOM(faultElt,
                                        messageClass, null);
                                final java.lang.reflect.Method m = exceptionClass.getMethod(
                                        "setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                if (ex instanceof com.colsanitas.www.contabilizacionpines.ConsultarDocumentoEquivalenteFaultException) {
                                    callback.receiveErrorconsultarDocumentoEquivalente(ex);
                                    return;
                                }

                                callback.receiveErrorconsultarDocumentoEquivalente(new java.rmi.RemoteException(
                                        ex.getMessage(), ex));
                            } catch (final java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultarDocumentoEquivalente(f);
                            } catch (final java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultarDocumentoEquivalente(f);
                            } catch (final java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultarDocumentoEquivalente(f);
                            } catch (final java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultarDocumentoEquivalente(f);
                            } catch (final java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultarDocumentoEquivalente(f);
                            } catch (final java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultarDocumentoEquivalente(f);
                            } catch (final org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultarDocumentoEquivalente(f);
                            }
                        } else {
                            callback.receiveErrorconsultarDocumentoEquivalente(f);
                        }
                    } else {
                        callback.receiveErrorconsultarDocumentoEquivalente(f);
                    }
                } else {
                    callback.receiveErrorconsultarDocumentoEquivalente(error);
                }
            }

            @Override
            public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
                final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
                        .getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            @Override
            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (final org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorconsultarDocumentoEquivalente(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[1].getMessageReceiver() == null
                && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[1].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see com.colsanitas.www.contabilizacionpines.GestionDocumentoEquivalente#generarDocumentoEquivalente
     * @param generarDocumentoEquivEnt70
     * 
     * @param headerRqust71
     * 
     * @throws com.colsanitas.www.contabilizacionpines.GenerarDocumentoEquivalenteFaultException :
     */

    public com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivSal generarDocumentoEquivalente(

            final com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivEnt generarDocumentoEquivEnt70,
            final com.colsanitas.gestiondocumentoequivalente.HeaderRqust headerRqust71)

    throws java.rmi.RemoteException

    , com.colsanitas.www.contabilizacionpines.GenerarDocumentoEquivalenteFaultException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                    .createClient(_operations[2].getName());
            _operationClient
                    .getOptions()
                    .setAction(
                            "http://colsanitas.com/GestionDocumentoEquivalente/GenerarDocumentoEquivalente");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(
                    _operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                    "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    generarDocumentoEquivEnt70, optimizeContent(new javax.xml.namespace.QName(
                            "http://colsanitas.com/GestionDocumentoEquivalente/",
                            "generarDocumentoEquivalente")), new javax.xml.namespace.QName(
                            "http://colsanitas.com/GestionDocumentoEquivalente/",
                            "generarDocumentoEquivalente"));

            env.build();

            // add the children only if the parameter is not null
            if (headerRqust71 != null) {

                final org.apache.axiom.om.OMElement omElementheaderRqust71 = toOM(headerRqust71,
                        optimizeContent(new javax.xml.namespace.QName(
                                "http://colsanitas.com/GestionDocumentoEquivalente/",
                                "generarDocumentoEquivalente")));
                addHeader(omElementheaderRqust71, env);

            }

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
                    .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
                    .getEnvelope();

            final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
                    com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivSal.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivSal) object;

        } catch (final org.apache.axis2.AxisFault f) {

            final org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "GenerarDocumentoEquivalente"))) {
                    // make the fault by reflection
                    try {
                        final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                        "GenerarDocumentoEquivalente"));
                        final java.lang.Class exceptionClass = java.lang.Class
                                .forName(exceptionClassName);
                        final java.lang.reflect.Constructor constructor = exceptionClass
                                .getConstructor(String.class);
                        final java.lang.Exception ex = (java.lang.Exception) constructor
                                .newInstance(f.getMessage());
                        // message class
                        final java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                        "GenerarDocumentoEquivalente"));
                        final java.lang.Class messageClass = java.lang.Class
                                .forName(messageClassName);
                        final java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        final java.lang.reflect.Method m = exceptionClass.getMethod(
                                "setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof com.colsanitas.www.contabilizacionpines.GenerarDocumentoEquivalenteFaultException) {
                            throw (com.colsanitas.www.contabilizacionpines.GenerarDocumentoEquivalenteFaultException) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (final java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (final java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (final java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (final java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (final java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (final java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see com.colsanitas.www.contabilizacionpines.GestionDocumentoEquivalente#startgenerarDocumentoEquivalente
     * @param generarDocumentoEquivEnt70
     * 
     * @param headerRqust71
     */
    public void startgenerarDocumentoEquivalente(

            final com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivEnt generarDocumentoEquivEnt70,
            final com.colsanitas.gestiondocumentoequivalente.HeaderRqust headerRqust71,

            final com.colsanitas.www.contabilizacionpines.GestionDocumentoEquivalenteCallbackHandler callback)

    throws java.rmi.RemoteException {

        final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                .createClient(_operations[2].getName());
        _operationClient.getOptions().setAction(
                "http://colsanitas.com/GestionDocumentoEquivalente/GenerarDocumentoEquivalente");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                generarDocumentoEquivEnt70, optimizeContent(new javax.xml.namespace.QName(
                        "http://colsanitas.com/GestionDocumentoEquivalente/",
                        "generarDocumentoEquivalente")), new javax.xml.namespace.QName(
                        "http://colsanitas.com/GestionDocumentoEquivalente/",
                        "generarDocumentoEquivalente"));

        // add the soap_headers only if they are not null
        if (headerRqust71 != null) {

            final org.apache.axiom.om.OMElement omElementheaderRqust71 = toOM(headerRqust71,
                    optimizeContent(new javax.xml.namespace.QName(
                            "http://colsanitas.com/GestionDocumentoEquivalente/",
                            "generarDocumentoEquivalente")));
            addHeader(omElementheaderRqust71, env);

        }

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            @Override
            public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
                try {
                    final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
                            .getEnvelope();

                    final java.lang.Object object = fromOM(
                            resultEnv.getBody().getFirstElement(),
                            com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivSal.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgenerarDocumentoEquivalente((com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivSal) object);

                } catch (final org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgenerarDocumentoEquivalente(e);
                }
            }

            @Override
            public void onError(final java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    final org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap
                                .containsKey(new org.apache.axis2.client.FaultMapKey(faultElt
                                        .getQName(), "GenerarDocumentoEquivalente"))) {
                            // make the fault by reflection
                            try {
                                final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                        .get(new org.apache.axis2.client.FaultMapKey(faultElt
                                                .getQName(), "GenerarDocumentoEquivalente"));
                                final java.lang.Class exceptionClass = java.lang.Class
                                        .forName(exceptionClassName);
                                final java.lang.reflect.Constructor constructor = exceptionClass
                                        .getConstructor(String.class);
                                final java.lang.Exception ex = (java.lang.Exception) constructor
                                        .newInstance(f.getMessage());
                                // message class
                                final java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                        .get(new org.apache.axis2.client.FaultMapKey(faultElt
                                                .getQName(), "GenerarDocumentoEquivalente"));
                                final java.lang.Class messageClass = java.lang.Class
                                        .forName(messageClassName);
                                final java.lang.Object messageObject = fromOM(faultElt,
                                        messageClass, null);
                                final java.lang.reflect.Method m = exceptionClass.getMethod(
                                        "setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                if (ex instanceof com.colsanitas.www.contabilizacionpines.GenerarDocumentoEquivalenteFaultException) {
                                    callback.receiveErrorgenerarDocumentoEquivalente(ex);
                                    return;
                                }

                                callback.receiveErrorgenerarDocumentoEquivalente(new java.rmi.RemoteException(
                                        ex.getMessage(), ex));
                            } catch (final java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgenerarDocumentoEquivalente(f);
                            } catch (final java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgenerarDocumentoEquivalente(f);
                            } catch (final java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgenerarDocumentoEquivalente(f);
                            } catch (final java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgenerarDocumentoEquivalente(f);
                            } catch (final java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgenerarDocumentoEquivalente(f);
                            } catch (final java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgenerarDocumentoEquivalente(f);
                            } catch (final org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgenerarDocumentoEquivalente(f);
                            }
                        } else {
                            callback.receiveErrorgenerarDocumentoEquivalente(f);
                        }
                    } else {
                        callback.receiveErrorgenerarDocumentoEquivalente(f);
                    }
                } else {
                    callback.receiveErrorgenerarDocumentoEquivalente(error);
                }
            }

            @Override
            public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
                final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
                        .getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            @Override
            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (final org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgenerarDocumentoEquivalente(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[2].getMessageReceiver() == null
                && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[2].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * A utility method that copies the namepaces from the SOAPEnvelope
     */
    private java.util.Map getEnvelopeNamespaces(final org.apache.axiom.soap.SOAPEnvelope env) {
        final java.util.Map returnMap = new java.util.HashMap();
        final java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            final org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator
                    .next();
            returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
        }
        return returnMap;
    }

    private final javax.xml.namespace.QName[] opNameArray = null;

    private boolean optimizeContent(final javax.xml.namespace.QName opName) {

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;
            }
        }
        return false;
    }

    // http://localhost:8080/Contabilizacion_Pines/GestionDocumentoEquivalenteSOAP
    private org.apache.axiom.om.OMElement toOM(
            final com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivEnt param,
            final boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(
                    com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivEnt.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (final org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            final com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivSal param,
            final boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(
                    com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivSal.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (final org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            final com.colsanitas.gestiondocumentoequivalente.AnularDocumentoEquivalenteFault param,
            final boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param
                    .getOMElement(
                            com.colsanitas.gestiondocumentoequivalente.AnularDocumentoEquivalenteFault.MY_QNAME,
                            org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (final org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            final com.colsanitas.gestiondocumentoequivalente.HeaderRqust param,
            final boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(
                    com.colsanitas.gestiondocumentoequivalente.HeaderRqust.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (final org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            final com.colsanitas.gestiondocumentoequivalente.HeaderRspns param,
            final boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(
                    com.colsanitas.gestiondocumentoequivalente.HeaderRspns.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (final org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            final com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivEnt param,
            final boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param
                    .getOMElement(
                            com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivEnt.MY_QNAME,
                            org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (final org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            final com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivSal param,
            final boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param
                    .getOMElement(
                            com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivSal.MY_QNAME,
                            org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (final org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            final com.colsanitas.gestiondocumentoequivalente.ConsultarDocumentoEquivalenteFault param,
            final boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param
                    .getOMElement(
                            com.colsanitas.gestiondocumentoequivalente.ConsultarDocumentoEquivalenteFault.MY_QNAME,
                            org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (final org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            final com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivEnt param,
            final boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param
                    .getOMElement(
                            com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivEnt.MY_QNAME,
                            org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (final org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            final com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivSal param,
            final boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param
                    .getOMElement(
                            com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivSal.MY_QNAME,
                            org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (final org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            final com.colsanitas.gestiondocumentoequivalente.GenerarDocumentoEquivalenteFault param,
            final boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param
                    .getOMElement(
                            com.colsanitas.gestiondocumentoequivalente.GenerarDocumentoEquivalenteFault.MY_QNAME,
                            org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (final org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            final org.apache.axiom.soap.SOAPFactory factory,
            final com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivEnt param,
            final boolean optimizeContent, final javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {

        try {

            final org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope
                    .getBody()
                    .addChild(
                            param.getOMElement(
                                    com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivEnt.MY_QNAME,
                                    factory));
            return emptyEnvelope;
        } catch (final org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            final org.apache.axiom.soap.SOAPFactory factory,
            final com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivEnt param,
            final boolean optimizeContent, final javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {

        try {

            final org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope
                    .getBody()
                    .addChild(
                            param.getOMElement(
                                    com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivEnt.MY_QNAME,
                                    factory));
            return emptyEnvelope;
        } catch (final org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            final org.apache.axiom.soap.SOAPFactory factory,
            final com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivEnt param,
            final boolean optimizeContent, final javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {

        try {

            final org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope
                    .getBody()
                    .addChild(
                            param.getOMElement(
                                    com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivEnt.MY_QNAME,
                                    factory));
            return emptyEnvelope;
        } catch (final org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    /**
     * get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            final org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(final org.apache.axiom.om.OMElement param,
            final java.lang.Class type, final java.util.Map extraNamespaces)
            throws org.apache.axis2.AxisFault {

        try {

            if (com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivEnt.class
                    .equals(type)) {

                return com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivEnt.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivSal.class
                    .equals(type)) {

                return com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivSal.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.colsanitas.gestiondocumentoequivalente.AnularDocumentoEquivalenteFault.class
                    .equals(type)) {

                return com.colsanitas.gestiondocumentoequivalente.AnularDocumentoEquivalenteFault.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.colsanitas.gestiondocumentoequivalente.HeaderRqust.class.equals(type)) {

                return com.colsanitas.gestiondocumentoequivalente.HeaderRqust.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.colsanitas.gestiondocumentoequivalente.HeaderRspns.class.equals(type)) {

                return com.colsanitas.gestiondocumentoequivalente.HeaderRspns.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivEnt.class
                    .equals(type)) {

                return com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivEnt.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivSal.class
                    .equals(type)) {

                return com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivSal.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.colsanitas.gestiondocumentoequivalente.ConsultarDocumentoEquivalenteFault.class
                    .equals(type)) {

                return com.colsanitas.gestiondocumentoequivalente.ConsultarDocumentoEquivalenteFault.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.colsanitas.gestiondocumentoequivalente.HeaderRqust.class.equals(type)) {

                return com.colsanitas.gestiondocumentoequivalente.HeaderRqust.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.colsanitas.gestiondocumentoequivalente.HeaderRspns.class.equals(type)) {

                return com.colsanitas.gestiondocumentoequivalente.HeaderRspns.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivEnt.class
                    .equals(type)) {

                return com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivEnt.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivSal.class
                    .equals(type)) {

                return com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivSal.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.colsanitas.gestiondocumentoequivalente.GenerarDocumentoEquivalenteFault.class
                    .equals(type)) {

                return com.colsanitas.gestiondocumentoequivalente.GenerarDocumentoEquivalenteFault.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.colsanitas.gestiondocumentoequivalente.HeaderRqust.class.equals(type)) {

                return com.colsanitas.gestiondocumentoequivalente.HeaderRqust.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.colsanitas.gestiondocumentoequivalente.HeaderRspns.class.equals(type)) {

                return com.colsanitas.gestiondocumentoequivalente.HeaderRspns.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }
            
            if (com.colsanitas.osi.srv.gestiondocequivservice.GenerarFacturaEnt.class
                    .equals(type)) {

                return com.colsanitas.osi.srv.gestiondocequivservice.GenerarFacturaEnt.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.colsanitas.osi.srv.gestiondocequivservice.GenerarFacturaSal.class
                    .equals(type)) {

                return com.colsanitas.osi.srv.gestiondocequivservice.GenerarFacturaSal.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.colsanitas.gestiondocumentoequivalente.GenerarFacturaFault.class
                    .equals(type)) {

                return com.colsanitas.gestiondocumentoequivalente.GenerarFacturaFault.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.colsanitas.gestiondocumentoequivalente.HeaderRqust.class.equals(type)) {

                return com.colsanitas.gestiondocumentoequivalente.HeaderRqust.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

            if (com.colsanitas.gestiondocumentoequivalente.HeaderRspns.class.equals(type)) {

                return com.colsanitas.gestiondocumentoequivalente.HeaderRspns.Factory.parse(param
                        .getXMLStreamReaderWithoutCaching());

            }

        } catch (final java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
    }

}
