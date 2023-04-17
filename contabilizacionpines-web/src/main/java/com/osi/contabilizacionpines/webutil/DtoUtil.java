package com.osi.contabilizacionpines.webutil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.colsanitas.osi.recaudo.DetalleConceptoType;
import com.colsanitas.osi.recaudo.MedioPagoType;
import com.colsanitas.osi.recaudo.PinType;
import com.colsanitas.osi.srv.gestiondocequivservice.AnularDocEquivEntType;
import com.colsanitas.osi.srv.gestiondocequivservice.ConsultarDocEquivEntType;
import com.colsanitas.osi.srv.gestiondocequivservice.GenerarDocEquivEntType;
import com.colsanitas.osi.srv.gestiondocequivservice.GenerarFacturaEntType;
import com.osi.colsanitas.business.fachada.ConceptoDto;
import com.osi.colsanitas.business.fachada.ContabilizacionPinesException;
import com.osi.colsanitas.business.fachada.GenerarDocumentoEquivEntDto;
import com.osi.colsanitas.business.fachada.GenerarFacturaDto;
import com.osi.colsanitas.business.fachada.MedioPagoDto;
import com.osi.colsanitas.persistent.storeProcedures.PinDto;

/**
 * Métodos utilitarios para convertir Types a DTOs.
 * @author sm
 * 
 */
public final class DtoUtil {
    /**
     * Logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(DtoUtil.class);
    /**
     * Locale a usar.
     */
    private static final transient Locale LOCALE = Locale.ENGLISH;
    /**
     * Patrón a usar para validar sólo números.
     */
    private static final Pattern SOLO_NUMEROS = Pattern.compile("^\\d*$");

    /**
     * Constructor privado para evitar instancias.
     */
    private DtoUtil() {
    }

    /**
     * Convierte el texto a Integer.
     * @param source el texto a Integer.
     * @param nombreCampo el nombre del campo a validar
     * @return el valor Integer
     */
    private static final Integer stringToInteger(final String source, final String nombreCampo) {
        final String texto = StringUtils.trimToEmpty(source);
        Integer resultado = null;
        if (StringUtils.isEmpty(texto)) {
            resultado = null;
        } else {
            final Scanner scanner = new Scanner(texto);
            scanner.useLocale(LOCALE);
            try {
                if (scanner.hasNextInt()) {
                    resultado = scanner.nextInt();
                    if (scanner.hasNext()) {
                        resultado = null;
                    }
                }
            } finally {
                scanner.close();
            }

            if (resultado == null) {
                throw new ContabilizacionPinesException(
                        String.format(
                                "El campo %s sólo permite caracteres numéricos o no es válido para el tipo de dato int",
                                nombreCampo));
            }
        }
        return resultado;
    }

    public static BigDecimal stringToBigDecimal(final String source, final String nombreCampo) {
        final String texto = StringUtils.trimToNull(source);
        BigDecimal resultado = null;
        if (texto == null) {
            resultado = null;
        } else {
            // Quita los separadores y utiliza coma como separador decimal
            final Scanner scanner = new Scanner(texto);
            scanner.useLocale(LOCALE);
            if (scanner.hasNextBigDecimal()) {
                resultado = scanner.nextBigDecimal();
                if (scanner.hasNext()) {
                    resultado = null;
                }
            }

            if (resultado == null) {
                throw new ContabilizacionPinesException(
                        String.format(
                                "El campo %s sólo permite caracteres numéricos con decimales o no es válido para el tipo de dato",
                                nombreCampo));
            }
        }
        return resultado;
    }

