package com.path.dbmaps.vo;

import java.math.BigDecimal;
import java.util.Date;

public class SWIFT_CUT_OFFVO extends SWIFT_CUT_OFFVOKey {
    /**
     * This field corresponds to the database column SWIFT_CUT_OFF.CUTOFF_DATE
     */
    private Date CUTOFF_DATE;

    /**
     * This field corresponds to the database column SWIFT_CUT_OFF.BEFORE_CUTOFF
     */
    private BigDecimal BEFORE_CUTOFF;

    /**
     * This field corresponds to the database column SWIFT_CUT_OFF.AFTER_CUTOFF
     */
    private BigDecimal AFTER_CUTOFF;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_CUT_OFF.CUTOFF_DATE
     *
     * @return the value of SWIFT_CUT_OFF.CUTOFF_DATE
     */
    public Date getCUTOFF_DATE() {
        return CUTOFF_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_CUT_OFF.CUTOFF_DATE
     *
     * @param CUTOFF_DATE the value for SWIFT_CUT_OFF.CUTOFF_DATE
     */
    public void setCUTOFF_DATE(Date CUTOFF_DATE) {
        this.CUTOFF_DATE = CUTOFF_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_CUT_OFF.BEFORE_CUTOFF
     *
     * @return the value of SWIFT_CUT_OFF.BEFORE_CUTOFF
     */
    public BigDecimal getBEFORE_CUTOFF() {
        return BEFORE_CUTOFF;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_CUT_OFF.BEFORE_CUTOFF
     *
     * @param BEFORE_CUTOFF the value for SWIFT_CUT_OFF.BEFORE_CUTOFF
     */
    public void setBEFORE_CUTOFF(BigDecimal BEFORE_CUTOFF) {
        this.BEFORE_CUTOFF = BEFORE_CUTOFF;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_CUT_OFF.AFTER_CUTOFF
     *
     * @return the value of SWIFT_CUT_OFF.AFTER_CUTOFF
     */
    public BigDecimal getAFTER_CUTOFF() {
        return AFTER_CUTOFF;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_CUT_OFF.AFTER_CUTOFF
     *
     * @param AFTER_CUTOFF the value for SWIFT_CUT_OFF.AFTER_CUTOFF
     */
    public void setAFTER_CUTOFF(BigDecimal AFTER_CUTOFF) {
        this.AFTER_CUTOFF = AFTER_CUTOFF;
    }
}