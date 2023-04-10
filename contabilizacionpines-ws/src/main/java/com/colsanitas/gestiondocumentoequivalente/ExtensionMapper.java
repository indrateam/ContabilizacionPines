/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.colsanitas.gestiondocumentoequivalente;

/**
 * ExtensionMapper class
 */
@SuppressWarnings({"unchecked","unused","rawtypes"})
public class ExtensionMapper {

    public static java.lang.Object getTypeObject(final java.lang.String namespaceURI,
            final java.lang.String typeName, final javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {

        if ("http://colsanitas.com/osi/comun/ubicacion".equals(namespaceURI)
                && "codigoCiudadType".equals(typeName)) {

            return com.colsanitas.osi.comun.ubicacion.CodigoCiudadType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/recaudo".equals(namespaceURI)
                && "codigoConceptoType".equals(typeName)) {

            return com.colsanitas.osi.recaudo.CodigoConceptoType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/nofuncionales".equals(namespaceURI)
                && "ErrorDetail".equals(typeName)) {

            return com.colsanitas.osi.comun.nofuncionales.ErrorDetail.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/definicionesfuncionales".equals(namespaceURI)
                && "codigoPeriodType".equals(typeName)) {

            return com.colsanitas.osi.comun.definicionesfuncionales.CodigoPeriodType.Factory
                    .parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/ubicacion".equals(namespaceURI)
                && "codigoDireccionType".equals(typeName)) {

            return com.colsanitas.osi.comun.ubicacion.CodigoDireccionType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/ubicacion".equals(namespaceURI)
                && "ciudadType".equals(typeName)) {

            return com.colsanitas.osi.comun.ubicacion.CiudadType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/persona".equals(namespaceURI)
                && "codigoPersonaType".equals(typeName)) {

            return com.colsanitas.osi.comun.persona.CodigoPersonaType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/recaudo/Transaccion".equals(namespaceURI)
                && "numFacturaType".equals(typeName)) {

            return com.colsanitas.osi.recaudo.transaccion.NumFacturaType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/persona".equals(namespaceURI)
                && "documentoType".equals(typeName)) {

            return com.colsanitas.osi.comun.persona.DocumentoType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/persona".equals(namespaceURI)
                && "identificacionType".equals(typeName)) {

            return com.colsanitas.osi.comun.persona.IdentificacionType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/organizacion".equals(namespaceURI)
                && "companiaType".equals(typeName)) {

            return com.colsanitas.osi.comun.organizacion.CompaniaType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/srv/GestionDocEquivService".equals(namespaceURI)
                && "ListaPines_type0".equals(typeName)) {

            return com.colsanitas.osi.srv.gestiondocequivservice.ListaPines_type0.Factory
                    .parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/ubicacion".equals(namespaceURI)
                && "paisType".equals(typeName)) {

            return com.colsanitas.osi.comun.ubicacion.PaisType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/nofuncionales".equals(namespaceURI)
                && "SystemException".equals(typeName)) {

            return com.colsanitas.osi.comun.nofuncionales.SystemException.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/ubicacion".equals(namespaceURI)
                && "telefonoType".equals(typeName)) {

            return com.colsanitas.osi.comun.ubicacion.TelefonoType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/nofuncionales".equals(namespaceURI)
                && "MessageKey".equals(typeName)) {

            return com.colsanitas.osi.comun.nofuncionales.MessageKey.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/recaudo".equals(namespaceURI)
                && "codigoEntidadFinType".equals(typeName)) {

            return com.colsanitas.osi.recaudo.CodigoEntidadFinType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/ubicacion".equals(namespaceURI)
                && "zonaLocalidadType".equals(typeName)) {

            return com.colsanitas.osi.comun.ubicacion.ZonaLocalidadType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/nofuncionales".equals(namespaceURI)
                && "HeaderFault".equals(typeName)) {

            return com.colsanitas.osi.comun.nofuncionales.HeaderFault.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/ubicacion".equals(namespaceURI)
                && "indicativoType".equals(typeName)) {

            return com.colsanitas.osi.comun.ubicacion.IndicativoType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/ubicacion".equals(namespaceURI)
                && "codigoPaisType".equals(typeName)) {

            return com.colsanitas.osi.comun.ubicacion.CodigoPaisType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/organizacion".equals(namespaceURI)
                && "codigoOficinaType".equals(typeName)) {

            return com.colsanitas.osi.comun.organizacion.CodigoOficinaType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/persona".equals(namespaceURI)
                && "personaType".equals(typeName)) {

            return com.colsanitas.osi.comun.persona.PersonaType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/organizacion".equals(namespaceURI)
                && "atributoContratoType".equals(typeName)) {

            return com.colsanitas.osi.comun.organizacion.AtributoContratoType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/organizacion".equals(namespaceURI)
                && "usuarioType".equals(typeName)) {

            return com.colsanitas.osi.comun.organizacion.UsuarioType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/recaudo".equals(namespaceURI)
                && "conceptoType".equals(typeName)) {

            return com.colsanitas.osi.recaudo.ConceptoType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/recaudo/TiraAuditora".equals(namespaceURI)
                && "textoTiraAuditType".equals(typeName)) {

            return com.colsanitas.osi.recaudo.tiraauditora.TextoTiraAuditType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/srv/GestionDocEquivService".equals(namespaceURI)
                && "generarDocEquivSalType".equals(typeName)) {

            return com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocEquivSalType.Factory
                    .parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/definicionesfuncionales".equals(namespaceURI)
                && "codigoEstadoType".equals(typeName)) {

            return com.colsanitas.osi.comun.definicionesfuncionales.CodigoEstadoType.Factory
                    .parse(reader);

        }

        if ("http://colsanitas.com/osi/srv/GestionDocEquivService".equals(namespaceURI)
                && "anularDocEquivEntType".equals(typeName)) {

            return com.colsanitas.osi.srv.gestiondocequivservice.AnularDocEquivEntType.Factory
                    .parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/definicionesfuncionales".equals(namespaceURI)
                && "codigoParentescoType".equals(typeName)) {

            return com.colsanitas.osi.comun.definicionesfuncionales.CodigoParentescoType.Factory
                    .parse(reader);

        }

        if ("http://colsanitas.com/osi/recaudo/Transaccion".equals(namespaceURI)
                && "transaccionType".equals(typeName)) {

            return com.colsanitas.osi.recaudo.transaccion.TransaccionType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/persona".equals(namespaceURI)
                && "atributoPersonaType".equals(typeName)) {

            return com.colsanitas.osi.comun.persona.AtributoPersonaType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/recaudo".equals(namespaceURI)
                && "medioPagoType".equals(typeName)) {

            return com.colsanitas.osi.recaudo.MedioPagoType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/recaudo/Transaccion".equals(namespaceURI)
                && "numeroTransaccionType".equals(typeName)) {

            return com.colsanitas.osi.recaudo.transaccion.NumeroTransaccionType.Factory
                    .parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/organizacion".equals(namespaceURI)
                && "codigoPlanType".equals(typeName)) {

            return com.colsanitas.osi.comun.organizacion.CodigoPlanType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/definicionesfuncionales".equals(namespaceURI)
                && "codigoEpsType".equals(typeName)) {

            return com.colsanitas.osi.comun.definicionesfuncionales.CodigoEpsType.Factory
                    .parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/definicionesfuncionales".equals(namespaceURI)
                && "rolType".equals(typeName)) {

            return com.colsanitas.osi.comun.definicionesfuncionales.RolType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/persona".equals(namespaceURI)
                && "generoType".equals(typeName)) {

            return com.colsanitas.osi.comun.persona.GeneroType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/ubicacion".equals(namespaceURI)
                && "regionType".equals(typeName)) {

            return com.colsanitas.osi.comun.ubicacion.RegionType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/recaudo".equals(namespaceURI) && "PinType".equals(typeName)) {

            return com.colsanitas.osi.recaudo.PinType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/recaudo".equals(namespaceURI)
                && "codigoEstacionType".equals(typeName)) {

            return com.colsanitas.osi.recaudo.CodigoEstacionType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/nofuncionales".equals(namespaceURI)
                && "ResponseHeader".equals(typeName)) {

            return com.colsanitas.osi.comun.nofuncionales.ResponseHeader.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/organizacion".equals(namespaceURI)
                && "codigoCanalType".equals(typeName)) {

            return com.colsanitas.osi.comun.organizacion.CodigoCanalType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/definicionesfuncionales".equals(namespaceURI)
                && "estadoType".equals(typeName)) {

            return com.colsanitas.osi.comun.definicionesfuncionales.EstadoType.Factory
                    .parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/nofuncionales".equals(namespaceURI)
                && "ServiceKey".equals(typeName)) {

            return com.colsanitas.osi.comun.nofuncionales.ServiceKey.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/ubicacion".equals(namespaceURI)
                && "viaType".equals(typeName)) {

            return com.colsanitas.osi.comun.ubicacion.ViaType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/definicionesfuncionales".equals(namespaceURI)
                && "periodicidadType".equals(typeName)) {

            return com.colsanitas.osi.comun.definicionesfuncionales.PeriodicidadType.Factory
                    .parse(reader);

        }

        if ("http://colsanitas.com/osi/recaudo".equals(namespaceURI)
                && "estacionType".equals(typeName)) {

            return com.colsanitas.osi.recaudo.EstacionType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/persona".equals(namespaceURI)
                && "tipoDocumentoType".equals(typeName)) {

            return com.colsanitas.osi.comun.persona.TipoDocumentoType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/tiposdedato".equals(namespaceURI)
                && "booleanType".equals(typeName)) {

            return com.colsanitas.osi.comun.tiposdedato.BooleanType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/nofuncionales".equals(namespaceURI)
                && "MessageTrace".equals(typeName)) {

            return com.colsanitas.osi.comun.nofuncionales.MessageTrace.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/definicionesfuncionales".equals(namespaceURI)
                && "codigoTipoType".equals(typeName)) {

            return com.colsanitas.osi.comun.definicionesfuncionales.CodigoTipoType.Factory
                    .parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/ubicacion".equals(namespaceURI)
                && "codigoRegionType".equals(typeName)) {

            return com.colsanitas.osi.comun.ubicacion.CodigoRegionType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/organizacion".equals(namespaceURI)
                && "numeroUsuarioType".equals(typeName)) {

            return com.colsanitas.osi.comun.organizacion.NumeroUsuarioType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/ubicacion".equals(namespaceURI)
                && "codigoDepartamentoType".equals(typeName)) {

            return com.colsanitas.osi.comun.ubicacion.CodigoDepartamentoType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/nofuncionales".equals(namespaceURI)
                && "BusinessException".equals(typeName)) {

            return com.colsanitas.osi.comun.nofuncionales.BusinessException.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/srv/GestionDocEquivService".equals(namespaceURI)
                && "consultarDocEquivEntType".equals(typeName)) {

            return com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocEquivEntType.Factory
                    .parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/ubicacion".equals(namespaceURI)
                && "zonaType".equals(typeName)) {

            return com.colsanitas.osi.comun.ubicacion.ZonaType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/organizacion".equals(namespaceURI)
                && "precioType".equals(typeName)) {

            return com.colsanitas.osi.comun.organizacion.PrecioType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/ubicacion".equals(namespaceURI)
                && "direccionType".equals(typeName)) {

            return com.colsanitas.osi.comun.ubicacion.DireccionType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/ubicacion".equals(namespaceURI)
                && "departamentoType".equals(typeName)) {

            return com.colsanitas.osi.comun.ubicacion.DepartamentoType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/organizacion".equals(namespaceURI)
                && "oficinaType".equals(typeName)) {

            return com.colsanitas.osi.comun.organizacion.OficinaType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/persona".equals(namespaceURI)
                && "nombreType".equals(typeName)) {

            return com.colsanitas.osi.comun.persona.NombreType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/nofuncionales".equals(namespaceURI)
                && "MessageInfo".equals(typeName)) {

            return com.colsanitas.osi.comun.nofuncionales.MessageInfo.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/persona".equals(namespaceURI)
                && "nombreCompletoType".equals(typeName)) {

            return com.colsanitas.osi.comun.persona.NombreCompletoType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/recaudo/TiraAuditora".equals(namespaceURI)
                && "tiraAuditoraType".equals(typeName)) {

            return com.colsanitas.osi.recaudo.tiraauditora.TiraAuditoraType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/nofuncionales".equals(namespaceURI)
                && "ResponseStatus".equals(typeName)) {

            return com.colsanitas.osi.comun.nofuncionales.ResponseStatus.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/organizacion".equals(namespaceURI)
                && "planType".equals(typeName)) {

            return com.colsanitas.osi.comun.organizacion.PlanType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/organizacion".equals(namespaceURI)
                && "numeroFliaType".equals(typeName)) {

            return com.colsanitas.osi.comun.organizacion.NumeroFliaType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/nofuncionales".equals(namespaceURI)
                && "MessageHeader".equals(typeName)) {

            return com.colsanitas.osi.comun.nofuncionales.MessageHeader.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/definicionesfuncionales".equals(namespaceURI)
                && "epsType".equals(typeName)) {

            return com.colsanitas.osi.comun.definicionesfuncionales.EpsType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/organizacion".equals(namespaceURI)
                && "contratoType".equals(typeName)) {

            return com.colsanitas.osi.comun.organizacion.ContratoType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/recaudo".equals(namespaceURI)
                && "numeroPinType".equals(typeName)) {

            return com.colsanitas.osi.recaudo.NumeroPinType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/recaudo".equals(namespaceURI)
                && "entidadFinanType".equals(typeName)) {

            return com.colsanitas.osi.recaudo.EntidadFinanType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/organizacion".equals(namespaceURI)
                && "codigoCiaType".equals(typeName)) {

            return com.colsanitas.osi.comun.organizacion.CodigoCiaType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/srv/GestionDocEquivService".equals(namespaceURI)
                && "anularDocEquivSalType".equals(typeName)) {

            return com.colsanitas.osi.srv.gestiondocequivservice.AnularDocEquivSalType.Factory
                    .parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/nofuncionales".equals(namespaceURI)
                && "RequestHeader".equals(typeName)) {

            return com.colsanitas.osi.comun.nofuncionales.RequestHeader.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/organizacion".equals(namespaceURI)
                && "familiaType".equals(typeName)) {

            return com.colsanitas.osi.comun.organizacion.FamiliaType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/srv/GestionDocEquivService".equals(namespaceURI)
                && "generarDocEquivEntType".equals(typeName)) {

            return com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocEquivEntType.Factory
                    .parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/persona".equals(namespaceURI)
                && "apellidoType".equals(typeName)) {

            return com.colsanitas.osi.comun.persona.ApellidoType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/srv/GestionDocEquivService".equals(namespaceURI)
                && "categoriaType".equals(typeName)) {

            return com.colsanitas.osi.srv.gestiondocequivservice.CategoriaType.Factory
                    .parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/ubicacion".equals(namespaceURI)
                && "viaPrincipalType".equals(typeName)) {

            return com.colsanitas.osi.comun.ubicacion.ViaPrincipalType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/srv/GestionDocEquivService".equals(namespaceURI)
                && "consultarDocEquivSalType".equals(typeName)) {

            return com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocEquivSalType.Factory
                    .parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/definicionesfuncionales".equals(namespaceURI)
                && "tipoType".equals(typeName)) {

            return com.colsanitas.osi.comun.definicionesfuncionales.TipoType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/recaudo/Transaccion".equals(namespaceURI)
                && "numReciboType".equals(typeName)) {

            return com.colsanitas.osi.recaudo.transaccion.NumReciboType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/persona".equals(namespaceURI)
                && "nombreCompuestoType".equals(typeName)) {

            return com.colsanitas.osi.comun.persona.NombreCompuestoType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/ubicacion".equals(namespaceURI)
                && "direccionCompletaType".equals(typeName)) {

            return com.colsanitas.osi.comun.ubicacion.DireccionCompletaType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/definicionesfuncionales".equals(namespaceURI)
                && "codigoMotivoType".equals(typeName)) {

            return com.colsanitas.osi.comun.definicionesfuncionales.CodigoMotivoType.Factory
                    .parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/definicionesfuncionales".equals(namespaceURI)
                && "motivoType".equals(typeName)) {

            return com.colsanitas.osi.comun.definicionesfuncionales.MotivoType.Factory
                    .parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/ubicacion".equals(namespaceURI)
                && "codigoViaPrincipalType".equals(typeName)) {

            return com.colsanitas.osi.comun.ubicacion.CodigoViaPrincipalType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/organizacion".equals(namespaceURI)
                && "canalType".equals(typeName)) {

            return com.colsanitas.osi.comun.organizacion.CanalType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/ubicacion".equals(namespaceURI)
                && "celularType".equals(typeName)) {

            return com.colsanitas.osi.comun.ubicacion.CelularType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/definicionesfuncionales".equals(namespaceURI)
                && "codigoRolType".equals(typeName)) {

            return com.colsanitas.osi.comun.definicionesfuncionales.CodigoRolType.Factory
                    .parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/organizacion".equals(namespaceURI)
                && "numeroContratoType".equals(typeName)) {

            return com.colsanitas.osi.comun.organizacion.NumeroContratoType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/srv/GestionDocEquivService".equals(namespaceURI)
                && "ListaMediosPago_type0".equals(typeName)) {

            return com.colsanitas.osi.srv.gestiondocequivservice.ListaMediosPago_type0.Factory
                    .parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/ubicacion".equals(namespaceURI)
                && "codigoZonaLocalidadType".equals(typeName)) {

            return com.colsanitas.osi.comun.ubicacion.CodigoZonaLocalidadType.Factory.parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/nofuncionales".equals(namespaceURI)
                && "AuthenticationHeader".equals(typeName)) {

            return com.colsanitas.osi.comun.nofuncionales.AuthenticationHeader.Factory
                    .parse(reader);

        }

        if ("http://colsanitas.com/osi/comun/definicionesfuncionales".equals(namespaceURI)
                && "parentescoType".equals(typeName)) {

            return com.colsanitas.osi.comun.definicionesfuncionales.ParentescoType.Factory
                    .parse(reader);

        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI
                + " " + typeName);
    }

}
