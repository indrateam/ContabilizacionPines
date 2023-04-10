/**
 * PersonaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.colsanitas.osi.comun.persona;

/**
 * PersonaType bean class
 */
@SuppressWarnings({"unchecked","unused","rawtypes"})
public class PersonaType implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name = personaType Namespace URI =
     * http://colsanitas.com/osi/comun/persona Namespace Prefix = ns5
     */

    /**
                 * 
                 */
    private static final long serialVersionUID = -1264783204340417298L;

    /**
     * field for Identificacion
     */

    protected com.colsanitas.osi.comun.persona.IdentificacionType localIdentificacion;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localIdentificacionTracker = false;

    public boolean isIdentificacionSpecified() {
        return localIdentificacionTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.persona.IdentificacionType
     */
    public com.colsanitas.osi.comun.persona.IdentificacionType getIdentificacion() {
        return localIdentificacion;
    }

    /**
     * Auto generated setter method
     * @param param Identificacion
     */
    public void setIdentificacion(final com.colsanitas.osi.comun.persona.IdentificacionType param) {
        localIdentificacionTracker = param != null;

        this.localIdentificacion = param;

    }

    /**
     * field for DigitoVerificacion
     */

    protected java.lang.String localDigitoVerificacion;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localDigitoVerificacionTracker = false;

    public boolean isDigitoVerificacionSpecified() {
        return localDigitoVerificacionTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDigitoVerificacion() {
        return localDigitoVerificacion;
    }

    /**
     * Auto generated setter method
     * @param param DigitoVerificacion
     */
    public void setDigitoVerificacion(final java.lang.String param) {
        localDigitoVerificacionTracker = param != null;

        this.localDigitoVerificacion = param;

    }

    /**
     * field for Nombre
     */

    protected com.colsanitas.osi.comun.persona.NombreCompletoType localNombre;

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
     * @return com.colsanitas.osi.comun.persona.NombreCompletoType
     */
    public com.colsanitas.osi.comun.persona.NombreCompletoType getNombre() {
        return localNombre;
    }

    /**
     * Auto generated setter method
     * @param param Nombre
     */
    public void setNombre(final com.colsanitas.osi.comun.persona.NombreCompletoType param) {
        localNombreTracker = param != null;

        this.localNombre = param;

    }

    /**
     * field for FechaNacimiento
     */

    protected java.util.Calendar localFechaNacimiento;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localFechaNacimientoTracker = false;

    public boolean isFechaNacimientoSpecified() {
        return localFechaNacimientoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getFechaNacimiento() {
        return localFechaNacimiento;
    }

    /**
     * Auto generated setter method
     * @param param FechaNacimiento
     */
    public void setFechaNacimiento(final java.util.Calendar param) {
        localFechaNacimientoTracker = param != null;

        this.localFechaNacimiento = param;

    }

    /**
     * field for Genero
     */

    protected com.colsanitas.osi.comun.persona.GeneroType localGenero;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localGeneroTracker = false;

    public boolean isGeneroSpecified() {
        return localGeneroTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.persona.GeneroType
     */
    public com.colsanitas.osi.comun.persona.GeneroType getGenero() {
        return localGenero;
    }

    /**
     * Auto generated setter method
     * @param param Genero
     */
    public void setGenero(final com.colsanitas.osi.comun.persona.GeneroType param) {
        localGeneroTracker = param != null;

        this.localGenero = param;

    }

    /**
     * field for TipoPersona
     */

    protected java.lang.String localTipoPersona;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localTipoPersonaTracker = false;

    public boolean isTipoPersonaSpecified() {
        return localTipoPersonaTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTipoPersona() {
        return localTipoPersona;
    }

    /**
     * Auto generated setter method
     * @param param TipoPersona
     */
    public void setTipoPersona(final java.lang.String param) {
        localTipoPersonaTracker = param != null;

        this.localTipoPersona = param;

    }

    /**
     * field for EstadoCivil
     */

    protected java.lang.String localEstadoCivil;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localEstadoCivilTracker = false;

    public boolean isEstadoCivilSpecified() {
        return localEstadoCivilTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEstadoCivil() {
        return localEstadoCivil;
    }

    /**
     * Auto generated setter method
     * @param param EstadoCivil
     */
    public void setEstadoCivil(final java.lang.String param) {
        localEstadoCivilTracker = param != null;

        this.localEstadoCivil = param;

    }

    /**
     * field for Estudiante
     */

    protected com.colsanitas.osi.comun.tiposdedato.BooleanType localEstudiante;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localEstudianteTracker = false;

    public boolean isEstudianteSpecified() {
        return localEstudianteTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.tiposdedato.BooleanType
     */
    public com.colsanitas.osi.comun.tiposdedato.BooleanType getEstudiante() {
        return localEstudiante;
    }

    /**
     * Auto generated setter method
     * @param param Estudiante
     */
    public void setEstudiante(final com.colsanitas.osi.comun.tiposdedato.BooleanType param) {
        localEstudianteTracker = param != null;

        this.localEstudiante = param;

    }

    /**
     * field for Discapacitado
     */

    protected com.colsanitas.osi.comun.tiposdedato.BooleanType localDiscapacitado;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localDiscapacitadoTracker = false;

    public boolean isDiscapacitadoSpecified() {
        return localDiscapacitadoTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.tiposdedato.BooleanType
     */
    public com.colsanitas.osi.comun.tiposdedato.BooleanType getDiscapacitado() {
        return localDiscapacitado;
    }

    /**
     * Auto generated setter method
     * @param param Discapacitado
     */
    public void setDiscapacitado(final com.colsanitas.osi.comun.tiposdedato.BooleanType param) {
        localDiscapacitadoTracker = param != null;

        this.localDiscapacitado = param;

    }

    /**
     * field for Supervivencia
     */

    protected com.colsanitas.osi.comun.tiposdedato.BooleanType localSupervivencia;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localSupervivenciaTracker = false;

    public boolean isSupervivenciaSpecified() {
        return localSupervivenciaTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.tiposdedato.BooleanType
     */
    public com.colsanitas.osi.comun.tiposdedato.BooleanType getSupervivencia() {
        return localSupervivencia;
    }

    /**
     * Auto generated setter method
     * @param param Supervivencia
     */
    public void setSupervivencia(final com.colsanitas.osi.comun.tiposdedato.BooleanType param) {
        localSupervivenciaTracker = param != null;

        this.localSupervivencia = param;

    }

    /**
     * field for MunicipioNacimiento
     */

    protected com.colsanitas.osi.comun.ubicacion.CodigoCiudadType localMunicipioNacimiento;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localMunicipioNacimientoTracker = false;

    public boolean isMunicipioNacimientoSpecified() {
        return localMunicipioNacimientoTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.ubicacion.CodigoCiudadType
     */
    public com.colsanitas.osi.comun.ubicacion.CodigoCiudadType getMunicipioNacimiento() {
        return localMunicipioNacimiento;
    }

    /**
     * Auto generated setter method
     * @param param MunicipioNacimiento
     */
    public void setMunicipioNacimiento(
            final com.colsanitas.osi.comun.ubicacion.CodigoCiudadType param) {
        localMunicipioNacimientoTracker = param != null;

        this.localMunicipioNacimiento = param;

    }

    /**
     * field for GrupoSanguineo
     */

    protected java.lang.String localGrupoSanguineo;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localGrupoSanguineoTracker = false;

    public boolean isGrupoSanguineoSpecified() {
        return localGrupoSanguineoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getGrupoSanguineo() {
        return localGrupoSanguineo;
    }

    /**
     * Auto generated setter method
     * @param param GrupoSanguineo
     */
    public void setGrupoSanguineo(final java.lang.String param) {
        localGrupoSanguineoTracker = param != null;

        this.localGrupoSanguineo = param;

    }

    /**
     * field for FactorRH
     */

    protected java.lang.String localFactorRH;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localFactorRHTracker = false;

    public boolean isFactorRHSpecified() {
        return localFactorRHTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getFactorRH() {
        return localFactorRH;
    }

    /**
     * Auto generated setter method
     * @param param FactorRH
     */
    public void setFactorRH(final java.lang.String param) {
        localFactorRHTracker = param != null;

        this.localFactorRH = param;

    }

    /**
     * field for Talla
     */

    protected java.lang.String localTalla;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localTallaTracker = false;

    public boolean isTallaSpecified() {
        return localTallaTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTalla() {
        return localTalla;
    }

    /**
     * Auto generated setter method
     * @param param Talla
     */
    public void setTalla(final java.lang.String param) {
        localTallaTracker = param != null;

        this.localTalla = param;

    }

    /**
     * field for Peso
     */

    protected java.lang.String localPeso;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localPesoTracker = false;

    public boolean isPesoSpecified() {
        return localPesoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPeso() {
        return localPeso;
    }

    /**
     * Auto generated setter method
     * @param param Peso
     */
    public void setPeso(final java.lang.String param) {
        localPesoTracker = param != null;

        this.localPeso = param;

    }

    /**
     * field for Atributos This was an Array!
     */

    protected com.colsanitas.osi.comun.persona.AtributoPersonaType[] localAtributos;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localAtributosTracker = false;

    public boolean isAtributosSpecified() {
        return localAtributosTracker;
    }

    /**
     * Auto generated getter method
     * @return com.colsanitas.osi.comun.persona.AtributoPersonaType[]
     */
    public com.colsanitas.osi.comun.persona.AtributoPersonaType[] getAtributos() {
        return localAtributos;
    }

    /**
     * validate the array for Atributos
     */
    protected void validateAtributos(
            final com.colsanitas.osi.comun.persona.AtributoPersonaType[] param) {

    }

    /**
     * Auto generated setter method
     * @param param Atributos
     */
    public void setAtributos(final com.colsanitas.osi.comun.persona.AtributoPersonaType[] param) {

        validateAtributos(param);

        localAtributosTracker = param != null;

        this.localAtributos = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param com.colsanitas.osi.comun.persona.AtributoPersonaType
     */
    public void addAtributos(final com.colsanitas.osi.comun.persona.AtributoPersonaType param) {
        if (localAtributos == null) {
            localAtributos = new com.colsanitas.osi.comun.persona.AtributoPersonaType[] {};
        }

        // update the setting tracker
        localAtributosTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil
                .toList(localAtributos);
        list.add(param);
        this.localAtributos = (com.colsanitas.osi.comun.persona.AtributoPersonaType[]) list
                .toArray(new com.colsanitas.osi.comun.persona.AtributoPersonaType[list.size()]);

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
                    "http://colsanitas.com/osi/comun/persona");
            if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":personaType", xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "personaType", xmlWriter);
            }

        }
        if (localIdentificacionTracker) {
            if (localIdentificacion == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "identificacion cannot be null!!");
            }
            localIdentificacion.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/persona", "identificacion"), xmlWriter);
        }
        if (localDigitoVerificacionTracker) {
            namespace = "http://colsanitas.com/osi/comun/persona";
            writeStartElement(null, namespace, "digitoVerificacion", xmlWriter);

            if (localDigitoVerificacion == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException(
                        "digitoVerificacion cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localDigitoVerificacion);

            }

            xmlWriter.writeEndElement();
        }
        if (localNombreTracker) {
            if (localNombre == null) {
                throw new org.apache.axis2.databinding.ADBException("nombre cannot be null!!");
            }
            localNombre.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/persona", "nombre"), xmlWriter);
        }
        if (localFechaNacimientoTracker) {
            namespace = "http://colsanitas.com/osi/comun/persona";
            writeStartElement(null, namespace, "fechaNacimiento", xmlWriter);

            if (localFechaNacimiento == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException(
                        "fechaNacimiento cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localFechaNacimiento));

            }

            xmlWriter.writeEndElement();
        }
        if (localGeneroTracker) {
            if (localGenero == null) {
                throw new org.apache.axis2.databinding.ADBException("genero cannot be null!!");
            }
            localGenero.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/persona", "genero"), xmlWriter);
        }
        if (localTipoPersonaTracker) {
            namespace = "http://colsanitas.com/osi/comun/persona";
            writeStartElement(null, namespace, "tipoPersona", xmlWriter);

            if (localTipoPersona == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("tipoPersona cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localTipoPersona);

            }

            xmlWriter.writeEndElement();
        }
        if (localEstadoCivilTracker) {
            namespace = "http://colsanitas.com/osi/comun/persona";
            writeStartElement(null, namespace, "estadoCivil", xmlWriter);

            if (localEstadoCivil == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("estadoCivil cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localEstadoCivil);

            }

            xmlWriter.writeEndElement();
        }
        if (localEstudianteTracker) {
            if (localEstudiante == null) {
                throw new org.apache.axis2.databinding.ADBException("estudiante cannot be null!!");
            }
            localEstudiante.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/persona", "estudiante"), xmlWriter);
        }
        if (localDiscapacitadoTracker) {
            if (localDiscapacitado == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "discapacitado cannot be null!!");
            }
            localDiscapacitado.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/persona", "discapacitado"), xmlWriter);
        }
        if (localSupervivenciaTracker) {
            if (localSupervivencia == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "supervivencia cannot be null!!");
            }
            localSupervivencia.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/persona", "supervivencia"), xmlWriter);
        }
        if (localMunicipioNacimientoTracker) {
            if (localMunicipioNacimiento == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "municipioNacimiento cannot be null!!");
            }
            localMunicipioNacimiento.serialize(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/persona", "municipioNacimiento"), xmlWriter);
        }
        if (localGrupoSanguineoTracker) {
            namespace = "http://colsanitas.com/osi/comun/persona";
            writeStartElement(null, namespace, "grupoSanguineo", xmlWriter);

            if (localGrupoSanguineo == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException(
                        "grupoSanguineo cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localGrupoSanguineo);

            }

            xmlWriter.writeEndElement();
        }
        if (localFactorRHTracker) {
            namespace = "http://colsanitas.com/osi/comun/persona";
            writeStartElement(null, namespace, "factorRH", xmlWriter);

            if (localFactorRH == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("factorRH cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localFactorRH);

            }

            xmlWriter.writeEndElement();
        }
        if (localTallaTracker) {
            namespace = "http://colsanitas.com/osi/comun/persona";
            writeStartElement(null, namespace, "talla", xmlWriter);

            if (localTalla == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("talla cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localTalla);

            }

            xmlWriter.writeEndElement();
        }
        if (localPesoTracker) {
            namespace = "http://colsanitas.com/osi/comun/persona";
            writeStartElement(null, namespace, "peso", xmlWriter);

            if (localPeso == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("peso cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localPeso);

            }

            xmlWriter.writeEndElement();
        }
        if (localAtributosTracker) {
            if (localAtributos != null) {
                for (int i = 0; i < localAtributos.length; i++) {
                    if (localAtributos[i] != null) {
                        localAtributos[i].serialize(new javax.xml.namespace.QName(
                                "http://colsanitas.com/osi/comun/persona", "atributos"), xmlWriter);
                    } else {

                        // we don't have to do any thing since minOccures is zero

                    }

                }
            } else {

                throw new org.apache.axis2.databinding.ADBException("atributos cannot be null!!");

            }
        }
        xmlWriter.writeEndElement();

    }

    private static java.lang.String generatePrefix(final java.lang.String namespace) {
        if (namespace.equals("http://colsanitas.com/osi/comun/persona")) {
            return "ns5";
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

        if (localIdentificacionTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/persona", "identificacion"));

            if (localIdentificacion == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "identificacion cannot be null!!");
            }
            elementList.add(localIdentificacion);
        }
        if (localDigitoVerificacionTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/persona", "digitoVerificacion"));

            if (localDigitoVerificacion != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localDigitoVerificacion));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "digitoVerificacion cannot be null!!");
            }
        }
        if (localNombreTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/persona", "nombre"));

            if (localNombre == null) {
                throw new org.apache.axis2.databinding.ADBException("nombre cannot be null!!");
            }
            elementList.add(localNombre);
        }
        if (localFechaNacimientoTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/persona", "fechaNacimiento"));

            if (localFechaNacimiento != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localFechaNacimiento));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "fechaNacimiento cannot be null!!");
            }
        }
        if (localGeneroTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/persona", "genero"));

            if (localGenero == null) {
                throw new org.apache.axis2.databinding.ADBException("genero cannot be null!!");
            }
            elementList.add(localGenero);
        }
        if (localTipoPersonaTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/persona", "tipoPersona"));

            if (localTipoPersona != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localTipoPersona));
            } else {
                throw new org.apache.axis2.databinding.ADBException("tipoPersona cannot be null!!");
            }
        }
        if (localEstadoCivilTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/persona", "estadoCivil"));

            if (localEstadoCivil != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localEstadoCivil));
            } else {
                throw new org.apache.axis2.databinding.ADBException("estadoCivil cannot be null!!");
            }
        }
        if (localEstudianteTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/persona", "estudiante"));

            if (localEstudiante == null) {
                throw new org.apache.axis2.databinding.ADBException("estudiante cannot be null!!");
            }
            elementList.add(localEstudiante);
        }
        if (localDiscapacitadoTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/persona", "discapacitado"));

            if (localDiscapacitado == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "discapacitado cannot be null!!");
            }
            elementList.add(localDiscapacitado);
        }
        if (localSupervivenciaTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/persona", "supervivencia"));

            if (localSupervivencia == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "supervivencia cannot be null!!");
            }
            elementList.add(localSupervivencia);
        }
        if (localMunicipioNacimientoTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/persona", "municipioNacimiento"));

            if (localMunicipioNacimiento == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "municipioNacimiento cannot be null!!");
            }
            elementList.add(localMunicipioNacimiento);
        }
        if (localGrupoSanguineoTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/persona", "grupoSanguineo"));

            if (localGrupoSanguineo != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localGrupoSanguineo));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "grupoSanguineo cannot be null!!");
            }
        }
        if (localFactorRHTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/persona", "factorRH"));

            if (localFactorRH != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localFactorRH));
            } else {
                throw new org.apache.axis2.databinding.ADBException("factorRH cannot be null!!");
            }
        }
        if (localTallaTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/persona", "talla"));

            if (localTalla != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localTalla));
            } else {
                throw new org.apache.axis2.databinding.ADBException("talla cannot be null!!");
            }
        }
        if (localPesoTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://colsanitas.com/osi/comun/persona", "peso"));

            if (localPeso != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localPeso));
            } else {
                throw new org.apache.axis2.databinding.ADBException("peso cannot be null!!");
            }
        }
        if (localAtributosTracker) {
            if (localAtributos != null) {
                for (int i = 0; i < localAtributos.length; i++) {

                    if (localAtributos[i] != null) {
                        elementList.add(new javax.xml.namespace.QName(
                                "http://colsanitas.com/osi/comun/persona", "atributos"));
                        elementList.add(localAtributos[i]);
                    } else {

                        // nothing to do

                    }

                }
            } else {

                throw new org.apache.axis2.databinding.ADBException("atributos cannot be null!!");

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
        public static PersonaType parse(final javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            PersonaType object = new PersonaType();

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

                        if (!"personaType".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(
                                    nsPrefix);
                            return (PersonaType) com.colsanitas.gestiondocumentoequivalente.ExtensionMapper
                                    .getTypeObject(nsUri, type, reader);
                        }

                    }

                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                java.util.ArrayList list16 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/comun/persona",
                                "identificacion").equals(reader.getName())) {

                    object.setIdentificacion(com.colsanitas.osi.comun.persona.IdentificacionType.Factory
                            .parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/comun/persona",
                                "digitoVerificacion").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "digitoVerificacion" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDigitoVerificacion(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/comun/persona",
                                "nombre").equals(reader.getName())) {

                    object.setNombre(com.colsanitas.osi.comun.persona.NombreCompletoType.Factory
                            .parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/comun/persona",
                                "fechaNacimiento").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "fechaNacimiento" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFechaNacimiento(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToDateTime(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/comun/persona",
                                "genero").equals(reader.getName())) {

                    object.setGenero(com.colsanitas.osi.comun.persona.GeneroType.Factory
                            .parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/comun/persona",
                                "tipoPersona").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "tipoPersona" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTipoPersona(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/comun/persona",
                                "estadoCivil").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "estadoCivil" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setEstadoCivil(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/comun/persona",
                                "estudiante").equals(reader.getName())) {

                    object.setEstudiante(com.colsanitas.osi.comun.tiposdedato.BooleanType.Factory
                            .parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/comun/persona",
                                "discapacitado").equals(reader.getName())) {

                    object.setDiscapacitado(com.colsanitas.osi.comun.tiposdedato.BooleanType.Factory
                            .parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/comun/persona",
                                "supervivencia").equals(reader.getName())) {

                    object.setSupervivencia(com.colsanitas.osi.comun.tiposdedato.BooleanType.Factory
                            .parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/comun/persona",
                                "municipioNacimiento").equals(reader.getName())) {

                    object.setMunicipioNacimiento(com.colsanitas.osi.comun.ubicacion.CodigoCiudadType.Factory
                            .parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/comun/persona",
                                "grupoSanguineo").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "grupoSanguineo" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setGrupoSanguineo(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/comun/persona",
                                "factorRH").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "factorRH" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFactorRH(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/comun/persona",
                                "talla").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "talla" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTalla(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/comun/persona",
                                "peso").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: "
                                + "peso" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPeso(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://colsanitas.com/osi/comun/persona",
                                "atributos").equals(reader.getName())) {

                    // Process the array and step past its final element's end.
                    list16.add(com.colsanitas.osi.comun.persona.AtributoPersonaType.Factory
                            .parse(reader));

                    // loop until we find a start element that is not part of this array
                    boolean loopDone16 = false;
                    while (!loopDone16) {
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
                            loopDone16 = true;
                        } else {
                            if (new javax.xml.namespace.QName(
                                    "http://colsanitas.com/osi/comun/persona", "atributos")
                                    .equals(reader.getName())) {
                                list16.add(com.colsanitas.osi.comun.persona.AtributoPersonaType.Factory
                                        .parse(reader));

                            } else {
                                loopDone16 = true;
                            }
                        }
                    }
                    // call the converter utility to convert and set the array

                    object.setAtributos((com.colsanitas.osi.comun.persona.AtributoPersonaType[]) org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToArray(
                                    com.colsanitas.osi.comun.persona.AtributoPersonaType.class,
                                    list16));

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
