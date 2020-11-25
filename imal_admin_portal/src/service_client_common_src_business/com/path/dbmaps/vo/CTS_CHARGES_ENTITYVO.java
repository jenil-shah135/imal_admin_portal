package com.path.dbmaps.vo;

import java.math.BigDecimal;

public class CTS_CHARGES_ENTITYVO extends CTS_CHARGES_ENTITYVOKey {
    /**
     * This field corresponds to the database column CTS_CHARGES_ENTITY.AMOUNT
     */
    private BigDecimal AMOUNT;

    /**
     * This field corresponds to the database column CTS_CHARGES_ENTITY.AMOUNT_FC
     */
    private BigDecimal AMOUNT_FC;

    /**
     * This field corresponds to the database column CTS_CHARGES_ENTITY.OPT_TYPE
     */
    private String OPT_TYPE;

    /**
     * This field corresponds to the database column CTS_CHARGES_ENTITY.ACC_BR
     */
    private BigDecimal ACC_BR;

    /**
     * This field corresponds to the database column CTS_CHARGES_ENTITY.ACC_CIF
     */
    private BigDecimal ACC_CIF;

    /**
     * This field corresponds to the database column CTS_CHARGES_ENTITY.ACC_CY
     */
    private BigDecimal ACC_CY;

    /**
     * This field corresponds to the database column CTS_CHARGES_ENTITY.ACC_GL
     */
    private BigDecimal ACC_GL;

    /**
     * This field corresponds to the database column CTS_CHARGES_ENTITY.ACC_SL
     */
    private BigDecimal ACC_SL;

    /**
     * This field corresponds to the database column CTS_CHARGES_ENTITY.AMOUNT_NEW
     */
    private BigDecimal AMOUNT_NEW;

    /**
     * This field corresponds to the database column CTS_CHARGES_ENTITY.APPLY_TVA
     */
    private String APPLY_TVA;

    /**
     * This field corresponds to the database column CTS_CHARGES_ENTITY.CHARGE_PERC
     */
    private BigDecimal CHARGE_PERC;

    /**
     * This field corresponds to the database column CTS_CHARGES_ENTITY.DEDUCT_FROM_ACC_BR
     */
    private BigDecimal DEDUCT_FROM_ACC_BR;

    /**
     * This field corresponds to the database column CTS_CHARGES_ENTITY.DEDUCT_FROM_ACC_CIF
     */
    private BigDecimal DEDUCT_FROM_ACC_CIF;

    /**
     * This field corresponds to the database column CTS_CHARGES_ENTITY.DEDUCT_FROM_ACC_CY
     */
    private BigDecimal DEDUCT_FROM_ACC_CY;

    /**
     * This field corresponds to the database column CTS_CHARGES_ENTITY.DEDUCT_FROM_ACC_GL
     */
    private BigDecimal DEDUCT_FROM_ACC_GL;

    /**
     * This field corresponds to the database column CTS_CHARGES_ENTITY.DEDUCT_FROM_ACC_SL
     */
    private BigDecimal DEDUCT_FROM_ACC_SL;

    /**
     * This field corresponds to the database column CTS_CHARGES_ENTITY.DR_ACC_CIF
     */
    private BigDecimal DR_ACC_CIF;

    /**
     * This field corresponds to the database column CTS_CHARGES_ENTITY.DR_ACC_GL
     */
    private BigDecimal DR_ACC_GL;

    /**
     * This field corresponds to the database column CTS_CHARGES_ENTITY.DR_ACC_SL
     */
    private BigDecimal DR_ACC_SL;

    /**
     * This field corresponds to the database column CTS_CHARGES_ENTITY.DR_CRITERIA
     */
    private String DR_CRITERIA;

    /**
     * This field corresponds to the database column CTS_CHARGES_ENTITY.PASS_SEPARATELY
     */
    private String PASS_SEPARATELY;

    /**
     * This field corresponds to the database column CTS_CHARGES_ENTITY.SCHEMA_CODE
     */
    private BigDecimal SCHEMA_CODE;

    /**
     * This field corresponds to the database column CTS_CHARGES_ENTITY.VAT_CODE
     */
    private BigDecimal VAT_CODE;

