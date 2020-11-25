package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class CTSCERTIFICATE_TRXTYPESVOKey extends BaseVO {
    /**
     * This field corresponds to the database column CTSCERTIFICATE_TRXTYPES.BRANCH_CODE
     */
    private BigDecimal BRANCH_CODE;

    /**
     * This field corresponds to the database column CTSCERTIFICATE_TRXTYPES.CERTIFICATE_CODE
     */
    private BigDecimal CERTIFICATE_CODE;

    /**
     * This field corresponds to the database column CTSCERTIFICATE_TRXTYPES.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column CTSCERTIFICATE_TRXTYPES.TRX_TYPE
     */
    private BigDecimal TRX_TYPE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTSCERTIFICATE_TRXTYPES.BRANCH_CODE
     *
     * @return the value of CTSCERTIFICATE_TRXTYPES.BRANCH_CODE
     */
    public BigDecimal getBRANCH_CODE() {
        return BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTSCERTIFICATE_TRXTYPES.BRANCH_CODE
     *
     * @param BRANCH_CODE the value for CTSCERTIFICATE_TRXTYPES.BRANCH_CODE
     */
    public void setBRANCH_CODE(BigDecimal BRANCH_CODE) {
        this.BRANCH_CODE = BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTSCERTIFICATE_TRXTYPES.CERTIFICATE_CODE
     *
     * @return the value of CTSCERTIFICATE_TRXTYPES.CERTIFICATE_CODE
     */
    public BigDecimal getCERTIFICATE_CODE() {
        return CERTIFICATE_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTSCERTIFICATE_TRXTYPES.CERTIFICATE_CODE
     *
     * @param CERTIFICATE_CODE the value for CTSCERTIFICATE_TRXTYPES.CERTIFICATE_CODE
     */
    public void setCERTIFICATE_CODE(BigDecimal CERTIFICATE_CODE) {
        this.CERTIFICATE_CODE = CERTIFICATE_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTSCERTIFICATE_TRXTYPES.COMP_CODE
     *
     * @return the value of CTSCERTIFICATE_TRXTYPES.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTSCERTIFICATE_TRXTYPES.COMP_CODE
     *
     * @param COMP_CODE the value for CTSCERTIFICATE_TRXTYPES.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTSCERTIFICATE_TRXTYPES.TRX_TYPE
     *
     * @return the value of CTSCERTIFICATE_TRXTYPES.TRX_TYPE
     */
    public BigDecimal getTRX_TYPE() {
        return TRX_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTSCERTIFICATE_TRXTYPES.TRX_TYPE
     *
     * @param TRX_TYPE the value for CTSCERTIFICATE_TRXTYPES.TRX_TYPE
     */
    public void setTRX_TYPE(BigDecimal TRX_TYPE) {
        this.TRX_TYPE = TRX_TYPE;
    }
}