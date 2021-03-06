package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class CTSPRODUCT_PACKAGE_DETVOKey extends BaseVO {
    /**
     * This field corresponds to the database column CTSPRODUCT_PACKAGE_DET.CODE
     */
    private BigDecimal CODE;

    /**
     * This field corresponds to the database column CTSPRODUCT_PACKAGE_DET.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column CTSPRODUCT_PACKAGE_DET.LINE_NO
     */
    private BigDecimal LINE_NO;

    /**
     * This field corresponds to the database column CTSPRODUCT_PACKAGE_DET.TYPE
     */
    private String TYPE;

    /**
     * This field corresponds to the database column CTSPRODUCT_PACKAGE_DET.TYPE_LINE
     */
    private BigDecimal TYPE_LINE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTSPRODUCT_PACKAGE_DET.CODE
     *
     * @return the value of CTSPRODUCT_PACKAGE_DET.CODE
     */
    public BigDecimal getCODE() {
        return CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTSPRODUCT_PACKAGE_DET.CODE
     *
     * @param CODE the value for CTSPRODUCT_PACKAGE_DET.CODE
     */
    public void setCODE(BigDecimal CODE) {
        this.CODE = CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTSPRODUCT_PACKAGE_DET.COMP_CODE
     *
     * @return the value of CTSPRODUCT_PACKAGE_DET.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTSPRODUCT_PACKAGE_DET.COMP_CODE
     *
     * @param COMP_CODE the value for CTSPRODUCT_PACKAGE_DET.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTSPRODUCT_PACKAGE_DET.LINE_NO
     *
     * @return the value of CTSPRODUCT_PACKAGE_DET.LINE_NO
     */
    public BigDecimal getLINE_NO() {
        return LINE_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTSPRODUCT_PACKAGE_DET.LINE_NO
     *
     * @param LINE_NO the value for CTSPRODUCT_PACKAGE_DET.LINE_NO
     */
    public void setLINE_NO(BigDecimal LINE_NO) {
        this.LINE_NO = LINE_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTSPRODUCT_PACKAGE_DET.TYPE
     *
     * @return the value of CTSPRODUCT_PACKAGE_DET.TYPE
     */
    public String getTYPE() {
        return TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTSPRODUCT_PACKAGE_DET.TYPE
     *
     * @param TYPE the value for CTSPRODUCT_PACKAGE_DET.TYPE
     */
    public void setTYPE(String TYPE) {
        this.TYPE = TYPE == null ? null : TYPE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTSPRODUCT_PACKAGE_DET.TYPE_LINE
     *
     * @return the value of CTSPRODUCT_PACKAGE_DET.TYPE_LINE
     */
    public BigDecimal getTYPE_LINE() {
        return TYPE_LINE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTSPRODUCT_PACKAGE_DET.TYPE_LINE
     *
     * @param TYPE_LINE the value for CTSPRODUCT_PACKAGE_DET.TYPE_LINE
     */
    public void setTYPE_LINE(BigDecimal TYPE_LINE) {
        this.TYPE_LINE = TYPE_LINE;
    }
}