    private static final BigDecimal stringToBigDecimalValida(final String source,
            final Integer longitudMaxima, final int decimales, final String nombreCampo,
            final boolean requerido) {
        final BigDecimal resultado;
        if (StringUtils.isNotEmpty(source)) {
            resultado = stringToBigDecimal(source, nombreCampo);
            if (resultado != null) {
                verificarLongitud(resultado.longValue(), longitudMaxima - decimales, nombreCampo);
                resultado.stripTrailingZeros();
                if (resultado.scale() > decimales) {
                    throw new ContabilizacionPinesException(String.format(
                            "El valor tiene demasiados decimales para %s", nombreCampo));
                }
            }
        } else if (requerido) {
            throw new ContabilizacionPinesException(String.format("El campo %s es requerido",
                    nombreCampo));
        } else {
            resultado = null;
        }
        return resultado;
    }

    private static final BigDecimal stringToBigDecimalValida(final String source,
            final Integer longitudMaxima, final int decimales, final String nombreCampo) {
        return stringToBigDecimalValida(source, longitudMaxima, decimales, nombreCampo, true);
    }

    /**
     * Verifica que la longitud del valor Object no sobrepase el límite.
     * @param valor el valor
     * @param longitudMaxima la longitud máxima
     * @param nombreCampo el nombre del campo
     */
    private static final void verificarLongitud(final Object valor, final Integer longitudMaxima,
            final String nombreCampo) {
        if (valor != null) {
            final int digitos = valor.toString().length();
            LOGGER.debug("Verificando longitud Object valor {} digitos {} máximo {}", valor,
                    digitos, longitudMaxima);
            if (digitos > longitudMaxima) {
                throw new ContabilizacionPinesException(String.format(
                        "El sistema sólo permite máximo %s caracteres en %s", longitudMaxima,
                        nombreCampo));
            }
        }
    }

    private static final String verificarTexto(final String valor, final Integer longitudMaxima,
            final String nombreCampo, final boolean requerido) {
        final String resultado = StringUtils.defaultString(valor);
        if (StringUtils.isNotEmpty(valor)) {
            verificarLongitud(resultado, longitudMaxima, nombreCampo);
        } else if (requerido) {
            throw new ContabilizacionPinesException(String.format("El campo %s es requerido",
                    nombreCampo));
        }
        return resultado;
    }

    private static final String verificarTexto(final String valor, final Integer longitudMaxima,
            final String nombreCampo) {
        return verificarTexto(valor, longitudMaxima, nombreCampo, true);
    }

    private static final String verificarSoloNumeros(final String valor,
            final Integer longitudMaxima, final String nombreCampo, final boolean requerido) {
        final String resultado = StringUtils.defaultString(valor);
        if (StringUtils.isNotEmpty(valor)) {
            final Matcher matcher = SOLO_NUMEROS.matcher(valor);
            if (!matcher.matches()) {
                throw new ContabilizacionPinesException(String.format(
                        "El campo %s sólo permite caracteres numéricos", nombreCampo));
            } else {
                verificarLongitud(resultado, longitudMaxima, nombreCampo);
            }
        } else if (requerido) {
            throw new ContabilizacionPinesException(String.format("El campo %s es requerido",
                    nombreCampo));
        }
        return resultado;
    }

    private static final String verificarSoloNumeros(final String valor,
            final Integer longitudMaxima, final String nombreCampo) {
        return verificarSoloNumeros(valor, longitudMaxima, nombreCampo, true);
    }

    /**
     * Convierte un texto a Integer.
     * @param source el texto
     * @param longitudMaxima la longitud máxima
     * @param nombreCampo el nombre del campo
     * @param requerido el indicador si el campo es requerido
     * @return el valor Integer
     */
    private static final Integer stringToIntegerValida(final String source,
            final Integer longitudMaxima, final String nombreCampo, final boolean requerido) {
        final Integer resultado;
        if (StringUtils.isNotEmpty(source)) {
            resultado = stringToInteger(source, nombreCampo);
            if (resultado != null) {
                verificarLongitud(resultado, longitudMaxima, nombreCampo);
            }
        } else if (requerido) {
            throw new ContabilizacionPinesException(String.format("El campo %s es requerido",
                    nombreCampo));
        } else {
            resultado = null;
        }
        return resultado;
    }

