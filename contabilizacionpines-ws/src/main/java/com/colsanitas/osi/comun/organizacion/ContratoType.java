/**
 * ContratoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.colsanitas.osi.comun.organizacion;

/**
 * ContratoType bean class
 */
@SuppressWarnings({"unchecked","unused","rawtypes"})
public class ContratoType implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name = contratoType Namespace URI =
     * http://colsanitas.com/osi/comun/organizacion Namespace Prefix = ns2
     */

    /**
                 * 
                 */
    private static final long serialVersionUID = -7247922776465136508L;

    /**
     * field for Numero
     */

    protected com.colsanitas.osi.comun.organizacion.NumeroContratoType localNumero;

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
     * @return com.colsanitas.osi.comun.organizacion.NumeroContratoType
     */
    public com.colsanitas.osi.comun.organizacion.NumeroContratoType getNumero() {
        return localNumero;
    }

    /**
     * Auto generated setter method
     * @param param Numero
     */
    public void setNumero(final com.colsanitas.osi.comun.organizacion.NumeroContratoType param) {
        localNumeroTracker = param != null;

        this.localNumero = param;

    }

    /**
     * field for Tipo
     */

    protected com.colsanitas.osi.comun.definicionesfuncionales.TipoType localTipo;

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
     * @return com.colsanitas.osi.comun.definicionesfuncionales.TipoType
     */
    public com.colsanitas.osi.comun.definicionesfuncionales.TipoType getTipo() {
        return localTipo;
    }

    /**
     * Auto generated setter method
     * @param param Tipo
     */
    public void setTipo(final com.colsanitas.osi.comun.definicionesfuncionales.TipoType param) {
        localTipoTracker = param != null;

        this.localTipo = param;

    }

    /**
     * field for Compania
     */

    protected com.colsanitas.osi.comun.organizacion.CompaniaType localCompania;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localCompaniaTracker = false;

    public boolean isCompaniaSpecified() {
        return localCompaniaTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.organizacion.CompaniaType
     */
    public com.colsanitas.osi.comun.organizacion.CompaniaType getCompania() {
        return localCompania;
    }

    /**
     * Auto generated setter method
     * @param param Compania
     */
    public void setCompania(final com.colsanitas.osi.comun.organizacion.CompaniaType param) {
        localCompaniaTracker = param != null;

        this.localCompania = param;

    }

    /**
     * field for Plan
     */

    protected com.colsanitas.osi.comun.organizacion.PlanType localPlan;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localPlanTracker = false;

    public boolean isPlanSpecified() {
        return localPlanTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.organizacion.PlanType
     */
    public com.colsanitas.osi.comun.organizacion.PlanType getPlan() {
        return localPlan;
    }

    /**
     * Auto generated setter method
     * @param param Plan
     */
    public void setPlan(final com.colsanitas.osi.comun.organizacion.PlanType param) {
        localPlanTracker = param != null;

        this.localPlan = param;

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
     * field for Familia This was an Array!
     */

    protected com.colsanitas.osi.comun.organizacion.FamiliaType[] localFamilia;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localFamiliaTracker = false;

    public boolean isFamiliaSpecified() {
        return localFamiliaTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.organizacion.FamiliaType[]
     */
    public com.colsanitas.osi.comun.organizacion.FamiliaType[] getFamilia() {
        return localFamilia;
    }

    /**
     * validate the array for Familia
     */
    protected void validateFamilia(final com.colsanitas.osi.comun.organizacion.FamiliaType[] param) {

    }

    /**
     * Auto generated setter method
     * @param param Familia
     */
    public void setFamilia(final com.colsanitas.osi.comun.organizacion.FamiliaType[] param) {

        validateFamilia(param);

        localFamiliaTracker = param != null;

        this.localFamilia = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param com.colsanitas.osi.comun.organizacion.FamiliaType
     */
    public void addFamilia(final com.colsanitas.osi.comun.organizacion.FamiliaType param) {
        if (localFamilia == null) {
            localFamilia = new com.colsanitas.osi.comun.organizacion.FamiliaType[] {};
        }

        // update the setting tracker
        localFamiliaTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localFamilia);
        list.add(param);
        this.localFamilia = (com.colsanitas.osi.comun.organizacion.FamiliaType[]) list
                .toArray(new com.colsanitas.osi.comun.organizacion.FamiliaType[list.size()]);

    }

    /**
     * field for FechaInicio
     */

    protected java.util.Calendar localFechaInicio;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localFechaInicioTracker = false;

    public boolean isFechaInicioSpecified() {
        return localFechaInicioTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getFechaInicio() {
        return localFechaInicio;
    }

    /**
     * Auto generated setter method
     * @param param FechaInicio
     */
    public void setFechaInicio(final java.util.Calendar param) {
        localFechaInicioTracker = param != null;

        this.localFechaInicio = param;

    }

    /**
     * field for FechaProxRenovacion
     */

    protected java.util.Calendar localFechaProxRenovacion;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localFechaProxRenovacionTracker = false;

    public boolean isFechaProxRenovacionSpecified() {
        return localFechaProxRenovacionTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getFechaProxRenovacion() {
        return localFechaProxRenovacion;
    }

    /**
     * Auto generated setter method
     * @param param FechaProxRenovacion
     */
    public void setFechaProxRenovacion(final java.util.Calendar param) {
        localFechaProxRenovacionTracker = param != null;

        this.localFechaProxRenovacion = param;

    }

    /**
     * field for OficinaRadicacion
     */

    protected com.colsanitas.osi.comun.organizacion.CodigoOficinaType localOficinaRadicacion;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localOficinaRadicacionTracker = false;

    public boolean isOficinaRadicacionSpecified() {
        return localOficinaRadicacionTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.organizacion.CodigoOficinaType
     */
    public com.colsanitas.osi.comun.organizacion.CodigoOficinaType getOficinaRadicacion() {
        return localOficinaRadicacion;
    }

    /**
     * Auto generated setter method
     * @param param OficinaRadicacion
     */
    public void setOficinaRadicacion(
            final com.colsanitas.osi.comun.organizacion.CodigoOficinaType param) {
        localOficinaRadicacionTracker = param != null;

        this.localOficinaRadicacion = param;

    }

    /**
     * field for AtributosContrato
     */

    protected com.colsanitas.osi.comun.organizacion.AtributoContratoType localAtributosContrato;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localAtributosContratoTracker = false;

    public boolean isAtributosContratoSpecified() {
        return localAtributosContratoTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.organizacion.AtributoContratoType
     */
    public com.colsanitas.osi.comun.organizacion.AtributoContratoType getAtributosContrato() {
        return localAtributosContrato;
    }

    /**
     * Auto generated setter method
     * @param param AtributosContrato
     */
    public void setAtributosContrato(
            final com.colsanitas.osi.comun.organizacion.AtributoContratoType param) {
        localAtributosContratoTracker = param != null;

        this.localAtributosContrato = param;

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
                        namespacePrefix + ":contratoType", xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "contratoType", xmlWriter);
            }

        }
        if (localNumeroTracker) {
            if (localNumero == null) {
                throw new org.apache.axis2.databinding.ADBException("numero cannot be null!!");
            }
            localNumero.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "numero"), xmlWriter);
        }
        if (localTipoTracker) {
            if (localTipo == null) {
                throw new org.apache.axis2.databinding.ADBException("tipo cannot be null!!");
            }
            localTipo.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "tipo"), xmlWriter);
        }
        if (localCompaniaTracker) {
            if (localCompania == null) {
                throw new org.apache.axis2.databinding.ADBException("compania cannot be null!!");
            }
            localCompania.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "compania"), xmlWriter);
        }
        if (localPlanTracker) {
            if (localPlan == null) {
                throw new org.apache.axis2.databinding.ADBException("plan cannot be null!!");
            }
            localPlan.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "plan"), xmlWriter);
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
        if (localFamiliaTracker) {
            if (localFamilia != null) {
                for (int i = 0; i < localFamilia.length; i++) {
                    if (localFamilia[i] != null) {
                        localFamilia[i].serialize(new javax.xml.namespace.QName(
                                "http://colsanitas.com/osi/comun/organizacion", "familia"),
                                xmlWriter);
                    } else {

                        // we don't have to do any thing since minOccures is zero

                    }

                }
            } else {

                throw new org.apache.axis2.databinding.ADBException("familia cannot be null!!");

            }
        }
        if (localFechaInicioTracker) {
            namespace = "http://colsanitas.com/osi/comun/organizacion";
            writeStartElement(null, namespace, "fechaInicio", xmlWriter);

            if (localFechaInicio == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("fechaInicio cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localFechaInicio));

            }

            xmlWriter.writeEndElement();
        }
        if (localFechaProxRenovacionTracker) {
            namespace = "http://colsanitas.com/osi/comun/organizacion";
            writeStartElement(null, namespace, "fechaProxRenovacion", xmlWriter);

            if (localFechaProxRenovacion == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException(
                        "fechaProxRenovacion cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localFechaProxRenovacion));

            }

            xmlWriter.writeEndElement();
        }
        if (localOficinaRadicacionTracker) {
            if (localOficinaRadicacion == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "oficinaRadicacion cannot be null!!");
            }
            localOficinaRadicacion
                    .serialize(new javax.xml.namespace.QName(
                            "http://colsanitas.com/osi/comun/organizacion", "oficinaRadicacion"),
                            xmlWriter);
        }
        if (localAtributosContratoTracker) {
            if (localAtributosContrato == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "atributosContrato cannot be null!!");
            }
            localAtributosContrato
                    .serialize(new javax.xml.namespace.QName(
                            "http://colsanitas.com/osi/comun/organizacion", "atributosContrato"),
                            xmlWriter);
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
        if (localTipoTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "tipo"));

            if (localTipo == null) {
                throw new org.apache.axis2.databinding.ADBException("tipo cannot be null!!");
            }
            elementList.add(localTipo);
        }
        if (localCompaniaTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "compania"));

            if (localCompania == null) {
                throw new org.apache.axis2.databinding.ADBException("compania cannot be null!!");
            }
            elementList.add(localCompania);
        }
        if (localPlanTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "plan"));

            if (localPlan == null) {
                throw new org.apache.axis2.databinding.ADBException("plan cannot be null!!");
            }
            elementList.add(localPlan);
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
        if (localFamiliaTracker) {
            if (localFamilia != null) {
                for (int i = 0; i < localFamilia.length; i++) {

                    if (localFamilia[i] != null) {
                        elementList.add(new javax.xml.namespace.QName(
                                "http://colsanitas.com/osi/comun/organizacion", "familia"));
                        elementList.add(localFamilia[i]);
                    } else {

                        // nothing to do

                    }

                }
            } else {

                throw new org.apache.axis2.databinding.ADBException("familia cannot be null!!");

            }

        }
        if (localFechaInicioTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "fechaInicio"));

            if (localFechaInicio != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localFechaInicio));
            } else {
                throw new org.apache.axis2.databinding.ADBException("fechaInicio cannot be null!!");
            }
        }
        if (localFechaProxRenovacionTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "fechaProxRenovacion"));

            if (localFechaProxRenovacion != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localFechaProxRenovacion));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "fechaProxRenovacion cannot be null!!");
            }
        }
        if (localOficinaRadicacionTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "oficinaRadicacion"));

            if (localOficinaRadicacion == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "oficinaRadicacion cannot be null!!");
            }
            elementList.add(localOficinaRadicacion);
        }
        if (localAtributosContratoTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/organizacion", "atributosContrato"));

            if (localAtributosContrato == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "atributosContrato cannot be null!!");
            }
            elementList.add(localAtributosContrato);
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
        public static ContratoType parse(final javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            ContratoType object = new ContratoType();

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

                        if (!"contratoType".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(
                                    nsPrefix);
                            return (ContratoType) com.colsanitas.gestiondocumentoequivalente.ExtensionMapper
                                    .getTypeObject(nsUri, type, reader);
                        }

                    }

                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                java.util.ArrayList list7 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                                "http://colsanitas.com/osi/comun/organizacion", "numero")
                                .equals(reader.getName())) {

                    object.setNumero(com.colsanitas.osi.comun.organizacion.NumeroContratoType.Factory
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
                                "http://colsanitas.com/osi/comun/organizacion", "tipo")
                                .equals(reader.getName())) {

                    object.setTipo(com.colsanitas.osi.comun.definicionesfuncionales.TipoType.Factory
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
                                "http://colsanitas.com/osi/comun/organizacion", "compania")
                                .equals(reader.getName())) {

                    object.setCompania(com.colsanitas.osi.comun.organizacion.CompaniaType.Factory
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
                                "http://colsanitas.com/osi/comun/organizacion", "plan")
                                .equals(reader.getName())) {

                    object.setPlan(com.colsanitas.osi.comun.organizacion.PlanType.Factory
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
                                "http://colsanitas.com/osi/comun/organizacion", "familia")
                                .equals(reader.getName())) {

                    // Process the array and step past its final element's end.
                    list7.add(com.colsanitas.osi.comun.organizacion.FamiliaType.Factory
                            .parse(reader));

                    // loop until we find a start element that is not part of this array
                    boolean loopDone7 = false;
                    while (!loopDone7) {
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
                            loopDone7 = true;
                        } else {
                            if (new javax.xml.namespace.QName(
                                    "http://colsanitas.com/osi/comun/organizacion", "familia")
                                    .equals(reader.getName())) {
                                list7.add(com.colsanitas.osi.comun.organizacion.FamiliaType.Factory
                                        .parse(reader));

                            } else {
                                loopDone7 = true;
                            }
                        }
                    }
                    // call the converter utility to convert and set the array

                    object.setFamilia((com.colsanitas.osi.comun.organizacion.FamiliaType[]) org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToArray(
                                    com.colsanitas.osi.comun.organizacion.FamiliaType.class, list7));

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                                "http://colsanitas.com/osi/comun/organizacion", "fechaInicio")
                                .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "fechaInicio" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFechaInicio(org.apache.axis2.databinding.utils.ConverterUtil
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
                                "http://colsanitas.com/osi/comun/organizacion",
                                "fechaProxRenovacion").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "fechaProxRenovacion" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFechaProxRenovacion(org.apache.axis2.databinding.utils.ConverterUtil
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
                                "http://colsanitas.com/osi/comun/organizacion", "oficinaRadicacion")
                                .equals(reader.getName())) {

                    object.setOficinaRadicacion(com.colsanitas.osi.comun.organizacion.CodigoOficinaType.Factory
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
                                "http://colsanitas.com/osi/comun/organizacion", "atributosContrato")
                                .equals(reader.getName())) {

                    object.setAtributosContrato(com.colsanitas.osi.comun.organizacion.AtributoContratoType.Factory
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
