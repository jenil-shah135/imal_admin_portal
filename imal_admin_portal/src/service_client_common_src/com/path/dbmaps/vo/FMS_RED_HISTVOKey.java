package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class FMS_RED_HISTVOKey extends BaseVO {
    /**
     * This field corresponds to the database column FMS_RED_HIST.BRANCH_CODE
     */
    private BigDecimal BRANCH_CODE;

    /**
     * This field corresponds to the database column FMS_RED_HIST.CODE
     */
    private BigDecimal CODE;

    /**
     * This field corresponds to the database column FMS_RED_HIST.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column FMS_RED_HIST.LINE_NBR
     */
    private BigDecimal LINE_NBR;

    /**
     * This field corresponds to the database column FMS_RED_HIST.SUB_LINE_NBR
     */
    private BigDecimal SUB_LINE_NBR;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMS_RED_HIST.BRANCH_CODE
     *
     * @return the value of FMS_RED_HIST.BRANCH_CODE
     */
    public BigDecimal getBRANCH_CODE() {
        return BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMS_RED_HIST.BRANCH_CODE
     *
     * @param BRANCH_CODE the value for FMS_RED_HIST.BRANCH_CODE
     */
    public void setBRANCH_CODE(BigDecimal BRANCH_CODE) {
        this.BRANCH_CODE = BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMS_RED_HIST.CODE
     *
     * @return the value of FMS_RED_HIST.CODE
     */
    public BigDecimal getCODE() {
        return CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMS_RED_HIST.CODE
     *
     * @param CODE the value for FMS_RED_HIST.CODE
     */
    public void setCODE(BigDecimal CODE) {
        this.CODE = CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMS_RED_HIST.COMP_CODE
     *
     * @return the value of FMS_RED_HIST.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMS_RED_HIST.COMP_CODE
     *
     * @param COMP_CODE the value for FMS_RED_HIST.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMS_RED_HIST.LINE_NBR
     *
     * @return the value of FMS_RED_HIST.LINE_NBR
     */
    public BigDecimal getLINE_NBR() {
        return LINE_NBR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMS_RED_HIST.LINE_NBR
     *
     * @param LINE_NBR the value for FMS_RED_HIST.LINE_NBR
     */
    public void setLINE_NBR(BigDecimal LINE_NBR) {
        this.LINE_NBR = LINE_NBR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMS_RED_HIST.SUB_LINE_NBR
     *
     * @return the value of FMS_RED_HIST.SUB_LINE_NBR
     */
    public BigDecimal getSUB_LINE_NBR() {
        return SUB_LINE_NBR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMS_RED_HIST.SUB_LINE_NBR
     *
     * @param SUB_LINE_NBR the value for FMS_RED_HIST.SUB_LINE_NBR
     */
    public void setSUB_LINE_NBR(BigDecimal SUB_LINE_NBR) {
        this.SUB_LINE_NBR = SUB_LINE_NBR;
    }
}