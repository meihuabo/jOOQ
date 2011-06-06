/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables;


import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.db2.generatedclasses.Keys;
import org.jooq.test.db2.generatedclasses.Lukas;
import org.jooq.test.db2.generatedclasses.tables.records.TAuthorRecord;
import org.jooq.util.db2.DB2DataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TAuthor extends UpdatableTableImpl<TAuthorRecord> {

	private static final long serialVersionUID = -1587860784;

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
	public static final TableField<TAuthorRecord, Integer> ID = new TableFieldImpl<TAuthorRecord, Integer>(SQLDialect.DB2, "ID", DB2DataType.INTEGER, T_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final TableField<TAuthorRecord, String> FIRST_NAME = new TableFieldImpl<TAuthorRecord, String>(SQLDialect.DB2, "FIRST_NAME", DB2DataType.VARCHAR, T_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final TableField<TAuthorRecord, String> LAST_NAME = new TableFieldImpl<TAuthorRecord, String>(SQLDialect.DB2, "LAST_NAME", DB2DataType.VARCHAR, T_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final TableField<TAuthorRecord, Date> DATE_OF_BIRTH = new TableFieldImpl<TAuthorRecord, Date>(SQLDialect.DB2, "DATE_OF_BIRTH", DB2DataType.DATE, T_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final TableField<TAuthorRecord, Integer> YEAR_OF_BIRTH = new TableFieldImpl<TAuthorRecord, Integer>(SQLDialect.DB2, "YEAR_OF_BIRTH", DB2DataType.INTEGER, T_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final TableField<TAuthorRecord, String> ADDRESS = new TableFieldImpl<TAuthorRecord, String>(SQLDialect.DB2, "ADDRESS", DB2DataType.VARCHAR, T_AUTHOR);

	/**
	 * No further instances allowed
	 */
	private TAuthor() {
		super(SQLDialect.DB2, "T_AUTHOR", Lukas.LUKAS);
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
