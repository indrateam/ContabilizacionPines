/**
 * UsuarioType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.colsanitas.osi.comun.organizacion;

/**
 * UsuarioType bean class
 */
@SuppressWarnings({"unchecked","unused","rawtypes"})
public class UsuarioType implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name = usuarioType Namespace URI =
     * http://colsanitas.com/osi/comun/organizacion Namespace Prefix = ns2
     */

    /**
                 * 
                 */
    private static final long serialVersionUID = 198829486705606658L;

    /**
     * field for Numero
     */

    protected com.colsanitas.osi.comun.organizacion.NumeroUsuarioType localNumero;

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.organizacion.NumeroUsuarioType
     */
    public com.colsanitas.osi.comun.organizacion.NumeroUsuarioType getNumero() {
        return localNumero;
    }

    /**
     * Auto generated setter method
     * @param param Numero
     */
    public void setNumero(final com.colsanitas.osi.comun.organizacion.NumeroUsuarioType param) {

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
     * field for RolContrato
     */

    protected com.colsanitas.osi.comun.definicionesfuncionales.RolType localRolContrato;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localRolContratoTracker = false;

    public boolean isRolContratoSpecified() {
        return localRolContratoTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.definicionesfuncionales.RolType
     */
    public com.colsanitas.osi.comun.definicionesfuncionales.RolType getRolContrato() {
        return localRolContrato;
    }

    /**
     * Auto generated setter method
     * @param param RolContrato
     */
    public void setRolContrato(final com.colsanitas.osi.comun.definicionesfuncionales.RolType param) {
        localRolContratoTracker = param != null;

        this.localRolContrato = param;

    }

    /**
     * field for Parentesco
     */

    protected com.colsanitas.osi.comun.definicionesfuncionales.ParentescoType localParentesco;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localParentescoTracker = false;

    public boolean isParentescoSpecified() {
        return localParentescoTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.definicionesfuncionales.ParentescoType
     */
    public com.colsanitas.osi.comun.definicionesfuncionales.ParentescoType getParentesco() {
        return localParentesco;
    }

    /**
     * Auto generated setter method
     * @param param Parentesco
     */
    public void setParentesco(
            final com.colsanitas.osi.comun.definicionesfuncionales.ParentescoType param) {
        localParentescoTracker = param != null;

        this.localParentesco = param;

    }

    /**
     * field for Eps
     */

    protected com.colsanitas.osi.comun.definicionesfuncionales.EpsType localEps;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localEpsTracker = false;

    public boolean isEpsSpecified() {
        return localEpsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.definicionesfuncionales.EpsType
     */
    public com.colsanitas.osi.comun.definicionesfuncionales.EpsType getEps() {
        return localEps;
    }

    /**
     * Auto generated setter method
     * @param param Eps
     */
    public void setEps(final com.colsanitas.osi.comun.definicionesfuncionales.EpsType param) {
        localEpsTracker = param != null;

        this.localEps = param;

    }

    /**
     * field for FechaInicioAfiliacion
     */

    protected java.util.Calendar localFechaInicioAfiliacion;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localFechaInicioAfiliacionTracker = false;

    public boolean isFechaInicioAfiliacionSpecified() {
        return localFechaInicioAfiliacionTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getFechaInicioAfiliacion() {
        return localFechaInicioAfiliacion;
    }

    /**
     * Auto generated setter method
     * @param param FechaInicioAfiliacion
     */
    public void setFechaInicioAfiliacion(final java.util.Calendar param) {
        localFechaInicioAfiliacionTracker = param != null;

        this.localFechaInicioAfiliacion = param;

    }

    /**
     * field for FechaCancelacion
     */

    protected java.util.Calendar localFechaCancelacion;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localFechaCancelacionTracker = false;

    public boolean isFechaCancelacionSpecified() {
        return localFechaCancelacionTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getFechaCancelacion() {
        return localFechaCancelacion;
    }

    /**
     * Auto generated setter method
     * @param param FechaCancelacion
     */
    public void setFechaCancelacion(final java.util.Calendar param) {
        localFechaCancelacionTracker = param != null;

        this.localFechaCancelacion = param;

    }

    /**
     * field for FechaInicioSusp
     */

    protected java.util.Calendar localFechaInicioSusp;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localFechaInicioSuspTracker = false;

    public boolean isFechaInicioSuspSpecified() {
        return localFechaInicioSuspTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getFechaInicioSusp() {
        return localFechaInicioSusp;
    }

    /**
     * Auto generated setter method
     * @param param FechaInicioSusp
     */
    public void setFechaInicioSusp(final java.util.Calendar param) {
        localFechaInicioSuspTracker = param != null;

        this.localFechaInicioSusp = param;

    }

    /**
     * field for FechaFinSusp
     */

    protected java.util.Calendar localFechaFinSusp;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localFechaFinSuspTracker = false;

    public boolean isFechaFinSuspSpecified() {
        return localFechaFinSuspTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getFechaFinSusp() {
        return localFechaFinSusp;
    }

    /**
     * Auto generated setter method
     * @param param FechaFinSusp
     */
    public void setFechaFinSusp(final java.util.Calendar param) {
        localFechaFinSuspTracker = param != null;

        this.localFechaFinSusp = param;

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
                        namespacePrefix + ":usuarioType", xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "usuarioType", xmlWriter);
            }

        }

        if (localNumero == null) {
            throw new org.apache.axis2.databinding.ADBException("numero cannot be null!!");
        }
        localNumero.serialize(new javax.xml.namespace.QName(
                "http://colsanitas.com/osi/comun/organizacion", "numero"), xmlWriter);
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
        if (localRolContratoTracker) {
            if (localRolContrato == null) {
                throw new org.apache.axis2.databinding.ADBException("rolContrato cannot be null!!");
            }
            localRolContrato.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "rolContrato"), xmlWriter);
        }
        if (localParentescoTracker) {
            if (localParentesco == null) {
                throw new org.apache.axis2.databinding.ADBException("parentesco cannot be null!!");
            }
            localParentesco.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "parentesco"), xmlWriter);
        }
        if (localEpsTracker) {
            if (localEps == null) {
                throw new org.apache.axis2.databinding.ADBException("eps cannot be null!!");
            }
            localEps.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "eps"), xmlWriter);
        }
        if (localFechaInicioAfiliacionTracker) {
            namespace = "http://colsanitas.com/osi/comun/organizacion";
            writeStartElement(null, namespace, "fechaInicioAfiliacion", xmlWriter);

            if (localFechaInicioAfiliacion == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException(
                        "fechaInicioAfiliacion cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localFechaInicioAfiliacion));

            }

            xmlWriter.writeEndElement();
        }
        if (localFechaCancelacionTracker) {
            namespace = "http://colsanitas.com/osi/comun/organizacion";
            writeStartElement(null, namespace, "fechaCancelacion", xmlWriter);

            if (localFechaCancelacion == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException(
                        "fechaCancelacion cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localFechaCancelacion));

            }

            xmlWriter.writeEndElement();
        }
        if (localFechaInicioSuspTracker) {
            namespace = "http://colsanitas.com/osi/comun/organizacion";
            writeStartElement(null, namespace, "fechaInicioSusp", xmlWriter);

            if (localFechaInicioSusp == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException(
                        "fechaInicioSusp cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localFechaInicioSusp));

            }

            xmlWriter.writeEndElement();
        }
        if (localFechaFinSuspTracker) {
            namespace = "http://colsanitas.com/osi/comun/organizacion";
            writeStartElement(null, namespace, "fechaFinSusp", xmlWriter);

            if (localFechaFinSusp == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("fechaFinSusp cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localFechaFinSusp));

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

        elementList.add(new javax.xml.namespace.QName(
                "http://colsanitas.com/osi/comun/organizacion", "numero"));

        if (localNumero == null) {
            throw new org.apache.axis2.databinding.ADBException("numero cannot be null!!");
        }
        elementList.add(localNumero);
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
        if (localRolContratoTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "rolContrato"));

            if (localRolContrato == null) {
                throw new org.apache.axis2.databinding.ADBException("rolContrato cannot be null!!");
            }
            elementList.add(localRolContrato);
        }
        if (localParentescoTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "parentesco"));

            if (localParentesco == null) {
                throw new org.apache.axis2.databinding.ADBException("parentesco cannot be null!!");
            }
            elementList.add(localParentesco);
        }
        if (localEpsTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "eps"));

            if (localEps == null) {
                throw new org.apache.axis2.databinding.ADBException("eps cannot be null!!");
            }
            elementList.add(localEps);
        }
        if (localFechaInicioAfiliacionTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "fechaInicioAfiliacion"));

            if (localFechaInicioAfiliacion != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localFechaInicioAfiliacion));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "fechaInicioAfiliacion cannot be null!!");
            }
        }
        if (localFechaCancelacionTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "fechaCancelacion"));

            if (localFechaCancelacion != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localFechaCancelacion));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "fechaCancelacion cannot be null!!");
            }
        }
        if (localFechaInicioSuspTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "fechaInicioSusp"));

            if (localFechaInicioSusp != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localFechaInicioSusp));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "fechaInicioSusp cannot be null!!");
            }
        }
        if (localFechaFinSuspTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "fechaFinSusp"));

            if (localFechaFinSusp != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localFechaFinSusp));
            } else {
                throw new org.apache.axis2.databinding.ADBException("fechaFinSusp cannot be null!!");
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
        public static UsuarioType parse(final javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            UsuarioType object = new UsuarioType();

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

                        if (!"usuarioType".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(
                                    nsPrefix);
                            return (UsuarioType) com.colsanitas.gestiondocumentoequivalente.ExtensionMapper
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
                                "http://colsanitas.com/osi/comun/organizacion", "numero")
                                .equals(reader.getName())) {

                    object.setNumero(com.colsanitas.osi.comun.organizacion.NumeroUsuarioType.Factory
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
                                "http://colsanitas.com/osi/comun/organizacion", "rolContrato")
                                .equals(reader.getName())) {

                    object.setRolContrato(com.colsanitas.osi.comun.definicionesfuncionales.RolType.Factory
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
                                "http://colsanitas.com/osi/comun/organizacion", "parentesco")
                                .equals(reader.getName())) {

                    object.setParentesco(com.colsanitas.osi.comun.definicionesfuncionales.ParentescoType.Factory
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
                                "http://colsanitas.com/osi/comun/organizacion", "eps")
                                .equals(reader.getName())) {

                    object.setEps(com.colsanitas.osi.comun.definicionesfuncionales.EpsType.Factory
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
                                "http://colsanitas.com/osi/comun/organizacion",
                                "fechaInicioAfiliacion").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "fechaInicioAfiliacion" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFechaInicioAfiliacion(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToDateTime(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                                "http://colsanitas.com/osi/comun/organizacion", "fechaCancelacion")
                                .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "fechaCancelacion" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFechaCancelacion(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToDateTime(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                                "http://colsanitas.com/osi/comun/organizacion", "fechaInicioSusp")
                                .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "fechaInicioSusp" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFechaInicioSusp(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToDateTime(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                                "http://colsanitas.com/osi/comun/organizacion", "fechaFinSusp")
                                .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "fechaFinSusp" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFechaFinSusp(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToDateTime(content));

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
