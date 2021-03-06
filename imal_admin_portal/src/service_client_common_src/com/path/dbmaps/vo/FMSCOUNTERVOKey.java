package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class FMSCOUNTERVOKey extends BaseVO {
    /**
     * This field corresponds to the database column FMSCOUNTER.BRANCH
     */
    private BigDecimal BRANCH;

    /**
     * This field corresponds to the database column FMSCOUNTER.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column FMSCOUNTER.TYPE
     */
    private BigDecimal TYPE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSCOUNTER.BRANCH
     *
     * @return the value of FMSCOUNTER.BRANCH
     */
    public BigDecimal getBRANCH() {
        return BRANCH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSCOUNTER.BRANCH
     *
     * @param BRANCH the value for FMSCOUNTER.BRANCH
     */
    public void setBRANCH(BigDecimal BRANCH) {
        this.BRANCH = BRANCH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSCOUNTER.COMP_CODE
     *
     * @return the value of FMSCOUNTER.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSCOUNTER.COMP_CODE
     *
     * @param COMP_CODE the value for FMSCOUNTER.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSCOUNTER.TYPE
     *
     * @return the value of FMSCOUNTER.TYPE
     */
    public BigDecimal getTYPE() {
        return TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSCOUNTER.TYPE
     *
     * @param TYPE the value for FMSCOUNTER.TYPE
     */
    public void setTYPE(BigDecimal TYPE) {
        this.TYPE = TYPE;
    }
}