/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.procedures;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.SQLDialect;
import org.jooq.impl.ParameterImpl;
import org.jooq.impl.StoredProcedureImpl;
import org.jooq.test.db2.generatedclasses.Lukas;
import org.jooq.util.db2.DB2DataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class PAuthorExists extends StoredProcedureImpl {

	private static final long serialVersionUID = 1019018296;


	/**
	 * An uncommented item
	 */
	public static final Parameter<String> AUTHOR_NAME = new ParameterImpl<String>(SQLDialect.DB2, "AUTHOR_NAME", DB2DataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final Parameter<Integer> RESULT = new ParameterImpl<Integer>(SQLDialect.DB2, "RESULT", DB2DataType.INTEGER);

	/**
	 * Create a new procedure call instance
	 */
	public PAuthorExists() {
		super(SQLDialect.DB2, "P_AUTHOR_EXISTS", Lukas.LUKAS);

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
