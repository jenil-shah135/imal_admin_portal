package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class CTSTELLERVOKey extends BaseVO {
    /**
     * This field corresponds to the database column CTSTELLER.BRANCH_CODE
     */
    private BigDecimal BRANCH_CODE;

    /**
     * This field corresponds to the database column CTSTELLER.CODE
     */
    private BigDecimal CODE;

    /**
     * This field corresponds to the database column CTSTELLER.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTSTELLER.BRANCH_CODE
     *
     * @return the value of CTSTELLER.BRANCH_CODE
     */
    public BigDecimal getBRANCH_CODE() {
        return BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTSTELLER.BRANCH_CODE
     *
     * @param BRANCH_CODE the value for CTSTELLER.BRANCH_CODE
     */
    public void setBRANCH_CODE(BigDecimal BRANCH_CODE) {
        this.BRANCH_CODE = BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTSTELLER.CODE
     *
     * @return the value of CTSTELLER.CODE
     */
    public BigDecimal getCODE() {
        return CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTSTELLER.CODE
     *
     * @param CODE the value for CTSTELLER.CODE
     */
    public void setCODE(BigDecimal CODE) {
        this.CODE = CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTSTELLER.COMP_CODE
     *
     * @return the value of CTSTELLER.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTSTELLER.COMP_CODE
     *
     * @param COMP_CODE the value for CTSTELLER.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }
}