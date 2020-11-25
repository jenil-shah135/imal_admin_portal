package com.path.dbmaps.vo;

import java.math.BigDecimal;
import java.util.Date;

public class TRSCIFLIMIT_COLL_DETVO extends TRSCIFLIMIT_COLL_DETVOKey {
    /**
     * This field corresponds to the database column TRSCIFLIMIT_COLL_DET.COLLATERAL_NO
     */
    private BigDecimal COLLATERAL_NO;

    /**
     * This field corresponds to the database column TRSCIFLIMIT_COLL_DET.GROUP_ID
     */
    private BigDecimal GROUP_ID;

    /**
     * This field corresponds to the database column TRSCIFLIMIT_COLL_DET.COLLATERAL_FOR
     */
    private String COLLATERAL_FOR;

    /**
     * This field corresponds to the database column TRSCIFLIMIT_COLL_DET.COLLATERAL_BRANCH
     */
    private BigDecimal COLLATERAL_BRANCH;

    /**
     * This field corresponds to the database column TRSCIFLIMIT_COLL_DET.COLLATERAL_LINKED_DATE
     */
    private Date COLLATERAL_LINKED_DATE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSCIFLIMIT_COLL_DET.COLLATERAL_NO
     *
     * @return the value of TRSCIFLIMIT_COLL_DET.COLLATERAL_NO
     */
    public BigDecimal getCOLLATERAL_NO() {
        return COLLATERAL_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSCIFLIMIT_COLL_DET.COLLATERAL_NO
     *
     * @param COLLATERAL_NO the value for TRSCIFLIMIT_COLL_DET.COLLATERAL_NO
     */
    public void setCOLLATERAL_NO(BigDecimal COLLATERAL_NO) {
        this.COLLATERAL_NO = COLLATERAL_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSCIFLIMIT_COLL_DET.GROUP_ID
     *
     * @return the value of TRSCIFLIMIT_COLL_DET.GROUP_ID
     */
    public BigDecimal getGROUP_ID() {
        return GROUP_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSCIFLIMIT_COLL_DET.GROUP_ID
     *
     * @param GROUP_ID the value for TRSCIFLIMIT_COLL_DET.GROUP_ID
     */
    public void setGROUP_ID(BigDecimal GROUP_ID) {
        this.GROUP_ID = GROUP_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSCIFLIMIT_COLL_DET.COLLATERAL_FOR
     *
     * @return the value of TRSCIFLIMIT_COLL_DET.COLLATERAL_FOR
     */
    public String getCOLLATERAL_FOR() {
        return COLLATERAL_FOR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSCIFLIMIT_COLL_DET.COLLATERAL_FOR
     *
     * @param COLLATERAL_FOR the value for TRSCIFLIMIT_COLL_DET.COLLATERAL_FOR
     */
    public void setCOLLATERAL_FOR(String COLLATERAL_FOR) {
        this.COLLATERAL_FOR = COLLATERAL_FOR == null ? null : COLLATERAL_FOR.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSCIFLIMIT_COLL_DET.COLLATERAL_BRANCH
     *
     * @return the value of TRSCIFLIMIT_COLL_DET.COLLATERAL_BRANCH
     */
    public BigDecimal getCOLLATERAL_BRANCH() {
        return COLLATERAL_BRANCH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSCIFLIMIT_COLL_DET.COLLATERAL_BRANCH
     *
     * @param COLLATERAL_BRANCH the value for TRSCIFLIMIT_COLL_DET.COLLATERAL_BRANCH
     */
    public void setCOLLATERAL_BRANCH(BigDecimal COLLATERAL_BRANCH) {
        this.COLLATERAL_BRANCH = COLLATERAL_BRANCH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSCIFLIMIT_COLL_DET.COLLATERAL_LINKED_DATE
     *
     * @return the value of TRSCIFLIMIT_COLL_DET.COLLATERAL_LINKED_DATE
     */
    public Date getCOLLATERAL_LINKED_DATE() {
        return COLLATERAL_LINKED_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSCIFLIMIT_COLL_DET.COLLATERAL_LINKED_DATE
     *
     * @param COLLATERAL_LINKED_DATE the value for TRSCIFLIMIT_COLL_DET.COLLATERAL_LINKED_DATE
     */
    public void setCOLLATERAL_LINKED_DATE(Date COLLATERAL_LINKED_DATE) {
        this.COLLATERAL_LINKED_DATE = COLLATERAL_LINKED_DATE;
    }
}