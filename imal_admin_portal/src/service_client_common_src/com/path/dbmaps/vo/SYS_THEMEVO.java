package com.path.dbmaps.vo;

import java.math.BigDecimal;
import java.util.Date;

public class SYS_THEMEVO extends SYS_THEMEVOKey {
    /**
     * This field corresponds to the database column SYS_THEME.THEME_NAME
     */
    private String THEME_NAME;

    /**
     * This field corresponds to the database column SYS_THEME.IS_ACTIVE_YN
     */
    private BigDecimal IS_ACTIVE_YN;

    /**
     * This field corresponds to the database column SYS_THEME.CREATED_BY
     */
    private String CREATED_BY;

    /**
     * This field corresponds to the database column SYS_THEME.UPDATED_BY
     */
    private String UPDATED_BY;

    /**
     * This field corresponds to the database column SYS_THEME.CREATED_DATE
     */
    private Date CREATED_DATE;

    /**
     * This field corresponds to the database column SYS_THEME.UPDATED_DATE
     */
    private Date UPDATED_DATE;

    /**
     * This field corresponds to the database column SYS_THEME.IS_UPDATED_YN
     */
    private BigDecimal IS_UPDATED_YN;

    /**
     * This field corresponds to the database column SYS_THEME.APP_NAME
     */
    private String APP_NAME;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_THEME.THEME_NAME
     *
     * @return the value of SYS_THEME.THEME_NAME
     */
    public String getTHEME_NAME() {
        return THEME_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_THEME.THEME_NAME
     *
     * @param THEME_NAME the value for SYS_THEME.THEME_NAME
     */
    public void setTHEME_NAME(String THEME_NAME) {
        this.THEME_NAME = THEME_NAME == null ? null : THEME_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_THEME.IS_ACTIVE_YN
     *
     * @return the value of SYS_THEME.IS_ACTIVE_YN
     */
    public BigDecimal getIS_ACTIVE_YN() {
        return IS_ACTIVE_YN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_THEME.IS_ACTIVE_YN
     *
     * @param IS_ACTIVE_YN the value for SYS_THEME.IS_ACTIVE_YN
     */
    public void setIS_ACTIVE_YN(BigDecimal IS_ACTIVE_YN) {
        this.IS_ACTIVE_YN = IS_ACTIVE_YN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_THEME.CREATED_BY
     *
     * @return the value of SYS_THEME.CREATED_BY
     */
    public String getCREATED_BY() {
        return CREATED_BY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_THEME.CREATED_BY
     *
     * @param CREATED_BY the value for SYS_THEME.CREATED_BY
     */
    public void setCREATED_BY(String CREATED_BY) {
        this.CREATED_BY = CREATED_BY == null ? null : CREATED_BY.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_THEME.UPDATED_BY
     *
     * @return the value of SYS_THEME.UPDATED_BY
     */
    public String getUPDATED_BY() {
        return UPDATED_BY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_THEME.UPDATED_BY
     *
     * @param UPDATED_BY the value for SYS_THEME.UPDATED_BY
     */
    public void setUPDATED_BY(String UPDATED_BY) {
        this.UPDATED_BY = UPDATED_BY == null ? null : UPDATED_BY.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_THEME.CREATED_DATE
     *
     * @return the value of SYS_THEME.CREATED_DATE
     */
    public Date getCREATED_DATE() {
        return CREATED_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_THEME.CREATED_DATE
     *
     * @param CREATED_DATE the value for SYS_THEME.CREATED_DATE
     */
    public void setCREATED_DATE(Date CREATED_DATE) {
        this.CREATED_DATE = CREATED_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_THEME.UPDATED_DATE
     *
     * @return the value of SYS_THEME.UPDATED_DATE
     */
    public Date getUPDATED_DATE() {
        return UPDATED_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_THEME.UPDATED_DATE
     *
     * @param UPDATED_DATE the value for SYS_THEME.UPDATED_DATE
     */
    public void setUPDATED_DATE(Date UPDATED_DATE) {
        this.UPDATED_DATE = UPDATED_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_THEME.IS_UPDATED_YN
     *
     * @return the value of SYS_THEME.IS_UPDATED_YN
     */
    public BigDecimal getIS_UPDATED_YN() {
        return IS_UPDATED_YN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_THEME.IS_UPDATED_YN
     *
     * @param IS_UPDATED_YN the value for SYS_THEME.IS_UPDATED_YN
     */
    public void setIS_UPDATED_YN(BigDecimal IS_UPDATED_YN) {
        this.IS_UPDATED_YN = IS_UPDATED_YN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_THEME.APP_NAME
     *
     * @return the value of SYS_THEME.APP_NAME
     */
    public String getAPP_NAME() {
        return APP_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_THEME.APP_NAME
     *
     * @param APP_NAME the value for SYS_THEME.APP_NAME
     */
    public void setAPP_NAME(String APP_NAME) {
        this.APP_NAME = APP_NAME == null ? null : APP_NAME.trim();
    }
}