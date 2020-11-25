package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class UNITSVOKey extends BaseVO {
    /**
     * This field corresponds to the database column UNITS.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column UNITS.DEPT_CODE
     */
    private BigDecimal DEPT_CODE;

    /**
     * This field corresponds to the database column UNITS.DIVISION_CODE
     */
    private BigDecimal DIVISION_CODE;

    /**
     * This field corresponds to the database column UNITS.UNIT_CODE
     */
    private BigDecimal UNIT_CODE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UNITS.COMP_CODE
     *
     * @return the value of UNITS.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UNITS.COMP_CODE
     *
     * @param COMP_CODE the value for UNITS.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UNITS.DEPT_CODE
     *
     * @return the value of UNITS.DEPT_CODE
     */
    public BigDecimal getDEPT_CODE() {
        return DEPT_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UNITS.DEPT_CODE
     *
     * @param DEPT_CODE the value for UNITS.DEPT_CODE
     */
    public void setDEPT_CODE(BigDecimal DEPT_CODE) {
        this.DEPT_CODE = DEPT_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UNITS.DIVISION_CODE
     *
     * @return the value of UNITS.DIVISION_CODE
     */
    public BigDecimal getDIVISION_CODE() {
        return DIVISION_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UNITS.DIVISION_CODE
     *
     * @param DIVISION_CODE the value for UNITS.DIVISION_CODE
     */
    public void setDIVISION_CODE(BigDecimal DIVISION_CODE) {
        this.DIVISION_CODE = DIVISION_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UNITS.UNIT_CODE
     *
     * @return the value of UNITS.UNIT_CODE
     */
    public BigDecimal getUNIT_CODE() {
        return UNIT_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UNITS.UNIT_CODE
     *
     * @param UNIT_CODE the value for UNITS.UNIT_CODE
     */
    public void setUNIT_CODE(BigDecimal UNIT_CODE) {
        this.UNIT_CODE = UNIT_CODE;
    }
}