/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.h2.generatedclasses.Keys;
import org.jooq.test.h2.generatedclasses.Public;
import org.jooq.test.h2.generatedclasses.tables.records.TArraysRecord;
import org.jooq.util.h2.H2DataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TArrays extends UpdatableTableImpl<TArraysRecord> {

	private static final long serialVersionUID = -1372163613;

	/**
	 * The singleton instance of T_ARRAYS
	 */
	public static final TArrays T_ARRAYS = new TArrays();

	/**
	 * The class holding records for this type
	 */
	private static final Class<TArraysRecord> __RECORD_TYPE = TArraysRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TArraysRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<TArraysRecord, Integer> ID = new TableFieldImpl<TArraysRecord, Integer>(SQLDialect.H2, "ID", H2DataType.INTEGER, T_ARRAYS);

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (ARRAY) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final TableField<TArraysRecord, Object[]> STRING_ARRAY = new TableFieldImpl<TArraysRecord, Object[]>(SQLDialect.H2, "STRING_ARRAY", H2DataType.OTHER.getArrayDataType(), T_ARRAYS);

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (ARRAY) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final TableField<TArraysRecord, Object[]> NUMBER_ARRAY = new TableFieldImpl<TArraysRecord, Object[]>(SQLDialect.H2, "NUMBER_ARRAY", H2DataType.OTHER.getArrayDataType(), T_ARRAYS);

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (ARRAY) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final TableField<TArraysRecord, Object[]> DATE_ARRAY = new TableFieldImpl<TArraysRecord, Object[]>(SQLDialect.H2, "DATE_ARRAY", H2DataType.OTHER.getArrayDataType(), T_ARRAYS);

	/**
	 * No further instances allowed
	 */
	private TArrays() {
		super(SQLDialect.H2, "T_ARRAYS", Public.PUBLIC);
	}

	@Override
	public UniqueKey<TArraysRecord> getMainKey() {
		return Keys.PK_T_ARRAYS;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<UniqueKey<TArraysRecord>> getKeys() {
		return Arrays.<UniqueKey<TArraysRecord>>asList(Keys.PK_T_ARRAYS);
	}
}