    /**
     * Convierte un texto a Integer.
     * @param source el texto
     * @param longitudMaxima la longitud máxima
     * @param nombreCampo el nombre del campo
     * @return el valor Integer
     */
    private static final Integer stringToIntegerValida(final String source,
            final Integer longitudMaxima, final String nombreCampo) {
        return stringToIntegerValida(source, longitudMaxima, nombreCampo, true);
    }

    /**
     * Convierte un texto a Integer.
     * @param source el texto
     * @param longitudMaxima la longitud máxima
     * @param nombreCampo el nombre del campo
     * @return el valor Integer
     */
    private static final Integer stringToIntegerValidaOpcional(final String source,
            final Integer longitudMaxima, final String nombreCampo) {
        return stringToIntegerValida(source, longitudMaxima, nombreCampo, false);
    }

    /**
     * Convierte el texto a Long.
     * @param source el texto
     * @param nombreCampo el nombre del campo a validar
     * @return el valor Long
     */
    private static final Long stringToLong(final String source, final String nombreCampo) {
        final String texto = StringUtils.trimToEmpty(source);
        Long resultado = null;
        if (StringUtils.isEmpty(texto)) {
            resultado = null;
        } else {
            final Scanner scanner = new Scanner(texto);
            try {
                scanner.useLocale(LOCALE);
                if (scanner.hasNextLong()) {
                    resultado = scanner.nextLong();
                    if (scanner.hasNext()) {
                        resultado = null;
                    }
                }
            } finally {
                scanner.close();
            }

            if (resultado == null) {
                throw new ContabilizacionPinesException(
                        String.format(
                                "El campo %s sólo permite caracteres numéricos y debe ser válido para el tipo de dato long",
                                nombreCampo));
            }
        }
        return resultado;
    }

    /**
     * Convierte el texto a long validando la longitud máxima.
     * @param source el texto
     * @param longitudMaxima la longitud máxima
     * @param nombreCampo el nombre del campo
     * @param requerido el indicador si el campo es requerido
     * @return el valor Long
     */
    private static final Long stringToLongValida(final String source, final Integer longitudMaxima,
            final String nombreCampo, final boolean requerido) {
        final Long resultado;
        if (StringUtils.isNotEmpty(source)) {
            resultado = stringToLong(source, nombreCampo);
            if (resultado != null) {
                verificarLongitud(resultado, longitudMaxima, nombreCampo);
            }
        } else if (requerido) {
            throw new ContabilizacionPinesException(String.format("El campo %s es requerido",
                    nombreCampo));
        } else {
            resultado = null;
        }

        return resultado;
    }

    /**
     * Convierte el texto a long validando la longitud máxima.
     * @param source el texto
     * @param longitudMaxima la longitud máxima
     * @param nombreCampo el nombre del campo
     * @return el valor Long
     */
    private static final Long stringToLongValida(final String source, final Integer longitudMaxima,
            final String nombreCampo) {
        return stringToLongValida(source, longitudMaxima, nombreCampo, true);
    }

    /**
     * Convierte el texto a String validando la longitud máxima.
     * @param texto el texto
     * @param longitudMaxima la longitu maxima
     * @param nombreCampo el nombre
     * @param requerido el indicador si el campo es requerido
     * @return el texto
     */
    private static final String validar(final String texto, final int longitudMaxima,
            final String nombreCampo, final boolean requerido) {
        if (StringUtils.isNotEmpty(texto)) {
            if (texto.length() > longitudMaxima) {
                throw new ContabilizacionPinesException(String.format(
                        "El sistema sólo permite máximo %s caracteres en %s", longitudMaxima,
                        nombreCampo));
            }
        } else if (requerido) {
            throw new ContabilizacionPinesException(String.format("El campo %s es requerido",
                    nombreCampo));
        }
        return StringUtils.defaultString(texto);
    }

