package com.path.dbmaps.vo;

import java.math.BigDecimal;
import java.util.Date;

public class TRS_CONTRIB_SETTLEMENT_DETVO extends TRS_CONTRIB_SETTLEMENT_DETVOKey {
    /**
     * This field corresponds to the database column TRS_CONTRIB_SETTLEMENT_DET.DEAL_NO
     */
    private BigDecimal DEAL_NO;

    /**
     * This field corresponds to the database column TRS_CONTRIB_SETTLEMENT_DET.OUTSTANDING_PRINCIPAL
     */
    private BigDecimal OUTSTANDING_PRINCIPAL;

    /**
     * This field corresponds to the database column TRS_CONTRIB_SETTLEMENT_DET.OUTSTANDING_PROFIT
     */
    private BigDecimal OUTSTANDING_PROFIT;

    /**
     * This field corresponds to the database column TRS_CONTRIB_SETTLEMENT_DET.SETTLED_YN
     */
    private String SETTLED_YN;

    /**
     * This field corresponds to the database column TRS_CONTRIB_SETTLEMENT_DET.SETTLED_PRINCIPAL
     */
    private BigDecimal SETTLED_PRINCIPAL;

    /**
     * This field corresponds to the database column TRS_CONTRIB_SETTLEMENT_DET.SETTLED_PROFIT
     */
    private BigDecimal SETTLED_PROFIT;

    /**
     * This field corresponds to the database column TRS_CONTRIB_SETTLEMENT_DET.CREATED_BY
     */
    private String CREATED_BY;

    /**
     * This field corresponds to the database column TRS_CONTRIB_SETTLEMENT_DET.CREATED_DATE
     */
    private Date CREATED_DATE;

    /**
     * This field corresponds to the database column TRS_CONTRIB_SETTLEMENT_DET.MODIFIED_BY
     */
    private String MODIFIED_BY;

