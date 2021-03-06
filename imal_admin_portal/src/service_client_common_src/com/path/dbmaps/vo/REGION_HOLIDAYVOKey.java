package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class REGION_HOLIDAYVOKey extends BaseVO {
    /**
     * This field corresponds to the database column REGION_HOLIDAY.DD_HOL
     */
    private BigDecimal DD_HOL;

    /**
     * This field corresponds to the database column REGION_HOLIDAY.MM_HOL
     */
    private BigDecimal MM_HOL;

    /**
     * This field corresponds to the database column REGION_HOLIDAY.REGION_CODE
     */
    private BigDecimal REGION_CODE;

    /**
     * This field corresponds to the database column REGION_HOLIDAY.YYYY_HOL
     */
    private BigDecimal YYYY_HOL;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REGION_HOLIDAY.DD_HOL
     *
     * @return the value of REGION_HOLIDAY.DD_HOL
     */
    public BigDecimal getDD_HOL() {
        return DD_HOL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REGION_HOLIDAY.DD_HOL
     *
     * @param DD_HOL the value for REGION_HOLIDAY.DD_HOL
     */
    public void setDD_HOL(BigDecimal DD_HOL) {
        this.DD_HOL = DD_HOL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REGION_HOLIDAY.MM_HOL
     *
     * @return the value of REGION_HOLIDAY.MM_HOL
     */
    public BigDecimal getMM_HOL() {
        return MM_HOL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REGION_HOLIDAY.MM_HOL
     *
     * @param MM_HOL the value for REGION_HOLIDAY.MM_HOL
     */
    public void setMM_HOL(BigDecimal MM_HOL) {
        this.MM_HOL = MM_HOL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REGION_HOLIDAY.REGION_CODE
     *
     * @return the value of REGION_HOLIDAY.REGION_CODE
     */
    public BigDecimal getREGION_CODE() {
        return REGION_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REGION_HOLIDAY.REGION_CODE
     *
     * @param REGION_CODE the value for REGION_HOLIDAY.REGION_CODE
     */
    public void setREGION_CODE(BigDecimal REGION_CODE) {
        this.REGION_CODE = REGION_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REGION_HOLIDAY.YYYY_HOL
     *
     * @return the value of REGION_HOLIDAY.YYYY_HOL
     */
    public BigDecimal getYYYY_HOL() {
        return YYYY_HOL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REGION_HOLIDAY.YYYY_HOL
     *
     * @param YYYY_HOL the value for REGION_HOLIDAY.YYYY_HOL
     */
    public void setYYYY_HOL(BigDecimal YYYY_HOL) {
        this.YYYY_HOL = YYYY_HOL;
    }
}