    /**
     * Convierte el texto a String validando la longitud máxima.
     * @param texto el texto
     * @param longitudMaxima la longitu maxima
     * @param nombreCampo el nombre
     * @return el texto
     */
    private static final String validar(final String texto, final int longitudMaxima,
            final String nombreCampo) {
        return validar(texto, longitudMaxima, nombreCampo, true);
    }

    /**
     * Convierte el texto a String validando la longitud máxima.
     * @param texto el texto
     * @param longitudMaxima la longitu maxima
     * @param nombreCampo el nombre
     * @return el texto
     */
    private static final String validarOpcional(final String texto, final int longitudMaxima,
            final String nombreCampo) {
        return validar(texto, longitudMaxima, nombreCampo, false);
    }

    /**
     * Verifica que se haya especificado el texto requerido.
     * @param texto el texto
     * @param nombreCampo el nombre
     * @return el texto
     */
    private static final String validarRequerido(final String texto, final String nombreCampo) {
        if (StringUtils.isEmpty(texto)) {
            throw new ContabilizacionPinesException(String.format("El campo %s es requerido",
                    nombreCampo));
        }
        return texto;
    }

    /**
     * Verifica que se haya especificado el texto requerido.
     * @param texto el texto
     * @param nombreCampo el nombre
     * @return el texto
     */
    private static final void validarRequerido(final Object dato, final String nombreCampo) {
        if (dato == null) {
            throw new ContabilizacionPinesException(String.format("El campo %s es requerido",
                    nombreCampo));
        }
    }

    /**
     * Convierte el texto a Integer validando la longitud máxima.
     * @param valor el valor
     * @param longitudMaxima la longitud maxima
     * @param nombreCampo el nombre
     * @return el texto
     */

    private static final Integer validar(final Integer valor, final int longitudMaxima,
            final String nombreCampo) {
        if (valor != null) {
            if (valor.equals(Integer.MIN_VALUE)) {
                throw new ContabilizacionPinesException(
                        String.format(
                                "El campo %s es requerido, sólo permite caracteres numéricos y debe ser válido para el tipo de dato int",
                                nombreCampo));
            } else {
                verificarLongitud(valor, longitudMaxima, nombreCampo);
            }
        }
        return valor;
    }

    /**
     * Convierte IdentificacionType a PinDto.
     * @param type el tipo
     * @return IdentificacionType
     */

    public static final PinDto toDto(final PinType type) {
        final PinDto dto = new PinDto();
        dto.setNumeroPin(stringToIntegerValida(type.getCodPin(), 10, "codPin"));
        validarRequerido(type.getPrecio(), "precio");
        dto.setValorTotal(stringToBigDecimalValida(type.getPrecio().getValorTotal(), 15, 2,
                "valorTotal"));
        dto.setValorImpuesto(stringToBigDecimalValida(type.getPrecio().getValorImpuesto(), 15, 2,
                "valorImpuesto"));

        if (dto.getValorImpuesto().compareTo(dto.getValorTotal()) > 0) {
            throw new ContabilizacionPinesException(
                    "El valor del impuesto no puede ser mayor que el valor total en el Pin");
        }
        return dto;
    }

