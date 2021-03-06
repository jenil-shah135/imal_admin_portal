package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class SIRON_PD_PASSPORTVO extends BaseVO {
    /**
     * This field corresponds to the database column SIRON_PD_PASSPORT.LINE
     */
    private BigDecimal LINE;

    /**
     * This field corresponds to the database column SIRON_PD_PASSPORT.PASSPORT
     */
    private String PASSPORT;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SIRON_PD_PASSPORT.LINE
     *
     * @return the value of SIRON_PD_PASSPORT.LINE
     */
    public BigDecimal getLINE() {
        return LINE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SIRON_PD_PASSPORT.LINE
     *
     * @param LINE the value for SIRON_PD_PASSPORT.LINE
     */
    public void setLINE(BigDecimal LINE) {
        this.LINE = LINE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SIRON_PD_PASSPORT.PASSPORT
     *
     * @return the value of SIRON_PD_PASSPORT.PASSPORT
     */
    public String getPASSPORT() {
        return PASSPORT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SIRON_PD_PASSPORT.PASSPORT
     *
     * @param PASSPORT the value for SIRON_PD_PASSPORT.PASSPORT
     */
    public void setPASSPORT(String PASSPORT) {
        this.PASSPORT = PASSPORT == null ? null : PASSPORT.trim();
    }
}