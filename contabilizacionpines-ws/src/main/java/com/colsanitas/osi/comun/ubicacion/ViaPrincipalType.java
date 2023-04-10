/**
 * ViaPrincipalType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.colsanitas.osi.comun.ubicacion;

/**
 * ViaPrincipalType bean class
 */
@SuppressWarnings({"unchecked","unused","rawtypes"})
public class ViaPrincipalType implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name = viaPrincipalType Namespace
     * URI = http://colsanitas.com/osi/comun/ubicacion Namespace Prefix = ns4
     */

    /**
                 * 
                 */
    private static final long serialVersionUID = 559911635022329471L;

    /**
     * field for Codigo
     */

    protected com.colsanitas.osi.comun.ubicacion.CodigoViaPrincipalType localCodigo;

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.ubicacion.CodigoViaPrincipalType
     */
    public com.colsanitas.osi.comun.ubicacion.CodigoViaPrincipalType getCodigo() {
        return localCodigo;
    }

    /**
     * Auto generated setter method
     * @param param Codigo
     */
    public void setCodigo(final com.colsanitas.osi.comun.ubicacion.CodigoViaPrincipalType param) {

        this.localCodigo = param;

    }

    /**
     * field for Descripcion
     */

    protected com.colsanitas.osi.comun.ubicacion.ViaType localDescripcion;

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
     * @return com.colsanitas.osi.comun.ubicacion.ViaType
     */
    public com.colsanitas.osi.comun.ubicacion.ViaType getDescripcion() {
        return localDescripcion;
    }

    /**
     * Auto generated setter method
     * @param param Descripcion
     */
    public void setDescripcion(final com.colsanitas.osi.comun.ubicacion.ViaType param) {
        localDescripcionTracker = param != null;

        this.localDescripcion = param;

    }

    /**
     * field for Abreviatura
     */

    protected com.colsanitas.osi.comun.ubicacion.ViaType localAbreviatura;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localAbreviaturaTracker = false;

    public boolean isAbreviaturaSpecified() {
        return localAbreviaturaTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.ubicacion.ViaType
     */
    public com.colsanitas.osi.comun.ubicacion.ViaType getAbreviatura() {
        return localAbreviatura;
    }

    /**
     * Auto generated setter method
     * @param param Abreviatura
     */
    public void setAbreviatura(final com.colsanitas.osi.comun.ubicacion.ViaType param) {
        localAbreviaturaTracker = param != null;

        this.localAbreviatura = param;

    }

    /**
     * field for NumeroRequerido
     */

    protected com.colsanitas.osi.comun.ubicacion.ViaType localNumeroRequerido;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localNumeroRequeridoTracker = false;

    public boolean isNumeroRequeridoSpecified() {
        return localNumeroRequeridoTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.ubicacion.ViaType
     */
    public com.colsanitas.osi.comun.ubicacion.ViaType getNumeroRequerido() {
        return localNumeroRequerido;
    }

    /**
     * Auto generated setter method
     * @param param NumeroRequerido
     */
    public void setNumeroRequerido(final com.colsanitas.osi.comun.ubicacion.ViaType param) {
        localNumeroRequeridoTracker = param != null;

        this.localNumeroRequerido = param;

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
                    "http://colsanitas.com/osi/comun/ubicacion");
            if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":viaPrincipalType", xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "viaPrincipalType", xmlWriter);
            }

        }

        if (localCodigo == null) {
            throw new org.apache.axis2.databinding.ADBException("codigo cannot be null!!");
        }
        localCodigo.serialize(new javax.xml.namespace.QName(
                "http://colsanitas.com/osi/comun/ubicacion", "codigo"), xmlWriter);
        if (localDescripcionTracker) {
            if (localDescripcion == null) {
                throw new org.apache.axis2.databinding.ADBException("descripcion cannot be null!!");
            }
            localDescripcion.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "descripcion"), xmlWriter);
        }
        if (localAbreviaturaTracker) {
            if (localAbreviatura == null) {
                throw new org.apache.axis2.databinding.ADBException("abreviatura cannot be null!!");
            }
            localAbreviatura.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "abreviatura"), xmlWriter);
        }
        if (localNumeroRequeridoTracker) {
            if (localNumeroRequerido == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "numeroRequerido cannot be null!!");
            }
            localNumeroRequerido.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "numeroRequerido"), xmlWriter);
        }
        xmlWriter.writeEndElement();

    }

    private static java.lang.String generatePrefix(final java.lang.String namespace) {
        if (namespace.equals("http://colsanitas.com/osi/comun/ubicacion")) {
            return "ns4";
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

        elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/comun/ubicacion",
                "codigo"));

        if (localCodigo == null) {
            throw new org.apache.axis2.databinding.ADBException("codigo cannot be null!!");
        }
        elementList.add(localCodigo);
        if (localDescripcionTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "descripcion"));

            if (localDescripcion == null) {
                throw new org.apache.axis2.databinding.ADBException("descripcion cannot be null!!");
            }
            elementList.add(localDescripcion);
        }
        if (localAbreviaturaTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "abreviatura"));

            if (localAbreviatura == null) {
                throw new org.apache.axis2.databinding.ADBException("abreviatura cannot be null!!");
            }
            elementList.add(localAbreviatura);
        }
        if (localNumeroRequeridoTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "numeroRequerido"));

            if (localNumeroRequerido == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "numeroRequerido cannot be null!!");
            }
            elementList.add(localNumeroRequerido);
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
        public static ViaPrincipalType parse(final javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            ViaPrincipalType object = new ViaPrincipalType();

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

                        if (!"viaPrincipalType".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(
                                    nsPrefix);
                            return (ViaPrincipalType) com.colsanitas.gestiondocumentoequivalente.ExtensionMapper
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
                                "http://colsanitas.com/osi/comun/ubicacion", "codigo")
                                .equals(reader.getName())) {

                    object.setCodigo(com.colsanitas.osi.comun.ubicacion.CodigoViaPrincipalType.Factory
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
                        && new javax.xml.namespace.QName(
                                "http://colsanitas.com/osi/comun/ubicacion", "descripcion")
                                .equals(reader.getName())) {

                    object.setDescripcion(com.colsanitas.osi.comun.ubicacion.ViaType.Factory
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
                                "http://colsanitas.com/osi/comun/ubicacion", "abreviatura")
                                .equals(reader.getName())) {

                    object.setAbreviatura(com.colsanitas.osi.comun.ubicacion.ViaType.Factory
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
                                "http://colsanitas.com/osi/comun/ubicacion", "numeroRequerido")
                                .equals(reader.getName())) {

                    object.setNumeroRequerido(com.colsanitas.osi.comun.ubicacion.ViaType.Factory
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
