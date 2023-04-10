/**
 * FamiliaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.colsanitas.osi.comun.organizacion;

/**
 * FamiliaType bean class
 */
@SuppressWarnings({"unchecked","unused","rawtypes"})
public class FamiliaType implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name = familiaType Namespace URI =
     * http://colsanitas.com/osi/comun/organizacion Namespace Prefix = ns2
     */

    /**
                 * 
                 */
    private static final long serialVersionUID = 7859681213200674026L;

    /**
     * field for Numero
     */

    protected com.colsanitas.osi.comun.organizacion.NumeroFliaType localNumero;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localNumeroTracker = false;

    public boolean isNumeroSpecified() {
        return localNumeroTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.organizacion.NumeroFliaType
     */
    public com.colsanitas.osi.comun.organizacion.NumeroFliaType getNumero() {
        return localNumero;
    }

    /**
     * Auto generated setter method
     * @param param Numero
     */
    public void setNumero(final com.colsanitas.osi.comun.organizacion.NumeroFliaType param) {
        localNumeroTracker = param != null;

        this.localNumero = param;

    }

    /**
     * field for Estado
     */

    protected com.colsanitas.osi.comun.definicionesfuncionales.EstadoType localEstado;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localEstadoTracker = false;

    public boolean isEstadoSpecified() {
        return localEstadoTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.definicionesfuncionales.EstadoType
     */
    public com.colsanitas.osi.comun.definicionesfuncionales.EstadoType getEstado() {
        return localEstado;
    }

    /**
     * Auto generated setter method
     * @param param Estado
     */
    public void setEstado(final com.colsanitas.osi.comun.definicionesfuncionales.EstadoType param) {
        localEstadoTracker = param != null;

        this.localEstado = param;

    }

    /**
     * field for Motivo
     */

    protected com.colsanitas.osi.comun.definicionesfuncionales.MotivoType localMotivo;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localMotivoTracker = false;

    public boolean isMotivoSpecified() {
        return localMotivoTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.definicionesfuncionales.MotivoType
     */
    public com.colsanitas.osi.comun.definicionesfuncionales.MotivoType getMotivo() {
        return localMotivo;
    }

    /**
     * Auto generated setter method
     * @param param Motivo
     */
    public void setMotivo(final com.colsanitas.osi.comun.definicionesfuncionales.MotivoType param) {
        localMotivoTracker = param != null;

        this.localMotivo = param;

    }

    /**
     * field for Usuarios This was an Array!
     */

    protected com.colsanitas.osi.comun.organizacion.UsuarioType[] localUsuarios;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localUsuariosTracker = false;

    public boolean isUsuariosSpecified() {
        return localUsuariosTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.organizacion.UsuarioType[]
     */
    public com.colsanitas.osi.comun.organizacion.UsuarioType[] getUsuarios() {
        return localUsuarios;
    }

    /**
     * validate the array for Usuarios
     */
    protected void validateUsuarios(final com.colsanitas.osi.comun.organizacion.UsuarioType[] param) {

    }

    /**
     * Auto generated setter method
     * @param param Usuarios
     */
    public void setUsuarios(final com.colsanitas.osi.comun.organizacion.UsuarioType[] param) {

        validateUsuarios(param);

        localUsuariosTracker = param != null;

        this.localUsuarios = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param com.colsanitas.osi.comun.organizacion.UsuarioType
     */
    public void addUsuarios(final com.colsanitas.osi.comun.organizacion.UsuarioType param) {
        if (localUsuarios == null) {
            localUsuarios = new com.colsanitas.osi.comun.organizacion.UsuarioType[] {};
        }

        // update the setting tracker
        localUsuariosTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil
                .toList(localUsuarios);
        list.add(param);
        this.localUsuarios = (com.colsanitas.osi.comun.organizacion.UsuarioType[]) list
                .toArray(new com.colsanitas.osi.comun.organizacion.UsuarioType[list.size()]);

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
                        namespacePrefix + ":familiaType", xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "familiaType", xmlWriter);
            }

        }
        if (localNumeroTracker) {
            if (localNumero == null) {
                throw new org.apache.axis2.databinding.ADBException("numero cannot be null!!");
            }
            localNumero.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "numero"), xmlWriter);
        }
        if (localEstadoTracker) {
            if (localEstado == null) {
                throw new org.apache.axis2.databinding.ADBException("estado cannot be null!!");
            }
            localEstado.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "estado"), xmlWriter);
        }
        if (localMotivoTracker) {
            if (localMotivo == null) {
                throw new org.apache.axis2.databinding.ADBException("motivo cannot be null!!");
            }
            localMotivo.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "motivo"), xmlWriter);
        }
        if (localUsuariosTracker) {
            if (localUsuarios != null) {
                for (int i = 0; i < localUsuarios.length; i++) {
                    if (localUsuarios[i] != null) {
                        localUsuarios[i].serialize(new javax.xml.namespace.QName(
                                "http://colsanitas.com/osi/comun/organizacion", "usuarios"),
                                xmlWriter);
                    } else {

                        // we don't have to do any thing since minOccures is zero

                    }

                }
            } else {

                throw new org.apache.axis2.databinding.ADBException("usuarios cannot be null!!");

            }
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

        if (localNumeroTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "numero"));

            if (localNumero == null) {
                throw new org.apache.axis2.databinding.ADBException("numero cannot be null!!");
            }
            elementList.add(localNumero);
        }
        if (localEstadoTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "estado"));

            if (localEstado == null) {
                throw new org.apache.axis2.databinding.ADBException("estado cannot be null!!");
            }
            elementList.add(localEstado);
        }
        if (localMotivoTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "motivo"));

            if (localMotivo == null) {
                throw new org.apache.axis2.databinding.ADBException("motivo cannot be null!!");
            }
            elementList.add(localMotivo);
        }
        if (localUsuariosTracker) {
            if (localUsuarios != null) {
                for (int i = 0; i < localUsuarios.length; i++) {

                    if (localUsuarios[i] != null) {
                        elementList.add(new javax.xml.namespace.QName(
                                "http://colsanitas.com/osi/comun/organizacion", "usuarios"));
                        elementList.add(localUsuarios[i]);
                    } else {

                        // nothing to do

                    }

                }
            } else {

                throw new org.apache.axis2.databinding.ADBException("usuarios cannot be null!!");

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
        public static FamiliaType parse(final javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            FamiliaType object = new FamiliaType();

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

                        if (!"familiaType".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(
                                    nsPrefix);
                            return (FamiliaType) com.colsanitas.gestiondocumentoequivalente.ExtensionMapper
                                    .getTypeObject(nsUri, type, reader);
                        }

                    }

                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                java.util.ArrayList list4 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                                "http://colsanitas.com/osi/comun/organizacion", "numero")
                                .equals(reader.getName())) {

                    object.setNumero(com.colsanitas.osi.comun.organizacion.NumeroFliaType.Factory
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
                                "http://colsanitas.com/osi/comun/organizacion", "estado")
                                .equals(reader.getName())) {

                    object.setEstado(com.colsanitas.osi.comun.definicionesfuncionales.EstadoType.Factory
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
                                "http://colsanitas.com/osi/comun/organizacion", "motivo")
                                .equals(reader.getName())) {

                    object.setMotivo(com.colsanitas.osi.comun.definicionesfuncionales.MotivoType.Factory
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
                                "http://colsanitas.com/osi/comun/organizacion", "usuarios")
                                .equals(reader.getName())) {

                    // Process the array and step past its final element's end.
                    list4.add(com.colsanitas.osi.comun.organizacion.UsuarioType.Factory
                            .parse(reader));

                    // loop until we find a start element that is not part of this array
                    boolean loopDone4 = false;
                    while (!loopDone4) {
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
                            loopDone4 = true;
                        } else {
                            if (new javax.xml.namespace.QName(
                                    "http://colsanitas.com/osi/comun/organizacion", "usuarios")
                                    .equals(reader.getName())) {
                                list4.add(com.colsanitas.osi.comun.organizacion.UsuarioType.Factory
                                        .parse(reader));

                            } else {
                                loopDone4 = true;
                            }
                        }
                    }
                    // call the converter utility to convert and set the array

                    object.setUsuarios((com.colsanitas.osi.comun.organizacion.UsuarioType[]) org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToArray(
                                    com.colsanitas.osi.comun.organizacion.UsuarioType.class, list4));

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
