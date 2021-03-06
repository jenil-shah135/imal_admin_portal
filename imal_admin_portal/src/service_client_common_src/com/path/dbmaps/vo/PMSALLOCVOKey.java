package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class PMSALLOCVOKey extends BaseVO {
    /**
     * This field corresponds to the database column PMSALLOC.ALLOC_NO
     */
    private BigDecimal ALLOC_NO;

    /**
     * This field corresponds to the database column PMSALLOC.BRANCH_CODE
     */
    private BigDecimal BRANCH_CODE;

    /**
     * This field corresponds to the database column PMSALLOC.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PMSALLOC.ALLOC_NO
     *
     * @return the value of PMSALLOC.ALLOC_NO
     */
    public BigDecimal getALLOC_NO() {
        return ALLOC_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PMSALLOC.ALLOC_NO
     *
     * @param ALLOC_NO the value for PMSALLOC.ALLOC_NO
     */
    public void setALLOC_NO(BigDecimal ALLOC_NO) {
        this.ALLOC_NO = ALLOC_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PMSALLOC.BRANCH_CODE
     *
     * @return the value of PMSALLOC.BRANCH_CODE
     */
    public BigDecimal getBRANCH_CODE() {
        return BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PMSALLOC.BRANCH_CODE
     *
     * @param BRANCH_CODE the value for PMSALLOC.BRANCH_CODE
     */
    public void setBRANCH_CODE(BigDecimal BRANCH_CODE) {
        this.BRANCH_CODE = BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PMSALLOC.COMP_CODE
     *
     * @return the value of PMSALLOC.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PMSALLOC.COMP_CODE
     *
     * @param COMP_CODE the value for PMSALLOC.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }
}