    /**
     * This field corresponds to the database column CTS_CHARGES_ENTITY.AMOUNT_ORIGINAL
     */
    private BigDecimal AMOUNT_ORIGINAL;

    /**
     * This field corresponds to the database column CTS_CHARGES_ENTITY.AMOUNT_ORIGINAL_FC
     */
    private BigDecimal AMOUNT_ORIGINAL_FC;

    /**
     * This field corresponds to the database column CTS_CHARGES_ENTITY.DUES_COLLECTION_TYPE
     */
    private String DUES_COLLECTION_TYPE;

    /**
     * This field corresponds to the database column CTS_CHARGES_ENTITY.DUES_MODE_PAY
     */
    private String DUES_MODE_PAY;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_CHARGES_ENTITY.AMOUNT
     *
     * @return the value of CTS_CHARGES_ENTITY.AMOUNT
     */
    public BigDecimal getAMOUNT() {
        return AMOUNT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_CHARGES_ENTITY.AMOUNT
     *
     * @param AMOUNT the value for CTS_CHARGES_ENTITY.AMOUNT
     */
    public void setAMOUNT(BigDecimal AMOUNT) {
        this.AMOUNT = AMOUNT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_CHARGES_ENTITY.AMOUNT_FC
     *
     * @return the value of CTS_CHARGES_ENTITY.AMOUNT_FC
     */
    public BigDecimal getAMOUNT_FC() {
        return AMOUNT_FC;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_CHARGES_ENTITY.AMOUNT_FC
     *
     * @param AMOUNT_FC the value for CTS_CHARGES_ENTITY.AMOUNT_FC
     */
    public void setAMOUNT_FC(BigDecimal AMOUNT_FC) {
        this.AMOUNT_FC = AMOUNT_FC;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_CHARGES_ENTITY.OPT_TYPE
     *
     * @return the value of CTS_CHARGES_ENTITY.OPT_TYPE
     */
    public String getOPT_TYPE() {
        return OPT_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_CHARGES_ENTITY.OPT_TYPE
     *
     * @param OPT_TYPE the value for CTS_CHARGES_ENTITY.OPT_TYPE
     */
    public void setOPT_TYPE(String OPT_TYPE) {
        this.OPT_TYPE = OPT_TYPE == null ? null : OPT_TYPE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_CHARGES_ENTITY.ACC_BR
     *
     * @return the value of CTS_CHARGES_ENTITY.ACC_BR
     */
    public BigDecimal getACC_BR() {
        return ACC_BR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_CHARGES_ENTITY.ACC_BR
     *
     * @param ACC_BR the value for CTS_CHARGES_ENTITY.ACC_BR
     */
    public void setACC_BR(BigDecimal ACC_BR) {
        this.ACC_BR = ACC_BR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_CHARGES_ENTITY.ACC_CIF
     *
     * @return the value of CTS_CHARGES_ENTITY.ACC_CIF
     */
    public BigDecimal getACC_CIF() {
        return ACC_CIF;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_CHARGES_ENTITY.ACC_CIF
     *
     * @param ACC_CIF the value for CTS_CHARGES_ENTITY.ACC_CIF
     */
    public void setACC_CIF(BigDecimal ACC_CIF) {
        this.ACC_CIF = ACC_CIF;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_CHARGES_ENTITY.ACC_CY
     *
     * @return the value of CTS_CHARGES_ENTITY.ACC_CY
     */
    public BigDecimal getACC_CY() {
        return ACC_CY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_CHARGES_ENTITY.ACC_CY
     *
     * @param ACC_CY the value for CTS_CHARGES_ENTITY.ACC_CY
     */
    public void setACC_CY(BigDecimal ACC_CY) {
        this.ACC_CY = ACC_CY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_CHARGES_ENTITY.ACC_GL
     *
     * @return the value of CTS_CHARGES_ENTITY.ACC_GL
     */
    public BigDecimal getACC_GL() {
        return ACC_GL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_CHARGES_ENTITY.ACC_GL
     *
     * @param ACC_GL the value for CTS_CHARGES_ENTITY.ACC_GL
     */
    public void setACC_GL(BigDecimal ACC_GL) {
        this.ACC_GL = ACC_GL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_CHARGES_ENTITY.ACC_SL
     *
     * @return the value of CTS_CHARGES_ENTITY.ACC_SL
     */
    public BigDecimal getACC_SL() {
        return ACC_SL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_CHARGES_ENTITY.ACC_SL
     *
     * @param ACC_SL the value for CTS_CHARGES_ENTITY.ACC_SL
     */
    public void setACC_SL(BigDecimal ACC_SL) {
        this.ACC_SL = ACC_SL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_CHARGES_ENTITY.AMOUNT_NEW
     *
     * @return the value of CTS_CHARGES_ENTITY.AMOUNT_NEW
     */
    public BigDecimal getAMOUNT_NEW() {
        return AMOUNT_NEW;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_CHARGES_ENTITY.AMOUNT_NEW
     *
     * @param AMOUNT_NEW the value for CTS_CHARGES_ENTITY.AMOUNT_NEW
     */
    public void setAMOUNT_NEW(BigDecimal AMOUNT_NEW) {
        this.AMOUNT_NEW = AMOUNT_NEW;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_CHARGES_ENTITY.APPLY_TVA
     *
     * @return the value of CTS_CHARGES_ENTITY.APPLY_TVA
     */
    public String getAPPLY_TVA() {
        return APPLY_TVA;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_CHARGES_ENTITY.APPLY_TVA
     *
     * @param APPLY_TVA the value for CTS_CHARGES_ENTITY.APPLY_TVA
     */
    public void setAPPLY_TVA(String APPLY_TVA) {
        this.APPLY_TVA = APPLY_TVA == null ? null : APPLY_TVA.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_CHARGES_ENTITY.CHARGE_PERC
     *
     * @return the value of CTS_CHARGES_ENTITY.CHARGE_PERC
     */
    public BigDecimal getCHARGE_PERC() {
        return CHARGE_PERC;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_CHARGES_ENTITY.CHARGE_PERC
     *
     * @param CHARGE_PERC the value for CTS_CHARGES_ENTITY.CHARGE_PERC
     */
    public void setCHARGE_PERC(BigDecimal CHARGE_PERC) {
        this.CHARGE_PERC = CHARGE_PERC;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_CHARGES_ENTITY.DEDUCT_FROM_ACC_BR
     *
     * @return the value of CTS_CHARGES_ENTITY.DEDUCT_FROM_ACC_BR
     */
    public BigDecimal getDEDUCT_FROM_ACC_BR() {
        return DEDUCT_FROM_ACC_BR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_CHARGES_ENTITY.DEDUCT_FROM_ACC_BR
     *
     * @param DEDUCT_FROM_ACC_BR the value for CTS_CHARGES_ENTITY.DEDUCT_FROM_ACC_BR
     */
    public void setDEDUCT_FROM_ACC_BR(BigDecimal DEDUCT_FROM_ACC_BR) {
        this.DEDUCT_FROM_ACC_BR = DEDUCT_FROM_ACC_BR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_CHARGES_ENTITY.DEDUCT_FROM_ACC_CIF
     *
     * @return the value of CTS_CHARGES_ENTITY.DEDUCT_FROM_ACC_CIF
     */
    public BigDecimal getDEDUCT_FROM_ACC_CIF() {
        return DEDUCT_FROM_ACC_CIF;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_CHARGES_ENTITY.DEDUCT_FROM_ACC_CIF
     *
     * @param DEDUCT_FROM_ACC_CIF the value for CTS_CHARGES_ENTITY.DEDUCT_FROM_ACC_CIF
     */
    public void setDEDUCT_FROM_ACC_CIF(BigDecimal DEDUCT_FROM_ACC_CIF) {
        this.DEDUCT_FROM_ACC_CIF = DEDUCT_FROM_ACC_CIF;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_CHARGES_ENTITY.DEDUCT_FROM_ACC_CY
     *
     * @return the value of CTS_CHARGES_ENTITY.DEDUCT_FROM_ACC_CY
     */
    public BigDecimal getDEDUCT_FROM_ACC_CY() {
        return DEDUCT_FROM_ACC_CY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_CHARGES_ENTITY.DEDUCT_FROM_ACC_CY
     *
     * @param DEDUCT_FROM_ACC_CY the value for CTS_CHARGES_ENTITY.DEDUCT_FROM_ACC_CY
     */
    public void setDEDUCT_FROM_ACC_CY(BigDecimal DEDUCT_FROM_ACC_CY) {
        this.DEDUCT_FROM_ACC_CY = DEDUCT_FROM_ACC_CY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_CHARGES_ENTITY.DEDUCT_FROM_ACC_GL
     *
     * @return the value of CTS_CHARGES_ENTITY.DEDUCT_FROM_ACC_GL
     */
    public BigDecimal getDEDUCT_FROM_ACC_GL() {
        return DEDUCT_FROM_ACC_GL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_CHARGES_ENTITY.DEDUCT_FROM_ACC_GL
     *
     * @param DEDUCT_FROM_ACC_GL the value for CTS_CHARGES_ENTITY.DEDUCT_FROM_ACC_GL
     */
    public void setDEDUCT_FROM_ACC_GL(BigDecimal DEDUCT_FROM_ACC_GL) {
        this.DEDUCT_FROM_ACC_GL = DEDUCT_FROM_ACC_GL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_CHARGES_ENTITY.DEDUCT_FROM_ACC_SL
     *
     * @return the value of CTS_CHARGES_ENTITY.DEDUCT_FROM_ACC_SL
     */
    public BigDecimal getDEDUCT_FROM_ACC_SL() {
        return DEDUCT_FROM_ACC_SL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_CHARGES_ENTITY.DEDUCT_FROM_ACC_SL
     *
     * @param DEDUCT_FROM_ACC_SL the value for CTS_CHARGES_ENTITY.DEDUCT_FROM_ACC_SL
     */
    public void setDEDUCT_FROM_ACC_SL(BigDecimal DEDUCT_FROM_ACC_SL) {
        this.DEDUCT_FROM_ACC_SL = DEDUCT_FROM_ACC_SL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_CHARGES_ENTITY.DR_ACC_CIF
     *
     * @return the value of CTS_CHARGES_ENTITY.DR_ACC_CIF
     */
    public BigDecimal getDR_ACC_CIF() {
        return DR_ACC_CIF;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_CHARGES_ENTITY.DR_ACC_CIF
     *
     * @param DR_ACC_CIF the value for CTS_CHARGES_ENTITY.DR_ACC_CIF
     */
    public void setDR_ACC_CIF(BigDecimal DR_ACC_CIF) {
        this.DR_ACC_CIF = DR_ACC_CIF;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_CHARGES_ENTITY.DR_ACC_GL
     *
     * @return the value of CTS_CHARGES_ENTITY.DR_ACC_GL
     */
    public BigDecimal getDR_ACC_GL() {
        return DR_ACC_GL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_CHARGES_ENTITY.DR_ACC_GL
     *
     * @param DR_ACC_GL the value for CTS_CHARGES_ENTITY.DR_ACC_GL
     */
    public void setDR_ACC_GL(BigDecimal DR_ACC_GL) {
        this.DR_ACC_GL = DR_ACC_GL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_CHARGES_ENTITY.DR_ACC_SL
     *
     * @return the value of CTS_CHARGES_ENTITY.DR_ACC_SL
     */
    public BigDecimal getDR_ACC_SL() {
        return DR_ACC_SL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_CHARGES_ENTITY.DR_ACC_SL
     *
     * @param DR_ACC_SL the value for CTS_CHARGES_ENTITY.DR_ACC_SL
     */
    public void setDR_ACC_SL(BigDecimal DR_ACC_SL) {
        this.DR_ACC_SL = DR_ACC_SL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_CHARGES_ENTITY.DR_CRITERIA
     *
     * @return the value of CTS_CHARGES_ENTITY.DR_CRITERIA
     */
    public String getDR_CRITERIA() {
        return DR_CRITERIA;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_CHARGES_ENTITY.DR_CRITERIA
     *
     * @param DR_CRITERIA the value for CTS_CHARGES_ENTITY.DR_CRITERIA
     */
    public void setDR_CRITERIA(String DR_CRITERIA) {
        this.DR_CRITERIA = DR_CRITERIA == null ? null : DR_CRITERIA.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_CHARGES_ENTITY.PASS_SEPARATELY
     *
     * @return the value of CTS_CHARGES_ENTITY.PASS_SEPARATELY
     */
    public String getPASS_SEPARATELY() {
        return PASS_SEPARATELY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_CHARGES_ENTITY.PASS_SEPARATELY
     *
     * @param PASS_SEPARATELY the value for CTS_CHARGES_ENTITY.PASS_SEPARATELY
     */
    public void setPASS_SEPARATELY(String PASS_SEPARATELY) {
        this.PASS_SEPARATELY = PASS_SEPARATELY == null ? null : PASS_SEPARATELY.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_CHARGES_ENTITY.SCHEMA_CODE
     *
     * @return the value of CTS_CHARGES_ENTITY.SCHEMA_CODE
     */
    public BigDecimal getSCHEMA_CODE() {
        return SCHEMA_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_CHARGES_ENTITY.SCHEMA_CODE
     *
     * @param SCHEMA_CODE the value for CTS_CHARGES_ENTITY.SCHEMA_CODE
     */
    public void setSCHEMA_CODE(BigDecimal SCHEMA_CODE) {
        this.SCHEMA_CODE = SCHEMA_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_CHARGES_ENTITY.VAT_CODE
     *
     * @return the value of CTS_CHARGES_ENTITY.VAT_CODE
     */
    public BigDecimal getVAT_CODE() {
        return VAT_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_CHARGES_ENTITY.VAT_CODE
     *
     * @param VAT_CODE the value for CTS_CHARGES_ENTITY.VAT_CODE
     */
    public void setVAT_CODE(BigDecimal VAT_CODE) {
        this.VAT_CODE = VAT_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_CHARGES_ENTITY.AMOUNT_ORIGINAL
     *
     * @return the value of CTS_CHARGES_ENTITY.AMOUNT_ORIGINAL
     */
    public BigDecimal getAMOUNT_ORIGINAL() {
        return AMOUNT_ORIGINAL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_CHARGES_ENTITY.AMOUNT_ORIGINAL
     *
     * @param AMOUNT_ORIGINAL the value for CTS_CHARGES_ENTITY.AMOUNT_ORIGINAL
     */
    public void setAMOUNT_ORIGINAL(BigDecimal AMOUNT_ORIGINAL) {
        this.AMOUNT_ORIGINAL = AMOUNT_ORIGINAL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_CHARGES_ENTITY.AMOUNT_ORIGINAL_FC
     *
     * @return the value of CTS_CHARGES_ENTITY.AMOUNT_ORIGINAL_FC
     */
    public BigDecimal getAMOUNT_ORIGINAL_FC() {
        return AMOUNT_ORIGINAL_FC;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_CHARGES_ENTITY.AMOUNT_ORIGINAL_FC
     *
     * @param AMOUNT_ORIGINAL_FC the value for CTS_CHARGES_ENTITY.AMOUNT_ORIGINAL_FC
     */
    public void setAMOUNT_ORIGINAL_FC(BigDecimal AMOUNT_ORIGINAL_FC) {
        this.AMOUNT_ORIGINAL_FC = AMOUNT_ORIGINAL_FC;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_CHARGES_ENTITY.DUES_COLLECTION_TYPE
     *
     * @return the value of CTS_CHARGES_ENTITY.DUES_COLLECTION_TYPE
     */
    public String getDUES_COLLECTION_TYPE() {
        return DUES_COLLECTION_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_CHARGES_ENTITY.DUES_COLLECTION_TYPE
     *
     * @param DUES_COLLECTION_TYPE the value for CTS_CHARGES_ENTITY.DUES_COLLECTION_TYPE
     */
    public void setDUES_COLLECTION_TYPE(String DUES_COLLECTION_TYPE) {
        this.DUES_COLLECTION_TYPE = DUES_COLLECTION_TYPE == null ? null : DUES_COLLECTION_TYPE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_CHARGES_ENTITY.DUES_MODE_PAY
     *
     * @return the value of CTS_CHARGES_ENTITY.DUES_MODE_PAY
     */
    public String getDUES_MODE_PAY() {
        return DUES_MODE_PAY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_CHARGES_ENTITY.DUES_MODE_PAY
     *
     * @param DUES_MODE_PAY the value for CTS_CHARGES_ENTITY.DUES_MODE_PAY
     */
    public void setDUES_MODE_PAY(String DUES_MODE_PAY) {
        this.DUES_MODE_PAY = DUES_MODE_PAY == null ? null : DUES_MODE_PAY.trim();
    }
}