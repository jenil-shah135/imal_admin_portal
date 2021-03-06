package com.path.dbmaps.vo;

import java.math.BigDecimal;

public class TRSDEAL_SETTLEMENT_CHARGESVO extends TRSDEAL_SETTLEMENT_CHARGESVOKey {
    /**
     * This field corresponds to the database column TRSDEAL_SETTLEMENT_CHARGES.CHARGE_CODE
     */
    private BigDecimal CHARGE_CODE;

    /**
     * This field corresponds to the database column TRSDEAL_SETTLEMENT_CHARGES.CHARGE_AMOUNT
     */
    private BigDecimal CHARGE_AMOUNT;

    /**
     * This field corresponds to the database column TRSDEAL_SETTLEMENT_CHARGES.INCLUDE_IN_INSTALLMENT_YN
     */
    private String INCLUDE_IN_INSTALLMENT_YN;

    /**
     * This field corresponds to the database column TRSDEAL_SETTLEMENT_CHARGES.DEFAULT_FROM_PRODUCT_CLASS_YN
     */
    private String DEFAULT_FROM_PRODUCT_CLASS_YN;

    /**
     * This field corresponds to the database column TRSDEAL_SETTLEMENT_CHARGES.VAT_AMOUNT
     */
    private BigDecimal VAT_AMOUNT;

    /**
     * This field corresponds to the database column TRSDEAL_SETTLEMENT_CHARGES.PAST_DUE_CHARGE_AMT
     */
    private BigDecimal PAST_DUE_CHARGE_AMT;

    /**
     * This field corresponds to the database column TRSDEAL_SETTLEMENT_CHARGES.PAST_DUE_CHARGE_SETTLED_AMT
     */
    private BigDecimal PAST_DUE_CHARGE_SETTLED_AMT;

    /**
     * This field corresponds to the database column TRSDEAL_SETTLEMENT_CHARGES.PAST_DUE_VAT_AMT
     */
    private BigDecimal PAST_DUE_VAT_AMT;

    /**
     * This field corresponds to the database column TRSDEAL_SETTLEMENT_CHARGES.PAST_DUE_VAT_SETTLED_AMT
     */
    private BigDecimal PAST_DUE_VAT_SETTLED_AMT;

    /**
     * This field corresponds to the database column TRSDEAL_SETTLEMENT_CHARGES.VAT_CODE
     */
    private BigDecimal VAT_CODE;

    /**
     * This field corresponds to the database column TRSDEAL_SETTLEMENT_CHARGES.TEMPLATE_CODE
     */
    private BigDecimal TEMPLATE_CODE;

