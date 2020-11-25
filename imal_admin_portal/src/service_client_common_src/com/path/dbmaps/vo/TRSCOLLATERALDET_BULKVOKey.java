package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class TRSCOLLATERALDET_BULKVOKey extends BaseVO {
    /**
     * This field corresponds to the database column TRSCOLLATERALDET_BULK.BRANCH_CODE
     */
    private BigDecimal BRANCH_CODE;

    /**
     * This field corresponds to the database column TRSCOLLATERALDET_BULK.BULK_REF_NO
     */
    private BigDecimal BULK_REF_NO;

    /**
     * This field corresponds to the database column TRSCOLLATERALDET_BULK.COLLATERAL_BRANCH
     */
    private BigDecimal COLLATERAL_BRANCH;

    /**
     * This field corresponds to the database column TRSCOLLATERALDET_BULK.COLLATERAL_NO
     */
    private BigDecimal COLLATERAL_NO;

    /**
     * This field corresponds to the database column TRSCOLLATERALDET_BULK.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSCOLLATERALDET_BULK.BRANCH_CODE
     *
     * @return the value of TRSCOLLATERALDET_BULK.BRANCH_CODE
     */
    public BigDecimal getBRANCH_CODE() {
        return BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSCOLLATERALDET_BULK.BRANCH_CODE
     *
     * @param BRANCH_CODE the value for TRSCOLLATERALDET_BULK.BRANCH_CODE
     */
    public void setBRANCH_CODE(BigDecimal BRANCH_CODE) {
        this.BRANCH_CODE = BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSCOLLATERALDET_BULK.BULK_REF_NO
     *
     * @return the value of TRSCOLLATERALDET_BULK.BULK_REF_NO
     */
    public BigDecimal getBULK_REF_NO() {
        return BULK_REF_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSCOLLATERALDET_BULK.BULK_REF_NO
     *
     * @param BULK_REF_NO the value for TRSCOLLATERALDET_BULK.BULK_REF_NO
     */
    public void setBULK_REF_NO(BigDecimal BULK_REF_NO) {
        this.BULK_REF_NO = BULK_REF_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSCOLLATERALDET_BULK.COLLATERAL_BRANCH
     *
     * @return the value of TRSCOLLATERALDET_BULK.COLLATERAL_BRANCH
     */
    public BigDecimal getCOLLATERAL_BRANCH() {
        return COLLATERAL_BRANCH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSCOLLATERALDET_BULK.COLLATERAL_BRANCH
     *
     * @param COLLATERAL_BRANCH the value for TRSCOLLATERALDET_BULK.COLLATERAL_BRANCH
     */
    public void setCOLLATERAL_BRANCH(BigDecimal COLLATERAL_BRANCH) {
        this.COLLATERAL_BRANCH = COLLATERAL_BRANCH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSCOLLATERALDET_BULK.COLLATERAL_NO
     *
     * @return the value of TRSCOLLATERALDET_BULK.COLLATERAL_NO
     */
    public BigDecimal getCOLLATERAL_NO() {
        return COLLATERAL_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSCOLLATERALDET_BULK.COLLATERAL_NO
     *
     * @param COLLATERAL_NO the value for TRSCOLLATERALDET_BULK.COLLATERAL_NO
     */
    public void setCOLLATERAL_NO(BigDecimal COLLATERAL_NO) {
        this.COLLATERAL_NO = COLLATERAL_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSCOLLATERALDET_BULK.COMP_CODE
     *
     * @return the value of TRSCOLLATERALDET_BULK.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSCOLLATERALDET_BULK.COMP_CODE
     *
     * @param COMP_CODE the value for TRSCOLLATERALDET_BULK.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }
}