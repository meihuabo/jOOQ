/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.procedures;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.SQLDialect;
import org.jooq.impl.ParameterImpl;
import org.jooq.impl.StoredProcedureImpl;
import org.jooq.test.hsqldb.generatedclasses.Public;
import org.jooq.util.hsqldb.HSQLDBDataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class PArrays3 extends StoredProcedureImpl {

	private static final long serialVersionUID = -2135387770;


	/**
	 * An uncommented item
	 */
	public static final Parameter<String[]> IN_ARRAY = new ParameterImpl<String[]>(SQLDialect.HSQLDB, "IN_ARRAY", HSQLDBDataType.VARCHAR.getArrayDataType());

	/**
	 * An uncommented item
	 */
	public static final Parameter<String[]> OUT_ARRAY = new ParameterImpl<String[]>(SQLDialect.HSQLDB, "OUT_ARRAY", HSQLDBDataType.VARCHAR.getArrayDataType());

	/**
	 * Create a new procedure call instance
	 */
	public PArrays3() {
		super(SQLDialect.HSQLDB, "P_ARRAYS3", Public.PUBLIC);

		addInParameter(IN_ARRAY);
		addOutParameter(OUT_ARRAY);
	}

	public void setInArray(String[] value) {
		setValue(IN_ARRAY, value);
	}

	public String[] getOutArray() {
		return getValue(OUT_ARRAY);
	}
}
