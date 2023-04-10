package com.osi.contabilizacionpines.webutil;

import org.apache.axis2.AxisFault;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.osi.colsanitas.business.fachada.ContabilizacionPinesException;

public class FaultUtil {
    /**
     * Logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(FaultUtil.class);

    /**
     * Detecta si se trata de un ContabilizacionPinesException.
     * @param cause la causa
     * @return regresa null si no es un ContabilizacionPinesException
     */
    public static final ContabilizacionPinesException getContabilizacionPinesException(
            final Throwable cause) {
        ContabilizacionPinesException exception;
        if (cause == null) {
            exception = null;
        } else if (cause instanceof ContabilizacionPinesException) {
            LOGGER.debug("ContabilizacionPinesException es {}", cause.getClass().getName());
            exception = (ContabilizacionPinesException) cause;
        } else {
            exception = getContabilizacionPinesException(cause.getCause());
        }
        return exception;
    }

    /**
     * Indica si no fue posible establecer comunicación con la base de datos.
     * @param cause el exception
     * @return el indicador
     */
    public static final boolean isComunicacionBaseDatos(final Throwable cause) {
        final String stack = ExceptionUtils.getStackTrace(cause);
        return StringUtils.contains(stack, "CannotGetJdbcConnectionException")
                || StringUtils.contains(stack, "java.net.");
    }

    /**
     * Construye el mensaje a partir del tipo de excepción.
     * @param cause el exception
     * @return el mensaje
     */
    public static final String getMensaje(final Throwable cause) {
        String mensaje;

        if (cause instanceof AxisFault) {
            mensaje = cause.getMessage();
        } else {
            final ContabilizacionPinesException exception = getContabilizacionPinesException(cause);
            if (exception != null) {
                LOGGER.debug("ContabilizacionPinesException", exception);
                mensaje = exception.getMessage();
            } else if (isComunicacionBaseDatos(cause)) {
                mensaje = "No fue posible establecer comunicación con la Base de Datos, por favor intente más tarde.";
                LOGGER.debug(mensaje, cause);
            } else {
                LOGGER.error("Error inesperado en ContabilizacionPines", cause);
                mensaje = "Ocurrió un error inesperado: "
                        + new DateTime().toString("dd/MM/yyyy HH:mm:ss");
            }
        }
        return mensaje;
    }

    /**
     * Construye el faultcode a partir del tipo de excepción.
     * @param cause el exception
     * @return el faultcode
     */
    public static final String getFaultCode(final Throwable cause) {
        String faultCode;
        if (cause instanceof AxisFault) {
            final AxisFault fault = (AxisFault) cause;
            if (fault.getFaultCode() == null) {
                faultCode = StringUtils.EMPTY;
            } else {
                faultCode = fault.getFaultCode().getLocalPart();
            }
        } else {
            final ContabilizacionPinesException exception = getContabilizacionPinesException(cause);
            if (exception != null) {
                faultCode = String.valueOf(exception.getCodigo());
            } else if (isComunicacionBaseDatos(cause)) {
                faultCode = "1";
            } else {
                faultCode = "0";
            }
        }
        return faultCode;
    }

    /**
     * Detecta si la causa fue un ContabilizacionPinesException.
     * @param cause el exception
     * @return el ContabilizacionPinesException si fue la causa, de lo contrario lo deja igual.
     */
    public static final Throwable getCause(final Throwable cause) {
        Throwable throwable;
        final ContabilizacionPinesException exception = getContabilizacionPinesException(cause);
        if (exception == null) {
            throwable = cause;
        } else {
            throwable = exception;
        }
        return throwable;
    }

}
