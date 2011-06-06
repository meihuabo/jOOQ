/**
 * This class is generated by jOOQ
 */
package org.jooq.test.derby.generatedclasses.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.derby.generatedclasses.Keys;
import org.jooq.test.derby.generatedclasses.Test;
import org.jooq.test.derby.generatedclasses.tables.records.TBookToBookStoreRecord;
import org.jooq.util.derby.DerbyDataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TBookToBookStore extends UpdatableTableImpl<TBookToBookStoreRecord> {

	private static final long serialVersionUID = 459127684;

	/**
	 * The singleton instance of T_BOOK_TO_BOOK_STORE
	 */
	public static final TBookToBookStore T_BOOK_TO_BOOK_STORE = new TBookToBookStore();

	/**
	 * The class holding records for this type
	 */
	private static final Class<TBookToBookStoreRecord> __RECORD_TYPE = TBookToBookStoreRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TBookToBookStoreRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TEST.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME]
	 * REFERENCES T_BOOK_STORE [TEST.T_BOOK_STORE.NAME]
	 * </pre></code>
	 */
	public static final TableField<TBookToBookStoreRecord, String> BOOK_STORE_NAME = new TableFieldImpl<TBookToBookStoreRecord, String>(SQLDialect.DERBY, "BOOK_STORE_NAME", DerbyDataType.VARCHAR, T_BOOK_TO_BOOK_STORE);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TEST.T_BOOK_TO_BOOK_STORE.BOOK_ID]
	 * REFERENCES T_BOOK [TEST.T_BOOK.ID]
	 * </pre></code>
	 */
	public static final TableField<TBookToBookStoreRecord, Integer> BOOK_ID = new TableFieldImpl<TBookToBookStoreRecord, Integer>(SQLDialect.DERBY, "BOOK_ID", DerbyDataType.INTEGER, T_BOOK_TO_BOOK_STORE);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookToBookStoreRecord, Integer> STOCK = new TableFieldImpl<TBookToBookStoreRecord, Integer>(SQLDialect.DERBY, "STOCK", DerbyDataType.INTEGER, T_BOOK_TO_BOOK_STORE);

	/**
	 * No further instances allowed
	 */
	private TBookToBookStore() {
		super(SQLDialect.DERBY, "T_BOOK_TO_BOOK_STORE", Test.TEST);
	}

	@Override
	public UniqueKey<TBookToBookStoreRecord> getMainKey() {
		return Keys.PK_B2BS;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<UniqueKey<TBookToBookStoreRecord>> getKeys() {
		return Arrays.<UniqueKey<TBookToBookStoreRecord>>asList(Keys.PK_B2BS);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<ForeignKey<TBookToBookStoreRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<TBookToBookStoreRecord, ?>>asList(Keys.FK_B2BS_BS_NAME, Keys.FK_B2BS_B_ID);
	}
}
