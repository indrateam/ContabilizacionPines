package com.osi.contabilizacionpines.webutil;

import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Métodos utilitarios para obtener el EJB.
 * @author sm
 * 
 */
public final class EjbUtil {

    /**
     * Constructor privado para evitar instancias.
     */
    private EjbUtil() {
    }

    /**
     * Regreasa el EJB que coincide con el nombre JNDI.
     * @param nombre el nombre JNDI
     * @return el EJB
     */
    public static Object getEjb(final String nombre) {
        final Object ejbLocal;
        InitialContext ctx = null;
        try {
            ctx = new InitialContext();
            ejbLocal = ctx.lookup(nombre);
        } catch (final NamingException e) {
            throw new IllegalStateException("Error al buscar el EJB " + nombre, e);
        }
        return ejbLocal;
    }

}