    public static final MedioPagoDto toDto(final MedioPagoType type) {
        final MedioPagoDto dto = new MedioPagoDto();
        validarRequerido(type.getCodigo(), "codigo");
        dto.setCodigo(stringToIntegerValida(type.getCodigo(), 2, "codigo"));
        validarRequerido(type.getTipoMedio(), "tipoMedio");
        dto.setTipoMedio(validar(type.getTipoMedio(), 1, "tipoMedio"));

        if (type.getCodigoEntFinanciera() != null) {
            dto.setCodigoEntFinanciera(stringToIntegerValida(type.getCodigoEntFinanciera()
                    .getCodigoEntidadFinType(), 3, "codigoEntFinanciera", false));
        }

        dto.setNumeroTarjeta(verificarSoloNumeros(type.getNumeroTarjeta(), 16, "numeroTarjeta",
                false));
        dto.setNumeroAprobacion(verificarSoloNumeros(type.getNumeroAprobacion(), 16,
                "numeroAprobacion", false));
        validarRequerido(type.getValor(), "valor");
        dto.setValor(stringToBigDecimalValida(type.getValor().getValorTotal(), 15, 2, "valorTotal"));
        dto.setValorImpuesto(stringToBigDecimalValida(type.getValor().getValorImpuesto(), 15, 2,
                "valorImpuesto"));

        if (dto.getValorImpuesto().compareTo(dto.getValor()) > 0) {
            throw new ContabilizacionPinesException(
                    "El valor del impuesto no puede ser mayor que el valor total en el medio de pago");
        }
        return dto;
    }

    /**
     * Convierte ConsultaType a ContratoDto.
     * @param type el tipo
     * @return la ConsultaType
     */

    public static final GenerarDocumentoEquivEntDto toDto(final GenerarDocEquivEntType type) {
        final GenerarDocumentoEquivEntDto dto = new GenerarDocumentoEquivEntDto();

        validarRequerido(type.getCodigoCompania(), "codigoCompania");
        dto.setCodigoCompania(stringToIntegerValida(type.getCodigoCompania().getCodigoCiaType(), 3,
                "codigoCompania"));
        validarRequerido(type.getCodigoPlan(), "codigoPlan");
        dto.setCodigoPlan(stringToIntegerValida(type.getCodigoPlan().getCodigoPlanType(), 5,
                "codigoPlan"));
        validarRequerido(type.getNumContrato(), "numContrato");
        dto.setNumContrato(stringToLongValida(type.getNumContrato().getNumeroContratoType(), 15,
                "numContrato"));
        validarRequerido(type.getNumeroFamilia(), "numeroFamilia");
        dto.setNumeroFamilia(stringToIntegerValida(type.getNumeroFamilia().getNumeroFliaType(), 5,
                "numeroFamilia"));
        if (type.getCategoria() != null) {
            dto.setCategoria(validar(type.getCategoria().getCategoriaType(), 2, "categoria", false));
        }
        validarRequerido(type.getCodigoConcepto(), "codigoConcepto");
        dto.setCodigoConcepto(stringToIntegerValida(type.getCodigoConcepto()
                .getCodigoConceptoType(), 4, "codigoConcepto"));
        validarRequerido(type.getEstacion(), "estacion");
        dto.setEstacion(stringToIntegerValida(type.getEstacion().getCodigoEstacionType(), 5,
                "estacion"));
        validarRequerido(type.getCiudadVenta(), "ciudadVenta");
        dto.setCiudadVenta(stringToIntegerValida(type.getCiudadVenta().getCodigoCiudadType(), 5,
                "ciudadVenta"));
        validarRequerido(type.getCodigoCanal(), "codigoCanal");
        dto.setTipoCanal(verificarTexto(type.getCodigoCanal().getCodigoCanalType(), 20,
                "codigoCanal"));
        validarRequerido(type.getNumeroTransaccion(), "numeroTransaccion");
        dto.setNumeroTransaccion(verificarSoloNumeros(type.getNumeroTransaccion()
                .getNumeroTransaccionType(), 15, "numeroTransaccion"));
        validarRequerido(type.getValor(), "valor");
        dto.setValorTotal(stringToBigDecimalValida(type.getValor().getValorTotal(), 15, 2,
                "valorTotal"));
        dto.setValorDescuento(stringToBigDecimalValida(type.getValor().getValorDescuento(), 15, 2,
                "valorDescuento"));
        dto.setValorImpuesto(stringToBigDecimalValida(type.getValor().getValorImpuesto(), 15, 2,
                "valorImpuesto"));

        if (dto.getValorDescuento().compareTo(dto.getValorTotal()) > 0) {
            throw new ContabilizacionPinesException(
                    "El valor del descuento no puede ser mayor que el valor total");
        }

        if (dto.getValorImpuesto().compareTo(dto.getValorTotal()) > 0) {
            throw new ContabilizacionPinesException(
                    "El valor del impuesto no puede ser mayor que el valor total");
        }
        final List<PinDto> pines = new ArrayList<PinDto>();
        dto.setPines(pines);
        if (type.getListaPines() != null && type.getListaPines().getPines() != null) {
            for (final PinType pin : type.getListaPines().getPines()) {
                pines.add(toDto(pin));
            }
        }

        validarRequerido(type.getListaMediosPago(), "ListaMediosPago");
        validarRequerido(type.getListaMediosPago().getMediosPago(), "mediosPago");
        final List<MedioPagoDto> mediosPago = new ArrayList<MedioPagoDto>();
        dto.setMediosPago(mediosPago);
        for (final MedioPagoType item : type.getListaMediosPago().getMediosPago()) {
            mediosPago.add(toDto(item));
        }
        dto.setEmailFacturacion("dsrodriguez@indracompany.com");
        return dto;
    }

