package com.osi.contabilizacionpines.webutil;

import org.apache.axis2.AxisFault;

public class ContabilizacionPinesFault extends AxisFault {
    /**
     * Constructor recibiendo una excepción raíz.
     * @param cause la causa
     */
    public ContabilizacionPinesFault(final Throwable cause) {
        super(FaultUtil.getMensaje(cause), FaultUtil.getFaultCode(cause), FaultUtil.getCause(cause));
    }

    /**
     * Constructor recibiendo un mensaje.
     * @param message el mensaje
     */
    public ContabilizacionPinesFault(final String message) {
        super(message);
    }

    /**
     * Constructor recibiendo un mensaje.
     * @param message el mensaje
     * @param cause la causa
     */
    public ContabilizacionPinesFault(final String message, final Throwable cause) {
        super(message, FaultUtil.getCause(cause));
    }

    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 19525604235154220L;

}
