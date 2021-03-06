package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class SYS_PARAM_SCREEN_ELEMENTSVOKey extends BaseVO {
    /**
     * This field corresponds to the database column SYS_PARAM_SCREEN_ELEMENTS.APP_NAME
     */
    private String APP_NAME;

    /**
     * This field corresponds to the database column SYS_PARAM_SCREEN_ELEMENTS.FLD_IDENTIFIER
     */
    private BigDecimal FLD_IDENTIFIER;

    /**
     * This field corresponds to the database column SYS_PARAM_SCREEN_ELEMENTS.PROG_REF
     */
    private String PROG_REF;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_PARAM_SCREEN_ELEMENTS.APP_NAME
     *
     * @return the value of SYS_PARAM_SCREEN_ELEMENTS.APP_NAME
     */
    public String getAPP_NAME() {
        return APP_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PARAM_SCREEN_ELEMENTS.APP_NAME
     *
     * @param APP_NAME the value for SYS_PARAM_SCREEN_ELEMENTS.APP_NAME
     */
    public void setAPP_NAME(String APP_NAME) {
        this.APP_NAME = APP_NAME == null ? null : APP_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_PARAM_SCREEN_ELEMENTS.FLD_IDENTIFIER
     *
     * @return the value of SYS_PARAM_SCREEN_ELEMENTS.FLD_IDENTIFIER
     */
    public BigDecimal getFLD_IDENTIFIER() {
        return FLD_IDENTIFIER;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PARAM_SCREEN_ELEMENTS.FLD_IDENTIFIER
     *
     * @param FLD_IDENTIFIER the value for SYS_PARAM_SCREEN_ELEMENTS.FLD_IDENTIFIER
     */
    public void setFLD_IDENTIFIER(BigDecimal FLD_IDENTIFIER) {
        this.FLD_IDENTIFIER = FLD_IDENTIFIER;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_PARAM_SCREEN_ELEMENTS.PROG_REF
     *
     * @return the value of SYS_PARAM_SCREEN_ELEMENTS.PROG_REF
     */
    public String getPROG_REF() {
        return PROG_REF;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PARAM_SCREEN_ELEMENTS.PROG_REF
     *
     * @param PROG_REF the value for SYS_PARAM_SCREEN_ELEMENTS.PROG_REF
     */
    public void setPROG_REF(String PROG_REF) {
        this.PROG_REF = PROG_REF == null ? null : PROG_REF.trim();
    }
}