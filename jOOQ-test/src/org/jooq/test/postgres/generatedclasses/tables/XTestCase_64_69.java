/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.postgres.generatedclasses.Keys;
import org.jooq.test.postgres.generatedclasses.Public;
import org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_64_69Record;
import org.jooq.util.postgres.PostgresDataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class XTestCase_64_69 extends UpdatableTableImpl<XTestCase_64_69Record> {

	private static final long serialVersionUID = -49260620;

	/**
	 * The singleton instance of x_test_case_64_69
	 */
	public static final XTestCase_64_69 X_TEST_CASE_64_69 = new XTestCase_64_69();

	/**
	 * The class holding records for this type
	 */
	private static final Class<XTestCase_64_69Record> __RECORD_TYPE = XTestCase_64_69Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<XTestCase_64_69Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<XTestCase_64_69Record, Integer> ID = new TableFieldImpl<XTestCase_64_69Record, Integer>(SQLDialect.POSTGRES, "id", PostgresDataType.INTEGER, X_TEST_CASE_64_69);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [public.x_test_case_64_69.unused_id]
	 * REFERENCES x_unused [public.x_unused.id]
	 * </pre></code>
	 */
	public static final TableField<XTestCase_64_69Record, Integer> UNUSED_ID = new TableFieldImpl<XTestCase_64_69Record, Integer>(SQLDialect.POSTGRES, "unused_id", PostgresDataType.INTEGER, X_TEST_CASE_64_69);

	/**
	 * No further instances allowed
	 */
	private XTestCase_64_69() {
		super(SQLDialect.POSTGRES, "x_test_case_64_69", Public.PUBLIC);
	}

	@Override
	public UniqueKey<XTestCase_64_69Record> getMainKey() {
		return Keys.pk_x_test_case_64_69;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<UniqueKey<XTestCase_64_69Record>> getKeys() {
		return Arrays.<UniqueKey<XTestCase_64_69Record>>asList(Keys.pk_x_test_case_64_69);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<ForeignKey<XTestCase_64_69Record, ?>> getReferences() {
		return Arrays.<ForeignKey<XTestCase_64_69Record, ?>>asList(Keys.fk_x_test_case_64_69);
	}
}
