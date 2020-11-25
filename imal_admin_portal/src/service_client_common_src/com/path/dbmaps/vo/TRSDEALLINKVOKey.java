package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class TRSDEALLINKVOKey extends BaseVO {
    /**
     * This field corresponds to the database column TRSDEALLINK.BRANCH_CODE
     */
    private BigDecimal BRANCH_CODE;

    /**
     * This field corresponds to the database column TRSDEALLINK.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column TRSDEALLINK.LINKED_DEAL_NO
     */
    private BigDecimal LINKED_DEAL_NO;

    /**
     * This field corresponds to the database column TRSDEALLINK.SERIAL_NO
     */
    private BigDecimal SERIAL_NO;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSDEALLINK.BRANCH_CODE
     *
     * @return the value of TRSDEALLINK.BRANCH_CODE
     */
    public BigDecimal getBRANCH_CODE() {
        return BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSDEALLINK.BRANCH_CODE
     *
     * @param BRANCH_CODE the value for TRSDEALLINK.BRANCH_CODE
     */
    public void setBRANCH_CODE(BigDecimal BRANCH_CODE) {
        this.BRANCH_CODE = BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSDEALLINK.COMP_CODE
     *
     * @return the value of TRSDEALLINK.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSDEALLINK.COMP_CODE
     *
     * @param COMP_CODE the value for TRSDEALLINK.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSDEALLINK.LINKED_DEAL_NO
     *
     * @return the value of TRSDEALLINK.LINKED_DEAL_NO
     */
    public BigDecimal getLINKED_DEAL_NO() {
        return LINKED_DEAL_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSDEALLINK.LINKED_DEAL_NO
     *
     * @param LINKED_DEAL_NO the value for TRSDEALLINK.LINKED_DEAL_NO
     */
    public void setLINKED_DEAL_NO(BigDecimal LINKED_DEAL_NO) {
        this.LINKED_DEAL_NO = LINKED_DEAL_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSDEALLINK.SERIAL_NO
     *
     * @return the value of TRSDEALLINK.SERIAL_NO
     */
    public BigDecimal getSERIAL_NO() {
        return SERIAL_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSDEALLINK.SERIAL_NO
     *
     * @param SERIAL_NO the value for TRSDEALLINK.SERIAL_NO
     */
    public void setSERIAL_NO(BigDecimal SERIAL_NO) {
        this.SERIAL_NO = SERIAL_NO;
    }
}