package com.path.dbmaps.vo;

import java.math.BigDecimal;

public class TRSDEALCONTRIBVO extends TRSDEALCONTRIBVOKey {
    /**
     * This field corresponds to the database column TRSDEALCONTRIB.CIF
     */
    private BigDecimal CIF;

    /**
     * This field corresponds to the database column TRSDEALCONTRIB.TRADE_REF_NO
     */
    private BigDecimal TRADE_REF_NO;

    /**
     * This field corresponds to the database column TRSDEALCONTRIB.CIF_AMOUNT
     */
    private BigDecimal CIF_AMOUNT;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSDEALCONTRIB.CIF
     *
     * @return the value of TRSDEALCONTRIB.CIF
     */
    public BigDecimal getCIF() {
        return CIF;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSDEALCONTRIB.CIF
     *
     * @param CIF the value for TRSDEALCONTRIB.CIF
     */
    public void setCIF(BigDecimal CIF) {
        this.CIF = CIF;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSDEALCONTRIB.TRADE_REF_NO
     *
     * @return the value of TRSDEALCONTRIB.TRADE_REF_NO
     */
    public BigDecimal getTRADE_REF_NO() {
        return TRADE_REF_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSDEALCONTRIB.TRADE_REF_NO
     *
     * @param TRADE_REF_NO the value for TRSDEALCONTRIB.TRADE_REF_NO
     */
    public void setTRADE_REF_NO(BigDecimal TRADE_REF_NO) {
        this.TRADE_REF_NO = TRADE_REF_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSDEALCONTRIB.CIF_AMOUNT
     *
     * @return the value of TRSDEALCONTRIB.CIF_AMOUNT
     */
    public BigDecimal getCIF_AMOUNT() {
        return CIF_AMOUNT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSDEALCONTRIB.CIF_AMOUNT
     *
     * @param CIF_AMOUNT the value for TRSDEALCONTRIB.CIF_AMOUNT
     */
    public void setCIF_AMOUNT(BigDecimal CIF_AMOUNT) {
        this.CIF_AMOUNT = CIF_AMOUNT;
    }
}