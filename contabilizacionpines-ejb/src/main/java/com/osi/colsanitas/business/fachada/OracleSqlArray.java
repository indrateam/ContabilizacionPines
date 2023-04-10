package com.osi.colsanitas.business.fachada;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import oracle.sql.ARRAY;
import oracle.sql.ArrayDescriptor;

import org.springframework.jdbc.core.support.AbstractSqlTypeValue;


/**
 * Clase utilitaria que representa un arreglo de Oracle.
 * Para mayor informaci�n sobre arreglos oracle con spring:
 * <ul>
 * <li>http://forum.springframework.org/archive/index.php/t-15182.html</li>
 * <li>http://forum.springsource.org/showthread.php?p=218833</li>
 * </ul>
 * @author nagarcia
 */

public class OracleSqlArray extends AbstractSqlTypeValue {

	private List<?> values;

	public OracleSqlArray(List<?> values) {
		this.values = values;
	}
	
	@Override
	protected Object createTypeValue(Connection conn, int sqlType, String typeName)throws SQLException 
	{
		Connection oracleConn = conn;
		ArrayDescriptor desc = new ArrayDescriptor(typeName, oracleConn);
		Object[] a = values.toArray();
		Object o = new ARRAY(desc, oracleConn, a);
		return o;
	}

}
