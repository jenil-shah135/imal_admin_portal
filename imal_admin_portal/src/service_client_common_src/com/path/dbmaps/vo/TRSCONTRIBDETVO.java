package com.path.dbmaps.vo;

import java.math.BigDecimal;

public class TRSCONTRIBDETVO extends TRSCONTRIBDETVOKey {
    /**
     * This field corresponds to the database column TRSCONTRIBDET.LIMIT
     */
    private BigDecimal LIMIT;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSCONTRIBDET.LIMIT
     *
     * @return the value of TRSCONTRIBDET.LIMIT
     */
    public BigDecimal getLIMIT() {
        return LIMIT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSCONTRIBDET.LIMIT
     *
     * @param LIMIT the value for TRSCONTRIBDET.LIMIT
     */
    public void setLIMIT(BigDecimal LIMIT) {
        this.LIMIT = LIMIT;
    }
}