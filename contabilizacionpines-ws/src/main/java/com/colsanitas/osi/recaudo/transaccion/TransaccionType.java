/**
 * TransaccionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.colsanitas.osi.recaudo.transaccion;

/**
 * TransaccionType bean class
 */
@SuppressWarnings({"unchecked","unused","rawtypes"})
public class TransaccionType implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name = transaccionType Namespace
     * URI = http://colsanitas.com/osi/recaudo/Transaccion Namespace Prefix = ns9
     */

    /**
                 * 
                 */
    private static final long serialVersionUID = -152221280169169177L;

    /**
     * field for Conceptos This was an Array!
     */

    protected com.colsanitas.osi.recaudo.ConceptoType[] localConceptos;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localConceptosTracker = false;

    public boolean isConceptosSpecified() {
        return localConceptosTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.recaudo.ConceptoType[]
     */
    public com.colsanitas.osi.recaudo.ConceptoType[] getConceptos() {
        return localConceptos;
    }

    /**
     * validate the array for Conceptos
     */
    protected void validateConceptos(final com.colsanitas.osi.recaudo.ConceptoType[] param) {

    }

    /**
     * Auto generated setter method
     * @param param Conceptos
     */
    public void setConceptos(final com.colsanitas.osi.recaudo.ConceptoType[] param) {

        validateConceptos(param);

        localConceptosTracker = param != null;

        this.localConceptos = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param com.colsanitas.osi.recaudo.ConceptoType
     */
    public void addConceptos(final com.colsanitas.osi.recaudo.ConceptoType param) {
        if (localConceptos == null) {
            localConceptos = new com.colsanitas.osi.recaudo.ConceptoType[] {};
        }

        // update the setting tracker
        localConceptosTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil
                .toList(localConceptos);
        list.add(param);
        this.localConceptos = (com.colsanitas.osi.recaudo.ConceptoType[]) list
                .toArray(new com.colsanitas.osi.recaudo.ConceptoType[list.size()]);

    }

    /**
     * field for NumTransaccion
     */

    protected com.colsanitas.osi.recaudo.transaccion.NumeroTransaccionType localNumTransaccion;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localNumTransaccionTracker = false;

    public boolean isNumTransaccionSpecified() {
        return localNumTransaccionTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.recaudo.transaccion.NumeroTransaccionType
     */
    public com.colsanitas.osi.recaudo.transaccion.NumeroTransaccionType getNumTransaccion() {
        return localNumTransaccion;
    }

    /**
     * Auto generated setter method
     * @param param NumTransaccion
     */
    public void setNumTransaccion(
            final com.colsanitas.osi.recaudo.transaccion.NumeroTransaccionType param) {
        localNumTransaccionTracker = param != null;

        this.localNumTransaccion = param;

    }

    /**
     * field for Tira_auditora
     */

    protected com.colsanitas.osi.recaudo.tiraauditora.TiraAuditoraType localTira_auditora;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localTira_auditoraTracker = false;

    public boolean isTira_auditoraSpecified() {
        return localTira_auditoraTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.recaudo.tiraauditora.TiraAuditoraType
     */
    public com.colsanitas.osi.recaudo.tiraauditora.TiraAuditoraType getTira_auditora() {
        return localTira_auditora;
    }

    /**
     * Auto generated setter method
     * @param param Tira_auditora
     */
    public void setTira_auditora(
            final com.colsanitas.osi.recaudo.tiraauditora.TiraAuditoraType param) {
        localTira_auditoraTracker = param != null;

        this.localTira_auditora = param;

    }

    /**
     * field for NumRecibo
     */

    protected com.colsanitas.osi.recaudo.transaccion.NumReciboType localNumRecibo;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localNumReciboTracker = false;

    public boolean isNumReciboSpecified() {
        return localNumReciboTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.recaudo.transaccion.NumReciboType
     */
    public com.colsanitas.osi.recaudo.transaccion.NumReciboType getNumRecibo() {
        return localNumRecibo;
    }

    /**
     * Auto generated setter method
     * @param param NumRecibo
     */
    public void setNumRecibo(final com.colsanitas.osi.recaudo.transaccion.NumReciboType param) {
        localNumReciboTracker = param != null;

        this.localNumRecibo = param;

    }

    /**
     * field for CodigoCompania
     */

    protected com.colsanitas.osi.comun.organizacion.CodigoCiaType localCodigoCompania;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localCodigoCompaniaTracker = false;

    public boolean isCodigoCompaniaSpecified() {
        return localCodigoCompaniaTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.organizacion.CodigoCiaType
     */
    public com.colsanitas.osi.comun.organizacion.CodigoCiaType getCodigoCompania() {
        return localCodigoCompania;
    }

    /**
     * Auto generated setter method
     * @param param CodigoCompania
     */
    public void setCodigoCompania(final com.colsanitas.osi.comun.organizacion.CodigoCiaType param) {
        localCodigoCompaniaTracker = param != null;

        this.localCodigoCompania = param;

    }

    /**
     * field for MediosPago This was an Array!
     */

    protected com.colsanitas.osi.recaudo.MedioPagoType[] localMediosPago;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localMediosPagoTracker = false;

    public boolean isMediosPagoSpecified() {
        return localMediosPagoTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.recaudo.MedioPagoType[]
     */
    public com.colsanitas.osi.recaudo.MedioPagoType[] getMediosPago() {
        return localMediosPago;
    }

    /**
     * validate the array for MediosPago
     */
    protected void validateMediosPago(final com.colsanitas.osi.recaudo.MedioPagoType[] param) {

    }

    /**
     * Auto generated setter method
     * @param param MediosPago
     */
    public void setMediosPago(final com.colsanitas.osi.recaudo.MedioPagoType[] param) {

        validateMediosPago(param);

        localMediosPagoTracker = param != null;

        this.localMediosPago = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param com.colsanitas.osi.recaudo.MedioPagoType
     */
    public void addMediosPago(final com.colsanitas.osi.recaudo.MedioPagoType param) {
        if (localMediosPago == null) {
            localMediosPago = new com.colsanitas.osi.recaudo.MedioPagoType[] {};
        }

        // update the setting tracker
        localMediosPagoTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil
                .toList(localMediosPago);
        list.add(param);
        this.localMediosPago = (com.colsanitas.osi.recaudo.MedioPagoType[]) list
                .toArray(new com.colsanitas.osi.recaudo.MedioPagoType[list.size()]);

    }

    /**
     * field for NumFactura
     */

    protected com.colsanitas.osi.recaudo.transaccion.NumFacturaType localNumFactura;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localNumFacturaTracker = false;

    public boolean isNumFacturaSpecified() {
        return localNumFacturaTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.recaudo.transaccion.NumFacturaType
     */
    public com.colsanitas.osi.recaudo.transaccion.NumFacturaType getNumFactura() {
        return localNumFactura;
    }

    /**
     * Auto generated setter method
     * @param param NumFactura
     */
    public void setNumFactura(final com.colsanitas.osi.recaudo.transaccion.NumFacturaType param) {
        localNumFacturaTracker = param != null;

        this.localNumFactura = param;

    }

    /**
     * 
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    @Override
    public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {

        org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
                this, parentQName);
        return factory.createOMElement(dataSource, parentQName);

    }

    @Override
    public void serialize(final javax.xml.namespace.QName parentQName,
            final javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    @Override
    public void serialize(final javax.xml.namespace.QName parentQName,
            final javax.xml.stream.XMLStreamWriter xmlWriter, final boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

        if (serializeType) {

            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "http://colsanitas.com/osi/recaudo/Transaccion");
            if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":transaccionType", xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "transaccionType", xmlWriter);
            }

        }
        if (localConceptosTracker) {
            if (localConceptos != null) {
                for (int i = 0; i < localConceptos.length; i++) {
                    if (localConceptos[i] != null) {
                        localConceptos[i].serialize(new javax.xml.namespace.QName(
                                "http://colsanitas.com/osi/recaudo/Transaccion", "conceptos"),
                                xmlWriter);
                    } else {

                        // we don't have to do any thing since minOccures is zero

                    }

                }
            } else {

                throw new org.apache.axis2.databinding.ADBException("conceptos cannot be null!!");

            }
        }
        if (localNumTransaccionTracker) {
            if (localNumTransaccion == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "numTransaccion cannot be null!!");
            }
            localNumTransaccion.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/recaudo/Transaccion", "numTransaccion"), xmlWriter);
        }
        if (localTira_auditoraTracker) {
            if (localTira_auditora == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "tira_auditora cannot be null!!");
            }
            localTira_auditora.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/recaudo/Transaccion", "tira_auditora"), xmlWriter);
        }
        if (localNumReciboTracker) {
            if (localNumRecibo == null) {
                throw new org.apache.axis2.databinding.ADBException("numRecibo cannot be null!!");
            }
            localNumRecibo.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/recaudo/Transaccion", "numRecibo"), xmlWriter);
        }
        if (localCodigoCompaniaTracker) {
            if (localCodigoCompania == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "codigoCompania cannot be null!!");
            }
            localCodigoCompania.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/recaudo/Transaccion", "codigoCompania"), xmlWriter);
        }
        if (localMediosPagoTracker) {
            if (localMediosPago != null) {
                for (int i = 0; i < localMediosPago.length; i++) {
                    if (localMediosPago[i] != null) {
                        localMediosPago[i].serialize(new javax.xml.namespace.QName(
                                "http://colsanitas.com/osi/recaudo/Transaccion", "mediosPago"),
                                xmlWriter);
                    } else {

                        // we don't have to do any thing since minOccures is zero

                    }

                }
            } else {

                throw new org.apache.axis2.databinding.ADBException("mediosPago cannot be null!!");

            }
        }
        if (localNumFacturaTracker) {
            if (localNumFactura == null) {
                throw new org.apache.axis2.databinding.ADBException("numFactura cannot be null!!");
            }
            localNumFactura.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/recaudo/Transaccion", "numFactura"), xmlWriter);
        }
        xmlWriter.writeEndElement();

    }

    private static java.lang.String generatePrefix(final java.lang.String namespace) {
        if (namespace.equals("http://colsanitas.com/osi/recaudo/Transaccion")) {
            return "ns9";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix, final java.lang.String namespace,
            final java.lang.String localPart, final javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
        if (writerPrefix != null) {
            xmlWriter.writeStartElement(namespace, localPart);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(final java.lang.String prefix, final java.lang.String namespace,
            final java.lang.String attName, final java.lang.String attValue,
            final javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        if (xmlWriter.getPrefix(namespace) == null) {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
        xmlWriter.writeAttribute(namespace, attName, attValue);
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(final java.lang.String namespace, final java.lang.String attName,
            final java.lang.String attValue, final javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(final java.lang.String namespace,
            final java.lang.String attName, final javax.xml.namespace.QName qname,
            final javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }

    /**
     * method to handle Qnames
     */

    private void writeQName(final javax.xml.namespace.QName qname,
            final javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();
        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":"
                        + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(qname));
            }

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(qname));
        }
    }

    private void writeQNames(final javax.xml.namespace.QName[] qnames,
            final javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }
                namespaceURI = qnames[i].getNamespaceURI();
                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);
                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite
                                .append(prefix)
                                .append(":")
                                .append(org.apache.axis2.databinding.utils.ConverterUtil
                                        .convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToString(qnames[i]));
                }
            }
            xmlWriter.writeCharacters(stringToWrite.toString());
        }

    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(final javax.xml.stream.XMLStreamWriter xmlWriter,
            final java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);
        if (prefix == null) {
            prefix = generatePrefix(namespace);
            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);
                if (uri == null || uri.length() == 0) {
                    break;
                }
                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
        return prefix;
    }

    /**
     * databinding method to get an XML representation of this object
     * 
     */
    @Override
    public javax.xml.stream.XMLStreamReader getPullParser(final javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {

        java.util.ArrayList elementList = new java.util.ArrayList();
        java.util.ArrayList attribList = new java.util.ArrayList();

        if (localConceptosTracker) {
            if (localConceptos != null) {
                for (int i = 0; i < localConceptos.length; i++) {

                    if (localConceptos[i] != null) {
                        elementList.add(new javax.xml.namespace.QName(
                                "http://colsanitas.com/osi/recaudo/Transaccion", "conceptos"));
                        elementList.add(localConceptos[i]);
                    } else {

                        // nothing to do

                    }

                }
            } else {

                throw new org.apache.axis2.databinding.ADBException("conceptos cannot be null!!");

            }

        }
        if (localNumTransaccionTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/recaudo/Transaccion", "numTransaccion"));

            if (localNumTransaccion == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "numTransaccion cannot be null!!");
            }
            elementList.add(localNumTransaccion);
        }
        if (localTira_auditoraTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/recaudo/Transaccion", "tira_auditora"));

            if (localTira_auditora == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "tira_auditora cannot be null!!");
            }
            elementList.add(localTira_auditora);
        }
        if (localNumReciboTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/recaudo/Transaccion", "numRecibo"));

            if (localNumRecibo == null) {
                throw new org.apache.axis2.databinding.ADBException("numRecibo cannot be null!!");
            }
            elementList.add(localNumRecibo);
        }
        if (localCodigoCompaniaTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/recaudo/Transaccion", "codigoCompania"));

            if (localCodigoCompania == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "codigoCompania cannot be null!!");
            }
            elementList.add(localCodigoCompania);
        }
        if (localMediosPagoTracker) {
            if (localMediosPago != null) {
                for (int i = 0; i < localMediosPago.length; i++) {

                    if (localMediosPago[i] != null) {
                        elementList.add(new javax.xml.namespace.QName(
                                "http://colsanitas.com/osi/recaudo/Transaccion", "mediosPago"));
                        elementList.add(localMediosPago[i]);
                    } else {

                        // nothing to do

                    }

                }
            } else {

                throw new org.apache.axis2.databinding.ADBException("mediosPago cannot be null!!");

            }

        }
        if (localNumFacturaTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/recaudo/Transaccion", "numFactura"));

            if (localNumFactura == null) {
                throw new org.apache.axis2.databinding.ADBException("numFactura cannot be null!!");
            }
            elementList.add(localNumFactura);
        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());

    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {

        /**
         * static method to create the object Precondition: If this object is an element, the
         * current or next start element starts this object and any intervening reader events are
         * ignorable If this object is not an element, it is a complex type and the reader is at the
         * event just after the outer start element Postcondition: If this object is an element, the
         * reader is positioned at its end element If this object is a complex type, the reader is
         * positioned at the end element of its outer element
         */
        public static TransaccionType parse(final javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            TransaccionType object = new TransaccionType();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";
            try {

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "type");
                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;
                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                        }
                        nsPrefix = nsPrefix == null ? "" : nsPrefix;

                        java.lang.String type = fullTypeName
                                .substring(fullTypeName.indexOf(":") + 1);

                        if (!"transaccionType".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(
                                    nsPrefix);
                            return (TransaccionType) com.colsanitas.gestiondocumentoequivalente.ExtensionMapper
                                    .getTypeObject(nsUri, type, reader);
                        }

                    }

                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                java.util.ArrayList list1 = new java.util.ArrayList();

                java.util.ArrayList list6 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                                "http://colsanitas.com/osi/recaudo/Transaccion", "conceptos")
                                .equals(reader.getName())) {

                    // Process the array and step past its final element's end.
                    list1.add(com.colsanitas.osi.recaudo.ConceptoType.Factory.parse(reader));

                    // loop until we find a start element that is not part of this array
                    boolean loopDone1 = false;
                    while (!loopDone1) {
                        // We should be at the end element, but make sure
                        while (!reader.isEndElement()) {
                            reader.next();
                        }
                        // Step out of this element
                        reader.next();
                        // Step to next element event.
                        while (!reader.isStartElement() && !reader.isEndElement()) {
                            reader.next();
                        }
                        if (reader.isEndElement()) {
                            // two continuous end elements means we are exiting the xml structure
                            loopDone1 = true;
                        } else {
                            if (new javax.xml.namespace.QName(
                                    "http://colsanitas.com/osi/recaudo/Transaccion", "conceptos")
                                    .equals(reader.getName())) {
                                list1.add(com.colsanitas.osi.recaudo.ConceptoType.Factory
                                        .parse(reader));

                            } else {
                                loopDone1 = true;
                            }
                        }
                    }
                    // call the converter utility to convert and set the array

                    object.setConceptos((com.colsanitas.osi.recaudo.ConceptoType[]) org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToArray(com.colsanitas.osi.recaudo.ConceptoType.class, list1));

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                                "http://colsanitas.com/osi/recaudo/Transaccion", "numTransaccion")
                                .equals(reader.getName())) {

                    object.setNumTransaccion(com.colsanitas.osi.recaudo.transaccion.NumeroTransaccionType.Factory
                            .parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                                "http://colsanitas.com/osi/recaudo/Transaccion", "tira_auditora")
                                .equals(reader.getName())) {

                    object.setTira_auditora(com.colsanitas.osi.recaudo.tiraauditora.TiraAuditoraType.Factory
                            .parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                                "http://colsanitas.com/osi/recaudo/Transaccion", "numRecibo")
                                .equals(reader.getName())) {

                    object.setNumRecibo(com.colsanitas.osi.recaudo.transaccion.NumReciboType.Factory
                            .parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                                "http://colsanitas.com/osi/recaudo/Transaccion", "codigoCompania")
                                .equals(reader.getName())) {

                    object.setCodigoCompania(com.colsanitas.osi.comun.organizacion.CodigoCiaType.Factory
                            .parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                                "http://colsanitas.com/osi/recaudo/Transaccion", "mediosPago")
                                .equals(reader.getName())) {

                    // Process the array and step past its final element's end.
                    list6.add(com.colsanitas.osi.recaudo.MedioPagoType.Factory.parse(reader));

                    // loop until we find a start element that is not part of this array
                    boolean loopDone6 = false;
                    while (!loopDone6) {
                        // We should be at the end element, but make sure
                        while (!reader.isEndElement()) {
                            reader.next();
                        }
                        // Step out of this element
                        reader.next();
                        // Step to next element event.
                        while (!reader.isStartElement() && !reader.isEndElement()) {
                            reader.next();
                        }
                        if (reader.isEndElement()) {
                            // two continuous end elements means we are exiting the xml structure
                            loopDone6 = true;
                        } else {
                            if (new javax.xml.namespace.QName(
                                    "http://colsanitas.com/osi/recaudo/Transaccion", "mediosPago")
                                    .equals(reader.getName())) {
                                list6.add(com.colsanitas.osi.recaudo.MedioPagoType.Factory
                                        .parse(reader));

                            } else {
                                loopDone6 = true;
                            }
                        }
                    }
                    // call the converter utility to convert and set the array

                    object.setMediosPago((com.colsanitas.osi.recaudo.MedioPagoType[]) org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToArray(com.colsanitas.osi.recaudo.MedioPagoType.class, list6));

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                                "http://colsanitas.com/osi/recaudo/Transaccion", "numFactura")
                                .equals(reader.getName())) {

                    object.setNumFactura(com.colsanitas.osi.recaudo.transaccion.NumFacturaType.Factory
                            .parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()) {
                    // A start element we are not expecting indicates a trailing invalid property
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement "
                            + reader.getName());
                }

            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

    }// end of factory class

}
