package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class EOD_PROCESS_DEPENDENCIESVOKey extends BaseVO {
    /**
     * This field corresponds to the database column EOD_PROCESS_DEPENDENCIES.DEPENDENT_PROCESS_CODE
     */
    private BigDecimal DEPENDENT_PROCESS_CODE;

    /**
     * This field corresponds to the database column EOD_PROCESS_DEPENDENCIES.PROCESS_CODE
     */
    private BigDecimal PROCESS_CODE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EOD_PROCESS_DEPENDENCIES.DEPENDENT_PROCESS_CODE
     *
     * @return the value of EOD_PROCESS_DEPENDENCIES.DEPENDENT_PROCESS_CODE
     */
    public BigDecimal getDEPENDENT_PROCESS_CODE() {
        return DEPENDENT_PROCESS_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EOD_PROCESS_DEPENDENCIES.DEPENDENT_PROCESS_CODE
     *
     * @param DEPENDENT_PROCESS_CODE the value for EOD_PROCESS_DEPENDENCIES.DEPENDENT_PROCESS_CODE
     */
    public void setDEPENDENT_PROCESS_CODE(BigDecimal DEPENDENT_PROCESS_CODE) {
        this.DEPENDENT_PROCESS_CODE = DEPENDENT_PROCESS_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EOD_PROCESS_DEPENDENCIES.PROCESS_CODE
     *
     * @return the value of EOD_PROCESS_DEPENDENCIES.PROCESS_CODE
     */
    public BigDecimal getPROCESS_CODE() {
        return PROCESS_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EOD_PROCESS_DEPENDENCIES.PROCESS_CODE
     *
     * @param PROCESS_CODE the value for EOD_PROCESS_DEPENDENCIES.PROCESS_CODE
     */
    public void setPROCESS_CODE(BigDecimal PROCESS_CODE) {
        this.PROCESS_CODE = PROCESS_CODE;
    }
}