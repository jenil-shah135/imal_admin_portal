package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class TRS_RESCHEDULE_REQST_DETVOKey extends BaseVO {
    /**
     * This field corresponds to the database column TRS_RESCHEDULE_REQST_DET.BRANCH_CODE
     */
    private BigDecimal BRANCH_CODE;

    /**
     * This field corresponds to the database column TRS_RESCHEDULE_REQST_DET.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column TRS_RESCHEDULE_REQST_DET.LINE_NO
     */
    private BigDecimal LINE_NO;

    /**
     * This field corresponds to the database column TRS_RESCHEDULE_REQST_DET.REQUEST_NO
     */
    private BigDecimal REQUEST_NO;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_RESCHEDULE_REQST_DET.BRANCH_CODE
     *
     * @return the value of TRS_RESCHEDULE_REQST_DET.BRANCH_CODE
     */
    public BigDecimal getBRANCH_CODE() {
        return BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_RESCHEDULE_REQST_DET.BRANCH_CODE
     *
     * @param BRANCH_CODE the value for TRS_RESCHEDULE_REQST_DET.BRANCH_CODE
     */
    public void setBRANCH_CODE(BigDecimal BRANCH_CODE) {
        this.BRANCH_CODE = BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_RESCHEDULE_REQST_DET.COMP_CODE
     *
     * @return the value of TRS_RESCHEDULE_REQST_DET.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_RESCHEDULE_REQST_DET.COMP_CODE
     *
     * @param COMP_CODE the value for TRS_RESCHEDULE_REQST_DET.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_RESCHEDULE_REQST_DET.LINE_NO
     *
     * @return the value of TRS_RESCHEDULE_REQST_DET.LINE_NO
     */
    public BigDecimal getLINE_NO() {
        return LINE_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_RESCHEDULE_REQST_DET.LINE_NO
     *
     * @param LINE_NO the value for TRS_RESCHEDULE_REQST_DET.LINE_NO
     */
    public void setLINE_NO(BigDecimal LINE_NO) {
        this.LINE_NO = LINE_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_RESCHEDULE_REQST_DET.REQUEST_NO
     *
     * @return the value of TRS_RESCHEDULE_REQST_DET.REQUEST_NO
     */
    public BigDecimal getREQUEST_NO() {
        return REQUEST_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_RESCHEDULE_REQST_DET.REQUEST_NO
     *
     * @param REQUEST_NO the value for TRS_RESCHEDULE_REQST_DET.REQUEST_NO
     */
    public void setREQUEST_NO(BigDecimal REQUEST_NO) {
        this.REQUEST_NO = REQUEST_NO;
    }
}