    /**
     * This field corresponds to the database column TRSDEAL_SETTLEMENT_CHARGES.CHARGE_PERCENTAGE
     */
    private BigDecimal CHARGE_PERCENTAGE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSDEAL_SETTLEMENT_CHARGES.CHARGE_CODE
     *
     * @return the value of TRSDEAL_SETTLEMENT_CHARGES.CHARGE_CODE
     */
    public BigDecimal getCHARGE_CODE() {
        return CHARGE_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSDEAL_SETTLEMENT_CHARGES.CHARGE_CODE
     *
     * @param CHARGE_CODE the value for TRSDEAL_SETTLEMENT_CHARGES.CHARGE_CODE
     */
    public void setCHARGE_CODE(BigDecimal CHARGE_CODE) {
        this.CHARGE_CODE = CHARGE_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSDEAL_SETTLEMENT_CHARGES.CHARGE_AMOUNT
     *
     * @return the value of TRSDEAL_SETTLEMENT_CHARGES.CHARGE_AMOUNT
     */
    public BigDecimal getCHARGE_AMOUNT() {
        return CHARGE_AMOUNT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSDEAL_SETTLEMENT_CHARGES.CHARGE_AMOUNT
     *
     * @param CHARGE_AMOUNT the value for TRSDEAL_SETTLEMENT_CHARGES.CHARGE_AMOUNT
     */
    public void setCHARGE_AMOUNT(BigDecimal CHARGE_AMOUNT) {
        this.CHARGE_AMOUNT = CHARGE_AMOUNT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSDEAL_SETTLEMENT_CHARGES.INCLUDE_IN_INSTALLMENT_YN
     *
     * @return the value of TRSDEAL_SETTLEMENT_CHARGES.INCLUDE_IN_INSTALLMENT_YN
     */
    public String getINCLUDE_IN_INSTALLMENT_YN() {
        return INCLUDE_IN_INSTALLMENT_YN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSDEAL_SETTLEMENT_CHARGES.INCLUDE_IN_INSTALLMENT_YN
     *
     * @param INCLUDE_IN_INSTALLMENT_YN the value for TRSDEAL_SETTLEMENT_CHARGES.INCLUDE_IN_INSTALLMENT_YN
     */
    public void setINCLUDE_IN_INSTALLMENT_YN(String INCLUDE_IN_INSTALLMENT_YN) {
        this.INCLUDE_IN_INSTALLMENT_YN = INCLUDE_IN_INSTALLMENT_YN == null ? null : INCLUDE_IN_INSTALLMENT_YN.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSDEAL_SETTLEMENT_CHARGES.DEFAULT_FROM_PRODUCT_CLASS_YN
     *
     * @return the value of TRSDEAL_SETTLEMENT_CHARGES.DEFAULT_FROM_PRODUCT_CLASS_YN
     */
    public String getDEFAULT_FROM_PRODUCT_CLASS_YN() {
        return DEFAULT_FROM_PRODUCT_CLASS_YN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSDEAL_SETTLEMENT_CHARGES.DEFAULT_FROM_PRODUCT_CLASS_YN
     *
     * @param DEFAULT_FROM_PRODUCT_CLASS_YN the value for TRSDEAL_SETTLEMENT_CHARGES.DEFAULT_FROM_PRODUCT_CLASS_YN
     */
    public void setDEFAULT_FROM_PRODUCT_CLASS_YN(String DEFAULT_FROM_PRODUCT_CLASS_YN) {
        this.DEFAULT_FROM_PRODUCT_CLASS_YN = DEFAULT_FROM_PRODUCT_CLASS_YN == null ? null : DEFAULT_FROM_PRODUCT_CLASS_YN.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSDEAL_SETTLEMENT_CHARGES.VAT_AMOUNT
     *
     * @return the value of TRSDEAL_SETTLEMENT_CHARGES.VAT_AMOUNT
     */
    public BigDecimal getVAT_AMOUNT() {
        return VAT_AMOUNT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSDEAL_SETTLEMENT_CHARGES.VAT_AMOUNT
     *
     * @param VAT_AMOUNT the value for TRSDEAL_SETTLEMENT_CHARGES.VAT_AMOUNT
     */
    public void setVAT_AMOUNT(BigDecimal VAT_AMOUNT) {
        this.VAT_AMOUNT = VAT_AMOUNT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSDEAL_SETTLEMENT_CHARGES.PAST_DUE_CHARGE_AMT
     *
     * @return the value of TRSDEAL_SETTLEMENT_CHARGES.PAST_DUE_CHARGE_AMT
     */
    public BigDecimal getPAST_DUE_CHARGE_AMT() {
        return PAST_DUE_CHARGE_AMT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSDEAL_SETTLEMENT_CHARGES.PAST_DUE_CHARGE_AMT
     *
     * @param PAST_DUE_CHARGE_AMT the value for TRSDEAL_SETTLEMENT_CHARGES.PAST_DUE_CHARGE_AMT
     */
    public void setPAST_DUE_CHARGE_AMT(BigDecimal PAST_DUE_CHARGE_AMT) {
        this.PAST_DUE_CHARGE_AMT = PAST_DUE_CHARGE_AMT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSDEAL_SETTLEMENT_CHARGES.PAST_DUE_CHARGE_SETTLED_AMT
     *
     * @return the value of TRSDEAL_SETTLEMENT_CHARGES.PAST_DUE_CHARGE_SETTLED_AMT
     */
    public BigDecimal getPAST_DUE_CHARGE_SETTLED_AMT() {
        return PAST_DUE_CHARGE_SETTLED_AMT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSDEAL_SETTLEMENT_CHARGES.PAST_DUE_CHARGE_SETTLED_AMT
     *
     * @param PAST_DUE_CHARGE_SETTLED_AMT the value for TRSDEAL_SETTLEMENT_CHARGES.PAST_DUE_CHARGE_SETTLED_AMT
     */
    public void setPAST_DUE_CHARGE_SETTLED_AMT(BigDecimal PAST_DUE_CHARGE_SETTLED_AMT) {
        this.PAST_DUE_CHARGE_SETTLED_AMT = PAST_DUE_CHARGE_SETTLED_AMT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSDEAL_SETTLEMENT_CHARGES.PAST_DUE_VAT_AMT
     *
     * @return the value of TRSDEAL_SETTLEMENT_CHARGES.PAST_DUE_VAT_AMT
     */
    public BigDecimal getPAST_DUE_VAT_AMT() {
        return PAST_DUE_VAT_AMT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSDEAL_SETTLEMENT_CHARGES.PAST_DUE_VAT_AMT
     *
     * @param PAST_DUE_VAT_AMT the value for TRSDEAL_SETTLEMENT_CHARGES.PAST_DUE_VAT_AMT
     */
    public void setPAST_DUE_VAT_AMT(BigDecimal PAST_DUE_VAT_AMT) {
        this.PAST_DUE_VAT_AMT = PAST_DUE_VAT_AMT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSDEAL_SETTLEMENT_CHARGES.PAST_DUE_VAT_SETTLED_AMT
     *
     * @return the value of TRSDEAL_SETTLEMENT_CHARGES.PAST_DUE_VAT_SETTLED_AMT
     */
    public BigDecimal getPAST_DUE_VAT_SETTLED_AMT() {
        return PAST_DUE_VAT_SETTLED_AMT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSDEAL_SETTLEMENT_CHARGES.PAST_DUE_VAT_SETTLED_AMT
     *
     * @param PAST_DUE_VAT_SETTLED_AMT the value for TRSDEAL_SETTLEMENT_CHARGES.PAST_DUE_VAT_SETTLED_AMT
     */
    public void setPAST_DUE_VAT_SETTLED_AMT(BigDecimal PAST_DUE_VAT_SETTLED_AMT) {
        this.PAST_DUE_VAT_SETTLED_AMT = PAST_DUE_VAT_SETTLED_AMT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSDEAL_SETTLEMENT_CHARGES.VAT_CODE
     *
     * @return the value of TRSDEAL_SETTLEMENT_CHARGES.VAT_CODE
     */
    public BigDecimal getVAT_CODE() {
        return VAT_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSDEAL_SETTLEMENT_CHARGES.VAT_CODE
     *
     * @param VAT_CODE the value for TRSDEAL_SETTLEMENT_CHARGES.VAT_CODE
     */
    public void setVAT_CODE(BigDecimal VAT_CODE) {
        this.VAT_CODE = VAT_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSDEAL_SETTLEMENT_CHARGES.TEMPLATE_CODE
     *
     * @return the value of TRSDEAL_SETTLEMENT_CHARGES.TEMPLATE_CODE
     */
    public BigDecimal getTEMPLATE_CODE() {
        return TEMPLATE_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSDEAL_SETTLEMENT_CHARGES.TEMPLATE_CODE
     *
     * @param TEMPLATE_CODE the value for TRSDEAL_SETTLEMENT_CHARGES.TEMPLATE_CODE
     */
    public void setTEMPLATE_CODE(BigDecimal TEMPLATE_CODE) {
        this.TEMPLATE_CODE = TEMPLATE_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSDEAL_SETTLEMENT_CHARGES.CHARGE_PERCENTAGE
     *
     * @return the value of TRSDEAL_SETTLEMENT_CHARGES.CHARGE_PERCENTAGE
     */
    public BigDecimal getCHARGE_PERCENTAGE() {
        return CHARGE_PERCENTAGE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSDEAL_SETTLEMENT_CHARGES.CHARGE_PERCENTAGE
     *
     * @param CHARGE_PERCENTAGE the value for TRSDEAL_SETTLEMENT_CHARGES.CHARGE_PERCENTAGE
     */
    public void setCHARGE_PERCENTAGE(BigDecimal CHARGE_PERCENTAGE) {
        this.CHARGE_PERCENTAGE = CHARGE_PERCENTAGE;
    }
}