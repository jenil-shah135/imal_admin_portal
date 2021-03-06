package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class TRSUSRLIMITDET2VOKey extends BaseVO {
    /**
     * This field corresponds to the database column TRSUSRLIMITDET2.BRANCH_CODE
     */
    private BigDecimal BRANCH_CODE;

    /**
     * This field corresponds to the database column TRSUSRLIMITDET2.CLASS
     */
    private BigDecimal CLASS;

    /**
     * This field corresponds to the database column TRSUSRLIMITDET2.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column TRSUSRLIMITDET2.CURRENCY
     */
    private BigDecimal CURRENCY;

    /**
     * This field corresponds to the database column TRSUSRLIMITDET2.LINE_NO
     */
    private BigDecimal LINE_NO;

    /**
     * This field corresponds to the database column TRSUSRLIMITDET2.USER_ID
     */
    private String USER_ID;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSUSRLIMITDET2.BRANCH_CODE
     *
     * @return the value of TRSUSRLIMITDET2.BRANCH_CODE
     */
    public BigDecimal getBRANCH_CODE() {
        return BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSUSRLIMITDET2.BRANCH_CODE
     *
     * @param BRANCH_CODE the value for TRSUSRLIMITDET2.BRANCH_CODE
     */
    public void setBRANCH_CODE(BigDecimal BRANCH_CODE) {
        this.BRANCH_CODE = BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSUSRLIMITDET2.CLASS
     *
     * @return the value of TRSUSRLIMITDET2.CLASS
     */
    public BigDecimal getCLASS() {
        return CLASS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSUSRLIMITDET2.CLASS
     *
     * @param CLASS the value for TRSUSRLIMITDET2.CLASS
     */
    public void setCLASS(BigDecimal CLASS) {
        this.CLASS = CLASS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSUSRLIMITDET2.COMP_CODE
     *
     * @return the value of TRSUSRLIMITDET2.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSUSRLIMITDET2.COMP_CODE
     *
     * @param COMP_CODE the value for TRSUSRLIMITDET2.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSUSRLIMITDET2.CURRENCY
     *
     * @return the value of TRSUSRLIMITDET2.CURRENCY
     */
    public BigDecimal getCURRENCY() {
        return CURRENCY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSUSRLIMITDET2.CURRENCY
     *
     * @param CURRENCY the value for TRSUSRLIMITDET2.CURRENCY
     */
    public void setCURRENCY(BigDecimal CURRENCY) {
        this.CURRENCY = CURRENCY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSUSRLIMITDET2.LINE_NO
     *
     * @return the value of TRSUSRLIMITDET2.LINE_NO
     */
    public BigDecimal getLINE_NO() {
        return LINE_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSUSRLIMITDET2.LINE_NO
     *
     * @param LINE_NO the value for TRSUSRLIMITDET2.LINE_NO
     */
    public void setLINE_NO(BigDecimal LINE_NO) {
        this.LINE_NO = LINE_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSUSRLIMITDET2.USER_ID
     *
     * @return the value of TRSUSRLIMITDET2.USER_ID
     */
    public String getUSER_ID() {
        return USER_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSUSRLIMITDET2.USER_ID
     *
     * @param USER_ID the value for TRSUSRLIMITDET2.USER_ID
     */
    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID == null ? null : USER_ID.trim();
    }
}