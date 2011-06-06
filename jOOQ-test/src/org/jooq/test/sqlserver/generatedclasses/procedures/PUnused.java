/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.procedures;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.SQLDialect;
import org.jooq.impl.ParameterImpl;
import org.jooq.impl.StoredProcedureImpl;
import org.jooq.test.sqlserver.generatedclasses.Dbo;
import org.jooq.util.sqlserver.SQLServerDataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class PUnused extends StoredProcedureImpl {

	private static final long serialVersionUID = 1037232350;


	/**
	 * An uncommented item
	 */
	public static final Parameter<String> IN1 = new ParameterImpl<String>(SQLDialect.SQLSERVER, "in1", SQLServerDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final Parameter<Integer> OUT1 = new ParameterImpl<Integer>(SQLDialect.SQLSERVER, "out1", SQLServerDataType.INT);

	/**
	 * An uncommented item
	 */
	public static final Parameter<Integer> OUT2 = new ParameterImpl<Integer>(SQLDialect.SQLSERVER, "out2", SQLServerDataType.INT);

	/**
	 * Create a new procedure call instance
	 */
	public PUnused() {
		super(SQLDialect.SQLSERVER, "p_unused", Dbo.DBO);

		addInParameter(IN1);
		addInOutParameter(OUT1);
		addInOutParameter(OUT2);
	}

	public void setIn1(String value) {
		setValue(IN1, value);
	}

	public void setOut1(Integer value) {
		setValue(OUT1, value);
	}

	public void setOut2(Integer value) {
		setValue(OUT2, value);
	}

	public Integer getOut1() {
		return getValue(OUT1);
	}

	public Integer getOut2() {
		return getValue(OUT2);
	}
}