    /**
     * This field corresponds to the database column TRS_CONTRIB_SETTLEMENT_DET.MODIFIED_DATE
     */
    private Date MODIFIED_DATE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_CONTRIB_SETTLEMENT_DET.DEAL_NO
     *
     * @return the value of TRS_CONTRIB_SETTLEMENT_DET.DEAL_NO
     */
    public BigDecimal getDEAL_NO() {
        return DEAL_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_CONTRIB_SETTLEMENT_DET.DEAL_NO
     *
     * @param DEAL_NO the value for TRS_CONTRIB_SETTLEMENT_DET.DEAL_NO
     */
    public void setDEAL_NO(BigDecimal DEAL_NO) {
        this.DEAL_NO = DEAL_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_CONTRIB_SETTLEMENT_DET.OUTSTANDING_PRINCIPAL
     *
     * @return the value of TRS_CONTRIB_SETTLEMENT_DET.OUTSTANDING_PRINCIPAL
     */
    public BigDecimal getOUTSTANDING_PRINCIPAL() {
        return OUTSTANDING_PRINCIPAL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_CONTRIB_SETTLEMENT_DET.OUTSTANDING_PRINCIPAL
     *
     * @param OUTSTANDING_PRINCIPAL the value for TRS_CONTRIB_SETTLEMENT_DET.OUTSTANDING_PRINCIPAL
     */
    public void setOUTSTANDING_PRINCIPAL(BigDecimal OUTSTANDING_PRINCIPAL) {
        this.OUTSTANDING_PRINCIPAL = OUTSTANDING_PRINCIPAL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_CONTRIB_SETTLEMENT_DET.OUTSTANDING_PROFIT
     *
     * @return the value of TRS_CONTRIB_SETTLEMENT_DET.OUTSTANDING_PROFIT
     */
    public BigDecimal getOUTSTANDING_PROFIT() {
        return OUTSTANDING_PROFIT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_CONTRIB_SETTLEMENT_DET.OUTSTANDING_PROFIT
     *
     * @param OUTSTANDING_PROFIT the value for TRS_CONTRIB_SETTLEMENT_DET.OUTSTANDING_PROFIT
     */
    public void setOUTSTANDING_PROFIT(BigDecimal OUTSTANDING_PROFIT) {
        this.OUTSTANDING_PROFIT = OUTSTANDING_PROFIT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_CONTRIB_SETTLEMENT_DET.SETTLED_YN
     *
     * @return the value of TRS_CONTRIB_SETTLEMENT_DET.SETTLED_YN
     */
    public String getSETTLED_YN() {
        return SETTLED_YN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_CONTRIB_SETTLEMENT_DET.SETTLED_YN
     *
     * @param SETTLED_YN the value for TRS_CONTRIB_SETTLEMENT_DET.SETTLED_YN
     */
    public void setSETTLED_YN(String SETTLED_YN) {
        this.SETTLED_YN = SETTLED_YN == null ? null : SETTLED_YN.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_CONTRIB_SETTLEMENT_DET.SETTLED_PRINCIPAL
     *
     * @return the value of TRS_CONTRIB_SETTLEMENT_DET.SETTLED_PRINCIPAL
     */
    public BigDecimal getSETTLED_PRINCIPAL() {
        return SETTLED_PRINCIPAL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_CONTRIB_SETTLEMENT_DET.SETTLED_PRINCIPAL
     *
     * @param SETTLED_PRINCIPAL the value for TRS_CONTRIB_SETTLEMENT_DET.SETTLED_PRINCIPAL
     */
    public void setSETTLED_PRINCIPAL(BigDecimal SETTLED_PRINCIPAL) {
        this.SETTLED_PRINCIPAL = SETTLED_PRINCIPAL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_CONTRIB_SETTLEMENT_DET.SETTLED_PROFIT
     *
     * @return the value of TRS_CONTRIB_SETTLEMENT_DET.SETTLED_PROFIT
     */
    public BigDecimal getSETTLED_PROFIT() {
        return SETTLED_PROFIT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_CONTRIB_SETTLEMENT_DET.SETTLED_PROFIT
     *
     * @param SETTLED_PROFIT the value for TRS_CONTRIB_SETTLEMENT_DET.SETTLED_PROFIT
     */
    public void setSETTLED_PROFIT(BigDecimal SETTLED_PROFIT) {
        this.SETTLED_PROFIT = SETTLED_PROFIT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_CONTRIB_SETTLEMENT_DET.CREATED_BY
     *
     * @return the value of TRS_CONTRIB_SETTLEMENT_DET.CREATED_BY
     */
    public String getCREATED_BY() {
        return CREATED_BY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_CONTRIB_SETTLEMENT_DET.CREATED_BY
     *
     * @param CREATED_BY the value for TRS_CONTRIB_SETTLEMENT_DET.CREATED_BY
     */
    public void setCREATED_BY(String CREATED_BY) {
        this.CREATED_BY = CREATED_BY == null ? null : CREATED_BY.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_CONTRIB_SETTLEMENT_DET.CREATED_DATE
     *
     * @return the value of TRS_CONTRIB_SETTLEMENT_DET.CREATED_DATE
     */
    public Date getCREATED_DATE() {
        return CREATED_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_CONTRIB_SETTLEMENT_DET.CREATED_DATE
     *
     * @param CREATED_DATE the value for TRS_CONTRIB_SETTLEMENT_DET.CREATED_DATE
     */
    public void setCREATED_DATE(Date CREATED_DATE) {
        this.CREATED_DATE = CREATED_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_CONTRIB_SETTLEMENT_DET.MODIFIED_BY
     *
     * @return the value of TRS_CONTRIB_SETTLEMENT_DET.MODIFIED_BY
     */
    public String getMODIFIED_BY() {
        return MODIFIED_BY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_CONTRIB_SETTLEMENT_DET.MODIFIED_BY
     *
     * @param MODIFIED_BY the value for TRS_CONTRIB_SETTLEMENT_DET.MODIFIED_BY
     */
    public void setMODIFIED_BY(String MODIFIED_BY) {
        this.MODIFIED_BY = MODIFIED_BY == null ? null : MODIFIED_BY.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_CONTRIB_SETTLEMENT_DET.MODIFIED_DATE
     *
     * @return the value of TRS_CONTRIB_SETTLEMENT_DET.MODIFIED_DATE
     */
    public Date getMODIFIED_DATE() {
        return MODIFIED_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_CONTRIB_SETTLEMENT_DET.MODIFIED_DATE
     *
     * @param MODIFIED_DATE the value for TRS_CONTRIB_SETTLEMENT_DET.MODIFIED_DATE
     */
    public void setMODIFIED_DATE(Date MODIFIED_DATE) {
        this.MODIFIED_DATE = MODIFIED_DATE;
    }
}