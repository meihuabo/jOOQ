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
public class PAuthorExists extends StoredProcedureImpl {

	private static final long serialVersionUID = 777798161;


	/**
	 * An uncommented item
	 */
	public static final Parameter<String> AUTHOR_NAME = new ParameterImpl<String>(SQLDialect.HSQLDB, "AUTHOR_NAME", HSQLDBDataType.CHARACTERVARYING);

	/**
	 * An uncommented item
	 */
	public static final Parameter<Integer> RESULT = new ParameterImpl<Integer>(SQLDialect.HSQLDB, "RESULT", HSQLDBDataType.INTEGER);

	/**
	 * Create a new procedure call instance
	 */
	public PAuthorExists() {
		super(SQLDialect.HSQLDB, "P_AUTHOR_EXISTS", Public.PUBLIC);

		addInParameter(AUTHOR_NAME);
		addOutParameter(RESULT);
	}

	public void setAuthorName(String value) {
		setValue(AUTHOR_NAME, value);
	}

	public Integer getResult() {
		return getValue(RESULT);
	}
}
