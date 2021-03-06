package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;
import java.util.Date;

public class OFAC_MAINVO extends BaseVO {
    /**
     * This field corresponds to the database column OFAC_MAIN.OFAC_NUM
     */
    private BigDecimal OFAC_NUM;

    /**
     * This field corresponds to the database column OFAC_MAIN.SDN_NAME
     */
    private String SDN_NAME;

    /**
     * This field corresponds to the database column OFAC_MAIN.SDN_TYPE
     */
    private String SDN_TYPE;

    /**
     * This field corresponds to the database column OFAC_MAIN.PROGRAM
     */
    private String PROGRAM;

    /**
     * This field corresponds to the database column OFAC_MAIN.TITLE
     */
    private String TITLE;

    /**
     * This field corresponds to the database column OFAC_MAIN.CALL_SIGN
     */
    private String CALL_SIGN;

    /**
     * This field corresponds to the database column OFAC_MAIN.VESS_TYPE
     */
    private String VESS_TYPE;

    /**
     * This field corresponds to the database column OFAC_MAIN.TONNAGE
     */
    private String TONNAGE;

    /**
     * This field corresponds to the database column OFAC_MAIN.GRT
     */
    private String GRT;

    /**
     * This field corresponds to the database column OFAC_MAIN.VESS_FLAG
     */
    private String VESS_FLAG;

    /**
     * This field corresponds to the database column OFAC_MAIN.VESS_OWNER
     */
    private String VESS_OWNER;

    /**
     * This field corresponds to the database column OFAC_MAIN.REMARKS
     */
    private String REMARKS;

    /**
     * This field corresponds to the database column OFAC_MAIN.REC_STATUS
     */
    private String REC_STATUS;

    /**
     * This field corresponds to the database column OFAC_MAIN.MODIF_DATE
     */
    private Date MODIF_DATE;

    /**
     * This field corresponds to the database column OFAC_MAIN.SOUNDEX_NAME
     */
    private String SOUNDEX_NAME;

    /**
     * This field corresponds to the database column OFAC_MAIN.DOWNLOAD_DATE
     */
    private Date DOWNLOAD_DATE;

    /**
     * This field corresponds to the database column OFAC_MAIN.DOWNLOAD_TIME
     */
    private String DOWNLOAD_TIME;

    /**
     * This field corresponds to the database column OFAC_MAIN.FILE_NAME
     */
    private String FILE_NAME;

