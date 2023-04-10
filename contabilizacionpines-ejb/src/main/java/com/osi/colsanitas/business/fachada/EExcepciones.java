package com.osi.colsanitas.business.fachada;

import java.util.HashMap;
import java.util.Map;

/**
 * Enumeracion que contiene los codigos y descripcion de los errores
 * @author legranados
 * 
 */
public class EExcepciones {
    /**
     * Indice de excepciones para que el cache actualice los nombres y códigos.
     */
    private static final Map<String, EExcepciones> INDICE_EXCEPCIONES = new HashMap<String, EExcepciones>();
    /**
     * Variables estática para EXCEPCION_COMUNICACION_BASE_DATOS
     */
    public static final EExcepciones EXCEPCION_COMUNICACION_BASE_DATOS = new EExcepciones(
            "EXCEPCION_COMUNICACION_BASE_DATOS");

    /**
     * Busca la excepción por nombre.
     * @param nombre el nombre
     * @return la excepción
     */
    public static final EExcepciones getExcepcionPorNombre(final String nombre) {
        return INDICE_EXCEPCIONES.get(nombre);
    }

    /**
     * Código de la excepción.
     */
    private Long codigo;
    /**
     * Descripción de la excepción.
     */
    private String descripcion;
    /**
     * Nombre de la excepción.
     */
    private String nombre;

    /**
     * Construye los datos del objeto a partir del nombre.
     * @param nombre el nombre
     */
    private EExcepciones(final String nombre) {
        this.codigo = 0L;
        this.nombre = nombre;
        this.descripcion = nombre;
        INDICE_EXCEPCIONES.put(nombre, this);
    }

    /**
     * @return el valor de la propiedad codigo
     */
    public final Long getCodigo() {
        return codigo;
    }

    /**
     * @param codigo el valor de la propiedad codigo a establecer
     */
    public final void setCodigo(final Long codigo) {
        this.codigo = codigo;
    }

    /**
     * @return el valor de la propiedad descripcion
     */
    public final String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion el valor de la propiedad descripcion a establecer
     */
    public final void setDescripcion(final String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return el valor de la propiedad nombre
     */
    public final String getNombre() {
        return nombre;
    }

    /**
     * @param nombre el valor de la propiedad nombre a establecer
     */
    public final void setNombre(final String nombre) {
        this.nombre = nombre;
    }

}
