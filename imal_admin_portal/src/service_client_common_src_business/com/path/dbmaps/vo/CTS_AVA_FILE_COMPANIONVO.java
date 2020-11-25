package com.path.dbmaps.vo;

import java.math.BigDecimal;

public class CTS_AVA_FILE_COMPANIONVO extends CTS_AVA_FILE_COMPANIONVOKey {
    /**
     * This field corresponds to the database column CTS_AVA_FILE_COMPANION.CIF_NO
     */
    private BigDecimal CIF_NO;

    /**
     * This field corresponds to the database column CTS_AVA_FILE_COMPANION.SHORT_NAME
     */
    private String SHORT_NAME;

    /**
     * This field corresponds to the database column CTS_AVA_FILE_COMPANION.LONG_NAME
     */
    private String LONG_NAME;

    /**
     * This field corresponds to the database column CTS_AVA_FILE_COMPANION.ID_TYPE
     */
    private BigDecimal ID_TYPE;

    /**
     * This field corresponds to the database column CTS_AVA_FILE_COMPANION.ID_NUMBER
     */
    private String ID_NUMBER;

    /**
     * This field corresponds to the database column CTS_AVA_FILE_COMPANION.ADDRESS
     */
    private String ADDRESS;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_AVA_FILE_COMPANION.CIF_NO
     *
     * @return the value of CTS_AVA_FILE_COMPANION.CIF_NO
     */
    public BigDecimal getCIF_NO() {
        return CIF_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_AVA_FILE_COMPANION.CIF_NO
     *
     * @param CIF_NO the value for CTS_AVA_FILE_COMPANION.CIF_NO
     */
    public void setCIF_NO(BigDecimal CIF_NO) {
        this.CIF_NO = CIF_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_AVA_FILE_COMPANION.SHORT_NAME
     *
     * @return the value of CTS_AVA_FILE_COMPANION.SHORT_NAME
     */
    public String getSHORT_NAME() {
        return SHORT_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_AVA_FILE_COMPANION.SHORT_NAME
     *
     * @param SHORT_NAME the value for CTS_AVA_FILE_COMPANION.SHORT_NAME
     */
    public void setSHORT_NAME(String SHORT_NAME) {
        this.SHORT_NAME = SHORT_NAME == null ? null : SHORT_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_AVA_FILE_COMPANION.LONG_NAME
     *
     * @return the value of CTS_AVA_FILE_COMPANION.LONG_NAME
     */
    public String getLONG_NAME() {
        return LONG_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_AVA_FILE_COMPANION.LONG_NAME
     *
     * @param LONG_NAME the value for CTS_AVA_FILE_COMPANION.LONG_NAME
     */
    public void setLONG_NAME(String LONG_NAME) {
        this.LONG_NAME = LONG_NAME == null ? null : LONG_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_AVA_FILE_COMPANION.ID_TYPE
     *
     * @return the value of CTS_AVA_FILE_COMPANION.ID_TYPE
     */
    public BigDecimal getID_TYPE() {
        return ID_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_AVA_FILE_COMPANION.ID_TYPE
     *
     * @param ID_TYPE the value for CTS_AVA_FILE_COMPANION.ID_TYPE
     */
    public void setID_TYPE(BigDecimal ID_TYPE) {
        this.ID_TYPE = ID_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_AVA_FILE_COMPANION.ID_NUMBER
     *
     * @return the value of CTS_AVA_FILE_COMPANION.ID_NUMBER
     */
    public String getID_NUMBER() {
        return ID_NUMBER;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_AVA_FILE_COMPANION.ID_NUMBER
     *
     * @param ID_NUMBER the value for CTS_AVA_FILE_COMPANION.ID_NUMBER
     */
    public void setID_NUMBER(String ID_NUMBER) {
        this.ID_NUMBER = ID_NUMBER == null ? null : ID_NUMBER.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_AVA_FILE_COMPANION.ADDRESS
     *
     * @return the value of CTS_AVA_FILE_COMPANION.ADDRESS
     */
    public String getADDRESS() {
        return ADDRESS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_AVA_FILE_COMPANION.ADDRESS
     *
     * @param ADDRESS the value for CTS_AVA_FILE_COMPANION.ADDRESS
     */
    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS == null ? null : ADDRESS.trim();
    }
}