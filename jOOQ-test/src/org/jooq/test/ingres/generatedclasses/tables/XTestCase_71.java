/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.ingres.generatedclasses.Keys;
import org.jooq.test.ingres.generatedclasses.Test;
import org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_71Record;
import org.jooq.util.ingres.IngresDataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class XTestCase_71 extends UpdatableTableImpl<XTestCase_71Record> {

	private static final long serialVersionUID = 1245845114;

	/**
	 * The singleton instance of x_test_case_71
	 */
	public static final XTestCase_71 X_TEST_CASE_71 = new XTestCase_71();

	/**
	 * The class holding records for this type
	 */
	private static final Class<XTestCase_71Record> __RECORD_TYPE = XTestCase_71Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<XTestCase_71Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<XTestCase_71Record, Integer> ID = new TableFieldImpl<XTestCase_71Record, Integer>(SQLDialect.INGRES, "id", IngresDataType.INTEGER, X_TEST_CASE_71);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.x_test_case_71.test_case_64_69_id]
	 * REFERENCES x_test_case_64_69 [test.x_test_case_64_69.id]
	 * </pre></code>
	 */
	public static final TableField<XTestCase_71Record, Integer> TEST_CASE_64_69_ID = new TableFieldImpl<XTestCase_71Record, Integer>(SQLDialect.INGRES, "test_case_64_69_id", IngresDataType.INTEGER, X_TEST_CASE_71);

	/**
	 * No further instances allowed
	 */
	private XTestCase_71() {
		super(SQLDialect.INGRES, "x_test_case_71", Test.TEST);
	}

	@Override
	public UniqueKey<XTestCase_71Record> getMainKey() {
		return Keys.pk_x_test_case_71;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<UniqueKey<XTestCase_71Record>> getKeys() {
		return Arrays.<UniqueKey<XTestCase_71Record>>asList(Keys.pk_x_test_case_71);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<ForeignKey<XTestCase_71Record, ?>> getReferences() {
		return Arrays.<ForeignKey<XTestCase_71Record, ?>>asList(Keys.fk_x_test_case_71);
	}
}
