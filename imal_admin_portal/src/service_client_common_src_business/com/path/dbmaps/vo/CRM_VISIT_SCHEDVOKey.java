package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class CRM_VISIT_SCHEDVOKey extends BaseVO {
    /**
     * This field corresponds to the database column CRM_VISIT_SCHED.BRANCH_CODE
     */
    private BigDecimal BRANCH_CODE;

    /**
     * This field corresponds to the database column CRM_VISIT_SCHED.CODE
     */
    private BigDecimal CODE;

    /**
     * This field corresponds to the database column CRM_VISIT_SCHED.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CRM_VISIT_SCHED.BRANCH_CODE
     *
     * @return the value of CRM_VISIT_SCHED.BRANCH_CODE
     */
    public BigDecimal getBRANCH_CODE() {
        return BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CRM_VISIT_SCHED.BRANCH_CODE
     *
     * @param BRANCH_CODE the value for CRM_VISIT_SCHED.BRANCH_CODE
     */
    public void setBRANCH_CODE(BigDecimal BRANCH_CODE) {
        this.BRANCH_CODE = BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CRM_VISIT_SCHED.CODE
     *
     * @return the value of CRM_VISIT_SCHED.CODE
     */
    public BigDecimal getCODE() {
        return CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CRM_VISIT_SCHED.CODE
     *
     * @param CODE the value for CRM_VISIT_SCHED.CODE
     */
    public void setCODE(BigDecimal CODE) {
        this.CODE = CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CRM_VISIT_SCHED.COMP_CODE
     *
     * @return the value of CRM_VISIT_SCHED.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CRM_VISIT_SCHED.COMP_CODE
     *
     * @param COMP_CODE the value for CRM_VISIT_SCHED.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }
}