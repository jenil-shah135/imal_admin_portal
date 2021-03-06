package com.path.dbmaps.vo;

import java.math.BigDecimal;

import com.path.lib.vo.BaseVO;

public class PMSFUNDCIFVOKey extends BaseVO {
    /**
     * This field corresponds to the database column PMSFUNDCIF.BRANCH_CODE
     */
    private BigDecimal BRANCH_CODE;

    /**
     * This field corresponds to the database column PMSFUNDCIF.CIF_NO
     */
    private BigDecimal CIF_NO;

    /**
     * This field corresponds to the database column PMSFUNDCIF.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PMSFUNDCIF.BRANCH_CODE
     *
     * @return the value of PMSFUNDCIF.BRANCH_CODE
     */
    public BigDecimal getBRANCH_CODE() {
        return BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PMSFUNDCIF.BRANCH_CODE
     *
     * @param BRANCH_CODE the value for PMSFUNDCIF.BRANCH_CODE
     */
    public void setBRANCH_CODE(BigDecimal BRANCH_CODE) {
        this.BRANCH_CODE = BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PMSFUNDCIF.CIF_NO
     *
     * @return the value of PMSFUNDCIF.CIF_NO
     */
    public BigDecimal getCIF_NO() {
        return CIF_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PMSFUNDCIF.CIF_NO
     *
     * @param CIF_NO the value for PMSFUNDCIF.CIF_NO
     */
    public void setCIF_NO(BigDecimal CIF_NO) {
        this.CIF_NO = CIF_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PMSFUNDCIF.COMP_CODE
     *
     * @return the value of PMSFUNDCIF.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PMSFUNDCIF.COMP_CODE
     *
     * @param COMP_CODE the value for PMSFUNDCIF.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }
}