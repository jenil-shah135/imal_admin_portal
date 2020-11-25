package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class TRSREASONVOKey extends BaseVO {
    /**
     * This field corresponds to the database column TRSREASON.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column TRSREASON.REASON_CODE
     */
    private BigDecimal REASON_CODE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSREASON.COMP_CODE
     *
     * @return the value of TRSREASON.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSREASON.COMP_CODE
     *
     * @param COMP_CODE the value for TRSREASON.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSREASON.REASON_CODE
     *
     * @return the value of TRSREASON.REASON_CODE
     */
    public BigDecimal getREASON_CODE() {
        return REASON_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSREASON.REASON_CODE
     *
     * @param REASON_CODE the value for TRSREASON.REASON_CODE
     */
    public void setREASON_CODE(BigDecimal REASON_CODE) {
        this.REASON_CODE = REASON_CODE;
    }
}