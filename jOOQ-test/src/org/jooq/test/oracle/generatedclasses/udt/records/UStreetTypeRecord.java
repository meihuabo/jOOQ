/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.udt.records;


import javax.annotation.Generated;

import org.jooq.impl.UDTRecordImpl;
import org.jooq.test.oracle.generatedclasses.udt.UStreetType;
import org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class UStreetTypeRecord extends UDTRecordImpl<UStreetTypeRecord> {

	private static final long serialVersionUID = -1376810007;


	/**
	 * An uncommented item
	 */
	public void setStreet(String value) {
		setValue(UStreetType.STREET, value);
	}

	/**
	 * An uncommented item
	 */
	public String getStreet() {
		return getValue(UStreetType.STREET);
	}

	/**
	 * An uncommented item
	 */
	public void setNo(String value) {
		setValue(UStreetType.NO, value);
	}

	/**
	 * An uncommented item
	 */
	public String getNo() {
		return getValue(UStreetType.NO);
	}

	/**
	 * An uncommented item
	 */
	public void setFloors(UNumberArrayRecord value) {
		setValue(UStreetType.FLOORS, value);
	}

	/**
	 * An uncommented item
	 */
	public UNumberArrayRecord getFloors() {
		return getValue(UStreetType.FLOORS);
	}

	public UStreetTypeRecord() {
		super(UStreetType.U_STREET_TYPE);
	}
}
