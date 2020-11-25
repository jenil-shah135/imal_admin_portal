package com.path.dbmaps.vo;

import java.math.BigDecimal;

public class TRSDEAL_PENALTYVO extends TRSDEAL_PENALTYVOKey {
    /**
     * This field corresponds to the database column TRSDEAL_PENALTY.PER_INSTANCE_AMOUNT
     */
    private BigDecimal PER_INSTANCE_AMOUNT;

    /**
     * This field corresponds to the database column TRSDEAL_PENALTY.PER_INSTANCE_TYPE
     */
    private String PER_INSTANCE_TYPE;

    /**
     * This field corresponds to the database column TRSDEAL_PENALTY.PER_INSTANCE_NUMBER
     */
    private BigDecimal PER_INSTANCE_NUMBER;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSDEAL_PENALTY.PER_INSTANCE_AMOUNT
     *
     * @return the value of TRSDEAL_PENALTY.PER_INSTANCE_AMOUNT
     */
    public BigDecimal getPER_INSTANCE_AMOUNT() {
        return PER_INSTANCE_AMOUNT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSDEAL_PENALTY.PER_INSTANCE_AMOUNT
     *
     * @param PER_INSTANCE_AMOUNT the value for TRSDEAL_PENALTY.PER_INSTANCE_AMOUNT
     */
    public void setPER_INSTANCE_AMOUNT(BigDecimal PER_INSTANCE_AMOUNT) {
        this.PER_INSTANCE_AMOUNT = PER_INSTANCE_AMOUNT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSDEAL_PENALTY.PER_INSTANCE_TYPE
     *
     * @return the value of TRSDEAL_PENALTY.PER_INSTANCE_TYPE
     */
    public String getPER_INSTANCE_TYPE() {
        return PER_INSTANCE_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSDEAL_PENALTY.PER_INSTANCE_TYPE
     *
     * @param PER_INSTANCE_TYPE the value for TRSDEAL_PENALTY.PER_INSTANCE_TYPE
     */
    public void setPER_INSTANCE_TYPE(String PER_INSTANCE_TYPE) {
        this.PER_INSTANCE_TYPE = PER_INSTANCE_TYPE == null ? null : PER_INSTANCE_TYPE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSDEAL_PENALTY.PER_INSTANCE_NUMBER
     *
     * @return the value of TRSDEAL_PENALTY.PER_INSTANCE_NUMBER
     */
    public BigDecimal getPER_INSTANCE_NUMBER() {
        return PER_INSTANCE_NUMBER;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSDEAL_PENALTY.PER_INSTANCE_NUMBER
     *
     * @param PER_INSTANCE_NUMBER the value for TRSDEAL_PENALTY.PER_INSTANCE_NUMBER
     */
    public void setPER_INSTANCE_NUMBER(BigDecimal PER_INSTANCE_NUMBER) {
        this.PER_INSTANCE_NUMBER = PER_INSTANCE_NUMBER;
    }
}