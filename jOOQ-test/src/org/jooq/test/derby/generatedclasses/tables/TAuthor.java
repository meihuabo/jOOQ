/**
 * This class is generated by jOOQ
 */
package org.jooq.test.derby.generatedclasses.tables;


import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.derby.generatedclasses.Keys;
import org.jooq.test.derby.generatedclasses.Test;
import org.jooq.test.derby.generatedclasses.tables.records.TAuthorRecord;
import org.jooq.util.derby.DerbyDataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TAuthor extends UpdatableTableImpl<TAuthorRecord> {

	private static final long serialVersionUID = -1763267300;

	/**
	 * The singleton instance of T_AUTHOR
	 */
	public static final TAuthor T_AUTHOR = new TAuthor();

	/**
	 * The class holding records for this type
	 */
	private static final Class<TAuthorRecord> __RECORD_TYPE = TAuthorRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TAuthorRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<TAuthorRecord, Integer> ID = new TableFieldImpl<TAuthorRecord, Integer>(SQLDialect.DERBY, "ID", DerbyDataType.INTEGER, T_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final TableField<TAuthorRecord, String> FIRST_NAME = new TableFieldImpl<TAuthorRecord, String>(SQLDialect.DERBY, "FIRST_NAME", DerbyDataType.VARCHAR, T_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final TableField<TAuthorRecord, String> LAST_NAME = new TableFieldImpl<TAuthorRecord, String>(SQLDialect.DERBY, "LAST_NAME", DerbyDataType.VARCHAR, T_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final TableField<TAuthorRecord, Date> DATE_OF_BIRTH = new TableFieldImpl<TAuthorRecord, Date>(SQLDialect.DERBY, "DATE_OF_BIRTH", DerbyDataType.DATE, T_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final TableField<TAuthorRecord, Integer> YEAR_OF_BIRTH = new TableFieldImpl<TAuthorRecord, Integer>(SQLDialect.DERBY, "YEAR_OF_BIRTH", DerbyDataType.INTEGER, T_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final TableField<TAuthorRecord, String> ADDRESS = new TableFieldImpl<TAuthorRecord, String>(SQLDialect.DERBY, "ADDRESS", DerbyDataType.VARCHAR, T_AUTHOR);

	/**
	 * No further instances allowed
	 */
	private TAuthor() {
		super(SQLDialect.DERBY, "T_AUTHOR", Test.TEST);
	}

	@Override
	public UniqueKey<TAuthorRecord> getMainKey() {
		return Keys.PK_T_AUTHOR;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<UniqueKey<TAuthorRecord>> getKeys() {
		return Arrays.<UniqueKey<TAuthorRecord>>asList(Keys.PK_T_AUTHOR);
	}
}
