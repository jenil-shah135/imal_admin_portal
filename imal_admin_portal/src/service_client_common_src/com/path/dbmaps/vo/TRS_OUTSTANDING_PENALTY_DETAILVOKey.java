package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class TRS_OUTSTANDING_PENALTY_DETAILVOKey extends BaseVO {
    /**
     * This field corresponds to the database column TRS_OUTSTANDING_PENALTY_DETAIL.BRANCH_CODE
     */
    private BigDecimal BRANCH_CODE;

    /**
     * This field corresponds to the database column TRS_OUTSTANDING_PENALTY_DETAIL.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column TRS_OUTSTANDING_PENALTY_DETAIL.TRS_NBR
     */
    private BigDecimal TRS_NBR;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_OUTSTANDING_PENALTY_DETAIL.BRANCH_CODE
     *
     * @return the value of TRS_OUTSTANDING_PENALTY_DETAIL.BRANCH_CODE
     */
    public BigDecimal getBRANCH_CODE() {
        return BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_OUTSTANDING_PENALTY_DETAIL.BRANCH_CODE
     *
     * @param BRANCH_CODE the value for TRS_OUTSTANDING_PENALTY_DETAIL.BRANCH_CODE
     */
    public void setBRANCH_CODE(BigDecimal BRANCH_CODE) {
        this.BRANCH_CODE = BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_OUTSTANDING_PENALTY_DETAIL.COMP_CODE
     *
     * @return the value of TRS_OUTSTANDING_PENALTY_DETAIL.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_OUTSTANDING_PENALTY_DETAIL.COMP_CODE
     *
     * @param COMP_CODE the value for TRS_OUTSTANDING_PENALTY_DETAIL.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRS_OUTSTANDING_PENALTY_DETAIL.TRS_NBR
     *
     * @return the value of TRS_OUTSTANDING_PENALTY_DETAIL.TRS_NBR
     */
    public BigDecimal getTRS_NBR() {
        return TRS_NBR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRS_OUTSTANDING_PENALTY_DETAIL.TRS_NBR
     *
     * @param TRS_NBR the value for TRS_OUTSTANDING_PENALTY_DETAIL.TRS_NBR
     */
    public void setTRS_NBR(BigDecimal TRS_NBR) {
        this.TRS_NBR = TRS_NBR;
    }
}