/*
 * This file is generated by jOOQ.
*/
package project.pilot.jooq.model;


import javax.annotation.Generated;

import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;

import project.pilot.jooq.model.tables.CarAdvertise;
import project.pilot.jooq.model.tables.Dealer;
import project.pilot.jooq.model.tables.records.CarAdvertiseRecord;
import project.pilot.jooq.model.tables.records.DealerRecord;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>pilot</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CarAdvertiseRecord> KEY_CAR_ADVERTISE_PRIMARY = UniqueKeys0.KEY_CAR_ADVERTISE_PRIMARY;
    public static final UniqueKey<DealerRecord> KEY_DEALER_PRIMARY = UniqueKeys0.KEY_DEALER_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<CarAdvertiseRecord> KEY_CAR_ADVERTISE_PRIMARY = createUniqueKey(CarAdvertise.CAR_ADVERTISE, "KEY_car_advertise_PRIMARY", CarAdvertise.CAR_ADVERTISE.CAR_NO);
        public static final UniqueKey<DealerRecord> KEY_DEALER_PRIMARY = createUniqueKey(Dealer.DEALER, "KEY_dealer_PRIMARY", Dealer.DEALER.DEALER_ID);
    }
}