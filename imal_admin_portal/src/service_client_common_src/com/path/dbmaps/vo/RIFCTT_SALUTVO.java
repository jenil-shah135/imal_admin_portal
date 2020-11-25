package com.path.dbmaps.vo;

import java.math.BigDecimal;

public class RIFCTT_SALUTVO extends RIFCTT_SALUTVOKey {
    /**
     * This field corresponds to the database column RIFCTT_SALUT.CIVIL_CODE
     */
    private BigDecimal CIVIL_CODE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RIFCTT_SALUT.CIVIL_CODE
     *
     * @return the value of RIFCTT_SALUT.CIVIL_CODE
     */
    public BigDecimal getCIVIL_CODE() {
        return CIVIL_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RIFCTT_SALUT.CIVIL_CODE
     *
     * @param CIVIL_CODE the value for RIFCTT_SALUT.CIVIL_CODE
     */
    public void setCIVIL_CODE(BigDecimal CIVIL_CODE) {
        this.CIVIL_CODE = CIVIL_CODE;
    }
}