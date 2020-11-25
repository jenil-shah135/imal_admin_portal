package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class CTS_CRITERIAVOKey extends BaseVO {
    /**
     * This field corresponds to the database column CTS_CRITERIA.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column CTS_CRITERIA.CRITERIA_CODE
     */
    private BigDecimal CRITERIA_CODE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_CRITERIA.COMP_CODE
     *
     * @return the value of CTS_CRITERIA.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_CRITERIA.COMP_CODE
     *
     * @param COMP_CODE the value for CTS_CRITERIA.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_CRITERIA.CRITERIA_CODE
     *
     * @return the value of CTS_CRITERIA.CRITERIA_CODE
     */
    public BigDecimal getCRITERIA_CODE() {
        return CRITERIA_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_CRITERIA.CRITERIA_CODE
     *
     * @param CRITERIA_CODE the value for CTS_CRITERIA.CRITERIA_CODE
     */
    public void setCRITERIA_CODE(BigDecimal CRITERIA_CODE) {
        this.CRITERIA_CODE = CRITERIA_CODE;
    }
}