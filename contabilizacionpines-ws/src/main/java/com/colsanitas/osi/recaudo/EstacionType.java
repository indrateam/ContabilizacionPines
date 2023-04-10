/**
 * EstacionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.colsanitas.osi.recaudo;

/**
 * EstacionType bean class
 */
@SuppressWarnings({"unchecked","unused","rawtypes"})
public class EstacionType implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name = estacionType Namespace URI =
     * http://colsanitas.com/osi/recaudo Namespace Prefix = ns7
     */

    /**
                 * 
                 */
    private static final long serialVersionUID = 4808573033783360435L;

    /**
     * field for Codigo
     */

    protected com.colsanitas.osi.recaudo.CodigoEstacionType localCodigo;

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.recaudo.CodigoEstacionType
     */
    public com.colsanitas.osi.recaudo.CodigoEstacionType getCodigo() {
        return localCodigo;
    }

    /**
     * Auto generated setter method
     * @param param Codigo
     */
    public void setCodigo(final com.colsanitas.osi.recaudo.CodigoEstacionType param) {

        this.localCodigo = param;

    }

    /**
     * field for DireccionFisica
     */

    protected java.lang.String localDireccionFisica;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localDireccionFisicaTracker = false;

    public boolean isDireccionFisicaSpecified() {
        return localDireccionFisicaTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDireccionFisica() {
        return localDireccionFisica;
    }

    /**
     * Auto generated setter method
     * @param param DireccionFisica
     */
    public void setDireccionFisica(final java.lang.String param) {
        localDireccionFisicaTracker = param != null;

        this.localDireccionFisica = param;

    }

    /**
     * field for Nombre
     */

    protected java.lang.String localNombre;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localNombreTracker = false;

    public boolean isNombreSpecified() {
        return localNombreTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNombre() {
        return localNombre;
    }

    /**
     * Auto generated setter method
     * @param param Nombre
     */
    public void setNombre(final java.lang.String param) {
        localNombreTracker = param != null;

        this.localNombre = param;

    }

    /**
     * field for Tipo
     */

    protected java.lang.String localTipo;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localTipoTracker = false;

    public boolean isTipoSpecified() {
        return localTipoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTipo() {
        return localTipo;
    }

    /**
     * Auto generated setter method
     * @param param Tipo
     */
    public void setTipo(final java.lang.String param) {
        localTipoTracker = param != null;

        this.localTipo = param;

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
                        namespacePrefix + ":estacionType", xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "estacionType", xmlWriter);
            }

        }

        if (localCodigo == null) {
            throw new org.apache.axis2.databinding.ADBException("Codigo cannot be null!!");
        }
        localCodigo.serialize(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                "Codigo"), xmlWriter);
        if (localDireccionFisicaTracker) {
            namespace = "http://colsanitas.com/osi/recaudo";
            writeStartElement(null, namespace, "DireccionFisica", xmlWriter);

            if (localDireccionFisica == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException(
                        "DireccionFisica cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localDireccionFisica);

            }

            xmlWriter.writeEndElement();
        }
        if (localNombreTracker) {
            namespace = "http://colsanitas.com/osi/recaudo";
            writeStartElement(null, namespace, "Nombre", xmlWriter);

            if (localNombre == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Nombre cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localNombre);

            }

            xmlWriter.writeEndElement();
        }
        if (localTipoTracker) {
            namespace = "http://colsanitas.com/osi/recaudo";
            writeStartElement(null, namespace, "Tipo", xmlWriter);

            if (localTipo == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Tipo cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localTipo);

            }

            xmlWriter.writeEndElement();
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
                .add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo", "Codigo"));

        if (localCodigo == null) {
            throw new org.apache.axis2.databinding.ADBException("Codigo cannot be null!!");
        }
        elementList.add(localCodigo);
        if (localDireccionFisicaTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "DireccionFisica"));

            if (localDireccionFisica != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localDireccionFisica));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "DireccionFisica cannot be null!!");
            }
        }
        if (localNombreTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "Nombre"));

            if (localNombre != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localNombre));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Nombre cannot be null!!");
            }
        }
        if (localTipoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "Tipo"));

            if (localTipo != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localTipo));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Tipo cannot be null!!");
            }
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
        public static EstacionType parse(final javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            EstacionType object = new EstacionType();

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

                        if (!"estacionType".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(
                                    nsPrefix);
                            return (EstacionType) com.colsanitas.gestiondocumentoequivalente.ExtensionMapper
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
                                "Codigo").equals(reader.getName())) {

                    object.setCodigo(com.colsanitas.osi.recaudo.CodigoEstacionType.Factory
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
                                "DireccionFisica").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "DireccionFisica" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDireccionFisica(org.apache.axis2.databinding.utils.ConverterUtil
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
                                "Nombre").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "Nombre" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNombre(org.apache.axis2.databinding.utils.ConverterUtil
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
                                "Tipo").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "Tipo" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTipo(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToString(content));

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
