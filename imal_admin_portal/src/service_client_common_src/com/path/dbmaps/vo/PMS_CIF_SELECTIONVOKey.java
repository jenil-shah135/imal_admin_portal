package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class PMS_CIF_SELECTIONVOKey extends BaseVO {
    /**
     * This field corresponds to the database column PMS_CIF_SELECTION.APP_NAME
     */
    private String APP_NAME;

    /**
     * This field corresponds to the database column PMS_CIF_SELECTION.BRANCH
     */
    private BigDecimal BRANCH;

    /**
     * This field corresponds to the database column PMS_CIF_SELECTION.CIF_NO
     */
    private BigDecimal CIF_NO;

    /**
     * This field corresponds to the database column PMS_CIF_SELECTION.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column PMS_CIF_SELECTION.REP_REF
     */
    private String REP_REF;

    /**
     * This field corresponds to the database column PMS_CIF_SELECTION.USER_ID
     */
    private String USER_ID;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PMS_CIF_SELECTION.APP_NAME
     *
     * @return the value of PMS_CIF_SELECTION.APP_NAME
     */
    public String getAPP_NAME() {
        return APP_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PMS_CIF_SELECTION.APP_NAME
     *
     * @param APP_NAME the value for PMS_CIF_SELECTION.APP_NAME
     */
    public void setAPP_NAME(String APP_NAME) {
        this.APP_NAME = APP_NAME == null ? null : APP_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PMS_CIF_SELECTION.BRANCH
     *
     * @return the value of PMS_CIF_SELECTION.BRANCH
     */
    public BigDecimal getBRANCH() {
        return BRANCH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PMS_CIF_SELECTION.BRANCH
     *
     * @param BRANCH the value for PMS_CIF_SELECTION.BRANCH
     */
    public void setBRANCH(BigDecimal BRANCH) {
        this.BRANCH = BRANCH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PMS_CIF_SELECTION.CIF_NO
     *
     * @return the value of PMS_CIF_SELECTION.CIF_NO
     */
    public BigDecimal getCIF_NO() {
        return CIF_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PMS_CIF_SELECTION.CIF_NO
     *
     * @param CIF_NO the value for PMS_CIF_SELECTION.CIF_NO
     */
    public void setCIF_NO(BigDecimal CIF_NO) {
        this.CIF_NO = CIF_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PMS_CIF_SELECTION.COMP_CODE
     *
     * @return the value of PMS_CIF_SELECTION.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PMS_CIF_SELECTION.COMP_CODE
     *
     * @param COMP_CODE the value for PMS_CIF_SELECTION.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PMS_CIF_SELECTION.REP_REF
     *
     * @return the value of PMS_CIF_SELECTION.REP_REF
     */
    public String getREP_REF() {
        return REP_REF;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PMS_CIF_SELECTION.REP_REF
     *
     * @param REP_REF the value for PMS_CIF_SELECTION.REP_REF
     */
    public void setREP_REF(String REP_REF) {
        this.REP_REF = REP_REF == null ? null : REP_REF.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PMS_CIF_SELECTION.USER_ID
     *
     * @return the value of PMS_CIF_SELECTION.USER_ID
     */
    public String getUSER_ID() {
        return USER_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PMS_CIF_SELECTION.USER_ID
     *
     * @param USER_ID the value for PMS_CIF_SELECTION.USER_ID
     */
    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID == null ? null : USER_ID.trim();
    }
}