package com.path.dbmaps.vo;

import java.math.BigDecimal;

public class FMSCOMMITTEEUSRVO extends FMSCOMMITTEEUSRVOKey {
    /**
     * This field corresponds to the database column FMSCOMMITTEEUSR.USER_ID
     */
    private String USER_ID;

    /**
     * This field corresponds to the database column FMSCOMMITTEEUSR.HIERARCHY
     */
    private BigDecimal HIERARCHY;

    /**
     * This field corresponds to the database column FMSCOMMITTEEUSR.APPROVAL_BRANCH
     */
    private BigDecimal APPROVAL_BRANCH;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSCOMMITTEEUSR.USER_ID
     *
     * @return the value of FMSCOMMITTEEUSR.USER_ID
     */
    public String getUSER_ID() {
        return USER_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSCOMMITTEEUSR.USER_ID
     *
     * @param USER_ID the value for FMSCOMMITTEEUSR.USER_ID
     */
    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID == null ? null : USER_ID.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSCOMMITTEEUSR.HIERARCHY
     *
     * @return the value of FMSCOMMITTEEUSR.HIERARCHY
     */
    public BigDecimal getHIERARCHY() {
        return HIERARCHY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSCOMMITTEEUSR.HIERARCHY
     *
     * @param HIERARCHY the value for FMSCOMMITTEEUSR.HIERARCHY
     */
    public void setHIERARCHY(BigDecimal HIERARCHY) {
        this.HIERARCHY = HIERARCHY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSCOMMITTEEUSR.APPROVAL_BRANCH
     *
     * @return the value of FMSCOMMITTEEUSR.APPROVAL_BRANCH
     */
    public BigDecimal getAPPROVAL_BRANCH() {
        return APPROVAL_BRANCH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSCOMMITTEEUSR.APPROVAL_BRANCH
     *
     * @param APPROVAL_BRANCH the value for FMSCOMMITTEEUSR.APPROVAL_BRANCH
     */
    public void setAPPROVAL_BRANCH(BigDecimal APPROVAL_BRANCH) {
        this.APPROVAL_BRANCH = APPROVAL_BRANCH;
    }
}