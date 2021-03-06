package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class EOD_PROCESSVOKey extends BaseVO {
    /**
     * This field corresponds to the database column EOD_PROCESS.BRANCH_CODE
     */
    private BigDecimal BRANCH_CODE;

    /**
     * This field corresponds to the database column EOD_PROCESS.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column EOD_PROCESS.PROCESS_CODE
     */
    private BigDecimal PROCESS_CODE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EOD_PROCESS.BRANCH_CODE
     *
     * @return the value of EOD_PROCESS.BRANCH_CODE
     */
    public BigDecimal getBRANCH_CODE() {
        return BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EOD_PROCESS.BRANCH_CODE
     *
     * @param BRANCH_CODE the value for EOD_PROCESS.BRANCH_CODE
     */
    public void setBRANCH_CODE(BigDecimal BRANCH_CODE) {
        this.BRANCH_CODE = BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EOD_PROCESS.COMP_CODE
     *
     * @return the value of EOD_PROCESS.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EOD_PROCESS.COMP_CODE
     *
     * @param COMP_CODE the value for EOD_PROCESS.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EOD_PROCESS.PROCESS_CODE
     *
     * @return the value of EOD_PROCESS.PROCESS_CODE
     */
    public BigDecimal getPROCESS_CODE() {
        return PROCESS_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EOD_PROCESS.PROCESS_CODE
     *
     * @param PROCESS_CODE the value for EOD_PROCESS.PROCESS_CODE
     */
    public void setPROCESS_CODE(BigDecimal PROCESS_CODE) {
        this.PROCESS_CODE = PROCESS_CODE;
    }
}