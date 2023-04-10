/**
 * GestionDocumentoEquivalenteMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.colsanitas.www.contabilizacionpines;

import com.osi.contabilizacionpines.webutil.TypeUtil;

/**
 * GestionDocumentoEquivalenteMessageReceiverInOut message receiver
 */
@SuppressWarnings({ "unchecked", "unused", "rawtypes" })
public class GestionDocumentoEquivalenteMessageReceiverInOut extends
        org.apache.axis2.receivers.AbstractInOutMessageReceiver {

    @Override
    public void invokeBusinessLogic(final org.apache.axis2.context.MessageContext msgContext,
            final org.apache.axis2.context.MessageContext newMsgContext)
            throws org.apache.axis2.AxisFault {

        try {

            // get the implementation class for the Web Service
            final Object obj = getTheImplementationObject(msgContext);

            final GestionDocumentoEquivalenteSkeleton skel = (GestionDocumentoEquivalenteSkeleton) obj;
            // Out Envelop
            org.apache.axiom.soap.SOAPEnvelope envelope = null;
            // Find the axisOperation that has been set by the Dispatch phase.
            final org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext()
                    .getAxisOperation();
            if (op == null) {
                throw new org.apache.axis2.AxisFault(
                        "Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
            }

            java.lang.String methodName;
            if (op.getName() != null
                    && (methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op
                            .getName().getLocalPart())) != null) {

                if ("anularDocumentoEquivalente".equals(methodName)) {

                    com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivSal anularDocumentoEquivSal4 = null;
                    final com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivEnt wrappedParam = (com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivEnt) fromOM(
                            msgContext.getEnvelope().getBody().getFirstElement(),
                            com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivEnt.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    anularDocumentoEquivSal4 =

                    skel.anularDocumentoEquivalente(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext), anularDocumentoEquivSal4,
                            false, new javax.xml.namespace.QName(
                                    "http://colsanitas.com/GestionDocumentoEquivalente/",
                                    "anularDocumentoEquivalente"));
                } else

                if ("consultarDocumentoEquivalente".equals(methodName)) {

                    com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivSal consultarDocumentoEquivSal7 = null;
                    final com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivEnt wrappedParam = (com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivEnt) fromOM(
                            msgContext.getEnvelope().getBody().getFirstElement(),
                            com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivEnt.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    consultarDocumentoEquivSal7 =

                    skel.consultarDocumentoEquivalente(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext), consultarDocumentoEquivSal7,
                            false, new javax.xml.namespace.QName(
                                    "http://colsanitas.com/GestionDocumentoEquivalente/",
                                    "consultarDocumentoEquivalente"));
                } else

                if ("generarDocumentoEquivalente".equals(methodName)) {

                    com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivSal generarDocumentoEquivSal10 = null;
                    final com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivEnt wrappedParam = (com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivEnt) fromOM(
                            msgContext.getEnvelope().getBody().getFirstElement(),
                            com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivEnt.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    generarDocumentoEquivSal10 =

                    skel.generarDocumentoEquivalente(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext), generarDocumentoEquivSal10,
                            false, new javax.xml.namespace.QName(
                                    "http://colsanitas.com/GestionDocumentoEquivalente/",
                                    "generarDocumentoEquivalente"));

                } else 

                    if("generarFactura".equals(methodName)){
                        
                        com.colsanitas.osi.srv.gestiondocequivservice.GenerarFacturaSal generarFacturaSal42 = null;
        	            final com.colsanitas.osi.srv.gestiondocequivservice.GenerarFacturaEnt wrappedParam =
                                                                     (com.colsanitas.osi.srv.gestiondocequivservice.GenerarFacturaEnt)fromOM(
                                            msgContext.getEnvelope().getBody().getFirstElement(),
                                            com.colsanitas.osi.srv.gestiondocequivservice.GenerarFacturaEnt.class,
                                            getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                        
                                                       generarFacturaSal42 =
                                                           
                                                           
                                                                 skel.generarFactura(wrappedParam)
                                                            ;
                                                    
                                                envelope = toEnvelope(getSOAPFactory(msgContext), generarFacturaSal42, false, new javax.xml.namespace.QName("http://colsanitas.com/GestionDocumentoEquivalente/",
                                                            "generarFactura"));
                 } else {
                    throw new java.lang.RuntimeException("method not found");
                }

                newMsgContext.setEnvelope(envelope);
            }
        } catch (final GenerarDocumentoEquivalenteFaultException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,
                    "GenerarDocumentoEquivalenteFault");
            final org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null) {
                f.setDetail(toOM(e.getFaultMessage(), false));
            }
            throw f;
        } catch (final ConsultarDocumentoEquivalenteFaultException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,
                    "ConsultarDocumentoEquivalenteFault");
            final org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null) {
                f.setDetail(toOM(e.getFaultMessage(), false));
            }
            throw f;
        } catch (final AnularDocumentoEquivalenteFaultException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,
                    "AnularDocumentoEquivalenteFault");
            final org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null) {
                f.setDetail(toOM(e.getFaultMessage(), false));
            }
            throw f;
        } catch (GenerarFacturaFaultException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"GenerarFacturaFault");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
          }

        catch (final java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    //
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
    
    private  org.apache.axiom.om.OMElement  toOM(com.colsanitas.osi.srv.gestiondocequivservice.GenerarFacturaEnt param, boolean optimizeContent)
    		throws org.apache.axis2.AxisFault {


    	try{
    		return param.getOMElement(com.colsanitas.osi.srv.gestiondocequivservice.GenerarFacturaEnt.MY_QNAME,
    				org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    	} catch(org.apache.axis2.databinding.ADBException e){
    		throw org.apache.axis2.AxisFault.makeFault(e);
    	}


    }

    private  org.apache.axiom.om.OMElement  toOM(com.colsanitas.osi.srv.gestiondocequivservice.GenerarFacturaSal param, boolean optimizeContent)
    		throws org.apache.axis2.AxisFault {


    	try{
    		return param.getOMElement(com.colsanitas.osi.srv.gestiondocequivservice.GenerarFacturaSal.MY_QNAME,
    				org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    	} catch(org.apache.axis2.databinding.ADBException e){
    		throw org.apache.axis2.AxisFault.makeFault(e);
    	}


    }

    private  org.apache.axiom.om.OMElement  toOM(com.colsanitas.gestiondocumentoequivalente.GenerarFacturaFault param, boolean optimizeContent)
    		throws org.apache.axis2.AxisFault {


    	try{
    		return param.getOMElement(com.colsanitas.gestiondocumentoequivalente.GenerarFacturaFault.MY_QNAME,
    				org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    	} catch(org.apache.axis2.databinding.ADBException e){
    		throw org.apache.axis2.AxisFault.makeFault(e);
    	}


    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            final org.apache.axiom.soap.SOAPFactory factory,
            final com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivSal param,
            final boolean optimizeContent, final javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        try {
            final org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope
                    .getBody()
                    .addChild(
                            param.getOMElement(
                                    com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivSal.MY_QNAME,
                                    factory));

            return emptyEnvelope;
        } catch (final org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivSal wrapAnularDocumentoEquivalente() {
        final com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivSal wrappedElement = new com.colsanitas.osi.srv.gestiondocequivservice.AnularDocumentoEquivSal();
        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            final org.apache.axiom.soap.SOAPFactory factory,
            final com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivSal param,
            final boolean optimizeContent, final javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        try {
            final org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope
                    .getBody()
                    .addChild(
                            param.getOMElement(
                                    com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivSal.MY_QNAME,
                                    factory));

            return emptyEnvelope;
        } catch (final org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivSal wrapConsultarDocumentoEquivalente() {
        final com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivSal wrappedElement = new com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocumentoEquivSal();
        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            final org.apache.axiom.soap.SOAPFactory factory,
            final com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivSal param,
            final boolean optimizeContent, final javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        try {
            final org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope
                    .getBody()
                    .addChild(
                            param.getOMElement(
                                    com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivSal.MY_QNAME,
                                    factory));

            return emptyEnvelope;
        } catch (final org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivSal wrapGenerarDocumentoEquivalente() {
        final com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivSal wrappedElement = new com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocumentoEquivSal();
        return wrappedElement;
    }
    
    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.colsanitas.osi.srv.gestiondocequivservice.GenerarFacturaSal param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
    		throws org.apache.axis2.AxisFault{
    	try{
    		org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

    		emptyEnvelope.getBody().addChild(param.getOMElement(com.colsanitas.osi.srv.gestiondocequivservice.GenerarFacturaSal.MY_QNAME,factory));


    		return emptyEnvelope;
    	} catch(org.apache.axis2.databinding.ADBException e){
    		throw org.apache.axis2.AxisFault.makeFault(e);
    	}
    }

    private com.colsanitas.osi.srv.gestiondocequivservice.GenerarFacturaSal wrapGenerarFactura(){
    	com.colsanitas.osi.srv.gestiondocequivservice.GenerarFacturaSal wrappedElement = new com.colsanitas.osi.srv.gestiondocequivservice.GenerarFacturaSal();
    	return wrappedElement;
    }

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
            
            if (com.colsanitas.osi.srv.gestiondocequivservice.GenerarFacturaEnt.class.equals(type)){

            	return com.colsanitas.osi.srv.gestiondocequivservice.GenerarFacturaEnt.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.colsanitas.osi.srv.gestiondocequivservice.GenerarFacturaSal.class.equals(type)){

            	return com.colsanitas.osi.srv.gestiondocequivservice.GenerarFacturaSal.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.colsanitas.gestiondocumentoequivalente.GenerarFacturaFault.class.equals(type)){

            	return com.colsanitas.gestiondocumentoequivalente.GenerarFacturaFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());


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

    private org.apache.axis2.AxisFault createAxisFault(final java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        final Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

}// end of class
