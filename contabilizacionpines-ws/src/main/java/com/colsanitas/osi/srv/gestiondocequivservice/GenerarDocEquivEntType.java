/**
 * GenerarDocEquivEntType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.colsanitas.osi.srv.gestiondocequivservice;

/**
 * GenerarDocEquivEntType bean class
 */
@SuppressWarnings({"unchecked","unused","rawtypes"})
public class GenerarDocEquivEntType implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name = generarDocEquivEntType
     * Namespace URI = http://colsanitas.com/osi/srv/GestionDocEquivService Namespace Prefix = ns10
     */

    /**
                 * 
                 */
    private static final long serialVersionUID = -6420641246409246040L;

    /**
     * field for Categoria
     */

    protected com.colsanitas.osi.srv.gestiondocequivservice.CategoriaType localCategoria;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localCategoriaTracker = false;

    public boolean isCategoriaSpecified() {
        return localCategoriaTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.srv.gestiondocequivservice.CategoriaType
     */
    public com.colsanitas.osi.srv.gestiondocequivservice.CategoriaType getCategoria() {
        return localCategoria;
    }

    /**
     * Auto generated setter method
     * @param param Categoria
     */
    public void setCategoria(final com.colsanitas.osi.srv.gestiondocequivservice.CategoriaType param) {
        localCategoriaTracker = param != null;

        this.localCategoria = param;

    }

    /**
     * field for ListaMediosPago
     */

    protected com.colsanitas.osi.srv.gestiondocequivservice.ListaMediosPago_type0 localListaMediosPago;

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.srv.gestiondocequivservice.ListaMediosPago_type0
     */
    public com.colsanitas.osi.srv.gestiondocequivservice.ListaMediosPago_type0 getListaMediosPago() {
        return localListaMediosPago;
    }

    /**
     * Auto generated setter method
     * @param param ListaMediosPago
     */
    public void setListaMediosPago(
            final com.colsanitas.osi.srv.gestiondocequivservice.ListaMediosPago_type0 param) {

        this.localListaMediosPago = param;

    }

    /**
     * field for ListaPines
     */

    protected com.colsanitas.osi.srv.gestiondocequivservice.ListaPines_type0 localListaPines;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localListaPinesTracker = false;

    public boolean isListaPinesSpecified() {
        return localListaPinesTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.srv.gestiondocequivservice.ListaPines_type0
     */
    public com.colsanitas.osi.srv.gestiondocequivservice.ListaPines_type0 getListaPines() {
        return localListaPines;
    }

    /**
     * Auto generated setter method
     * @param param ListaPines
     */
    public void setListaPines(
            final com.colsanitas.osi.srv.gestiondocequivservice.ListaPines_type0 param) {
        localListaPinesTracker = param != null;

        this.localListaPines = param;

    }

    /**
     * field for CodigoCompania
     */

    protected com.colsanitas.osi.comun.organizacion.CodigoCiaType localCodigoCompania;

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

        this.localCodigoCompania = param;

    }

    /**
     * field for CodigoPlan
     */

    protected com.colsanitas.osi.comun.organizacion.CodigoPlanType localCodigoPlan;

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.organizacion.CodigoPlanType
     */
    public com.colsanitas.osi.comun.organizacion.CodigoPlanType getCodigoPlan() {
        return localCodigoPlan;
    }

    /**
     * Auto generated setter method
     * @param param CodigoPlan
     */
    public void setCodigoPlan(final com.colsanitas.osi.comun.organizacion.CodigoPlanType param) {

        this.localCodigoPlan = param;

    }

    /**
     * field for NumContrato
     */

    protected com.colsanitas.osi.comun.organizacion.NumeroContratoType localNumContrato;

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.organizacion.NumeroContratoType
     */
    public com.colsanitas.osi.comun.organizacion.NumeroContratoType getNumContrato() {
        return localNumContrato;
    }

    /**
     * Auto generated setter method
     * @param param NumContrato
     */
    public void setNumContrato(final com.colsanitas.osi.comun.organizacion.NumeroContratoType param) {

        this.localNumContrato = param;

    }

    /**
     * field for NumeroFamilia
     */

    protected com.colsanitas.osi.comun.organizacion.NumeroFliaType localNumeroFamilia;

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.organizacion.NumeroFliaType
     */
    public com.colsanitas.osi.comun.organizacion.NumeroFliaType getNumeroFamilia() {
        return localNumeroFamilia;
    }

    /**
     * Auto generated setter method
     * @param param NumeroFamilia
     */
    public void setNumeroFamilia(final com.colsanitas.osi.comun.organizacion.NumeroFliaType param) {

        this.localNumeroFamilia = param;

    }

    /**
     * field for CodigoConcepto
     */

    protected com.colsanitas.osi.recaudo.CodigoConceptoType localCodigoConcepto;

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.recaudo.CodigoConceptoType
     */
    public com.colsanitas.osi.recaudo.CodigoConceptoType getCodigoConcepto() {
        return localCodigoConcepto;
    }

    /**
     * Auto generated setter method
     * @param param CodigoConcepto
     */
    public void setCodigoConcepto(final com.colsanitas.osi.recaudo.CodigoConceptoType param) {

        this.localCodigoConcepto = param;

    }

    /**
     * field for Estacion
     */

    protected com.colsanitas.osi.recaudo.CodigoEstacionType localEstacion;

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.recaudo.CodigoEstacionType
     */
    public com.colsanitas.osi.recaudo.CodigoEstacionType getEstacion() {
        return localEstacion;
    }

    /**
     * Auto generated setter method
     * @param param Estacion
     */
    public void setEstacion(final com.colsanitas.osi.recaudo.CodigoEstacionType param) {

        this.localEstacion = param;

    }

    /**
     * field for CiudadVenta
     */

    protected com.colsanitas.osi.comun.ubicacion.CodigoCiudadType localCiudadVenta;

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.ubicacion.CodigoCiudadType
     */
    public com.colsanitas.osi.comun.ubicacion.CodigoCiudadType getCiudadVenta() {
        return localCiudadVenta;
    }

    /**
     * Auto generated setter method
     * @param param CiudadVenta
     */
    public void setCiudadVenta(final com.colsanitas.osi.comun.ubicacion.CodigoCiudadType param) {

        this.localCiudadVenta = param;

    }

    /**
     * field for CodigoCanal
     */

    protected com.colsanitas.osi.comun.organizacion.CodigoCanalType localCodigoCanal;

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.organizacion.CodigoCanalType
     */
    public com.colsanitas.osi.comun.organizacion.CodigoCanalType getCodigoCanal() {
        return localCodigoCanal;
    }

    /**
     * Auto generated setter method
     * @param param CodigoCanal
     */
    public void setCodigoCanal(final com.colsanitas.osi.comun.organizacion.CodigoCanalType param) {

        this.localCodigoCanal = param;

    }

    /**
     * field for NumeroTransaccion
     */

    protected com.colsanitas.osi.recaudo.transaccion.NumeroTransaccionType localNumeroTransaccion;

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.recaudo.transaccion.NumeroTransaccionType
     */
    public com.colsanitas.osi.recaudo.transaccion.NumeroTransaccionType getNumeroTransaccion() {
        return localNumeroTransaccion;
    }

    /**
     * Auto generated setter method
     * @param param NumeroTransaccion
     */
    public void setNumeroTransaccion(
            final com.colsanitas.osi.recaudo.transaccion.NumeroTransaccionType param) {

        this.localNumeroTransaccion = param;

    }

    /**
     * field for Valor
     */

    protected com.colsanitas.osi.comun.organizacion.PrecioType localValor;

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

        this.localValor = param;

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
                    "http://colsanitas.com/osi/srv/GestionDocEquivService");
            if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":generarDocEquivEntType", xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "generarDocEquivEntType", xmlWriter);
            }

        }
        if (localCategoriaTracker) {
            if (localCategoria == null) {
                throw new org.apache.axis2.databinding.ADBException("categoria cannot be null!!");
            }
            localCategoria
                    .serialize(new javax.xml.namespace.QName(
                            "http://colsanitas.com/osi/srv/GestionDocEquivService", "categoria"),
                            xmlWriter);
        }
        if (localListaMediosPago == null) {
            throw new org.apache.axis2.databinding.ADBException("ListaMediosPago cannot be null!!");
        }
        localListaMediosPago.serialize(new javax.xml.namespace.QName(
                "http://colsanitas.com/osi/srv/GestionDocEquivService", "ListaMediosPago"),
                xmlWriter);
        if (localListaPinesTracker) {
            if (localListaPines == null) {
                throw new org.apache.axis2.databinding.ADBException("ListaPines cannot be null!!");
            }
            localListaPines.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/srv/GestionDocEquivService", "ListaPines"),
                    xmlWriter);
        }
        if (localCodigoCompania == null) {
            throw new org.apache.axis2.databinding.ADBException("codigoCompania cannot be null!!");
        }
        localCodigoCompania.serialize(new javax.xml.namespace.QName(
                "http://colsanitas.com/osi/srv/GestionDocEquivService", "codigoCompania"),
                xmlWriter);

        if (localCodigoPlan == null) {
            throw new org.apache.axis2.databinding.ADBException("codigoPlan cannot be null!!");
        }
        localCodigoPlan.serialize(new javax.xml.namespace.QName(
                "http://colsanitas.com/osi/srv/GestionDocEquivService", "codigoPlan"), xmlWriter);

        if (localNumContrato == null) {
            throw new org.apache.axis2.databinding.ADBException("numContrato cannot be null!!");
        }
        localNumContrato.serialize(new javax.xml.namespace.QName(
                "http://colsanitas.com/osi/srv/GestionDocEquivService", "numContrato"), xmlWriter);

        if (localNumeroFamilia == null) {
            throw new org.apache.axis2.databinding.ADBException("numeroFamilia cannot be null!!");
        }
        localNumeroFamilia
                .serialize(new javax.xml.namespace.QName(
                        "http://colsanitas.com/osi/srv/GestionDocEquivService", "numeroFamilia"),
                        xmlWriter);

        if (localCodigoConcepto == null) {
            throw new org.apache.axis2.databinding.ADBException("codigoConcepto cannot be null!!");
        }
        localCodigoConcepto.serialize(new javax.xml.namespace.QName(
                "http://colsanitas.com/osi/srv/GestionDocEquivService", "codigoConcepto"),
                xmlWriter);

        if (localEstacion == null) {
            throw new org.apache.axis2.databinding.ADBException("estacion cannot be null!!");
        }
        localEstacion.serialize(new javax.xml.namespace.QName(
                "http://colsanitas.com/osi/srv/GestionDocEquivService", "estacion"), xmlWriter);

        if (localCiudadVenta == null) {
            throw new org.apache.axis2.databinding.ADBException("ciudadVenta cannot be null!!");
        }
        localCiudadVenta.serialize(new javax.xml.namespace.QName(
                "http://colsanitas.com/osi/srv/GestionDocEquivService", "ciudadVenta"), xmlWriter);

        if (localCodigoCanal == null) {
            throw new org.apache.axis2.databinding.ADBException("codigoCanal cannot be null!!");
        }
        localCodigoCanal.serialize(new javax.xml.namespace.QName(
                "http://colsanitas.com/osi/srv/GestionDocEquivService", "codigoCanal"), xmlWriter);

        if (localNumeroTransaccion == null) {
            throw new org.apache.axis2.databinding.ADBException(
                    "numeroTransaccion cannot be null!!");
        }
        localNumeroTransaccion.serialize(new javax.xml.namespace.QName(
                "http://colsanitas.com/osi/srv/GestionDocEquivService", "numeroTransaccion"),
                xmlWriter);

        if (localValor == null) {
            throw new org.apache.axis2.databinding.ADBException("valor cannot be null!!");
        }
        localValor.serialize(new javax.xml.namespace.QName(
                "http://colsanitas.com/osi/srv/GestionDocEquivService", "valor"), xmlWriter);

        xmlWriter.writeEndElement();

    }

    private static java.lang.String generatePrefix(final java.lang.String namespace) {
        if (namespace.equals("http://colsanitas.com/osi/srv/GestionDocEquivService")) {
            return "ns10";
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

        if (localCategoriaTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/srv/GestionDocEquivService", "categoria"));

            if (localCategoria == null) {
                throw new org.apache.axis2.databinding.ADBException("categoria cannot be null!!");
            }
            elementList.add(localCategoria);
        }
        elementList.add(new javax.xml.namespace.QName(
                "http://colsanitas.com/osi/srv/GestionDocEquivService", "ListaMediosPago"));

        if (localListaMediosPago == null) {
            throw new org.apache.axis2.databinding.ADBException("ListaMediosPago cannot be null!!");
        }
        elementList.add(localListaMediosPago);
        if (localListaPinesTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/srv/GestionDocEquivService", "ListaPines"));

            if (localListaPines == null) {
                throw new org.apache.axis2.databinding.ADBException("ListaPines cannot be null!!");
            }
            elementList.add(localListaPines);
        }
        elementList.add(new javax.xml.namespace.QName(
                "http://colsanitas.com/osi/srv/GestionDocEquivService", "codigoCompania"));

        if (localCodigoCompania == null) {
            throw new org.apache.axis2.databinding.ADBException("codigoCompania cannot be null!!");
        }
        elementList.add(localCodigoCompania);

        elementList.add(new javax.xml.namespace.QName(
                "http://colsanitas.com/osi/srv/GestionDocEquivService", "codigoPlan"));

        if (localCodigoPlan == null) {
            throw new org.apache.axis2.databinding.ADBException("codigoPlan cannot be null!!");
        }
        elementList.add(localCodigoPlan);

        elementList.add(new javax.xml.namespace.QName(
                "http://colsanitas.com/osi/srv/GestionDocEquivService", "numContrato"));

        if (localNumContrato == null) {
            throw new org.apache.axis2.databinding.ADBException("numContrato cannot be null!!");
        }
        elementList.add(localNumContrato);

        elementList.add(new javax.xml.namespace.QName(
                "http://colsanitas.com/osi/srv/GestionDocEquivService", "numeroFamilia"));

        if (localNumeroFamilia == null) {
            throw new org.apache.axis2.databinding.ADBException("numeroFamilia cannot be null!!");
        }
        elementList.add(localNumeroFamilia);

        elementList.add(new javax.xml.namespace.QName(
                "http://colsanitas.com/osi/srv/GestionDocEquivService", "codigoConcepto"));

        if (localCodigoConcepto == null) {
            throw new org.apache.axis2.databinding.ADBException("codigoConcepto cannot be null!!");
        }
        elementList.add(localCodigoConcepto);

        elementList.add(new javax.xml.namespace.QName(
                "http://colsanitas.com/osi/srv/GestionDocEquivService", "estacion"));

        if (localEstacion == null) {
            throw new org.apache.axis2.databinding.ADBException("estacion cannot be null!!");
        }
        elementList.add(localEstacion);

        elementList.add(new javax.xml.namespace.QName(
                "http://colsanitas.com/osi/srv/GestionDocEquivService", "ciudadVenta"));

        if (localCiudadVenta == null) {
            throw new org.apache.axis2.databinding.ADBException("ciudadVenta cannot be null!!");
        }
        elementList.add(localCiudadVenta);

        elementList.add(new javax.xml.namespace.QName(
                "http://colsanitas.com/osi/srv/GestionDocEquivService", "codigoCanal"));

        if (localCodigoCanal == null) {
            throw new org.apache.axis2.databinding.ADBException("codigoCanal cannot be null!!");
        }
        elementList.add(localCodigoCanal);

        elementList.add(new javax.xml.namespace.QName(
                "http://colsanitas.com/osi/srv/GestionDocEquivService", "numeroTransaccion"));

        if (localNumeroTransaccion == null) {
            throw new org.apache.axis2.databinding.ADBException(
                    "numeroTransaccion cannot be null!!");
        }
        elementList.add(localNumeroTransaccion);

        elementList.add(new javax.xml.namespace.QName(
                "http://colsanitas.com/osi/srv/GestionDocEquivService", "valor"));

        if (localValor == null) {
            throw new org.apache.axis2.databinding.ADBException("valor cannot be null!!");
        }
        elementList.add(localValor);

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
        public static GenerarDocEquivEntType parse(final javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            GenerarDocEquivEntType object = new GenerarDocEquivEntType();

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

                        if (!"generarDocEquivEntType".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(
                                    nsPrefix);
                            return (GenerarDocEquivEntType) com.colsanitas.gestiondocumentoequivalente.ExtensionMapper
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
                                "http://colsanitas.com/osi/srv/GestionDocEquivService", "categoria")
                                .equals(reader.getName())) {

                    object.setCategoria(com.colsanitas.osi.srv.gestiondocequivservice.CategoriaType.Factory
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
                                "http://colsanitas.com/osi/srv/GestionDocEquivService",
                                "ListaMediosPago").equals(reader.getName())) {

                    object.setListaMediosPago(com.colsanitas.osi.srv.gestiondocequivservice.ListaMediosPago_type0.Factory
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
                                "http://colsanitas.com/osi/srv/GestionDocEquivService",
                                "ListaPines").equals(reader.getName())) {

                    object.setListaPines(com.colsanitas.osi.srv.gestiondocequivservice.ListaPines_type0.Factory
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
                                "http://colsanitas.com/osi/srv/GestionDocEquivService",
                                "codigoCompania").equals(reader.getName())) {

                    object.setCodigoCompania(com.colsanitas.osi.comun.organizacion.CodigoCiaType.Factory
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
                                "http://colsanitas.com/osi/srv/GestionDocEquivService",
                                "codigoPlan").equals(reader.getName())) {

                    object.setCodigoPlan(com.colsanitas.osi.comun.organizacion.CodigoPlanType.Factory
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
                                "http://colsanitas.com/osi/srv/GestionDocEquivService",
                                "numContrato").equals(reader.getName())) {

                    object.setNumContrato(com.colsanitas.osi.comun.organizacion.NumeroContratoType.Factory
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
                                "http://colsanitas.com/osi/srv/GestionDocEquivService",
                                "numeroFamilia").equals(reader.getName())) {

                    object.setNumeroFamilia(com.colsanitas.osi.comun.organizacion.NumeroFliaType.Factory
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
                                "http://colsanitas.com/osi/srv/GestionDocEquivService",
                                "codigoConcepto").equals(reader.getName())) {

                    object.setCodigoConcepto(com.colsanitas.osi.recaudo.CodigoConceptoType.Factory
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
                                "http://colsanitas.com/osi/srv/GestionDocEquivService", "estacion")
                                .equals(reader.getName())) {

                    object.setEstacion(com.colsanitas.osi.recaudo.CodigoEstacionType.Factory
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
                                "http://colsanitas.com/osi/srv/GestionDocEquivService",
                                "ciudadVenta").equals(reader.getName())) {

                    object.setCiudadVenta(com.colsanitas.osi.comun.ubicacion.CodigoCiudadType.Factory
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
                                "http://colsanitas.com/osi/srv/GestionDocEquivService",
                                "codigoCanal").equals(reader.getName())) {

                    object.setCodigoCanal(com.colsanitas.osi.comun.organizacion.CodigoCanalType.Factory
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
                                "http://colsanitas.com/osi/srv/GestionDocEquivService",
                                "numeroTransaccion").equals(reader.getName())) {

                    object.setNumeroTransaccion(com.colsanitas.osi.recaudo.transaccion.NumeroTransaccionType.Factory
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
                                "http://colsanitas.com/osi/srv/GestionDocEquivService", "valor")
                                .equals(reader.getName())) {

                    object.setValor(com.colsanitas.osi.comun.organizacion.PrecioType.Factory
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
