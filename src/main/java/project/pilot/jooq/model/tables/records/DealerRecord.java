/*
 * This file is generated by jOOQ.
*/
package project.pilot.jooq.model.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import project.pilot.jooq.model.tables.Dealer;


/**
 * 딜러
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DealerRecord extends UpdatableRecordImpl<DealerRecord> implements Record5<String, String, String, Date, Date> {

    private static final long serialVersionUID = 319124355;

    /**
     * Setter for <code>pilot.dealer.DEALER_ID</code>. 딜러ID
     */
    public void setDealerId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pilot.dealer.DEALER_ID</code>. 딜러ID
     */
    public String getDealerId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pilot.dealer.DEALER_NAME</code>. 딜러명
     */
    public void setDealerName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pilot.dealer.DEALER_NAME</code>. 딜러명
     */
    public String getDealerName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pilot.dealer.SHOP_ID</code>. 상사ID
     */
    public void setShopId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pilot.dealer.SHOP_ID</code>. 상사ID
     */
    public String getShopId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pilot.dealer.CREATE_DATE</code>.
     */
    public void setCreateDate(Date value) {
        set(3, value);
    }

    /**
     * Getter for <code>pilot.dealer.CREATE_DATE</code>.
     */
    public Date getCreateDate() {
        return (Date) get(3);
    }

    /**
     * Setter for <code>pilot.dealer.LAST_UPDATE_DATE</code>.
     */
    public void setLastUpdateDate(Date value) {
        set(4, value);
    }

    /**
     * Getter for <code>pilot.dealer.LAST_UPDATE_DATE</code>.
     */
    public Date getLastUpdateDate() {
        return (Date) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, Date, Date> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, Date, Date> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Dealer.DEALER.DEALER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Dealer.DEALER.DEALER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Dealer.DEALER.SHOP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field4() {
        return Dealer.DEALER.CREATE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field5() {
        return Dealer.DEALER.LAST_UPDATE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getDealerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getDealerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component4() {
        return getCreateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component5() {
        return getLastUpdateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getDealerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDealerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value4() {
        return getCreateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value5() {
        return getLastUpdateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DealerRecord value1(String value) {
        setDealerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DealerRecord value2(String value) {
        setDealerName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DealerRecord value3(String value) {
        setShopId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DealerRecord value4(Date value) {
        setCreateDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DealerRecord value5(Date value) {
        setLastUpdateDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DealerRecord values(String value1, String value2, String value3, Date value4, Date value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DealerRecord
     */
    public DealerRecord() {
        super(Dealer.DEALER);
    }

    /**
     * Create a detached, initialised DealerRecord
     */
    public DealerRecord(String dealerId, String dealerName, String shopId, Date createDate, Date lastUpdateDate) {
        super(Dealer.DEALER);

        set(0, dealerId);
        set(1, dealerName);
        set(2, shopId);
        set(3, createDate);
        set(4, lastUpdateDate);
    }
}
