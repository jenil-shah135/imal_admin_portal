package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class FMSFACILITY_CUSTOM_ATT_DETVOKey extends BaseVO {
    /**
     * This field corresponds to the database column FMSFACILITY_CUSTOM_ATT_DET.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column FMSFACILITY_CUSTOM_ATT_DET.FACILITY_CUSTOM_CODE
     */
    private BigDecimal FACILITY_CUSTOM_CODE;

    /**
     * This field corresponds to the database column FMSFACILITY_CUSTOM_ATT_DET.LINE_NO
     */
    private BigDecimal LINE_NO;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSFACILITY_CUSTOM_ATT_DET.COMP_CODE
     *
     * @return the value of FMSFACILITY_CUSTOM_ATT_DET.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSFACILITY_CUSTOM_ATT_DET.COMP_CODE
     *
     * @param COMP_CODE the value for FMSFACILITY_CUSTOM_ATT_DET.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSFACILITY_CUSTOM_ATT_DET.FACILITY_CUSTOM_CODE
     *
     * @return the value of FMSFACILITY_CUSTOM_ATT_DET.FACILITY_CUSTOM_CODE
     */
    public BigDecimal getFACILITY_CUSTOM_CODE() {
        return FACILITY_CUSTOM_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSFACILITY_CUSTOM_ATT_DET.FACILITY_CUSTOM_CODE
     *
     * @param FACILITY_CUSTOM_CODE the value for FMSFACILITY_CUSTOM_ATT_DET.FACILITY_CUSTOM_CODE
     */
    public void setFACILITY_CUSTOM_CODE(BigDecimal FACILITY_CUSTOM_CODE) {
        this.FACILITY_CUSTOM_CODE = FACILITY_CUSTOM_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSFACILITY_CUSTOM_ATT_DET.LINE_NO
     *
     * @return the value of FMSFACILITY_CUSTOM_ATT_DET.LINE_NO
     */
    public BigDecimal getLINE_NO() {
        return LINE_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSFACILITY_CUSTOM_ATT_DET.LINE_NO
     *
     * @param LINE_NO the value for FMSFACILITY_CUSTOM_ATT_DET.LINE_NO
     */
    public void setLINE_NO(BigDecimal LINE_NO) {
        this.LINE_NO = LINE_NO;
    }
}