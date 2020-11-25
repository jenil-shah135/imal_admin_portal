package com.path.dbmaps.vo;

import java.math.BigDecimal;

public class CIF_CHANNEL_REGISTRATIONVO extends CIF_CHANNEL_REGISTRATIONVOKey {
    /**
     * This field corresponds to the database column CIF_CHANNEL_REGISTRATION.IS_REGISTRED_YN
     */
    private String IS_REGISTRED_YN; 
    
    /**
     * This field corresponds to the database column CIF_CHANNEL_REGISTRATION.ACC_BR
     */
    private BigDecimal ACC_BR;

    /**
     * This field corresponds to the database column CIF_CHANNEL_REGISTRATION.ACC_CY
     */
    private BigDecimal ACC_CY;

    /**
     * This field corresponds to the database column CIF_CHANNEL_REGISTRATION.ACC_GL
     */
    private BigDecimal ACC_GL;

    /**
     * This field corresponds to the database column CIF_CHANNEL_REGISTRATION.ACC_CIF
     */
    private BigDecimal ACC_CIF;

    /**
     * This field corresponds to the database column CIF_CHANNEL_REGISTRATION.ACC_SL
     */
    private BigDecimal ACC_SL;


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CIF_CHANNEL_REGISTRATION.IS_REGISTRED_YN
     *
     * @return the value of CIF_CHANNEL_REGISTRATION.IS_REGISTRED_YN
     */
    public String getIS_REGISTRED_YN() {
        return IS_REGISTRED_YN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CIF_CHANNEL_REGISTRATION.IS_REGISTRED_YN
     *
     * @param IS_REGISTRED_YN the value for CIF_CHANNEL_REGISTRATION.IS_REGISTRED_YN
     */
    public void setIS_REGISTRED_YN(String IS_REGISTRED_YN) {
        this.IS_REGISTRED_YN = IS_REGISTRED_YN == null ? null : IS_REGISTRED_YN.trim();
    }
    

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CIF_CHANNEL_REGISTRATION.ACC_BR
     *
     * @return the value of CIF_CHANNEL_REGISTRATION.ACC_BR
     */
    public BigDecimal getACC_BR() {
        return ACC_BR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CIF_CHANNEL_REGISTRATION.ACC_BR
     *
     * @param ACC_BR the value for CIF_CHANNEL_REGISTRATION.ACC_BR
     */
    public void setACC_BR(BigDecimal ACC_BR) {
        this.ACC_BR = ACC_BR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CIF_CHANNEL_REGISTRATION.ACC_CY
     *
     * @return the value of CIF_CHANNEL_REGISTRATION.ACC_CY
     */
    public BigDecimal getACC_CY() {
        return ACC_CY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CIF_CHANNEL_REGISTRATION.ACC_CY
     *
     * @param ACC_CY the value for CIF_CHANNEL_REGISTRATION.ACC_CY
     */
    public void setACC_CY(BigDecimal ACC_CY) {
        this.ACC_CY = ACC_CY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CIF_CHANNEL_REGISTRATION.ACC_GL
     *
     * @return the value of CIF_CHANNEL_REGISTRATION.ACC_GL
     */
    public BigDecimal getACC_GL() {
        return ACC_GL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CIF_CHANNEL_REGISTRATION.ACC_GL
     *
     * @param ACC_GL the value for CIF_CHANNEL_REGISTRATION.ACC_GL
     */
    public void setACC_GL(BigDecimal ACC_GL) {
        this.ACC_GL = ACC_GL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CIF_CHANNEL_REGISTRATION.ACC_CIF
     *
     * @return the value of CIF_CHANNEL_REGISTRATION.ACC_CIF
     */
    public BigDecimal getACC_CIF() {
        return ACC_CIF;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CIF_CHANNEL_REGISTRATION.ACC_CIF
     *
     * @param ACC_CIF the value for CIF_CHANNEL_REGISTRATION.ACC_CIF
     */
    public void setACC_CIF(BigDecimal ACC_CIF) {
        this.ACC_CIF = ACC_CIF;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CIF_CHANNEL_REGISTRATION.ACC_SL
     *
     * @return the value of CIF_CHANNEL_REGISTRATION.ACC_SL
     */
    public BigDecimal getACC_SL() {
        return ACC_SL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CIF_CHANNEL_REGISTRATION.ACC_SL
     *
     * @param ACC_SL the value for CIF_CHANNEL_REGISTRATION.ACC_SL
     */
    public void setACC_SL(BigDecimal ACC_SL) {
        this.ACC_SL = ACC_SL;
    }
}