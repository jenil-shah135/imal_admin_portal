package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;
import java.util.Date;

public class TRS_PROVISION_PROCESS_BY_CIFVOKey extends BaseVO {
    /**
     * This field corresponds to the database column TRS_PROVISION_PROCESS_BY_CIF.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column TRS_PROVISION_PROCESS_BY_CIF.COUNTER_PARTY
     */
    private BigDecimal COUNTER_PARTY;

    /**
     * This field corresponds to the database column TRS_PROVISION_PROCESS_BY_CIF.PROCESS_DATE
     */
    private Date PROCESS_DATE;

    /**
     * This field corresponds to the database column TRS_PROVISION_PROCESS_BY_CIF.PROCESS_NBR
     */
    private BigDecimal PROCESS_NBR;

    /**
     * This field corresponds to the database column TRS_PROVISION_PROCESS_BY_CIF.PRODUCT_TYPE
     */
    private String PRODUCT_TYPE;

    /**
     * This field corresponds to the database column TRS_PROVISION_PROCESS_BY_CIF.PROVISION_CLASS
     */
    private BigDecimal PROVISION_CLASS;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_PROVISION_PROCESS_BY_CIF.COMP_CODE
     *
     * @return the value of TRS_PROVISION_PROCESS_BY_CIF.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_PROVISION_PROCESS_BY_CIF.COMP_CODE
     *
     * @param COMP_CODE the value for TRS_PROVISION_PROCESS_BY_CIF.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_PROVISION_PROCESS_BY_CIF.COUNTER_PARTY
     *
     * @return the value of TRS_PROVISION_PROCESS_BY_CIF.COUNTER_PARTY
     */
    public BigDecimal getCOUNTER_PARTY() {
        return COUNTER_PARTY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_PROVISION_PROCESS_BY_CIF.COUNTER_PARTY
     *
     * @param COUNTER_PARTY the value for TRS_PROVISION_PROCESS_BY_CIF.COUNTER_PARTY
     */
    public void setCOUNTER_PARTY(BigDecimal COUNTER_PARTY) {
        this.COUNTER_PARTY = COUNTER_PARTY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_PROVISION_PROCESS_BY_CIF.PROCESS_DATE
     *
     * @return the value of TRS_PROVISION_PROCESS_BY_CIF.PROCESS_DATE
     */
    public Date getPROCESS_DATE() {
        return PROCESS_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_PROVISION_PROCESS_BY_CIF.PROCESS_DATE
     *
     * @param PROCESS_DATE the value for TRS_PROVISION_PROCESS_BY_CIF.PROCESS_DATE
     */
    public void setPROCESS_DATE(Date PROCESS_DATE) {
        this.PROCESS_DATE = PROCESS_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_PROVISION_PROCESS_BY_CIF.PROCESS_NBR
     *
     * @return the value of TRS_PROVISION_PROCESS_BY_CIF.PROCESS_NBR
     */
    public BigDecimal getPROCESS_NBR() {
        return PROCESS_NBR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_PROVISION_PROCESS_BY_CIF.PROCESS_NBR
     *
     * @param PROCESS_NBR the value for TRS_PROVISION_PROCESS_BY_CIF.PROCESS_NBR
     */
    public void setPROCESS_NBR(BigDecimal PROCESS_NBR) {
        this.PROCESS_NBR = PROCESS_NBR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_PROVISION_PROCESS_BY_CIF.PRODUCT_TYPE
     *
     * @return the value of TRS_PROVISION_PROCESS_BY_CIF.PRODUCT_TYPE
     */
    public String getPRODUCT_TYPE() {
        return PRODUCT_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_PROVISION_PROCESS_BY_CIF.PRODUCT_TYPE
     *
     * @param PRODUCT_TYPE the value for TRS_PROVISION_PROCESS_BY_CIF.PRODUCT_TYPE
     */
    public void setPRODUCT_TYPE(String PRODUCT_TYPE) {
        this.PRODUCT_TYPE = PRODUCT_TYPE == null ? null : PRODUCT_TYPE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_PROVISION_PROCESS_BY_CIF.PROVISION_CLASS
     *
     * @return the value of TRS_PROVISION_PROCESS_BY_CIF.PROVISION_CLASS
     */
    public BigDecimal getPROVISION_CLASS() {
        return PROVISION_CLASS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_PROVISION_PROCESS_BY_CIF.PROVISION_CLASS
     *
     * @param PROVISION_CLASS the value for TRS_PROVISION_PROCESS_BY_CIF.PROVISION_CLASS
     */
    public void setPROVISION_CLASS(BigDecimal PROVISION_CLASS) {
        this.PROVISION_CLASS = PROVISION_CLASS;
    }
}