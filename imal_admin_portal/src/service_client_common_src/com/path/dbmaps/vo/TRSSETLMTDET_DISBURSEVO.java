package com.path.dbmaps.vo;

import java.math.BigDecimal;

public class TRSSETLMTDET_DISBURSEVO extends TRSSETLMTDET_DISBURSEVOKey {
    /**
     * This field corresponds to the database column TRSSETLMTDET_DISBURSE.SETTLEMENT_AMOUNT
     */
    private BigDecimal SETTLEMENT_AMOUNT;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSSETLMTDET_DISBURSE.SETTLEMENT_AMOUNT
     *
     * @return the value of TRSSETLMTDET_DISBURSE.SETTLEMENT_AMOUNT
     */
    public BigDecimal getSETTLEMENT_AMOUNT() {
        return SETTLEMENT_AMOUNT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSSETLMTDET_DISBURSE.SETTLEMENT_AMOUNT
     *
     * @param SETTLEMENT_AMOUNT the value for TRSSETLMTDET_DISBURSE.SETTLEMENT_AMOUNT
     */
    public void setSETTLEMENT_AMOUNT(BigDecimal SETTLEMENT_AMOUNT) {
        this.SETTLEMENT_AMOUNT = SETTLEMENT_AMOUNT;
    }
}