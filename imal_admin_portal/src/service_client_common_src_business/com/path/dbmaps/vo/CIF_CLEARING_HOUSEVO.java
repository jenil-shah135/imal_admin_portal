package com.path.dbmaps.vo;

import java.math.BigDecimal;

public class CIF_CLEARING_HOUSEVO extends CIF_CLEARING_HOUSEVOKey {
    /**
     * This field corresponds to the database column CIF_CLEARING_HOUSE.CLEARING_HOUSE
     */
    private BigDecimal CLEARING_HOUSE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CIF_CLEARING_HOUSE.CLEARING_HOUSE
     *
     * @return the value of CIF_CLEARING_HOUSE.CLEARING_HOUSE
     */
    public BigDecimal getCLEARING_HOUSE() {
        return CLEARING_HOUSE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CIF_CLEARING_HOUSE.CLEARING_HOUSE
     *
     * @param CLEARING_HOUSE the value for CIF_CLEARING_HOUSE.CLEARING_HOUSE
     */
    public void setCLEARING_HOUSE(BigDecimal CLEARING_HOUSE) {
        this.CLEARING_HOUSE = CLEARING_HOUSE;
    }
}