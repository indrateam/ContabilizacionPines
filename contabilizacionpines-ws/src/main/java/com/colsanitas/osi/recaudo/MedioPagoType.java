/**
 * MedioPagoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.colsanitas.osi.recaudo;

/**
 * MedioPagoType bean class
 */
@SuppressWarnings({"unchecked","unused","rawtypes"})
public class MedioPagoType implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name = medioPagoType Namespace URI
     * = http://colsanitas.com/osi/recaudo Namespace Prefix = ns7
     */

    /**
                 * 
                 */
    private static final long serialVersionUID = -7928778542512122980L;

    /**
     * field for Codigo
     */

    protected java.lang.String localCodigo;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localCodigoTracker = false;

    public boolean isCodigoSpecified() {
        return localCodigoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCodigo() {
        return localCodigo;
    }

    /**
     * Auto generated setter method
     * @param param Codigo
     */
    public void setCodigo(final java.lang.String param) {
        localCodigoTracker = param != null;

        this.localCodigo = param;

    }

    /**
     * field for TipoMedio
     */

    protected java.lang.String localTipoMedio;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localTipoMedioTracker = false;

    public boolean isTipoMedioSpecified() {
        return localTipoMedioTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTipoMedio() {
        return localTipoMedio;
    }

    /**
     * Auto generated setter method
     * @param param TipoMedio
     */
    public void setTipoMedio(final java.lang.String param) {
        localTipoMedioTracker = param != null;

        this.localTipoMedio = param;

    }

    /**
     * field for CodigoEntFinanciera
     */

    protected com.colsanitas.osi.recaudo.CodigoEntidadFinType localCodigoEntFinanciera;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localCodigoEntFinancieraTracker = false;

    public boolean isCodigoEntFinancieraSpecified() {
        return localCodigoEntFinancieraTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.recaudo.CodigoEntidadFinType
     */
    public com.colsanitas.osi.recaudo.CodigoEntidadFinType getCodigoEntFinanciera() {
        return localCodigoEntFinanciera;
    }

    /**
     * Auto generated setter method
     * @param param CodigoEntFinanciera
     */
    public void setCodigoEntFinanciera(final com.colsanitas.osi.recaudo.CodigoEntidadFinType param) {
        localCodigoEntFinancieraTracker = param != null;

        this.localCodigoEntFinanciera = param;

    }

    /**
     * field for NumeroTarjeta
     */

    protected java.lang.String localNumeroTarjeta;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localNumeroTarjetaTracker = false;

    public boolean isNumeroTarjetaSpecified() {
        return localNumeroTarjetaTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNumeroTarjeta() {
        return localNumeroTarjeta;
    }

    /**
     * Auto generated setter method
     * @param param NumeroTarjeta
     */
    public void setNumeroTarjeta(final java.lang.String param) {
        localNumeroTarjetaTracker = param != null;

        this.localNumeroTarjeta = param;

    }

    /**
     * field for NumeroAprobacion
     */

    protected java.lang.String localNumeroAprobacion;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localNumeroAprobacionTracker = false;

    public boolean isNumeroAprobacionSpecified() {
        return localNumeroAprobacionTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNumeroAprobacion() {
        return localNumeroAprobacion;
    }

    /**
     * Auto generated setter method
     * @param param NumeroAprobacion
     */
    public void setNumeroAprobacion(final java.lang.String param) {
        localNumeroAprobacionTracker = param != null;

        this.localNumeroAprobacion = param;

    }

    /**
     * field for Valor
     */

    protected com.colsanitas.osi.comun.organizacion.PrecioType localValor;

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
     * @return com.colsanitas.osi.comun.organizacion.PrecioType
     */
    public com.colsanitas.osi.comun.organizacion.PrecioType getValor() {
        return localValor;
    }

    /**
     * Auto generated setter method
     * @param param Valor
     */
    public void setValor(final com.colsanitas.osi.comun.organizacion.PrecioType param) {
        localValorTracker = param != null;

        this.localValor = param;

    }

    /**
     * field for ImpuestoTarjeta
     */

    protected java.lang.String localImpuestoTarjeta;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localImpuestoTarjetaTracker = false;

    public boolean isImpuestoTarjetaSpecified() {
        return localImpuestoTarjetaTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getImpuestoTarjeta() {
        return localImpuestoTarjeta;
    }

    /**
     * Auto generated setter method
     * @param param ImpuestoTarjeta
     */
    public void setImpuestoTarjeta(final java.lang.String param) {
        localImpuestoTarjetaTracker = param != null;

        this.localImpuestoTarjeta = param;

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
                        namespacePrefix + ":medioPagoType", xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "medioPagoType", xmlWriter);
            }

        }
        if (localCodigoTracker) {
            namespace = "http://colsanitas.com/osi/recaudo";
            writeStartElement(null, namespace, "codigo", xmlWriter);

            if (localCodigo == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("codigo cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localCodigo);

            }

            xmlWriter.writeEndElement();
        }
        if (localTipoMedioTracker) {
            namespace = "http://colsanitas.com/osi/recaudo";
            writeStartElement(null, namespace, "tipoMedio", xmlWriter);

            if (localTipoMedio == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("tipoMedio cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localTipoMedio);

            }

            xmlWriter.writeEndElement();
        }
        if (localCodigoEntFinancieraTracker) {
            if (localCodigoEntFinanciera == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "codigoEntFinanciera cannot be null!!");
            }
            localCodigoEntFinanciera.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/recaudo", "codigoEntFinanciera"), xmlWriter);
        }
        if (localNumeroTarjetaTracker) {
            namespace = "http://colsanitas.com/osi/recaudo";
            writeStartElement(null, namespace, "numeroTarjeta", xmlWriter);

            if (localNumeroTarjeta == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException(
                        "numeroTarjeta cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localNumeroTarjeta);

            }

            xmlWriter.writeEndElement();
        }
        if (localNumeroAprobacionTracker) {
            namespace = "http://colsanitas.com/osi/recaudo";
            writeStartElement(null, namespace, "numeroAprobacion", xmlWriter);

            if (localNumeroAprobacion == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException(
                        "numeroAprobacion cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localNumeroAprobacion);

            }

            xmlWriter.writeEndElement();
        }
        if (localValorTracker) {
            if (localValor == null) {
                throw new org.apache.axis2.databinding.ADBException("valor cannot be null!!");
            }
            localValor.serialize(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "valor"), xmlWriter);
        }
        if (localImpuestoTarjetaTracker) {
            namespace = "http://colsanitas.com/osi/recaudo";
            writeStartElement(null, namespace, "impuestoTarjeta", xmlWriter);

            if (localImpuestoTarjeta == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException(
                        "impuestoTarjeta cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localImpuestoTarjeta);

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

        if (localCodigoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "codigo"));

            if (localCodigo != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localCodigo));
            } else {
                throw new org.apache.axis2.databinding.ADBException("codigo cannot be null!!");
            }
        }
        if (localTipoMedioTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "tipoMedio"));

            if (localTipoMedio != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localTipoMedio));
            } else {
                throw new org.apache.axis2.databinding.ADBException("tipoMedio cannot be null!!");
            }
        }
        if (localCodigoEntFinancieraTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "codigoEntFinanciera"));

            if (localCodigoEntFinanciera == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "codigoEntFinanciera cannot be null!!");
            }
            elementList.add(localCodigoEntFinanciera);
        }
        if (localNumeroTarjetaTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "numeroTarjeta"));

            if (localNumeroTarjeta != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localNumeroTarjeta));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "numeroTarjeta cannot be null!!");
            }
        }
        if (localNumeroAprobacionTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "numeroAprobacion"));

            if (localNumeroAprobacion != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localNumeroAprobacion));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "numeroAprobacion cannot be null!!");
            }
        }
        if (localValorTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "valor"));

            if (localValor == null) {
                throw new org.apache.axis2.databinding.ADBException("valor cannot be null!!");
            }
            elementList.add(localValor);
        }
        if (localImpuestoTarjetaTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "impuestoTarjeta"));

            if (localImpuestoTarjeta != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localImpuestoTarjeta));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "impuestoTarjeta cannot be null!!");
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
        public static MedioPagoType parse(final javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            MedioPagoType object = new MedioPagoType();

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

                        if (!"medioPagoType".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(
                                    nsPrefix);
                            return (MedioPagoType) com.colsanitas.gestiondocumentoequivalente.ExtensionMapper
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

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "codigo" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCodigo(org.apache.axis2.databinding.utils.ConverterUtil
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
                                "tipoMedio").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "tipoMedio" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTipoMedio(org.apache.axis2.databinding.utils.ConverterUtil
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
                                "codigoEntFinanciera").equals(reader.getName())) {

                    object.setCodigoEntFinanciera(com.colsanitas.osi.recaudo.CodigoEntidadFinType.Factory
                            .parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                                "numeroTarjeta").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "numeroTarjeta" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNumeroTarjeta(org.apache.axis2.databinding.utils.ConverterUtil
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
                                "numeroAprobacion").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "numeroAprobacion" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNumeroAprobacion(org.apache.axis2.databinding.utils.ConverterUtil
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

                    object.setValor(com.colsanitas.osi.comun.organizacion.PrecioType.Factory
                            .parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                                "impuestoTarjeta").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "impuestoTarjeta" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setImpuestoTarjeta(org.apache.axis2.databinding.utils.ConverterUtil
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