    public static GenerarDocumentoEquivEntDto toDto(final ConsultarDocEquivEntType type) {
        final GenerarDocumentoEquivEntDto dto = new GenerarDocumentoEquivEntDto();

        validarRequerido(type.getCodigo_compania(), "codigoCompania");
        dto.setCodigoCompania(stringToIntegerValida(type.getCodigo_compania().getCodigoCiaType(),
                3, "codigoCompania"));
        validarRequerido(type.getEstacion(), "estacion");
        dto.setEstacion(stringToIntegerValida(type.getEstacion().getCodigoEstacionType(), 5,
                "estacion"));
        validarRequerido(type.getNum_transaccion_docEquiv(), "numeroTransaccion");
        dto.setNumeroTransaccion(verificarSoloNumeros(type.getNum_transaccion_docEquiv()
                .getNumeroTransaccionType(), 15, "numeroTransaccion"));
        return dto;
    }

    public static GenerarDocumentoEquivEntDto toDto(final AnularDocEquivEntType type) {
        final GenerarDocumentoEquivEntDto dto = new GenerarDocumentoEquivEntDto();

        validarRequerido(type.getCodigo_compania(), "codigoCompania");
        dto.setCodigoCompania(stringToIntegerValida(type.getCodigo_compania().getCodigoCiaType(),
                3, "codigoCompania"));
        validarRequerido(type.getEstacion(), "estacion");
        dto.setEstacion(stringToIntegerValida(type.getEstacion().getCodigoEstacionType(), 5,
                "estacion"));
        validarRequerido(type.getNum_trans_ref(), "numeroTransaccion");
        dto.setNumeroTransaccion(verificarSoloNumeros(type.getNum_trans_ref()
                .getNumeroTransaccionType(), 15, "numeroTransaccion"));
        return dto;
    }
    
