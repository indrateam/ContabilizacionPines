/**
 * ConceptoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.colsanitas.osi.recaudo;

/**
 * ConceptoType bean class
 */
@SuppressWarnings({"unchecked","unused","rawtypes"})
public class ConceptoType implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name = conceptoType Namespace URI =
     * http://colsanitas.com/osi/recaudo Namespace Prefix = ns7
     */

    /**
                 * 
                 */
    private static final long serialVersionUID = -1269811138771392626L;

    /**
     * field for Codigo
     */

    protected com.colsanitas.osi.recaudo.CodigoConceptoType localCodigo;

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.recaudo.CodigoConceptoType
     */
    public com.colsanitas.osi.recaudo.CodigoConceptoType getCodigo() {
        return localCodigo;
    }

    /**
     * Auto generated setter method
     * @param param Codigo
     */
    public void setCodigo(final com.colsanitas.osi.recaudo.CodigoConceptoType param) {

        this.localCodigo = param;

    }

    /**
     * field for Descripcion
     */

    protected java.lang.String localDescripcion;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localDescripcionTracker = false;

    public boolean isDescripcionSpecified() {
        return localDescripcionTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDescripcion() {
        return localDescripcion;
    }

    /**
     * Auto generated setter method
     * @param param Descripcion
     */
    public void setDescripcion(final java.lang.String param) {
        localDescripcionTracker = param != null;

        this.localDescripcion = param;

    }

    /**
     * field for Valor
     */

    protected java.lang.String localValor;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localValorTracker = false;

    public boolean isValorSpecified() {
        return localValorTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getValor() {
        return localValor;
    }

    /**
     * Auto generated setter method
     * @param param Valor
     */
    public void setValor(final java.lang.String param) {
        localValorTracker = param != null;

        this.localValor = param;

    }

    /**
     * field for Comportamiento
     */

    protected java.lang.String localComportamiento;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localComportamientoTracker = false;

    public boolean isComportamientoSpecified() {
        return localComportamientoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getComportamiento() {
        return localComportamiento;
    }

    /**
     * Auto generated setter method
     * @param param Comportamiento
     */
    public void setComportamiento(final java.lang.String param) {
        localComportamientoTracker = param != null;

        this.localComportamiento = param;

    }

    /**
     * field for CodigoImpuestoAsociado
     */

    protected com.colsanitas.osi.recaudo.ConceptoType localCodigoImpuestoAsociado;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localCodigoImpuestoAsociadoTracker = false;

    public boolean isCodigoImpuestoAsociadoSpecified() {
        return localCodigoImpuestoAsociadoTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.recaudo.ConceptoType
     */
    public com.colsanitas.osi.recaudo.ConceptoType getCodigoImpuestoAsociado() {
        return localCodigoImpuestoAsociado;
    }

    /**
     * Auto generated setter method
     * @param param CodigoImpuestoAsociado
     */
    public void setCodigoImpuestoAsociado(final com.colsanitas.osi.recaudo.ConceptoType param) {
        localCodigoImpuestoAsociadoTracker = param != null;

        this.localCodigoImpuestoAsociado = param;

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
                    "http://colsanitas.com/osi/recaudo");
            if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":conceptoType", xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "conceptoType", xmlWriter);
            }

        }

        if (localCodigo == null) {
            throw new org.apache.axis2.databinding.ADBException("codigo cannot be null!!");
        }
        localCodigo.serialize(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                "codigo"), xmlWriter);
        if (localDescripcionTracker) {
            namespace = "http://colsanitas.com/osi/recaudo";
            writeStartElement(null, namespace, "descripcion", xmlWriter);

            if (localDescripcion == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("descripcion cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localDescripcion);

            }

            xmlWriter.writeEndElement();
        }
        if (localValorTracker) {
            namespace = "http://colsanitas.com/osi/recaudo";
            writeStartElement(null, namespace, "valor", xmlWriter);

            if (localValor == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("valor cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localValor);

            }

            xmlWriter.writeEndElement();
        }
        if (localComportamientoTracker) {
            namespace = "http://colsanitas.com/osi/recaudo";
            writeStartElement(null, namespace, "comportamiento", xmlWriter);

            if (localComportamiento == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException(
                        "comportamiento cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localComportamiento);

            }

            xmlWriter.writeEndElement();
        }
        if (localCodigoImpuestoAsociadoTracker) {
            if (localCodigoImpuestoAsociado == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "codigoImpuestoAsociado cannot be null!!");
            }
            localCodigoImpuestoAsociado.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/recaudo", "codigoImpuestoAsociado"), xmlWriter);
        }
        xmlWriter.writeEndElement();

    }

    private static java.lang.String generatePrefix(final java.lang.String namespace) {
        if (namespace.equals("http://colsanitas.com/osi/recaudo")) {
            return "ns7";
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

        elementList
                .add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo", "codigo"));

        if (localCodigo == null) {
            throw new org.apache.axis2.databinding.ADBException("codigo cannot be null!!");
        }
        elementList.add(localCodigo);
        if (localDescripcionTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "descripcion"));

            if (localDescripcion != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localDescripcion));
            } else {
                throw new org.apache.axis2.databinding.ADBException("descripcion cannot be null!!");
            }
        }
        if (localValorTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "valor"));

            if (localValor != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localValor));
            } else {
                throw new org.apache.axis2.databinding.ADBException("valor cannot be null!!");
            }
        }
        if (localComportamientoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "comportamiento"));

            if (localComportamiento != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localComportamiento));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "comportamiento cannot be null!!");
            }
        }
        if (localCodigoImpuestoAsociadoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "codigoImpuestoAsociado"));

            if (localCodigoImpuestoAsociado == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "codigoImpuestoAsociado cannot be null!!");
            }
            elementList.add(localCodigoImpuestoAsociado);
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
        public static ConceptoType parse(final javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            ConceptoType object = new ConceptoType();

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

                        if (!"conceptoType".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(
                                    nsPrefix);
                            return (ConceptoType) com.colsanitas.gestiondocumentoequivalente.ExtensionMapper
                                    .getTypeObject(nsUri, type, reader);
                        }

                    }

                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                                "codigo").equals(reader.getName())) {

                    object.setCodigo(com.colsanitas.osi.recaudo.CodigoConceptoType.Factory
                            .parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was
                    // passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement "
                            + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                                "descripcion").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "descripcion" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDescripcion(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                                "valor").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "valor" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setValor(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                                "comportamiento").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "comportamiento" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setComportamiento(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                                "codigoImpuestoAsociado").equals(reader.getName())) {

                    object.setCodigoImpuestoAsociado(com.colsanitas.osi.recaudo.ConceptoType.Factory
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
