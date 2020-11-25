package com.path.dbmaps.vo;

import java.math.BigDecimal;

import com.path.lib.vo.BaseVO;

public class FMSCOLATTYPE_PROPERTYVOKey extends BaseVO {
    /**
     * This field corresponds to the database column FMSCOLATTYPE_PROPERTY.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column FMSCOLATTYPE_PROPERTY.PROPERTY_CODE
     */
    private BigDecimal PROPERTY_CODE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSCOLATTYPE_PROPERTY.COMP_CODE
     *
     * @return the value of FMSCOLATTYPE_PROPERTY.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSCOLATTYPE_PROPERTY.COMP_CODE
     *
     * @param COMP_CODE the value for FMSCOLATTYPE_PROPERTY.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSCOLATTYPE_PROPERTY.PROPERTY_CODE
     *
     * @return the value of FMSCOLATTYPE_PROPERTY.PROPERTY_CODE
     */
    public BigDecimal getPROPERTY_CODE() {
        return PROPERTY_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSCOLATTYPE_PROPERTY.PROPERTY_CODE
     *
     * @param PROPERTY_CODE the value for FMSCOLATTYPE_PROPERTY.PROPERTY_CODE
     */
    public void setPROPERTY_CODE(BigDecimal PROPERTY_CODE) {
        this.PROPERTY_CODE = PROPERTY_CODE;
    }
}