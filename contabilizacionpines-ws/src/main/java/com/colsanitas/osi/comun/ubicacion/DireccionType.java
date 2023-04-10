/**
 * DireccionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.colsanitas.osi.comun.ubicacion;

/**
 * DireccionType bean class
 */
@SuppressWarnings({"unchecked","unused","rawtypes"})
public class DireccionType implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name = direccionType Namespace URI
     * = http://colsanitas.com/osi/comun/ubicacion Namespace Prefix = ns4
     */

    /**
                 * 
                 */
    private static final long serialVersionUID = -7222327423529402844L;

    /**
     * field for Ordinal
     */

    protected int localOrdinal;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localOrdinalTracker = false;

    public boolean isOrdinalSpecified() {
        return localOrdinalTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getOrdinal() {
        return localOrdinal;
    }

    /**
     * Auto generated setter method
     * @param param Ordinal
     */
    public void setOrdinal(final int param) {

        // setting primitive attribute tracker to true
        localOrdinalTracker = param != java.lang.Integer.MIN_VALUE;

        this.localOrdinal = param;

    }

    /**
     * field for Principal
     */

    protected com.colsanitas.osi.comun.ubicacion.ViaType localPrincipal;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localPrincipalTracker = false;

    public boolean isPrincipalSpecified() {
        return localPrincipalTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.ubicacion.ViaType
     */
    public com.colsanitas.osi.comun.ubicacion.ViaType getPrincipal() {
        return localPrincipal;
    }

    /**
     * Auto generated setter method
     * @param param Principal
     */
    public void setPrincipal(final com.colsanitas.osi.comun.ubicacion.ViaType param) {
        localPrincipalTracker = param != null;

        this.localPrincipal = param;

    }

    /**
     * field for Cruce
     */

    protected com.colsanitas.osi.comun.ubicacion.ViaType localCruce;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localCruceTracker = false;

    public boolean isCruceSpecified() {
        return localCruceTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.ubicacion.ViaType
     */
    public com.colsanitas.osi.comun.ubicacion.ViaType getCruce() {
        return localCruce;
    }

    /**
     * Auto generated setter method
     * @param param Cruce
     */
    public void setCruce(final com.colsanitas.osi.comun.ubicacion.ViaType param) {
        localCruceTracker = param != null;

        this.localCruce = param;

    }

    /**
     * field for Complementarios
     */

    protected java.lang.String localComplementarios;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localComplementariosTracker = false;

    public boolean isComplementariosSpecified() {
        return localComplementariosTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getComplementarios() {
        return localComplementarios;
    }

    /**
     * Auto generated setter method
     * @param param Complementarios
     */
    public void setComplementarios(final java.lang.String param) {
        localComplementariosTracker = param != null;

        this.localComplementarios = param;

    }

    /**
     * field for Localidad
     */

    protected java.lang.String localLocalidad;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localLocalidadTracker = false;

    public boolean isLocalidadSpecified() {
        return localLocalidadTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getLocalidad() {
        return localLocalidad;
    }

    /**
     * Auto generated setter method
     * @param param Localidad
     */
    public void setLocalidad(final java.lang.String param) {
        localLocalidadTracker = param != null;

        this.localLocalidad = param;

    }

    /**
     * field for Telefono1
     */

    protected com.colsanitas.osi.comun.ubicacion.TelefonoType localTelefono1;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localTelefono1Tracker = false;

    public boolean isTelefono1Specified() {
        return localTelefono1Tracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.ubicacion.TelefonoType
     */
    public com.colsanitas.osi.comun.ubicacion.TelefonoType getTelefono1() {
        return localTelefono1;
    }

    /**
     * Auto generated setter method
     * @param param Telefono1
     */
    public void setTelefono1(final com.colsanitas.osi.comun.ubicacion.TelefonoType param) {
        localTelefono1Tracker = param != null;

        this.localTelefono1 = param;

    }

    /**
     * field for Fax
     */

    protected com.colsanitas.osi.comun.ubicacion.TelefonoType localFax;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localFaxTracker = false;

    public boolean isFaxSpecified() {
        return localFaxTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.ubicacion.TelefonoType
     */
    public com.colsanitas.osi.comun.ubicacion.TelefonoType getFax() {
        return localFax;
    }

    /**
     * Auto generated setter method
     * @param param Fax
     */
    public void setFax(final com.colsanitas.osi.comun.ubicacion.TelefonoType param) {
        localFaxTracker = param != null;

        this.localFax = param;

    }

    /**
     * field for Telefono2
     */

    protected com.colsanitas.osi.comun.ubicacion.TelefonoType localTelefono2;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localTelefono2Tracker = false;

    public boolean isTelefono2Specified() {
        return localTelefono2Tracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.ubicacion.TelefonoType
     */
    public com.colsanitas.osi.comun.ubicacion.TelefonoType getTelefono2() {
        return localTelefono2;
    }

    /**
     * Auto generated setter method
     * @param param Telefono2
     */
    public void setTelefono2(final com.colsanitas.osi.comun.ubicacion.TelefonoType param) {
        localTelefono2Tracker = param != null;

        this.localTelefono2 = param;

    }

    /**
     * field for Celular
     */

    protected java.lang.String localCelular;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localCelularTracker = false;

    public boolean isCelularSpecified() {
        return localCelularTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCelular() {
        return localCelular;
    }

    /**
     * Auto generated setter method
     * @param param Celular
     */
    public void setCelular(final java.lang.String param) {
        localCelularTracker = param != null;

        this.localCelular = param;

    }

    /**
     * field for CorreoElectronico
     */

    protected java.lang.String localCorreoElectronico;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localCorreoElectronicoTracker = false;

    public boolean isCorreoElectronicoSpecified() {
        return localCorreoElectronicoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCorreoElectronico() {
        return localCorreoElectronico;
    }

    /**
     * Auto generated setter method
     * @param param CorreoElectronico
     */
    public void setCorreoElectronico(final java.lang.String param) {
        localCorreoElectronicoTracker = param != null;

        this.localCorreoElectronico = param;

    }

    /**
     * field for Nomenclatura
     */

    protected java.lang.String localNomenclatura;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localNomenclaturaTracker = false;

    public boolean isNomenclaturaSpecified() {
        return localNomenclaturaTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNomenclatura() {
        return localNomenclatura;
    }

    /**
     * Auto generated setter method
     * @param param Nomenclatura
     */
    public void setNomenclatura(final java.lang.String param) {
        localNomenclaturaTracker = param != null;

        this.localNomenclatura = param;

    }

    /**
     * field for Municipio
     */

    protected com.colsanitas.osi.comun.ubicacion.CiudadType localMunicipio;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localMunicipioTracker = false;

    public boolean isMunicipioSpecified() {
        return localMunicipioTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.ubicacion.CiudadType
     */
    public com.colsanitas.osi.comun.ubicacion.CiudadType getMunicipio() {
        return localMunicipio;
    }

    /**
     * Auto generated setter method
     * @param param Municipio
     */
    public void setMunicipio(final com.colsanitas.osi.comun.ubicacion.CiudadType param) {
        localMunicipioTracker = param != null;

        this.localMunicipio = param;

    }

    /**
     * field for TipoViaPrincipal
     */

    protected com.colsanitas.osi.comun.ubicacion.CodigoViaPrincipalType localTipoViaPrincipal;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localTipoViaPrincipalTracker = false;

    public boolean isTipoViaPrincipalSpecified() {
        return localTipoViaPrincipalTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.ubicacion.CodigoViaPrincipalType
     */
    public com.colsanitas.osi.comun.ubicacion.CodigoViaPrincipalType getTipoViaPrincipal() {
        return localTipoViaPrincipal;
    }

    /**
     * Auto generated setter method
     * @param param TipoViaPrincipal
     */
    public void setTipoViaPrincipal(
            final com.colsanitas.osi.comun.ubicacion.CodigoViaPrincipalType param) {
        localTipoViaPrincipalTracker = param != null;

        this.localTipoViaPrincipal = param;

    }

    /**
     * field for ZonaLocalidad
     */

    protected com.colsanitas.osi.comun.ubicacion.CodigoZonaLocalidadType localZonaLocalidad;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localZonaLocalidadTracker = false;

    public boolean isZonaLocalidadSpecified() {
        return localZonaLocalidadTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.ubicacion.CodigoZonaLocalidadType
     */
    public com.colsanitas.osi.comun.ubicacion.CodigoZonaLocalidadType getZonaLocalidad() {
        return localZonaLocalidad;
    }

    /**
     * Auto generated setter method
     * @param param ZonaLocalidad
     */
    public void setZonaLocalidad(
            final com.colsanitas.osi.comun.ubicacion.CodigoZonaLocalidadType param) {
        localZonaLocalidadTracker = param != null;

        this.localZonaLocalidad = param;

    }

    /**
     * field for DireecionCompleta
     */

    protected com.colsanitas.osi.comun.ubicacion.DireccionCompletaType localDireecionCompleta;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localDireecionCompletaTracker = false;

    public boolean isDireecionCompletaSpecified() {
        return localDireecionCompletaTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.ubicacion.DireccionCompletaType
     */
    public com.colsanitas.osi.comun.ubicacion.DireccionCompletaType getDireecionCompleta() {
        return localDireecionCompleta;
    }

    /**
     * Auto generated setter method
     * @param param DireecionCompleta
     */
    public void setDireecionCompleta(
            final com.colsanitas.osi.comun.ubicacion.DireccionCompletaType param) {
        localDireecionCompletaTracker = param != null;

        this.localDireecionCompleta = param;

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
                        namespacePrefix + ":direccionType", xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "direccionType", xmlWriter);
            }

        }
        if (localOrdinalTracker) {
            namespace = "http://colsanitas.com/osi/comun/ubicacion";
            writeStartElement(null, namespace, "ordinal", xmlWriter);

            if (localOrdinal == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("ordinal cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localOrdinal));
            }

            xmlWriter.writeEndElement();
        }
        if (localPrincipalTracker) {
            if (localPrincipal == null) {
                throw new org.apache.axis2.databinding.ADBException("principal cannot be null!!");
            }
            localPrincipal.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "principal"), xmlWriter);
        }
        if (localCruceTracker) {
            if (localCruce == null) {
                throw new org.apache.axis2.databinding.ADBException("cruce cannot be null!!");
            }
            localCruce.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "cruce"), xmlWriter);
        }
        if (localComplementariosTracker) {
            namespace = "http://colsanitas.com/osi/comun/ubicacion";
            writeStartElement(null, namespace, "complementarios", xmlWriter);

            if (localComplementarios == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException(
                        "complementarios cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localComplementarios);

            }

            xmlWriter.writeEndElement();
        }
        if (localLocalidadTracker) {
            namespace = "http://colsanitas.com/osi/comun/ubicacion";
            writeStartElement(null, namespace, "localidad", xmlWriter);

            if (localLocalidad == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("localidad cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localLocalidad);

            }

            xmlWriter.writeEndElement();
        }
        if (localTelefono1Tracker) {
            if (localTelefono1 == null) {
                throw new org.apache.axis2.databinding.ADBException("telefono1 cannot be null!!");
            }
            localTelefono1.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "telefono1"), xmlWriter);
        }
        if (localFaxTracker) {
            if (localFax == null) {
                throw new org.apache.axis2.databinding.ADBException("fax cannot be null!!");
            }
            localFax.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "fax"), xmlWriter);
        }
        if (localTelefono2Tracker) {
            if (localTelefono2 == null) {
                throw new org.apache.axis2.databinding.ADBException("telefono2 cannot be null!!");
            }
            localTelefono2.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "telefono2"), xmlWriter);
        }
        if (localCelularTracker) {
            namespace = "http://colsanitas.com/osi/comun/ubicacion";
            writeStartElement(null, namespace, "celular", xmlWriter);

            if (localCelular == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("celular cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localCelular);

            }

            xmlWriter.writeEndElement();
        }
        if (localCorreoElectronicoTracker) {
            namespace = "http://colsanitas.com/osi/comun/ubicacion";
            writeStartElement(null, namespace, "correoElectronico", xmlWriter);

            if (localCorreoElectronico == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException(
                        "correoElectronico cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localCorreoElectronico);

            }

            xmlWriter.writeEndElement();
        }
        if (localNomenclaturaTracker) {
            namespace = "http://colsanitas.com/osi/comun/ubicacion";
            writeStartElement(null, namespace, "nomenclatura", xmlWriter);

            if (localNomenclatura == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("nomenclatura cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localNomenclatura);

            }

            xmlWriter.writeEndElement();
        }
        if (localMunicipioTracker) {
            if (localMunicipio == null) {
                throw new org.apache.axis2.databinding.ADBException("municipio cannot be null!!");
            }
            localMunicipio.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "municipio"), xmlWriter);
        }
        if (localTipoViaPrincipalTracker) {
            if (localTipoViaPrincipal == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "tipoViaPrincipal cannot be null!!");
            }
            localTipoViaPrincipal.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "tipoViaPrincipal"), xmlWriter);
        }
        if (localZonaLocalidadTracker) {
            if (localZonaLocalidad == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "zonaLocalidad cannot be null!!");
            }
            localZonaLocalidad.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "zonaLocalidad"), xmlWriter);
        }
        if (localDireecionCompletaTracker) {
            if (localDireecionCompleta == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "direecionCompleta cannot be null!!");
            }
            localDireecionCompleta.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "direecionCompleta"), xmlWriter);
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

        if (localOrdinalTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "ordinal"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localOrdinal));
        }
        if (localPrincipalTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "principal"));

            if (localPrincipal == null) {
                throw new org.apache.axis2.databinding.ADBException("principal cannot be null!!");
            }
            elementList.add(localPrincipal);
        }
        if (localCruceTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "cruce"));

            if (localCruce == null) {
                throw new org.apache.axis2.databinding.ADBException("cruce cannot be null!!");
            }
            elementList.add(localCruce);
        }
        if (localComplementariosTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "complementarios"));

            if (localComplementarios != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localComplementarios));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "complementarios cannot be null!!");
            }
        }
        if (localLocalidadTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "localidad"));

            if (localLocalidad != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localLocalidad));
            } else {
                throw new org.apache.axis2.databinding.ADBException("localidad cannot be null!!");
            }
        }
        if (localTelefono1Tracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "telefono1"));

            if (localTelefono1 == null) {
                throw new org.apache.axis2.databinding.ADBException("telefono1 cannot be null!!");
            }
            elementList.add(localTelefono1);
        }
        if (localFaxTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "fax"));

            if (localFax == null) {
                throw new org.apache.axis2.databinding.ADBException("fax cannot be null!!");
            }
            elementList.add(localFax);
        }
        if (localTelefono2Tracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "telefono2"));

            if (localTelefono2 == null) {
                throw new org.apache.axis2.databinding.ADBException("telefono2 cannot be null!!");
            }
            elementList.add(localTelefono2);
        }
        if (localCelularTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "celular"));

            if (localCelular != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localCelular));
            } else {
                throw new org.apache.axis2.databinding.ADBException("celular cannot be null!!");
            }
        }
        if (localCorreoElectronicoTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "correoElectronico"));

            if (localCorreoElectronico != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localCorreoElectronico));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "correoElectronico cannot be null!!");
            }
        }
        if (localNomenclaturaTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "nomenclatura"));

            if (localNomenclatura != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localNomenclatura));
            } else {
                throw new org.apache.axis2.databinding.ADBException("nomenclatura cannot be null!!");
            }
        }
        if (localMunicipioTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "municipio"));

            if (localMunicipio == null) {
                throw new org.apache.axis2.databinding.ADBException("municipio cannot be null!!");
            }
            elementList.add(localMunicipio);
        }
        if (localTipoViaPrincipalTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "tipoViaPrincipal"));

            if (localTipoViaPrincipal == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "tipoViaPrincipal cannot be null!!");
            }
            elementList.add(localTipoViaPrincipal);
        }
        if (localZonaLocalidadTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "zonaLocalidad"));

            if (localZonaLocalidad == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "zonaLocalidad cannot be null!!");
            }
            elementList.add(localZonaLocalidad);
        }
        if (localDireecionCompletaTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/ubicacion", "direecionCompleta"));

            if (localDireecionCompleta == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "direecionCompleta cannot be null!!");
            }
            elementList.add(localDireecionCompleta);
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
        public static DireccionType parse(final javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            DireccionType object = new DireccionType();

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

                        if (!"direccionType".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(
                                    nsPrefix);
                            return (DireccionType) com.colsanitas.gestiondocumentoequivalente.ExtensionMapper
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
                                "http://colsanitas.com/osi/comun/ubicacion", "ordinal")
                                .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "ordinal" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setOrdinal(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToInt(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                    object.setOrdinal(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName(
                                "http://colsanitas.com/osi/comun/ubicacion", "principal")
                                .equals(reader.getName())) {

                    object.setPrincipal(com.colsanitas.osi.comun.ubicacion.ViaType.Factory
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
                                "http://colsanitas.com/osi/comun/ubicacion", "cruce").equals(reader
                                .getName())) {

                    object.setCruce(com.colsanitas.osi.comun.ubicacion.ViaType.Factory
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
                                "http://colsanitas.com/osi/comun/ubicacion", "complementarios")
                                .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "complementarios" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setComplementarios(org.apache.axis2.databinding.utils.ConverterUtil
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
                                "http://colsanitas.com/osi/comun/ubicacion", "localidad")
                                .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "localidad" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLocalidad(org.apache.axis2.databinding.utils.ConverterUtil
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
                                "http://colsanitas.com/osi/comun/ubicacion", "telefono1")
                                .equals(reader.getName())) {

                    object.setTelefono1(com.colsanitas.osi.comun.ubicacion.TelefonoType.Factory
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
                                "http://colsanitas.com/osi/comun/ubicacion", "fax").equals(reader
                                .getName())) {

                    object.setFax(com.colsanitas.osi.comun.ubicacion.TelefonoType.Factory
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
                                "http://colsanitas.com/osi/comun/ubicacion", "telefono2")
                                .equals(reader.getName())) {

                    object.setTelefono2(com.colsanitas.osi.comun.ubicacion.TelefonoType.Factory
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
                                "http://colsanitas.com/osi/comun/ubicacion", "celular")
                                .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "celular" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCelular(org.apache.axis2.databinding.utils.ConverterUtil
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
                                "http://colsanitas.com/osi/comun/ubicacion", "correoElectronico")
                                .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "correoElectronico" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCorreoElectronico(org.apache.axis2.databinding.utils.ConverterUtil
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
                                "http://colsanitas.com/osi/comun/ubicacion", "nomenclatura")
                                .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "nomenclatura" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNomenclatura(org.apache.axis2.databinding.utils.ConverterUtil
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
                                "http://colsanitas.com/osi/comun/ubicacion", "municipio")
                                .equals(reader.getName())) {

                    object.setMunicipio(com.colsanitas.osi.comun.ubicacion.CiudadType.Factory
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
                                "http://colsanitas.com/osi/comun/ubicacion", "tipoViaPrincipal")
                                .equals(reader.getName())) {

                    object.setTipoViaPrincipal(com.colsanitas.osi.comun.ubicacion.CodigoViaPrincipalType.Factory
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
                                "http://colsanitas.com/osi/comun/ubicacion", "zonaLocalidad")
                                .equals(reader.getName())) {

                    object.setZonaLocalidad(com.colsanitas.osi.comun.ubicacion.CodigoZonaLocalidadType.Factory
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
                                "http://colsanitas.com/osi/comun/ubicacion", "direecionCompleta")
                                .equals(reader.getName())) {

                    object.setDireecionCompleta(com.colsanitas.osi.comun.ubicacion.DireccionCompletaType.Factory
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
