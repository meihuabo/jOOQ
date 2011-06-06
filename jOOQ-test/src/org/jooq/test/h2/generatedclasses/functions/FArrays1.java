/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.functions;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.SQLDialect;
import org.jooq.Select;
import org.jooq.impl.ParameterImpl;
import org.jooq.impl.StoredFunctionImpl;
import org.jooq.test.h2.generatedclasses.Public;
import org.jooq.util.h2.H2DataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class FArrays1 extends StoredFunctionImpl<Object[]> {

	private static final long serialVersionUID = -1100651391;


	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (ARRAY) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final Parameter<Object[]> P1 = new ParameterImpl<Object[]>(SQLDialect.H2, "P1", H2DataType.OTHER.getArrayDataType());

	/**
	 * Create a new function call instance
	 */
	public FArrays1() {
		super(SQLDialect.H2, "F_ARRAYS1", Public.PUBLIC, H2DataType.OTHER.getArrayDataType());

		addInParameter(P1);
	}

	/**
	 * Set the <code>P1</code> parameter to the function
	 */
	public void setP1(Object[] value) {
		setValue(P1, value);
	}

	/**
	 * Set the <code>P1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link Field} in a {@link Select} statement!
	 */
	public void setP1(Field<Object[]> field) {
		setField(P1, field);
	}
}
