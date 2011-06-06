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
public class FArrays3 extends StoredFunctionImpl<String[]> {

	private static final long serialVersionUID = 66819705;


	/**
	 * An uncommented item
	 */
	public static final Parameter<String[]> IN_ARRAY = new ParameterImpl<String[]>(SQLDialect.HSQLDB, "IN_ARRAY", HSQLDBDataType.VARCHAR.getArrayDataType());

	/**
	 * Create a new function call instance
	 */
	public FArrays3() {
		super(SQLDialect.HSQLDB, "F_ARRAYS3", Public.PUBLIC, HSQLDBDataType.VARCHAR.getArrayDataType());

		addInParameter(IN_ARRAY);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the function
	 */
	public void setInArray(String[] value) {
		setValue(IN_ARRAY, value);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link Field} in a {@link Select} statement!
	 */
	public void setInArray(Field<String[]> field) {
		setField(IN_ARRAY, field);
	}
}
