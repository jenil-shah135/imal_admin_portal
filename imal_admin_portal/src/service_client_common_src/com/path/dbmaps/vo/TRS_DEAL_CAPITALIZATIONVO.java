package com.path.dbmaps.vo;

import java.math.BigDecimal;
import java.util.Date;

public class TRS_DEAL_CAPITALIZATIONVO extends TRS_DEAL_CAPITALIZATIONVOKey {
    /**
     * This field corresponds to the database column TRS_DEAL_CAPITALIZATION.PAYMENT_INSTRUCTION_NO
     */
    private BigDecimal PAYMENT_INSTRUCTION_NO;

    /**
     * This field corresponds to the database column TRS_DEAL_CAPITALIZATION.TRSDET_LINE_NO
     */
    private BigDecimal TRSDET_LINE_NO;

    /**
     * This field corresponds to the database column TRS_DEAL_CAPITALIZATION.TRS_TYPE
     */
    private String TRS_TYPE;

    /**
     * This field corresponds to the database column TRS_DEAL_CAPITALIZATION.DEAL_VALUE_DATE
     */
    private Date DEAL_VALUE_DATE;

    /**
     * This field corresponds to the database column TRS_DEAL_CAPITALIZATION.DEAL_MATURITY_DATE
     */
    private Date DEAL_MATURITY_DATE;

    /**
     * This field corresponds to the database column TRS_DEAL_CAPITALIZATION.VALUE_DATE
     */
    private Date VALUE_DATE;

    /**
     * This field corresponds to the database column TRS_DEAL_CAPITALIZATION.REVENUE
     */
    private BigDecimal REVENUE;

    /**
     * This field corresponds to the database column TRS_DEAL_CAPITALIZATION.CLIENT_REVENUE
     */
    private BigDecimal CLIENT_REVENUE;

    /**
     * This field corresponds to the database column TRS_DEAL_CAPITALIZATION.MODARIB_PROFIT
     */
    private BigDecimal MODARIB_PROFIT;

    /**
     * This field corresponds to the database column TRS_DEAL_CAPITALIZATION.CURRENCY_RATE
     */
    private BigDecimal CURRENCY_RATE;

    /**
     * This field corresponds to the database column TRS_DEAL_CAPITALIZATION.OUTSTANDING_AMOUNT
     */
    private BigDecimal OUTSTANDING_AMOUNT;

    /**
     * This field corresponds to the database column TRS_DEAL_CAPITALIZATION.YIELD
     */
    private BigDecimal YIELD;

    /**
     * This field corresponds to the database column TRS_DEAL_CAPITALIZATION.CAPITALIZED_YN
     */
    private String CAPITALIZED_YN;

    /**
     * This field corresponds to the database column TRS_DEAL_CAPITALIZATION.SETTLED_YN
     */
    private String SETTLED_YN;

    /**
     * This field corresponds to the database column TRS_DEAL_CAPITALIZATION.SETTLED_PRINCIPAL
     */
    private BigDecimal SETTLED_PRINCIPAL;

    /**
     * This field corresponds to the database column TRS_DEAL_CAPITALIZATION.SETTLED_PROFIT
     */
    private BigDecimal SETTLED_PROFIT;

    /**
     * This field corresponds to the database column TRS_DEAL_CAPITALIZATION.NEW_OUTSTANDING_AMOUNT
     */
    private BigDecimal NEW_OUTSTANDING_AMOUNT;

    /**
     * This field corresponds to the database column TRS_DEAL_CAPITALIZATION.SETTLEMENT_NBR
     */
    private BigDecimal SETTLEMENT_NBR;

