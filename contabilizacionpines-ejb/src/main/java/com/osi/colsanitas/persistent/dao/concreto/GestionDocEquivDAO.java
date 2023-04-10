package com.osi.colsanitas.persistent.dao.concreto;

import javax.sql.DataSource;

import com.osi.colsanitas.business.fachada.GenerarDocumentoEquivEntDto;
import com.osi.colsanitas.business.fachada.GenerarFacturaDto;
import com.osi.colsanitas.business.fachada.RespuestaAnulacionDto;
import com.osi.colsanitas.business.fachada.RespuestaGenerarFacturaDto;
import com.osi.colsanitas.persistent.dao.fachada.GestionDocEquivDAOFacade;
import com.osi.colsanitas.persistent.storeProcedures.AnularDocEquivSP;
import com.osi.colsanitas.persistent.storeProcedures.ConsultarDocEquivSP;
import com.osi.colsanitas.persistent.storeProcedures.GenerarDocEquivSP;
import com.osi.colsanitas.persistent.storeProcedures.GenerarFacturaSP;

/**
 * Clase de implementación de persistencia y acceso a datos
 * @author amonastoque-Softmanagement
 * @date 15/11/2013
 */

public class GestionDocEquivDAO implements GestionDocEquivDAOFacade {
    private final GenerarDocEquivSP generarDocEquivSp;
    private final ConsultarDocEquivSP consultarDocEquivSp;
    private final AnularDocEquivSP anularDocEquivSp;
    private final GenerarFacturaSP generarFacturaSp;

    /**
     * Constructor
     */
    public GestionDocEquivDAO(final DataSource ds) {
        super();
        generarDocEquivSp = new GenerarDocEquivSP(ds);
        consultarDocEquivSp = new ConsultarDocEquivSP(ds);
        anularDocEquivSp = new AnularDocEquivSP(ds);
        generarFacturaSp = new GenerarFacturaSP(ds);
    }

    /**
     * Metodo de ejecución del PL/SQL que genera el documento equivalente
     */
    @Override
    public String generarDocEquivalente(final GenerarDocumentoEquivEntDto generarDocE) {
        return generarDocEquivSp.execute(generarDocE);
    }

    /**
     * Metodo de ejecución del PL/SQL que consulta y retora el documento equivalente en formato pdf
     */
    @Override
    public String consultarDocumentoEquivalente(final GenerarDocumentoEquivEntDto consultarDocEquiv) {
        return consultarDocEquivSp.execute(consultarDocEquiv);
    }

    /**
     * Metodo de ejecución del proceso de anulación del documento equivalente
     */
    @Override
    public RespuestaAnulacionDto anularDocumentoEquivalente(final GenerarDocumentoEquivEntDto ent) {
        return anularDocEquivSp.execute(ent);
    }
    
    @Override
	public RespuestaGenerarFacturaDto generarFactura(GenerarFacturaDto generarFacturaE) {
		return generarFacturaSp.execute(generarFacturaE);
	}

}
