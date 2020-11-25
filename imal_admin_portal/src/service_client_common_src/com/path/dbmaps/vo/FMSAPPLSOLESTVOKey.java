package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class FMSAPPLSOLESTVOKey extends BaseVO {
    /**
     * This field corresponds to the database column FMSAPPLSOLEST.APP_REF
     */
    private BigDecimal APP_REF;

    /**
     * This field corresponds to the database column FMSAPPLSOLEST.BRANCH
     */
    private BigDecimal BRANCH;

    /**
     * This field corresponds to the database column FMSAPPLSOLEST.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSAPPLSOLEST.APP_REF
     *
     * @return the value of FMSAPPLSOLEST.APP_REF
     */
    public BigDecimal getAPP_REF() {
        return APP_REF;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSAPPLSOLEST.APP_REF
     *
     * @param APP_REF the value for FMSAPPLSOLEST.APP_REF
     */
    public void setAPP_REF(BigDecimal APP_REF) {
        this.APP_REF = APP_REF;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSAPPLSOLEST.BRANCH
     *
     * @return the value of FMSAPPLSOLEST.BRANCH
     */
    public BigDecimal getBRANCH() {
        return BRANCH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSAPPLSOLEST.BRANCH
     *
     * @param BRANCH the value for FMSAPPLSOLEST.BRANCH
     */
    public void setBRANCH(BigDecimal BRANCH) {
        this.BRANCH = BRANCH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSAPPLSOLEST.COMP_CODE
     *
     * @return the value of FMSAPPLSOLEST.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSAPPLSOLEST.COMP_CODE
     *
     * @param COMP_CODE the value for FMSAPPLSOLEST.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }
}