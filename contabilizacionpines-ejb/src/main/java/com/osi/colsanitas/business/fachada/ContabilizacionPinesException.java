package com.osi.colsanitas.business.fachada;

/**
 * Clase que contiene las excepcion generadas por los ejbs
 * @author legranados
 * 
 */
@SuppressWarnings("serial")
public class ContabilizacionPinesException extends RuntimeException {
    /**
     * Código del error.
     */
    private Long codigo;

    /**
     * Constructor vacío.
     */
    public ContabilizacionPinesException() {
        super();
    }

    /**
     * Construye una nueva excepción con el mensaje especificado.
     * 
     * @param info la información del mensaje
     */
    public ContabilizacionPinesException(final EExcepciones info) {
        super(info.getDescripcion());

        this.codigo = info.getCodigo();
    }

    /**
     * Construye una nueva excepción con el mensaje especificado y los argumentos variables se pasan
     * a un String.format.
     * 
     * @param info la información del mensaje
     * @param args argumentos variables para String.format.
     */
    public ContabilizacionPinesException(final EExcepciones info, final Object... args) {
        super(String.format(info.getDescripcion(), args));

        this.codigo = info.getCodigo();
    }

    /**
     * Construye una nueva excepción con el mensaje y causa especificados. Los argumentos variables
     * se pasan a un String.format.
     * 
     * @param info la información del mensaje
     * @param cause la causa
     * @param args argumentos variables para String.format.
     */
    public ContabilizacionPinesException(final EExcepciones info, final Throwable cause,
            final Object... args) {
        super(String.format(info.getDescripcion(), args), cause);

        this.codigo = info.getCodigo();
    }

    /**
     * Construye una nueva excepción con el mensaje y causa especificados.
     * 
     * @param info la información del mensaje
     * @param cause la causa
     */
    public ContabilizacionPinesException(final EExcepciones info, final Throwable cause) {
        super(info.getDescripcion(), cause);

        this.codigo = info.getCodigo();
    }

    /**
     * Construye una nueva excepción especificando código y descripción.
     * 
     * @param codigo el código
     * @param descripcion la descripción
     */
    public ContabilizacionPinesException(final String codigo, final String descripcion) {
        super(descripcion);

        this.codigo = Long.parseLong(codigo);
    }

    /**
     * Construye una nueva excepción especificando código y descripción.
     * 
     * @param descripcion la descripción
     */
    public ContabilizacionPinesException(final String descripcion, final Throwable cause) {
        super(descripcion, cause);

        this.codigo = 1L;
    }

    public ContabilizacionPinesException(final String descripcion) {
        super(descripcion);

        this.codigo = 1L;
    }

    /**
     * Propiedad código.
     * @return el valor de la propiedad.
     */
    public Long getCodigo() {
        return codigo;
    }

    /**
     * Propiedad código.
     * @param codigo el valor de la propiedad.
     */
    public void setCodigo(final Long codigo) {
        this.codigo = codigo;
    }

}
