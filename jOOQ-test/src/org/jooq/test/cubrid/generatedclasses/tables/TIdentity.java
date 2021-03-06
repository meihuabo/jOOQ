/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TIdentity extends org.jooq.impl.TableImpl<org.jooq.test.cubrid.generatedclasses.tables.records.TIdentityRecord> {

	private static final long serialVersionUID = -264088738;

	/**
	 * The singleton instance of <code>t_identity</code>
	 */
	public static final org.jooq.test.cubrid.generatedclasses.tables.TIdentity T_IDENTITY = new org.jooq.test.cubrid.generatedclasses.tables.TIdentity();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.cubrid.generatedclasses.tables.records.TIdentityRecord> getRecordType() {
		return org.jooq.test.cubrid.generatedclasses.tables.records.TIdentityRecord.class;
	}

	/**
	 * The column <code>t_identity.id</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), T_IDENTITY, "");

	/**
	 * The column <code>t_identity.val</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> VAL = createField("val", org.jooq.impl.SQLDataType.INTEGER, T_IDENTITY, "");

	/**
	 * No further instances allowed
	 */
	private TIdentity() {
		this("t_identity", null);
	}

	private TIdentity(java.lang.String alias, org.jooq.Table<org.jooq.test.cubrid.generatedclasses.tables.records.TIdentityRecord> aliased) {
		this(alias, aliased, null);
	}

	private TIdentity(java.lang.String alias, org.jooq.Table<org.jooq.test.cubrid.generatedclasses.tables.records.TIdentityRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.cubrid.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.test.cubrid.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> getIdentity() {
		return org.jooq.test.cubrid.generatedclasses.Keys.IDENTITY_T_IDENTITY;
	}
}
