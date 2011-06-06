/**
 * This class is generated by jOOQ
 */
package org.jooq.test.derby.generatedclasses.tables.records;


import java.sql.SQLException;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.derby.generatedclasses.tables.XTestCase_64_69;
import org.jooq.test.derby.generatedclasses.tables.XTestCase_71;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class XTestCase_71Record extends UpdatableRecordImpl<XTestCase_71Record> {

	private static final long serialVersionUID = -2120166460;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(Integer value) {
		setValue(XTestCase_71.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public Integer getId() {
		return getValue(XTestCase_71.ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TEST.X_TEST_CASE_71.TEST_CASE_64_69_ID]
	 * REFERENCES X_TEST_CASE_64_69 [TEST.X_TEST_CASE_64_69.ID]
	 * </pre></code>
	 */
	public void setTestCase_64_69Id(Integer value) {
		setValue(XTestCase_71.TEST_CASE_64_69_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TEST.X_TEST_CASE_71.TEST_CASE_64_69_ID]
	 * REFERENCES X_TEST_CASE_64_69 [TEST.X_TEST_CASE_64_69.ID]
	 * </pre></code>
	 */
	public Integer getTestCase_64_69Id() {
		return getValue(XTestCase_71.TEST_CASE_64_69_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TEST.X_TEST_CASE_71.TEST_CASE_64_69_ID]
	 * REFERENCES X_TEST_CASE_64_69 [TEST.X_TEST_CASE_64_69.ID]
	 * </pre></code>
	 */
	public XTestCase_64_69Record fetchXTestCase_64_69() throws SQLException {
		return create()
			.selectFrom(XTestCase_64_69.X_TEST_CASE_64_69)
			.where(XTestCase_64_69.ID.equal(getValue(XTestCase_71.TEST_CASE_64_69_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TEST.X_TEST_CASE_71.TEST_CASE_64_69_ID]
	 * REFERENCES X_TEST_CASE_64_69 [TEST.X_TEST_CASE_64_69.ID]
	 * </pre></code>
	 *
	 * @deprecated Because of risk of ambiguity (#187), code generation for this<br/>
	 *             method will not be supported anymore, soon.<br/><br/>
	 *             If you wish to remove this method, adapt your configuration:<br/>
	 *             <code>generator.generate.deprecated=false</code>
	 */
	@Deprecated
	public XTestCase_64_69Record getXTestCase_64_69() throws SQLException {
		return create()
			.selectFrom(XTestCase_64_69.X_TEST_CASE_64_69)
			.where(XTestCase_64_69.ID.equal(getValue(XTestCase_71.TEST_CASE_64_69_ID)))
			.fetchOne();
	}
	/**
	 * Create a detached XTestCase_71Record
	 */
	public XTestCase_71Record() {
		super(XTestCase_71.X_TEST_CASE_71);
	}

	/**
	 * Create an attached XTestCase_71Record
	 */
	public XTestCase_71Record(Configuration configuration) {
		super(XTestCase_71.X_TEST_CASE_71, configuration);
	}
}
