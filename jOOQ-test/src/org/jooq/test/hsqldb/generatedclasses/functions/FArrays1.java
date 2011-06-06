/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.functions;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.SQLDialect;
import org.jooq.Select;
import org.jooq.impl.ParameterImpl;
import org.jooq.impl.StoredFunctionImpl;
import org.jooq.test.hsqldb.generatedclasses.Public;
import org.jooq.util.hsqldb.HSQLDBDataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class FArrays1 extends StoredFunctionImpl<Integer[]> {

	private static final long serialVersionUID = -742627450;


	/**
	 * An uncommented item
	 */
	public static final Parameter<Integer[]> IN_ARRAY = new ParameterImpl<Integer[]>(SQLDialect.HSQLDB, "IN_ARRAY", HSQLDBDataType.INTEGER.getArrayDataType());

	/**
	 * Create a new function call instance
	 */
	public FArrays1() {
		super(SQLDialect.HSQLDB, "F_ARRAYS1", Public.PUBLIC, HSQLDBDataType.INTEGER.getArrayDataType());

		addInParameter(IN_ARRAY);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the function
	 */
	public void setInArray(Integer[] value) {
		setValue(IN_ARRAY, value);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link Field} in a {@link Select} statement!
	 */
	public void setInArray(Field<Integer[]> field) {
		setField(IN_ARRAY, field);
	}
}