    /**
     * This field corresponds to the database column OFAC_MAIN.USER_ID
     */
    private String USER_ID;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OFAC_MAIN.OFAC_NUM
     *
     * @return the value of OFAC_MAIN.OFAC_NUM
     */
    public BigDecimal getOFAC_NUM() {
        return OFAC_NUM;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OFAC_MAIN.OFAC_NUM
     *
     * @param OFAC_NUM the value for OFAC_MAIN.OFAC_NUM
     */
    public void setOFAC_NUM(BigDecimal OFAC_NUM) {
        this.OFAC_NUM = OFAC_NUM;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OFAC_MAIN.SDN_NAME
     *
     * @return the value of OFAC_MAIN.SDN_NAME
     */
    public String getSDN_NAME() {
        return SDN_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OFAC_MAIN.SDN_NAME
     *
     * @param SDN_NAME the value for OFAC_MAIN.SDN_NAME
     */
    public void setSDN_NAME(String SDN_NAME) {
        this.SDN_NAME = SDN_NAME == null ? null : SDN_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OFAC_MAIN.SDN_TYPE
     *
     * @return the value of OFAC_MAIN.SDN_TYPE
     */
    public String getSDN_TYPE() {
        return SDN_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OFAC_MAIN.SDN_TYPE
     *
     * @param SDN_TYPE the value for OFAC_MAIN.SDN_TYPE
     */
    public void setSDN_TYPE(String SDN_TYPE) {
        this.SDN_TYPE = SDN_TYPE == null ? null : SDN_TYPE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OFAC_MAIN.PROGRAM
     *
     * @return the value of OFAC_MAIN.PROGRAM
     */
    public String getPROGRAM() {
        return PROGRAM;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OFAC_MAIN.PROGRAM
     *
     * @param PROGRAM the value for OFAC_MAIN.PROGRAM
     */
    public void setPROGRAM(String PROGRAM) {
        this.PROGRAM = PROGRAM == null ? null : PROGRAM.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OFAC_MAIN.TITLE
     *
     * @return the value of OFAC_MAIN.TITLE
     */
    public String getTITLE() {
        return TITLE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OFAC_MAIN.TITLE
     *
     * @param TITLE the value for OFAC_MAIN.TITLE
     */
    public void setTITLE(String TITLE) {
        this.TITLE = TITLE == null ? null : TITLE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OFAC_MAIN.CALL_SIGN
     *
     * @return the value of OFAC_MAIN.CALL_SIGN
     */
    public String getCALL_SIGN() {
        return CALL_SIGN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OFAC_MAIN.CALL_SIGN
     *
     * @param CALL_SIGN the value for OFAC_MAIN.CALL_SIGN
     */
    public void setCALL_SIGN(String CALL_SIGN) {
        this.CALL_SIGN = CALL_SIGN == null ? null : CALL_SIGN.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OFAC_MAIN.VESS_TYPE
     *
     * @return the value of OFAC_MAIN.VESS_TYPE
     */
    public String getVESS_TYPE() {
        return VESS_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OFAC_MAIN.VESS_TYPE
     *
     * @param VESS_TYPE the value for OFAC_MAIN.VESS_TYPE
     */
    public void setVESS_TYPE(String VESS_TYPE) {
        this.VESS_TYPE = VESS_TYPE == null ? null : VESS_TYPE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OFAC_MAIN.TONNAGE
     *
     * @return the value of OFAC_MAIN.TONNAGE
     */
    public String getTONNAGE() {
        return TONNAGE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OFAC_MAIN.TONNAGE
     *
     * @param TONNAGE the value for OFAC_MAIN.TONNAGE
     */
    public void setTONNAGE(String TONNAGE) {
        this.TONNAGE = TONNAGE == null ? null : TONNAGE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OFAC_MAIN.GRT
     *
     * @return the value of OFAC_MAIN.GRT
     */
    public String getGRT() {
        return GRT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OFAC_MAIN.GRT
     *
     * @param GRT the value for OFAC_MAIN.GRT
     */
    public void setGRT(String GRT) {
        this.GRT = GRT == null ? null : GRT.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OFAC_MAIN.VESS_FLAG
     *
     * @return the value of OFAC_MAIN.VESS_FLAG
     */
    public String getVESS_FLAG() {
        return VESS_FLAG;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OFAC_MAIN.VESS_FLAG
     *
     * @param VESS_FLAG the value for OFAC_MAIN.VESS_FLAG
     */
    public void setVESS_FLAG(String VESS_FLAG) {
        this.VESS_FLAG = VESS_FLAG == null ? null : VESS_FLAG.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OFAC_MAIN.VESS_OWNER
     *
     * @return the value of OFAC_MAIN.VESS_OWNER
     */
    public String getVESS_OWNER() {
        return VESS_OWNER;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OFAC_MAIN.VESS_OWNER
     *
     * @param VESS_OWNER the value for OFAC_MAIN.VESS_OWNER
     */
    public void setVESS_OWNER(String VESS_OWNER) {
        this.VESS_OWNER = VESS_OWNER == null ? null : VESS_OWNER.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OFAC_MAIN.REMARKS
     *
     * @return the value of OFAC_MAIN.REMARKS
     */
    public String getREMARKS() {
        return REMARKS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OFAC_MAIN.REMARKS
     *
     * @param REMARKS the value for OFAC_MAIN.REMARKS
     */
    public void setREMARKS(String REMARKS) {
        this.REMARKS = REMARKS == null ? null : REMARKS.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OFAC_MAIN.REC_STATUS
     *
     * @return the value of OFAC_MAIN.REC_STATUS
     */
    public String getREC_STATUS() {
        return REC_STATUS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OFAC_MAIN.REC_STATUS
     *
     * @param REC_STATUS the value for OFAC_MAIN.REC_STATUS
     */
    public void setREC_STATUS(String REC_STATUS) {
        this.REC_STATUS = REC_STATUS == null ? null : REC_STATUS.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OFAC_MAIN.MODIF_DATE
     *
     * @return the value of OFAC_MAIN.MODIF_DATE
     */
    public Date getMODIF_DATE() {
        return MODIF_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OFAC_MAIN.MODIF_DATE
     *
     * @param MODIF_DATE the value for OFAC_MAIN.MODIF_DATE
     */
    public void setMODIF_DATE(Date MODIF_DATE) {
        this.MODIF_DATE = MODIF_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OFAC_MAIN.SOUNDEX_NAME
     *
     * @return the value of OFAC_MAIN.SOUNDEX_NAME
     */
    public String getSOUNDEX_NAME() {
        return SOUNDEX_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OFAC_MAIN.SOUNDEX_NAME
     *
     * @param SOUNDEX_NAME the value for OFAC_MAIN.SOUNDEX_NAME
     */
    public void setSOUNDEX_NAME(String SOUNDEX_NAME) {
        this.SOUNDEX_NAME = SOUNDEX_NAME == null ? null : SOUNDEX_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OFAC_MAIN.DOWNLOAD_DATE
     *
     * @return the value of OFAC_MAIN.DOWNLOAD_DATE
     */
    public Date getDOWNLOAD_DATE() {
        return DOWNLOAD_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OFAC_MAIN.DOWNLOAD_DATE
     *
     * @param DOWNLOAD_DATE the value for OFAC_MAIN.DOWNLOAD_DATE
     */
    public void setDOWNLOAD_DATE(Date DOWNLOAD_DATE) {
        this.DOWNLOAD_DATE = DOWNLOAD_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OFAC_MAIN.DOWNLOAD_TIME
     *
     * @return the value of OFAC_MAIN.DOWNLOAD_TIME
     */
    public String getDOWNLOAD_TIME() {
        return DOWNLOAD_TIME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OFAC_MAIN.DOWNLOAD_TIME
     *
     * @param DOWNLOAD_TIME the value for OFAC_MAIN.DOWNLOAD_TIME
     */
    public void setDOWNLOAD_TIME(String DOWNLOAD_TIME) {
        this.DOWNLOAD_TIME = DOWNLOAD_TIME == null ? null : DOWNLOAD_TIME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OFAC_MAIN.FILE_NAME
     *
     * @return the value of OFAC_MAIN.FILE_NAME
     */
    public String getFILE_NAME() {
        return FILE_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OFAC_MAIN.FILE_NAME
     *
     * @param FILE_NAME the value for OFAC_MAIN.FILE_NAME
     */
    public void setFILE_NAME(String FILE_NAME) {
        this.FILE_NAME = FILE_NAME == null ? null : FILE_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OFAC_MAIN.USER_ID
     *
     * @return the value of OFAC_MAIN.USER_ID
     */
    public String getUSER_ID() {
        return USER_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OFAC_MAIN.USER_ID
     *
     * @param USER_ID the value for OFAC_MAIN.USER_ID
     */
    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID == null ? null : USER_ID.trim();
    }
}