    /**
     * This field corresponds to the database column TRS_DEAL_CAPITALIZATION.CREATED_BY
     */
    private String CREATED_BY;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_DEAL_CAPITALIZATION.PAYMENT_INSTRUCTION_NO
     *
     * @return the value of TRS_DEAL_CAPITALIZATION.PAYMENT_INSTRUCTION_NO
     */
    public BigDecimal getPAYMENT_INSTRUCTION_NO() {
        return PAYMENT_INSTRUCTION_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_DEAL_CAPITALIZATION.PAYMENT_INSTRUCTION_NO
     *
     * @param PAYMENT_INSTRUCTION_NO the value for TRS_DEAL_CAPITALIZATION.PAYMENT_INSTRUCTION_NO
     */
    public void setPAYMENT_INSTRUCTION_NO(BigDecimal PAYMENT_INSTRUCTION_NO) {
        this.PAYMENT_INSTRUCTION_NO = PAYMENT_INSTRUCTION_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_DEAL_CAPITALIZATION.TRSDET_LINE_NO
     *
     * @return the value of TRS_DEAL_CAPITALIZATION.TRSDET_LINE_NO
     */
    public BigDecimal getTRSDET_LINE_NO() {
        return TRSDET_LINE_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_DEAL_CAPITALIZATION.TRSDET_LINE_NO
     *
     * @param TRSDET_LINE_NO the value for TRS_DEAL_CAPITALIZATION.TRSDET_LINE_NO
     */
    public void setTRSDET_LINE_NO(BigDecimal TRSDET_LINE_NO) {
        this.TRSDET_LINE_NO = TRSDET_LINE_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_DEAL_CAPITALIZATION.TRS_TYPE
     *
     * @return the value of TRS_DEAL_CAPITALIZATION.TRS_TYPE
     */
    public String getTRS_TYPE() {
        return TRS_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_DEAL_CAPITALIZATION.TRS_TYPE
     *
     * @param TRS_TYPE the value for TRS_DEAL_CAPITALIZATION.TRS_TYPE
     */
    public void setTRS_TYPE(String TRS_TYPE) {
        this.TRS_TYPE = TRS_TYPE == null ? null : TRS_TYPE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_DEAL_CAPITALIZATION.DEAL_VALUE_DATE
     *
     * @return the value of TRS_DEAL_CAPITALIZATION.DEAL_VALUE_DATE
     */
    public Date getDEAL_VALUE_DATE() {
        return DEAL_VALUE_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_DEAL_CAPITALIZATION.DEAL_VALUE_DATE
     *
     * @param DEAL_VALUE_DATE the value for TRS_DEAL_CAPITALIZATION.DEAL_VALUE_DATE
     */
    public void setDEAL_VALUE_DATE(Date DEAL_VALUE_DATE) {
        this.DEAL_VALUE_DATE = DEAL_VALUE_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_DEAL_CAPITALIZATION.DEAL_MATURITY_DATE
     *
     * @return the value of TRS_DEAL_CAPITALIZATION.DEAL_MATURITY_DATE
     */
    public Date getDEAL_MATURITY_DATE() {
        return DEAL_MATURITY_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_DEAL_CAPITALIZATION.DEAL_MATURITY_DATE
     *
     * @param DEAL_MATURITY_DATE the value for TRS_DEAL_CAPITALIZATION.DEAL_MATURITY_DATE
     */
    public void setDEAL_MATURITY_DATE(Date DEAL_MATURITY_DATE) {
        this.DEAL_MATURITY_DATE = DEAL_MATURITY_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_DEAL_CAPITALIZATION.VALUE_DATE
     *
     * @return the value of TRS_DEAL_CAPITALIZATION.VALUE_DATE
     */
    public Date getVALUE_DATE() {
        return VALUE_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_DEAL_CAPITALIZATION.VALUE_DATE
     *
     * @param VALUE_DATE the value for TRS_DEAL_CAPITALIZATION.VALUE_DATE
     */
    public void setVALUE_DATE(Date VALUE_DATE) {
        this.VALUE_DATE = VALUE_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_DEAL_CAPITALIZATION.REVENUE
     *
     * @return the value of TRS_DEAL_CAPITALIZATION.REVENUE
     */
    public BigDecimal getREVENUE() {
        return REVENUE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_DEAL_CAPITALIZATION.REVENUE
     *
     * @param REVENUE the value for TRS_DEAL_CAPITALIZATION.REVENUE
     */
    public void setREVENUE(BigDecimal REVENUE) {
        this.REVENUE = REVENUE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_DEAL_CAPITALIZATION.CLIENT_REVENUE
     *
     * @return the value of TRS_DEAL_CAPITALIZATION.CLIENT_REVENUE
     */
    public BigDecimal getCLIENT_REVENUE() {
        return CLIENT_REVENUE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_DEAL_CAPITALIZATION.CLIENT_REVENUE
     *
     * @param CLIENT_REVENUE the value for TRS_DEAL_CAPITALIZATION.CLIENT_REVENUE
     */
    public void setCLIENT_REVENUE(BigDecimal CLIENT_REVENUE) {
        this.CLIENT_REVENUE = CLIENT_REVENUE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_DEAL_CAPITALIZATION.MODARIB_PROFIT
     *
     * @return the value of TRS_DEAL_CAPITALIZATION.MODARIB_PROFIT
     */
    public BigDecimal getMODARIB_PROFIT() {
        return MODARIB_PROFIT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_DEAL_CAPITALIZATION.MODARIB_PROFIT
     *
     * @param MODARIB_PROFIT the value for TRS_DEAL_CAPITALIZATION.MODARIB_PROFIT
     */
    public void setMODARIB_PROFIT(BigDecimal MODARIB_PROFIT) {
        this.MODARIB_PROFIT = MODARIB_PROFIT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_DEAL_CAPITALIZATION.CURRENCY_RATE
     *
     * @return the value of TRS_DEAL_CAPITALIZATION.CURRENCY_RATE
     */
    public BigDecimal getCURRENCY_RATE() {
        return CURRENCY_RATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_DEAL_CAPITALIZATION.CURRENCY_RATE
     *
     * @param CURRENCY_RATE the value for TRS_DEAL_CAPITALIZATION.CURRENCY_RATE
     */
    public void setCURRENCY_RATE(BigDecimal CURRENCY_RATE) {
        this.CURRENCY_RATE = CURRENCY_RATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_DEAL_CAPITALIZATION.OUTSTANDING_AMOUNT
     *
     * @return the value of TRS_DEAL_CAPITALIZATION.OUTSTANDING_AMOUNT
     */
    public BigDecimal getOUTSTANDING_AMOUNT() {
        return OUTSTANDING_AMOUNT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_DEAL_CAPITALIZATION.OUTSTANDING_AMOUNT
     *
     * @param OUTSTANDING_AMOUNT the value for TRS_DEAL_CAPITALIZATION.OUTSTANDING_AMOUNT
     */
    public void setOUTSTANDING_AMOUNT(BigDecimal OUTSTANDING_AMOUNT) {
        this.OUTSTANDING_AMOUNT = OUTSTANDING_AMOUNT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_DEAL_CAPITALIZATION.YIELD
     *
     * @return the value of TRS_DEAL_CAPITALIZATION.YIELD
     */
    public BigDecimal getYIELD() {
        return YIELD;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_DEAL_CAPITALIZATION.YIELD
     *
     * @param YIELD the value for TRS_DEAL_CAPITALIZATION.YIELD
     */
    public void setYIELD(BigDecimal YIELD) {
        this.YIELD = YIELD;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_DEAL_CAPITALIZATION.CAPITALIZED_YN
     *
     * @return the value of TRS_DEAL_CAPITALIZATION.CAPITALIZED_YN
     */
    public String getCAPITALIZED_YN() {
        return CAPITALIZED_YN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_DEAL_CAPITALIZATION.CAPITALIZED_YN
     *
     * @param CAPITALIZED_YN the value for TRS_DEAL_CAPITALIZATION.CAPITALIZED_YN
     */
    public void setCAPITALIZED_YN(String CAPITALIZED_YN) {
        this.CAPITALIZED_YN = CAPITALIZED_YN == null ? null : CAPITALIZED_YN.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_DEAL_CAPITALIZATION.SETTLED_YN
     *
     * @return the value of TRS_DEAL_CAPITALIZATION.SETTLED_YN
     */
    public String getSETTLED_YN() {
        return SETTLED_YN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_DEAL_CAPITALIZATION.SETTLED_YN
     *
     * @param SETTLED_YN the value for TRS_DEAL_CAPITALIZATION.SETTLED_YN
     */
    public void setSETTLED_YN(String SETTLED_YN) {
        this.SETTLED_YN = SETTLED_YN == null ? null : SETTLED_YN.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_DEAL_CAPITALIZATION.SETTLED_PRINCIPAL
     *
     * @return the value of TRS_DEAL_CAPITALIZATION.SETTLED_PRINCIPAL
     */
    public BigDecimal getSETTLED_PRINCIPAL() {
        return SETTLED_PRINCIPAL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_DEAL_CAPITALIZATION.SETTLED_PRINCIPAL
     *
     * @param SETTLED_PRINCIPAL the value for TRS_DEAL_CAPITALIZATION.SETTLED_PRINCIPAL
     */
    public void setSETTLED_PRINCIPAL(BigDecimal SETTLED_PRINCIPAL) {
        this.SETTLED_PRINCIPAL = SETTLED_PRINCIPAL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_DEAL_CAPITALIZATION.SETTLED_PROFIT
     *
     * @return the value of TRS_DEAL_CAPITALIZATION.SETTLED_PROFIT
     */
    public BigDecimal getSETTLED_PROFIT() {
        return SETTLED_PROFIT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_DEAL_CAPITALIZATION.SETTLED_PROFIT
     *
     * @param SETTLED_PROFIT the value for TRS_DEAL_CAPITALIZATION.SETTLED_PROFIT
     */
    public void setSETTLED_PROFIT(BigDecimal SETTLED_PROFIT) {
        this.SETTLED_PROFIT = SETTLED_PROFIT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_DEAL_CAPITALIZATION.NEW_OUTSTANDING_AMOUNT
     *
     * @return the value of TRS_DEAL_CAPITALIZATION.NEW_OUTSTANDING_AMOUNT
     */
    public BigDecimal getNEW_OUTSTANDING_AMOUNT() {
        return NEW_OUTSTANDING_AMOUNT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_DEAL_CAPITALIZATION.NEW_OUTSTANDING_AMOUNT
     *
     * @param NEW_OUTSTANDING_AMOUNT the value for TRS_DEAL_CAPITALIZATION.NEW_OUTSTANDING_AMOUNT
     */
    public void setNEW_OUTSTANDING_AMOUNT(BigDecimal NEW_OUTSTANDING_AMOUNT) {
        this.NEW_OUTSTANDING_AMOUNT = NEW_OUTSTANDING_AMOUNT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_DEAL_CAPITALIZATION.SETTLEMENT_NBR
     *
     * @return the value of TRS_DEAL_CAPITALIZATION.SETTLEMENT_NBR
     */
    public BigDecimal getSETTLEMENT_NBR() {
        return SETTLEMENT_NBR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_DEAL_CAPITALIZATION.SETTLEMENT_NBR
     *
     * @param SETTLEMENT_NBR the value for TRS_DEAL_CAPITALIZATION.SETTLEMENT_NBR
     */
    public void setSETTLEMENT_NBR(BigDecimal SETTLEMENT_NBR) {
        this.SETTLEMENT_NBR = SETTLEMENT_NBR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_DEAL_CAPITALIZATION.CREATED_BY
     *
     * @return the value of TRS_DEAL_CAPITALIZATION.CREATED_BY
     */
    public String getCREATED_BY() {
        return CREATED_BY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_DEAL_CAPITALIZATION.CREATED_BY
     *
     * @param CREATED_BY the value for TRS_DEAL_CAPITALIZATION.CREATED_BY
     */
    public void setCREATED_BY(String CREATED_BY) {
        this.CREATED_BY = CREATED_BY == null ? null : CREATED_BY.trim();
    }
}