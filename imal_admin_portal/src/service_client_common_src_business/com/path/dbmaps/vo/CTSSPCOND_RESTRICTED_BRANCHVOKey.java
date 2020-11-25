package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class CTSSPCOND_RESTRICTED_BRANCHVOKey extends BaseVO {
    /**
     * This field corresponds to the database column CTSSPCOND_RESTRICTED_BRANCH.BRANCH_CODE
     */
    private BigDecimal BRANCH_CODE;

    /**
     * This field corresponds to the database column CTSSPCOND_RESTRICTED_BRANCH.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column CTSSPCOND_RESTRICTED_BRANCH.SPCOND_CODE
     */
    private BigDecimal SPCOND_CODE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTSSPCOND_RESTRICTED_BRANCH.BRANCH_CODE
     *
     * @return the value of CTSSPCOND_RESTRICTED_BRANCH.BRANCH_CODE
     */
    public BigDecimal getBRANCH_CODE() {
        return BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTSSPCOND_RESTRICTED_BRANCH.BRANCH_CODE
     *
     * @param BRANCH_CODE the value for CTSSPCOND_RESTRICTED_BRANCH.BRANCH_CODE
     */
    public void setBRANCH_CODE(BigDecimal BRANCH_CODE) {
        this.BRANCH_CODE = BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTSSPCOND_RESTRICTED_BRANCH.COMP_CODE
     *
     * @return the value of CTSSPCOND_RESTRICTED_BRANCH.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTSSPCOND_RESTRICTED_BRANCH.COMP_CODE
     *
     * @param COMP_CODE the value for CTSSPCOND_RESTRICTED_BRANCH.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTSSPCOND_RESTRICTED_BRANCH.SPCOND_CODE
     *
     * @return the value of CTSSPCOND_RESTRICTED_BRANCH.SPCOND_CODE
     */
    public BigDecimal getSPCOND_CODE() {
        return SPCOND_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTSSPCOND_RESTRICTED_BRANCH.SPCOND_CODE
     *
     * @param SPCOND_CODE the value for CTSSPCOND_RESTRICTED_BRANCH.SPCOND_CODE
     */
    public void setSPCOND_CODE(BigDecimal SPCOND_CODE) {
        this.SPCOND_CODE = SPCOND_CODE;
    }
}