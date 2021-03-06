package com.path.dbmaps.vo;

import java.math.BigDecimal;

public class FMSAPPL_YIELD_PERIOD_DETVO extends FMSAPPL_YIELD_PERIOD_DETVOKey {
    /**
     * This field corresponds to the database column FMSAPPL_YIELD_PERIOD_DET.NO_OF_PAYMENTS
     */
    private BigDecimal NO_OF_PAYMENTS;

    /**
     * This field corresponds to the database column FMSAPPL_YIELD_PERIOD_DET.YIELD
     */
    private BigDecimal YIELD;

    /**
     * This field corresponds to the database column FMSAPPL_YIELD_PERIOD_DET.PAYM_PERIOD_NBR
     */
    private BigDecimal PAYM_PERIOD_NBR;

    /**
     * This field corresponds to the database column FMSAPPL_YIELD_PERIOD_DET.PAYM_PERIODICITY
     */
    private String PAYM_PERIODICITY;

    /**
     * This field corresponds to the database column FMSAPPL_YIELD_PERIOD_DET.GRACE_PERIOD
     */
    private BigDecimal GRACE_PERIOD;

    /**
     * This field corresponds to the database column FMSAPPL_YIELD_PERIOD_DET.GRACE_PERIODICITY
     */
    private String GRACE_PERIODICITY;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSAPPL_YIELD_PERIOD_DET.NO_OF_PAYMENTS
     *
     * @return the value of FMSAPPL_YIELD_PERIOD_DET.NO_OF_PAYMENTS
     */
    public BigDecimal getNO_OF_PAYMENTS() {
        return NO_OF_PAYMENTS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSAPPL_YIELD_PERIOD_DET.NO_OF_PAYMENTS
     *
     * @param NO_OF_PAYMENTS the value for FMSAPPL_YIELD_PERIOD_DET.NO_OF_PAYMENTS
     */
    public void setNO_OF_PAYMENTS(BigDecimal NO_OF_PAYMENTS) {
        this.NO_OF_PAYMENTS = NO_OF_PAYMENTS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSAPPL_YIELD_PERIOD_DET.YIELD
     *
     * @return the value of FMSAPPL_YIELD_PERIOD_DET.YIELD
     */
    public BigDecimal getYIELD() {
        return YIELD;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSAPPL_YIELD_PERIOD_DET.YIELD
     *
     * @param YIELD the value for FMSAPPL_YIELD_PERIOD_DET.YIELD
     */
    public void setYIELD(BigDecimal YIELD) {
        this.YIELD = YIELD;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSAPPL_YIELD_PERIOD_DET.PAYM_PERIOD_NBR
     *
     * @return the value of FMSAPPL_YIELD_PERIOD_DET.PAYM_PERIOD_NBR
     */
    public BigDecimal getPAYM_PERIOD_NBR() {
        return PAYM_PERIOD_NBR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSAPPL_YIELD_PERIOD_DET.PAYM_PERIOD_NBR
     *
     * @param PAYM_PERIOD_NBR the value for FMSAPPL_YIELD_PERIOD_DET.PAYM_PERIOD_NBR
     */
    public void setPAYM_PERIOD_NBR(BigDecimal PAYM_PERIOD_NBR) {
        this.PAYM_PERIOD_NBR = PAYM_PERIOD_NBR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSAPPL_YIELD_PERIOD_DET.PAYM_PERIODICITY
     *
     * @return the value of FMSAPPL_YIELD_PERIOD_DET.PAYM_PERIODICITY
     */
    public String getPAYM_PERIODICITY() {
        return PAYM_PERIODICITY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSAPPL_YIELD_PERIOD_DET.PAYM_PERIODICITY
     *
     * @param PAYM_PERIODICITY the value for FMSAPPL_YIELD_PERIOD_DET.PAYM_PERIODICITY
     */
    public void setPAYM_PERIODICITY(String PAYM_PERIODICITY) {
        this.PAYM_PERIODICITY = PAYM_PERIODICITY == null ? null : PAYM_PERIODICITY.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSAPPL_YIELD_PERIOD_DET.GRACE_PERIOD
     *
     * @return the value of FMSAPPL_YIELD_PERIOD_DET.GRACE_PERIOD
     */
    public BigDecimal getGRACE_PERIOD() {
        return GRACE_PERIOD;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSAPPL_YIELD_PERIOD_DET.GRACE_PERIOD
     *
     * @param GRACE_PERIOD the value for FMSAPPL_YIELD_PERIOD_DET.GRACE_PERIOD
     */
    public void setGRACE_PERIOD(BigDecimal GRACE_PERIOD) {
        this.GRACE_PERIOD = GRACE_PERIOD;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSAPPL_YIELD_PERIOD_DET.GRACE_PERIODICITY
     *
     * @return the value of FMSAPPL_YIELD_PERIOD_DET.GRACE_PERIODICITY
     */
    public String getGRACE_PERIODICITY() {
        return GRACE_PERIODICITY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSAPPL_YIELD_PERIOD_DET.GRACE_PERIODICITY
     *
     * @param GRACE_PERIODICITY the value for FMSAPPL_YIELD_PERIOD_DET.GRACE_PERIODICITY
     */
    public void setGRACE_PERIODICITY(String GRACE_PERIODICITY) {
        this.GRACE_PERIODICITY = GRACE_PERIODICITY == null ? null : GRACE_PERIODICITY.trim();
    }
}