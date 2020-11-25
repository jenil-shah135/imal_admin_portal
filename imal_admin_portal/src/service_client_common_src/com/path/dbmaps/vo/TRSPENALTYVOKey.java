package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class TRSPENALTYVOKey extends BaseVO {
    /**
     * This field corresponds to the database column TRSPENALTY.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column TRSPENALTY.PENALTY_CODE
     */
    private BigDecimal PENALTY_CODE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSPENALTY.COMP_CODE
     *
     * @return the value of TRSPENALTY.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSPENALTY.COMP_CODE
     *
     * @param COMP_CODE the value for TRSPENALTY.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSPENALTY.PENALTY_CODE
     *
     * @return the value of TRSPENALTY.PENALTY_CODE
     */
    public BigDecimal getPENALTY_CODE() {
        return PENALTY_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSPENALTY.PENALTY_CODE
     *
     * @param PENALTY_CODE the value for TRSPENALTY.PENALTY_CODE
     */
    public void setPENALTY_CODE(BigDecimal PENALTY_CODE) {
        this.PENALTY_CODE = PENALTY_CODE;
    }
}