    public static GenerarFacturaDto toDto(final GenerarFacturaEntType type){
    	final GenerarFacturaDto dto = new GenerarFacturaDto();
    	if(type.getCodigoCompania() != null){
    		dto.setCodigoCompania(Integer.valueOf(type.getCodigoCompania().getCodigoCiaType()));
    	}if(type.getCodigoPlan() != null){
    		if(StringUtils.isNotEmpty(type.getCodigoPlan().getCodigoPlanType())){
    			dto.setCodigoPlan(Integer.valueOf(type.getCodigoPlan().getCodigoPlanType()));
    		}
    	}if(type.getNumContrato()!= null){
    		if(StringUtils.isNotEmpty(type.getNumContrato().getNumeroContratoType())){
    			dto.setNumContrato(Long.valueOf(type.getNumContrato().getNumeroContratoType()));
    		}
    	}if(type.getNumeroFamilia() != null){
    		if(StringUtils.isNotEmpty(type.getNumeroFamilia().getNumeroFliaType())){
    			dto.setNumeroFamilia(Integer.valueOf(type.getNumeroFamilia().getNumeroFliaType()));
    		}
    	}if(type.getCategoria() != null){
    		dto.setCategoria(type.getCategoria().getCategoriaType());
    	}if(type.getListaConceptos() != null){
    		ConceptoDto[] vectorConceptos = new ConceptoDto[type.getListaConceptos().getDetalleConcepto().length]; 
    		int i = 0;
    		for(DetalleConceptoType detalleConcepto: type.getListaConceptos().getDetalleConcepto()){
    			ConceptoDto concepto = new ConceptoDto();
        		concepto.setCod_concepto(Long.valueOf(detalleConcepto.getCodigo()));
        		concepto.setDescrip_concepto(detalleConcepto.getDescripcionConcepto());
        		concepto.setVlr_unit_concepto(detalleConcepto.getValorUnitConcepto().longValue());
        		concepto.setVlr_iva_concepto(detalleConcepto.getValorIvaConcepto().longValue());
        		concepto.setVlr_descuento_concepto(detalleConcepto.getValorDescuentoConcepto().longValue());
        		concepto.setCantidad(detalleConcepto.getCantidad().longValue());
        		vectorConceptos[i] = concepto;
        		i++;
    		}
    		dto.setListDetalleConcepto(vectorConceptos);
    	}if(StringUtils.isNotEmpty(type.getCodIdentificacionPagador())){
    		dto.setCodIdPagador(type.getCodIdentificacionPagador());
    	}if(StringUtils.isNotEmpty(type.getTipoIdentificacionPagador())){
    		dto.setTipoIdPagador(type.getTipoIdentificacionPagador());
    	}if(StringUtils.isNotEmpty(type.getNumIdentificacionPagador())){
    		dto.setNumeroIdPagador(type.getNumIdentificacionPagador());
    	}if(StringUtils.isNotEmpty(type.getNombrePagador())){
    		dto.setNombresPagador(type.getNombrePagador());
    	}if(StringUtils.isNotEmpty(type.getApellidoPagador())){
    		dto.setApellidosPagador(type.getApellidoPagador());
    	}if(StringUtils.isNotEmpty(type.getTelefonoPagador())){
    		dto.setTelefonoPagador(type.getTelefonoPagador());
    	}if(type.getEstacionIn() != null){
    		dto.setEstacion(type.getEstacionIn().intValue());
    	}if(type.getCiudadVenta() != null){
    		dto.setCiudadVenta(type.getCiudadVenta().intValue());
    	}if(type.getNumTransRef() != null){
    		dto.setNumeroTransaccion(type.getNumTransRef().getNumeroTransaccionType());
    	}
   		dto.setValorTotal(new BigDecimal(type.getValorTotalTransaccion()));
   		if(type.getMediosPago() != null){
   			MedioPagoDto medioPago = new MedioPagoDto();
   			if(type.getMediosPago()!= null){
   				medioPago.setCodigo(Integer.valueOf(type.getMediosPago().getCodigo()));
   			}if(type.getMediosPago().getValor() != null){
   				medioPago.setValor(new BigDecimal(type.getMediosPago().getValor()));
   			}if(type.getMediosPago().getCodigoEntFinanciera() != null){
   				medioPago.setCodigoEntFinanciera(Integer.valueOf(type.getMediosPago().getCodigoEntFinanciera().getCodigoEntidadFinType()));
   			}if(StringUtils.isNotEmpty(type.getMediosPago().getNumeroTarjeta())){
   				medioPago.setNumeroTarjeta(type.getMediosPago().getNumeroTarjeta());
   			}if(type.getMediosPago().getTipoMedio() != null){
   				medioPago.setTipoMedio(type.getMediosPago().getTipoMedio());
   			}
   			dto.setMediosPago(medioPago);
   		}
    	return dto;
    }

}
