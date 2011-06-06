/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.test.sqlite.generatedclasses.tables.records.VBookRecord;
import org.jooq.util.sqlite.SQLiteDataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class VBook extends TableImpl<VBookRecord> {

	private static final long serialVersionUID = -941112324;

	/**
	 * The singleton instance of v_book
	 */
	public static final VBook V_BOOK = new VBook();

	/**
	 * The class holding records for this type
	 */
	private static final Class<VBookRecord> __RECORD_TYPE = VBookRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<VBookRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<VBookRecord, Integer> ID = new TableFieldImpl<VBookRecord, Integer>(SQLDialect.SQLITE, "ID", SQLiteDataType.INT, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<VBookRecord, Integer> AUTHOR_ID = new TableFieldImpl<VBookRecord, Integer>(SQLDialect.SQLITE, "AUTHOR_ID", SQLiteDataType.INT, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<VBookRecord, Integer> CO_AUTHOR_ID = new TableFieldImpl<VBookRecord, Integer>(SQLDialect.SQLITE, "co_author_id", SQLiteDataType.INTEGER, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<VBookRecord, Integer> DETAILS_ID = new TableFieldImpl<VBookRecord, Integer>(SQLDialect.SQLITE, "DETAILS_ID", SQLiteDataType.INT, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<VBookRecord, String> TITLE = new TableFieldImpl<VBookRecord, String>(SQLDialect.SQLITE, "TITLE", SQLiteDataType.VARCHAR, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<VBookRecord, Integer> PUBLISHED_IN = new TableFieldImpl<VBookRecord, Integer>(SQLDialect.SQLITE, "PUBLISHED_IN", SQLiteDataType.INT, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<VBookRecord, Integer> LANGUAGE_ID = new TableFieldImpl<VBookRecord, Integer>(SQLDialect.SQLITE, "LANGUAGE_ID", SQLiteDataType.INT, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<VBookRecord, String> CONTENT_TEXT = new TableFieldImpl<VBookRecord, String>(SQLDialect.SQLITE, "CONTENT_TEXT", SQLiteDataType.LONGVARCHAR, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<VBookRecord, byte[]> CONTENT_PDF = new TableFieldImpl<VBookRecord, byte[]>(SQLDialect.SQLITE, "CONTENT_PDF", SQLiteDataType.LONGVARBINARY, V_BOOK);

	/**
	 * No further instances allowed
	 */
	private VBook() {
		super(SQLDialect.SQLITE, "v_book");
	}
}
