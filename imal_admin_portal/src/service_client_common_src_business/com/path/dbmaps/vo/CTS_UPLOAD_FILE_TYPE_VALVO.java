package com.path.dbmaps.vo;

import java.math.BigDecimal;

public class CTS_UPLOAD_FILE_TYPE_VALVO extends CTS_UPLOAD_FILE_TYPE_VALVOKey {
    /**
     * This field corresponds to the database column CTS_UPLOAD_FILE_TYPE_VAL.INCLUDE_VAL
     */
    private String INCLUDE_VAL;

    /**
     * This field corresponds to the database column CTS_UPLOAD_FILE_TYPE_VAL.VAL_ORDER
     */
    private BigDecimal VAL_ORDER;

    /**
     * This field corresponds to the database column CTS_UPLOAD_FILE_TYPE_VAL.DATA_RETRIEVE
     */
    private String DATA_RETRIEVE;

    /**
     * This field corresponds to the database column CTS_UPLOAD_FILE_TYPE_VAL.DATA_SAVING
     */
    private String DATA_SAVING;

    /**
     * This field corresponds to the database column CTS_UPLOAD_FILE_TYPE_VAL.CHQ_IMG_MAND
     */
    private String CHQ_IMG_MAND;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_UPLOAD_FILE_TYPE_VAL.INCLUDE_VAL
     *
     * @return the value of CTS_UPLOAD_FILE_TYPE_VAL.INCLUDE_VAL
     */
    public String getINCLUDE_VAL() {
        return INCLUDE_VAL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_UPLOAD_FILE_TYPE_VAL.INCLUDE_VAL
     *
     * @param INCLUDE_VAL the value for CTS_UPLOAD_FILE_TYPE_VAL.INCLUDE_VAL
     */
    public void setINCLUDE_VAL(String INCLUDE_VAL) {
        this.INCLUDE_VAL = INCLUDE_VAL == null ? null : INCLUDE_VAL.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_UPLOAD_FILE_TYPE_VAL.VAL_ORDER
     *
     * @return the value of CTS_UPLOAD_FILE_TYPE_VAL.VAL_ORDER
     */
    public BigDecimal getVAL_ORDER() {
        return VAL_ORDER;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_UPLOAD_FILE_TYPE_VAL.VAL_ORDER
     *
     * @param VAL_ORDER the value for CTS_UPLOAD_FILE_TYPE_VAL.VAL_ORDER
     */
    public void setVAL_ORDER(BigDecimal VAL_ORDER) {
        this.VAL_ORDER = VAL_ORDER;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_UPLOAD_FILE_TYPE_VAL.DATA_RETRIEVE
     *
     * @return the value of CTS_UPLOAD_FILE_TYPE_VAL.DATA_RETRIEVE
     */
    public String getDATA_RETRIEVE() {
        return DATA_RETRIEVE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_UPLOAD_FILE_TYPE_VAL.DATA_RETRIEVE
     *
     * @param DATA_RETRIEVE the value for CTS_UPLOAD_FILE_TYPE_VAL.DATA_RETRIEVE
     */
    public void setDATA_RETRIEVE(String DATA_RETRIEVE) {
        this.DATA_RETRIEVE = DATA_RETRIEVE == null ? null : DATA_RETRIEVE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_UPLOAD_FILE_TYPE_VAL.DATA_SAVING
     *
     * @return the value of CTS_UPLOAD_FILE_TYPE_VAL.DATA_SAVING
     */
    public String getDATA_SAVING() {
        return DATA_SAVING;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_UPLOAD_FILE_TYPE_VAL.DATA_SAVING
     *
     * @param DATA_SAVING the value for CTS_UPLOAD_FILE_TYPE_VAL.DATA_SAVING
     */
    public void setDATA_SAVING(String DATA_SAVING) {
        this.DATA_SAVING = DATA_SAVING == null ? null : DATA_SAVING.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_UPLOAD_FILE_TYPE_VAL.CHQ_IMG_MAND
     *
     * @return the value of CTS_UPLOAD_FILE_TYPE_VAL.CHQ_IMG_MAND
     */
    public String getCHQ_IMG_MAND() {
        return CHQ_IMG_MAND;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_UPLOAD_FILE_TYPE_VAL.CHQ_IMG_MAND
     *
     * @param CHQ_IMG_MAND the value for CTS_UPLOAD_FILE_TYPE_VAL.CHQ_IMG_MAND
     */
    public void setCHQ_IMG_MAND(String CHQ_IMG_MAND) {
        this.CHQ_IMG_MAND = CHQ_IMG_MAND == null ? null : CHQ_IMG_MAND.trim();
    }
}