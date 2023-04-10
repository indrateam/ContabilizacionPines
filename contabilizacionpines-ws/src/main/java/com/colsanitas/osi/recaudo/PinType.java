/**
 * PinType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.colsanitas.osi.recaudo;

/**
 * PinType bean class
 */
@SuppressWarnings({"unchecked","unused","rawtypes"})
public class PinType implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name = PinType Namespace URI =
     * http://colsanitas.com/osi/recaudo Namespace Prefix = ns7
     */

    /**
                 * 
                 */
    private static final long serialVersionUID = -37909777104695607L;

    /**
     * field for CodPin
     */

    protected java.lang.String localCodPin;

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCodPin() {
        return localCodPin;
    }

    /**
     * Auto generated setter method
     * @param param CodPin
     */
    public void setCodPin(final java.lang.String param) {

        this.localCodPin = param;

    }

    /**
     * field for FechaAsignacion
     */

    protected java.util.Calendar localFechaAsignacion;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localFechaAsignacionTracker = false;

    public boolean isFechaAsignacionSpecified() {
        return localFechaAsignacionTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getFechaAsignacion() {
        return localFechaAsignacion;
    }

    /**
     * Auto generated setter method
     * @param param FechaAsignacion
     */
    public void setFechaAsignacion(final java.util.Calendar param) {
        localFechaAsignacionTracker = param != null;

        this.localFechaAsignacion = param;

    }

    /**
     * field for FechaUtilizacion
     */

    protected java.util.Calendar localFechaUtilizacion;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localFechaUtilizacionTracker = false;

    public boolean isFechaUtilizacionSpecified() {
        return localFechaUtilizacionTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getFechaUtilizacion() {
        return localFechaUtilizacion;
    }

    /**
     * Auto generated setter method
     * @param param FechaUtilizacion
     */
    public void setFechaUtilizacion(final java.util.Calendar param) {
        localFechaUtilizacionTracker = param != null;

        this.localFechaUtilizacion = param;

    }

    /**
     * field for FechaUltimoEstado
     */

    protected java.util.Calendar localFechaUltimoEstado;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localFechaUltimoEstadoTracker = false;

    public boolean isFechaUltimoEstadoSpecified() {
        return localFechaUltimoEstadoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getFechaUltimoEstado() {
        return localFechaUltimoEstado;
    }

    /**
     * Auto generated setter method
     * @param param FechaUltimoEstado
     */
    public void setFechaUltimoEstado(final java.util.Calendar param) {
        localFechaUltimoEstadoTracker = param != null;

        this.localFechaUltimoEstado = param;

    }

    /**
     * field for PersonaAutoriza
     */

    protected com.colsanitas.osi.comun.persona.PersonaType localPersonaAutoriza;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localPersonaAutorizaTracker = false;

    public boolean isPersonaAutorizaSpecified() {
        return localPersonaAutorizaTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.persona.PersonaType
     */
    public com.colsanitas.osi.comun.persona.PersonaType getPersonaAutoriza() {
        return localPersonaAutoriza;
    }

    /**
     * Auto generated setter method
     * @param param PersonaAutoriza
     */
    public void setPersonaAutoriza(final com.colsanitas.osi.comun.persona.PersonaType param) {
        localPersonaAutorizaTracker = param != null;

        this.localPersonaAutoriza = param;

    }

    /**
     * field for PersonaUtiliza
     */

    protected com.colsanitas.osi.comun.persona.PersonaType localPersonaUtiliza;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localPersonaUtilizaTracker = false;

    public boolean isPersonaUtilizaSpecified() {
        return localPersonaUtilizaTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.persona.PersonaType
     */
    public com.colsanitas.osi.comun.persona.PersonaType getPersonaUtiliza() {
        return localPersonaUtiliza;
    }

    /**
     * Auto generated setter method
     * @param param PersonaUtiliza
     */
    public void setPersonaUtiliza(final com.colsanitas.osi.comun.persona.PersonaType param) {
        localPersonaUtilizaTracker = param != null;

        this.localPersonaUtiliza = param;

    }

    /**
     * field for Prestador
     */

    protected com.colsanitas.osi.comun.persona.PersonaType localPrestador;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localPrestadorTracker = false;

    public boolean isPrestadorSpecified() {
        return localPrestadorTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.persona.PersonaType
     */
    public com.colsanitas.osi.comun.persona.PersonaType getPrestador() {
        return localPrestador;
    }

    /**
     * Auto generated setter method
     * @param param Prestador
     */
    public void setPrestador(final com.colsanitas.osi.comun.persona.PersonaType param) {
        localPrestadorTracker = param != null;

        this.localPrestador = param;

    }

    /**
     * field for CanalAsignado
     */

    protected com.colsanitas.osi.comun.organizacion.CanalType localCanalAsignado;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localCanalAsignadoTracker = false;

    public boolean isCanalAsignadoSpecified() {
        return localCanalAsignadoTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.organizacion.CanalType
     */
    public com.colsanitas.osi.comun.organizacion.CanalType getCanalAsignado() {
        return localCanalAsignado;
    }

    /**
     * Auto generated setter method
     * @param param CanalAsignado
     */
    public void setCanalAsignado(final com.colsanitas.osi.comun.organizacion.CanalType param) {
        localCanalAsignadoTracker = param != null;

        this.localCanalAsignado = param;

    }

    /**
     * field for CanalUtilizado
     */

    protected com.colsanitas.osi.comun.organizacion.CanalType localCanalUtilizado;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localCanalUtilizadoTracker = false;

    public boolean isCanalUtilizadoSpecified() {
        return localCanalUtilizadoTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.organizacion.CanalType
     */
    public com.colsanitas.osi.comun.organizacion.CanalType getCanalUtilizado() {
        return localCanalUtilizado;
    }

    /**
     * Auto generated setter method
     * @param param CanalUtilizado
     */
    public void setCanalUtilizado(final com.colsanitas.osi.comun.organizacion.CanalType param) {
        localCanalUtilizadoTracker = param != null;

        this.localCanalUtilizado = param;

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
     * field for Contrato
     */

    protected com.colsanitas.osi.comun.organizacion.ContratoType localContrato;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localContratoTracker = false;

    public boolean isContratoSpecified() {
        return localContratoTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.organizacion.ContratoType
     */
    public com.colsanitas.osi.comun.organizacion.ContratoType getContrato() {
        return localContrato;
    }

    /**
     * Auto generated setter method
     * @param param Contrato
     */
    public void setContrato(final com.colsanitas.osi.comun.organizacion.ContratoType param) {
        localContratoTracker = param != null;

        this.localContrato = param;

    }

    /**
     * field for Familia
     */

    protected java.lang.String localFamilia;

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
     * @return java.lang.String
     */
    public java.lang.String getFamilia() {
        return localFamilia;
    }

    /**
     * Auto generated setter method
     * @param param Familia
     */
    public void setFamilia(final java.lang.String param) {
        localFamiliaTracker = param != null;

        this.localFamilia = param;

    }

    /**
     * field for Categoria
     */

    protected java.lang.String localCategoria;

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
     * @return java.lang.String
     */
    public java.lang.String getCategoria() {
        return localCategoria;
    }

    /**
     * Auto generated setter method
     * @param param Categoria
     */
    public void setCategoria(final java.lang.String param) {
        localCategoriaTracker = param != null;

        this.localCategoria = param;

    }

    /**
     * field for Estacion
     */

    protected java.lang.String localEstacion;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localEstacionTracker = false;

    public boolean isEstacionSpecified() {
        return localEstacionTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEstacion() {
        return localEstacion;
    }

    /**
     * Auto generated setter method
     * @param param Estacion
     */
    public void setEstacion(final java.lang.String param) {
        localEstacionTracker = param != null;

        this.localEstacion = param;

    }

    /**
     * field for NumeroTransaccion
     */

    protected java.lang.String localNumeroTransaccion;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localNumeroTransaccionTracker = false;

    public boolean isNumeroTransaccionSpecified() {
        return localNumeroTransaccionTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNumeroTransaccion() {
        return localNumeroTransaccion;
    }

    /**
     * Auto generated setter method
     * @param param NumeroTransaccion
     */
    public void setNumeroTransaccion(final java.lang.String param) {
        localNumeroTransaccionTracker = param != null;

        this.localNumeroTransaccion = param;

    }

    /**
     * field for Ciudad
     */

    protected com.colsanitas.osi.comun.ubicacion.CiudadType localCiudad;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localCiudadTracker = false;

    public boolean isCiudadSpecified() {
        return localCiudadTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.ubicacion.CiudadType
     */
    public com.colsanitas.osi.comun.ubicacion.CiudadType getCiudad() {
        return localCiudad;
    }

    /**
     * Auto generated setter method
     * @param param Ciudad
     */
    public void setCiudad(final com.colsanitas.osi.comun.ubicacion.CiudadType param) {
        localCiudadTracker = param != null;

        this.localCiudad = param;

    }

    /**
     * field for Precio
     */

    protected com.colsanitas.osi.comun.organizacion.PrecioType localPrecio;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localPrecioTracker = false;

    public boolean isPrecioSpecified() {
        return localPrecioTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.organizacion.PrecioType
     */
    public com.colsanitas.osi.comun.organizacion.PrecioType getPrecio() {
        return localPrecio;
    }

    /**
     * Auto generated setter method
     * @param param Precio
     */
    public void setPrecio(final com.colsanitas.osi.comun.organizacion.PrecioType param) {
        localPrecioTracker = param != null;

        this.localPrecio = param;

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
                        namespacePrefix + ":PinType", xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "PinType", xmlWriter);
            }

        }

        namespace = "http://colsanitas.com/osi/recaudo";
        writeStartElement(null, namespace, "codPin", xmlWriter);

        if (localCodPin == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("codPin cannot be null!!");

        } else {

            xmlWriter.writeCharacters(localCodPin);

        }

        xmlWriter.writeEndElement();
        if (localFechaAsignacionTracker) {
            namespace = "http://colsanitas.com/osi/recaudo";
            writeStartElement(null, namespace, "fechaAsignacion", xmlWriter);

            if (localFechaAsignacion == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException(
                        "fechaAsignacion cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localFechaAsignacion));

            }

            xmlWriter.writeEndElement();
        }
        if (localFechaUtilizacionTracker) {
            namespace = "http://colsanitas.com/osi/recaudo";
            writeStartElement(null, namespace, "fechaUtilizacion", xmlWriter);

            if (localFechaUtilizacion == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException(
                        "fechaUtilizacion cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localFechaUtilizacion));

            }

            xmlWriter.writeEndElement();
        }
        if (localFechaUltimoEstadoTracker) {
            namespace = "http://colsanitas.com/osi/recaudo";
            writeStartElement(null, namespace, "fechaUltimoEstado", xmlWriter);

            if (localFechaUltimoEstado == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException(
                        "fechaUltimoEstado cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localFechaUltimoEstado));

            }

            xmlWriter.writeEndElement();
        }
        if (localPersonaAutorizaTracker) {
            if (localPersonaAutoriza == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "personaAutoriza cannot be null!!");
            }
            localPersonaAutoriza.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/recaudo", "personaAutoriza"), xmlWriter);
        }
        if (localPersonaUtilizaTracker) {
            if (localPersonaUtiliza == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "personaUtiliza cannot be null!!");
            }
            localPersonaUtiliza.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/recaudo", "personaUtiliza"), xmlWriter);
        }
        if (localPrestadorTracker) {
            if (localPrestador == null) {
                throw new org.apache.axis2.databinding.ADBException("prestador cannot be null!!");
            }
            localPrestador.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/recaudo", "prestador"), xmlWriter);
        }
        if (localCanalAsignadoTracker) {
            if (localCanalAsignado == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "canalAsignado cannot be null!!");
            }
            localCanalAsignado.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/recaudo", "canalAsignado"), xmlWriter);
        }
        if (localCanalUtilizadoTracker) {
            if (localCanalUtilizado == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "canalUtilizado cannot be null!!");
            }
            localCanalUtilizado.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/recaudo", "canalUtilizado"), xmlWriter);
        }
        if (localCompaniaTracker) {
            if (localCompania == null) {
                throw new org.apache.axis2.databinding.ADBException("compania cannot be null!!");
            }
            localCompania.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/recaudo", "compania"), xmlWriter);
        }
        if (localPlanTracker) {
            if (localPlan == null) {
                throw new org.apache.axis2.databinding.ADBException("plan cannot be null!!");
            }
            localPlan.serialize(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "plan"), xmlWriter);
        }
        if (localEstadoTracker) {
            if (localEstado == null) {
                throw new org.apache.axis2.databinding.ADBException("estado cannot be null!!");
            }
            localEstado.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/recaudo", "estado"), xmlWriter);
        }
        if (localMotivoTracker) {
            if (localMotivo == null) {
                throw new org.apache.axis2.databinding.ADBException("motivo cannot be null!!");
            }
            localMotivo.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/recaudo", "motivo"), xmlWriter);
        }
        if (localContratoTracker) {
            if (localContrato == null) {
                throw new org.apache.axis2.databinding.ADBException("contrato cannot be null!!");
            }
            localContrato.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/recaudo", "contrato"), xmlWriter);
        }
        if (localFamiliaTracker) {
            namespace = "http://colsanitas.com/osi/recaudo";
            writeStartElement(null, namespace, "familia", xmlWriter);

            if (localFamilia == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("familia cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localFamilia);

            }

            xmlWriter.writeEndElement();
        }
        if (localCategoriaTracker) {
            namespace = "http://colsanitas.com/osi/recaudo";
            writeStartElement(null, namespace, "categoria", xmlWriter);

            if (localCategoria == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("categoria cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localCategoria);

            }

            xmlWriter.writeEndElement();
        }
        if (localEstacionTracker) {
            namespace = "http://colsanitas.com/osi/recaudo";
            writeStartElement(null, namespace, "estacion", xmlWriter);

            if (localEstacion == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("estacion cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localEstacion);

            }

            xmlWriter.writeEndElement();
        }
        if (localNumeroTransaccionTracker) {
            namespace = "http://colsanitas.com/osi/recaudo";
            writeStartElement(null, namespace, "numeroTransaccion", xmlWriter);

            if (localNumeroTransaccion == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException(
                        "numeroTransaccion cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localNumeroTransaccion);

            }

            xmlWriter.writeEndElement();
        }
        if (localCiudadTracker) {
            if (localCiudad == null) {
                throw new org.apache.axis2.databinding.ADBException("ciudad cannot be null!!");
            }
            localCiudad.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/recaudo", "ciudad"), xmlWriter);
        }
        if (localPrecioTracker) {
            if (localPrecio == null) {
                throw new org.apache.axis2.databinding.ADBException("precio cannot be null!!");
            }
            localPrecio.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/recaudo", "precio"), xmlWriter);
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
                .add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo", "codPin"));

        if (localCodPin != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localCodPin));
        } else {
            throw new org.apache.axis2.databinding.ADBException("codPin cannot be null!!");
        }
        if (localFechaAsignacionTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "fechaAsignacion"));

            if (localFechaAsignacion != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localFechaAsignacion));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "fechaAsignacion cannot be null!!");
            }
        }
        if (localFechaUtilizacionTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "fechaUtilizacion"));

            if (localFechaUtilizacion != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localFechaUtilizacion));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "fechaUtilizacion cannot be null!!");
            }
        }
        if (localFechaUltimoEstadoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "fechaUltimoEstado"));

            if (localFechaUltimoEstado != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localFechaUltimoEstado));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "fechaUltimoEstado cannot be null!!");
            }
        }
        if (localPersonaAutorizaTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "personaAutoriza"));

            if (localPersonaAutoriza == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "personaAutoriza cannot be null!!");
            }
            elementList.add(localPersonaAutoriza);
        }
        if (localPersonaUtilizaTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "personaUtiliza"));

            if (localPersonaUtiliza == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "personaUtiliza cannot be null!!");
            }
            elementList.add(localPersonaUtiliza);
        }
        if (localPrestadorTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "prestador"));

            if (localPrestador == null) {
                throw new org.apache.axis2.databinding.ADBException("prestador cannot be null!!");
            }
            elementList.add(localPrestador);
        }
        if (localCanalAsignadoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "canalAsignado"));

            if (localCanalAsignado == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "canalAsignado cannot be null!!");
            }
            elementList.add(localCanalAsignado);
        }
        if (localCanalUtilizadoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "canalUtilizado"));

            if (localCanalUtilizado == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "canalUtilizado cannot be null!!");
            }
            elementList.add(localCanalUtilizado);
        }
        if (localCompaniaTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "compania"));

            if (localCompania == null) {
                throw new org.apache.axis2.databinding.ADBException("compania cannot be null!!");
            }
            elementList.add(localCompania);
        }
        if (localPlanTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "plan"));

            if (localPlan == null) {
                throw new org.apache.axis2.databinding.ADBException("plan cannot be null!!");
            }
            elementList.add(localPlan);
        }
        if (localEstadoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "estado"));

            if (localEstado == null) {
                throw new org.apache.axis2.databinding.ADBException("estado cannot be null!!");
            }
            elementList.add(localEstado);
        }
        if (localMotivoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "motivo"));

            if (localMotivo == null) {
                throw new org.apache.axis2.databinding.ADBException("motivo cannot be null!!");
            }
            elementList.add(localMotivo);
        }
        if (localContratoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "contrato"));

            if (localContrato == null) {
                throw new org.apache.axis2.databinding.ADBException("contrato cannot be null!!");
            }
            elementList.add(localContrato);
        }
        if (localFamiliaTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "familia"));

            if (localFamilia != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localFamilia));
            } else {
                throw new org.apache.axis2.databinding.ADBException("familia cannot be null!!");
            }
        }
        if (localCategoriaTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "categoria"));

            if (localCategoria != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localCategoria));
            } else {
                throw new org.apache.axis2.databinding.ADBException("categoria cannot be null!!");
            }
        }
        if (localEstacionTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "estacion"));

            if (localEstacion != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localEstacion));
            } else {
                throw new org.apache.axis2.databinding.ADBException("estacion cannot be null!!");
            }
        }
        if (localNumeroTransaccionTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "numeroTransaccion"));

            if (localNumeroTransaccion != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localNumeroTransaccion));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "numeroTransaccion cannot be null!!");
            }
        }
        if (localCiudadTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "ciudad"));

            if (localCiudad == null) {
                throw new org.apache.axis2.databinding.ADBException("ciudad cannot be null!!");
            }
            elementList.add(localCiudad);
        }
        if (localPrecioTracker) {
            elementList.add(new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                    "precio"));

            if (localPrecio == null) {
                throw new org.apache.axis2.databinding.ADBException("precio cannot be null!!");
            }
            elementList.add(localPrecio);
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
        public static PinType parse(final javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            PinType object = new PinType();

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

                        if (!"PinType".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(
                                    nsPrefix);
                            return (PinType) com.colsanitas.gestiondocumentoequivalente.ExtensionMapper
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
                                "codPin").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "codPin" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCodPin(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToString(content));

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
                                "fechaAsignacion").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "fechaAsignacion" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFechaAsignacion(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToDateTime(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                                "fechaUtilizacion").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "fechaUtilizacion" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFechaUtilizacion(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToDateTime(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                                "fechaUltimoEstado").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "fechaUltimoEstado" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFechaUltimoEstado(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToDateTime(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                                "personaAutoriza").equals(reader.getName())) {

                    object.setPersonaAutoriza(com.colsanitas.osi.comun.persona.PersonaType.Factory
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
                                "personaUtiliza").equals(reader.getName())) {

                    object.setPersonaUtiliza(com.colsanitas.osi.comun.persona.PersonaType.Factory
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
                                "prestador").equals(reader.getName())) {

                    object.setPrestador(com.colsanitas.osi.comun.persona.PersonaType.Factory
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
                                "canalAsignado").equals(reader.getName())) {

                    object.setCanalAsignado(com.colsanitas.osi.comun.organizacion.CanalType.Factory
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
                                "canalUtilizado").equals(reader.getName())) {

                    object.setCanalUtilizado(com.colsanitas.osi.comun.organizacion.CanalType.Factory
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
                                "compania").equals(reader.getName())) {

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
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                                "plan").equals(reader.getName())) {

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
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                                "estado").equals(reader.getName())) {

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
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                                "motivo").equals(reader.getName())) {

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
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/recaudo",
                                "contrato").equals(reader.getName())) {

                    object.setContrato(com.colsanitas.osi.comun.organizacion.ContratoType.Factory
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
                                "familia").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "familia" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFamilia(org.apache.axis2.databinding.utils.ConverterUtil
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
                                "categoria").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "categoria" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCategoria(org.apache.axis2.databinding.utils.ConverterUtil
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
                                "estacion").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "estacion" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setEstacion(org.apache.axis2.databinding.utils.ConverterUtil
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
                                "numeroTransaccion").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "numeroTransaccion" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNumeroTransaccion(org.apache.axis2.databinding.utils.ConverterUtil
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
                                "ciudad").equals(reader.getName())) {

                    object.setCiudad(com.colsanitas.osi.comun.ubicacion.CiudadType.Factory
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
                                "precio").equals(reader.getName())) {

                    object.setPrecio(com.colsanitas.osi.comun.organizacion.PrecioType.Factory
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
