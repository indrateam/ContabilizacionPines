/**
 * PrecioType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.colsanitas.osi.comun.organizacion;

/**
 * PrecioType bean class
 */
@SuppressWarnings({"unchecked","unused","rawtypes"})
public class PrecioType implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name = precioType Namespace URI =
     * http://colsanitas.com/osi/comun/organizacion Namespace Prefix = ns2
     */

    /**
                 * 
                 */
    private static final long serialVersionUID = 1341358394113481499L;

    /**
     * field for ValorTotal
     */

    protected java.lang.String localValorTotal;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localValorTotalTracker = false;

    public boolean isValorTotalSpecified() {
        return localValorTotalTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getValorTotal() {
        return localValorTotal;
    }

    /**
     * Auto generated setter method
     * @param param ValorTotal
     */
    public void setValorTotal(final java.lang.String param) {
        localValorTotalTracker = param != null;

        this.localValorTotal = param;

    }

    /**
     * field for ValorImpuesto
     */

    protected java.lang.String localValorImpuesto;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localValorImpuestoTracker = false;

    public boolean isValorImpuestoSpecified() {
        return localValorImpuestoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getValorImpuesto() {
        return localValorImpuesto;
    }

    /**
     * Auto generated setter method
     * @param param ValorImpuesto
     */
    public void setValorImpuesto(final java.lang.String param) {
        localValorImpuestoTracker = param != null;

        this.localValorImpuesto = param;

    }

    /**
     * field for ValorNeto
     */

    protected java.lang.String localValorNeto;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localValorNetoTracker = false;

    public boolean isValorNetoSpecified() {
        return localValorNetoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getValorNeto() {
        return localValorNeto;
    }

    /**
     * Auto generated setter method
     * @param param ValorNeto
     */
    public void setValorNeto(final java.lang.String param) {
        localValorNetoTracker = param != null;

        this.localValorNeto = param;

    }

    /**
     * field for ValorDescuento
     */

    protected java.lang.String localValorDescuento;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localValorDescuentoTracker = false;

    public boolean isValorDescuentoSpecified() {
        return localValorDescuentoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getValorDescuento() {
        return localValorDescuento;
    }

    /**
     * Auto generated setter method
     * @param param ValorDescuento
     */
    public void setValorDescuento(final java.lang.String param) {
        localValorDescuentoTracker = param != null;

        this.localValorDescuento = param;

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
                    "http://colsanitas.com/osi/comun/organizacion");
            if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":precioType", xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "precioType", xmlWriter);
            }

        }
        if (localValorTotalTracker) {
            namespace = "http://colsanitas.com/osi/comun/organizacion";
            writeStartElement(null, namespace, "valorTotal", xmlWriter);

            if (localValorTotal == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("valorTotal cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localValorTotal);

            }

            xmlWriter.writeEndElement();
        }
        if (localValorImpuestoTracker) {
            namespace = "http://colsanitas.com/osi/comun/organizacion";
            writeStartElement(null, namespace, "valorImpuesto", xmlWriter);

            if (localValorImpuesto == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException(
                        "valorImpuesto cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localValorImpuesto);

            }

            xmlWriter.writeEndElement();
        }
        if (localValorNetoTracker) {
            namespace = "http://colsanitas.com/osi/comun/organizacion";
            writeStartElement(null, namespace, "valorNeto", xmlWriter);

            if (localValorNeto == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("valorNeto cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localValorNeto);

            }

            xmlWriter.writeEndElement();
        }
        if (localValorDescuentoTracker) {
            namespace = "http://colsanitas.com/osi/comun/organizacion";
            writeStartElement(null, namespace, "valorDescuento", xmlWriter);

            if (localValorDescuento == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException(
                        "valorDescuento cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localValorDescuento);

            }

            xmlWriter.writeEndElement();
        }
        xmlWriter.writeEndElement();

    }

    private static java.lang.String generatePrefix(final java.lang.String namespace) {
        if (namespace.equals("http://colsanitas.com/osi/comun/organizacion")) {
            return "ns2";
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

        if (localValorTotalTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "valorTotal"));

            if (localValorTotal != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localValorTotal));
            } else {
                throw new org.apache.axis2.databinding.ADBException("valorTotal cannot be null!!");
            }
        }
        if (localValorImpuestoTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "valorImpuesto"));

            if (localValorImpuesto != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localValorImpuesto));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "valorImpuesto cannot be null!!");
            }
        }
        if (localValorNetoTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "valorNeto"));

            if (localValorNeto != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localValorNeto));
            } else {
                throw new org.apache.axis2.databinding.ADBException("valorNeto cannot be null!!");
            }
        }
        if (localValorDescuentoTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "valorDescuento"));

            if (localValorDescuento != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localValorDescuento));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "valorDescuento cannot be null!!");
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
        public static PrecioType parse(final javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            PrecioType object = new PrecioType();

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

                        if (!"precioType".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(
                                    nsPrefix);
                            return (PrecioType) com.colsanitas.gestiondocumentoequivalente.ExtensionMapper
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
                        && new javax.xml.namespace.QName(
                                "http://colsanitas.com/osi/comun/organizacion", "valorTotal")
                                .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "valorTotal" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setValorTotal(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                                "http://colsanitas.com/osi/comun/organizacion", "valorImpuesto")
                                .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "valorImpuesto" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setValorImpuesto(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                                "http://colsanitas.com/osi/comun/organizacion", "valorNeto")
                                .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "valorNeto" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setValorNeto(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                                "http://colsanitas.com/osi/comun/organizacion", "valorDescuento")
                                .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "valorDescuento" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setValorDescuento(org.apache.axis2.databinding.utils.ConverterUtil
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
