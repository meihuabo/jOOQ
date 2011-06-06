/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.procedures;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.SQLDialect;
import org.jooq.impl.ParameterImpl;
import org.jooq.impl.StoredProcedureImpl;
import org.jooq.test.postgres.generatedclasses.Public;
import org.jooq.util.postgres.PostgresDataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class PArrays2 extends StoredProcedureImpl {

	private static final long serialVersionUID = 1705547801;


	/**
	 * An uncommented item
	 */
	public static final Parameter<Long[]> IN_ARRAY = new ParameterImpl<Long[]>(SQLDialect.POSTGRES, "in_array", PostgresDataType.INT8.getArrayDataType());

	/**
	 * An uncommented item
	 */
	public static final Parameter<Long[]> OUT_ARRAY = new ParameterImpl<Long[]>(SQLDialect.POSTGRES, "out_array", PostgresDataType.INT8.getArrayDataType());

	/**
	 * Create a new procedure call instance
	 */
	public PArrays2() {
		super(SQLDialect.POSTGRES, "p_arrays", Public.PUBLIC);

		addInParameter(IN_ARRAY);
		addOutParameter(OUT_ARRAY);
		setOverloaded(true);
	}

	public void setInArray(Long[] value) {
		setValue(IN_ARRAY, value);
	}

	public Long[] getOutArray() {
		return getValue(OUT_ARRAY);
	}
}
