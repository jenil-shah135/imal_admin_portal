package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;
import java.util.Date;

public class TFS_TEXTTYPEVO extends BaseVO {
    /**
     * This field corresponds to the database column TFS_TEXTTYPE.CODE
     */
    private BigDecimal CODE;

    /**
     * This field corresponds to the database column TFS_TEXTTYPE.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column TFS_TEXTTYPE.DOC_TYPE
     */
    private String DOC_TYPE;

    /**
     * This field corresponds to the database column TFS_TEXTTYPE.BRIEF_NAME_ENG
     */
    private String BRIEF_NAME_ENG;

    /**
     * This field corresponds to the database column TFS_TEXTTYPE.BRIEF_NAME_ARAB
     */
    private String BRIEF_NAME_ARAB;

    /**
     * This field corresponds to the database column TFS_TEXTTYPE.LONG_NAME_ENG
     */
    private String LONG_NAME_ENG;

    /**
     * This field corresponds to the database column TFS_TEXTTYPE.LONG_NAME_ARAB
     */
    private String LONG_NAME_ARAB;

    /**
     * This field corresponds to the database column TFS_TEXTTYPE.DATE_CREATED
     */
    private Date DATE_CREATED;

    /**
     * This field corresponds to the database column TFS_TEXTTYPE.CREATED_BY
     */
    private String CREATED_BY;

    /**
     * This field corresponds to the database column TFS_TEXTTYPE.DATE_DELETED
     */
    private Date DATE_DELETED;

    /**
     * This field corresponds to the database column TFS_TEXTTYPE.DELETED_BY
     */
    private String DELETED_BY;

    /**
     * This field corresponds to the database column TFS_TEXTTYPE.DATE_APPROVED
     */
    private Date DATE_APPROVED;

    /**
     * This field corresponds to the database column TFS_TEXTTYPE.APPROVED_BY
     */
    private String APPROVED_BY;

    /**
     * This field corresponds to the database column TFS_TEXTTYPE.DATE_REVERSED
     */
    private Date DATE_REVERSED;

    /**
     * This field corresponds to the database column TFS_TEXTTYPE.REVERSED_BY
     */
    private String REVERSED_BY;

    /**
     * This field corresponds to the database column TFS_TEXTTYPE.STATUS
     */
    private String STATUS;

    /**
     * This field corresponds to the database column TFS_TEXTTYPE.DETAILS1_ENG
     */
    private String DETAILS1_ENG;

    /**
     * This field corresponds to the database column TFS_TEXTTYPE.DETAILS1_ARAB
     */
    private String DETAILS1_ARAB;

    /**
     * This field corresponds to the database column TFS_TEXTTYPE.DETAILS2_ENG
     */
    private String DETAILS2_ENG;

    /**
     * This field corresponds to the database column TFS_TEXTTYPE.DETAILS2_ARAB
     */
    private String DETAILS2_ARAB;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFS_TEXTTYPE.CODE
     *
     * @return the value of TFS_TEXTTYPE.CODE
     */
    public BigDecimal getCODE() {
        return CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFS_TEXTTYPE.CODE
     *
     * @param CODE the value for TFS_TEXTTYPE.CODE
     */
    public void setCODE(BigDecimal CODE) {
        this.CODE = CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFS_TEXTTYPE.COMP_CODE
     *
     * @return the value of TFS_TEXTTYPE.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFS_TEXTTYPE.COMP_CODE
     *
     * @param COMP_CODE the value for TFS_TEXTTYPE.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFS_TEXTTYPE.DOC_TYPE
     *
     * @return the value of TFS_TEXTTYPE.DOC_TYPE
     */
    public String getDOC_TYPE() {
        return DOC_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFS_TEXTTYPE.DOC_TYPE
     *
     * @param DOC_TYPE the value for TFS_TEXTTYPE.DOC_TYPE
     */
    public void setDOC_TYPE(String DOC_TYPE) {
        this.DOC_TYPE = DOC_TYPE == null ? null : DOC_TYPE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFS_TEXTTYPE.BRIEF_NAME_ENG
     *
     * @return the value of TFS_TEXTTYPE.BRIEF_NAME_ENG
     */
    public String getBRIEF_NAME_ENG() {
        return BRIEF_NAME_ENG;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFS_TEXTTYPE.BRIEF_NAME_ENG
     *
     * @param BRIEF_NAME_ENG the value for TFS_TEXTTYPE.BRIEF_NAME_ENG
     */
    public void setBRIEF_NAME_ENG(String BRIEF_NAME_ENG) {
        this.BRIEF_NAME_ENG = BRIEF_NAME_ENG == null ? null : BRIEF_NAME_ENG.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFS_TEXTTYPE.BRIEF_NAME_ARAB
     *
     * @return the value of TFS_TEXTTYPE.BRIEF_NAME_ARAB
     */
    public String getBRIEF_NAME_ARAB() {
        return BRIEF_NAME_ARAB;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFS_TEXTTYPE.BRIEF_NAME_ARAB
     *
     * @param BRIEF_NAME_ARAB the value for TFS_TEXTTYPE.BRIEF_NAME_ARAB
     */
    public void setBRIEF_NAME_ARAB(String BRIEF_NAME_ARAB) {
        this.BRIEF_NAME_ARAB = BRIEF_NAME_ARAB == null ? null : BRIEF_NAME_ARAB.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFS_TEXTTYPE.LONG_NAME_ENG
     *
     * @return the value of TFS_TEXTTYPE.LONG_NAME_ENG
     */
    public String getLONG_NAME_ENG() {
        return LONG_NAME_ENG;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFS_TEXTTYPE.LONG_NAME_ENG
     *
     * @param LONG_NAME_ENG the value for TFS_TEXTTYPE.LONG_NAME_ENG
     */
    public void setLONG_NAME_ENG(String LONG_NAME_ENG) {
        this.LONG_NAME_ENG = LONG_NAME_ENG == null ? null : LONG_NAME_ENG.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFS_TEXTTYPE.LONG_NAME_ARAB
     *
     * @return the value of TFS_TEXTTYPE.LONG_NAME_ARAB
     */
    public String getLONG_NAME_ARAB() {
        return LONG_NAME_ARAB;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFS_TEXTTYPE.LONG_NAME_ARAB
     *
     * @param LONG_NAME_ARAB the value for TFS_TEXTTYPE.LONG_NAME_ARAB
     */
    public void setLONG_NAME_ARAB(String LONG_NAME_ARAB) {
        this.LONG_NAME_ARAB = LONG_NAME_ARAB == null ? null : LONG_NAME_ARAB.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFS_TEXTTYPE.DATE_CREATED
     *
     * @return the value of TFS_TEXTTYPE.DATE_CREATED
     */
    public Date getDATE_CREATED() {
        return DATE_CREATED;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFS_TEXTTYPE.DATE_CREATED
     *
     * @param DATE_CREATED the value for TFS_TEXTTYPE.DATE_CREATED
     */
    public void setDATE_CREATED(Date DATE_CREATED) {
        this.DATE_CREATED = DATE_CREATED;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFS_TEXTTYPE.CREATED_BY
     *
     * @return the value of TFS_TEXTTYPE.CREATED_BY
     */
    public String getCREATED_BY() {
        return CREATED_BY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFS_TEXTTYPE.CREATED_BY
     *
     * @param CREATED_BY the value for TFS_TEXTTYPE.CREATED_BY
     */
    public void setCREATED_BY(String CREATED_BY) {
        this.CREATED_BY = CREATED_BY == null ? null : CREATED_BY.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFS_TEXTTYPE.DATE_DELETED
     *
     * @return the value of TFS_TEXTTYPE.DATE_DELETED
     */
    public Date getDATE_DELETED() {
        return DATE_DELETED;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFS_TEXTTYPE.DATE_DELETED
     *
     * @param DATE_DELETED the value for TFS_TEXTTYPE.DATE_DELETED
     */
    public void setDATE_DELETED(Date DATE_DELETED) {
        this.DATE_DELETED = DATE_DELETED;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFS_TEXTTYPE.DELETED_BY
     *
     * @return the value of TFS_TEXTTYPE.DELETED_BY
     */
    public String getDELETED_BY() {
        return DELETED_BY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFS_TEXTTYPE.DELETED_BY
     *
     * @param DELETED_BY the value for TFS_TEXTTYPE.DELETED_BY
     */
    public void setDELETED_BY(String DELETED_BY) {
        this.DELETED_BY = DELETED_BY == null ? null : DELETED_BY.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFS_TEXTTYPE.DATE_APPROVED
     *
     * @return the value of TFS_TEXTTYPE.DATE_APPROVED
     */
    public Date getDATE_APPROVED() {
        return DATE_APPROVED;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFS_TEXTTYPE.DATE_APPROVED
     *
     * @param DATE_APPROVED the value for TFS_TEXTTYPE.DATE_APPROVED
     */
    public void setDATE_APPROVED(Date DATE_APPROVED) {
        this.DATE_APPROVED = DATE_APPROVED;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFS_TEXTTYPE.APPROVED_BY
     *
     * @return the value of TFS_TEXTTYPE.APPROVED_BY
     */
    public String getAPPROVED_BY() {
        return APPROVED_BY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFS_TEXTTYPE.APPROVED_BY
     *
     * @param APPROVED_BY the value for TFS_TEXTTYPE.APPROVED_BY
     */
    public void setAPPROVED_BY(String APPROVED_BY) {
        this.APPROVED_BY = APPROVED_BY == null ? null : APPROVED_BY.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFS_TEXTTYPE.DATE_REVERSED
     *
     * @return the value of TFS_TEXTTYPE.DATE_REVERSED
     */
    public Date getDATE_REVERSED() {
        return DATE_REVERSED;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFS_TEXTTYPE.DATE_REVERSED
     *
     * @param DATE_REVERSED the value for TFS_TEXTTYPE.DATE_REVERSED
     */
    public void setDATE_REVERSED(Date DATE_REVERSED) {
        this.DATE_REVERSED = DATE_REVERSED;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFS_TEXTTYPE.REVERSED_BY
     *
     * @return the value of TFS_TEXTTYPE.REVERSED_BY
     */
    public String getREVERSED_BY() {
        return REVERSED_BY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFS_TEXTTYPE.REVERSED_BY
     *
     * @param REVERSED_BY the value for TFS_TEXTTYPE.REVERSED_BY
     */
    public void setREVERSED_BY(String REVERSED_BY) {
        this.REVERSED_BY = REVERSED_BY == null ? null : REVERSED_BY.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFS_TEXTTYPE.STATUS
     *
     * @return the value of TFS_TEXTTYPE.STATUS
     */
    public String getSTATUS() {
        return STATUS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFS_TEXTTYPE.STATUS
     *
     * @param STATUS the value for TFS_TEXTTYPE.STATUS
     */
    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS == null ? null : STATUS.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFS_TEXTTYPE.DETAILS1_ENG
     *
     * @return the value of TFS_TEXTTYPE.DETAILS1_ENG
     */
    public String getDETAILS1_ENG() {
        return DETAILS1_ENG;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFS_TEXTTYPE.DETAILS1_ENG
     *
     * @param DETAILS1_ENG the value for TFS_TEXTTYPE.DETAILS1_ENG
     */
    public void setDETAILS1_ENG(String DETAILS1_ENG) {
        this.DETAILS1_ENG = DETAILS1_ENG == null ? null : DETAILS1_ENG.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFS_TEXTTYPE.DETAILS1_ARAB
     *
     * @return the value of TFS_TEXTTYPE.DETAILS1_ARAB
     */
    public String getDETAILS1_ARAB() {
        return DETAILS1_ARAB;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFS_TEXTTYPE.DETAILS1_ARAB
     *
     * @param DETAILS1_ARAB the value for TFS_TEXTTYPE.DETAILS1_ARAB
     */
    public void setDETAILS1_ARAB(String DETAILS1_ARAB) {
        this.DETAILS1_ARAB = DETAILS1_ARAB == null ? null : DETAILS1_ARAB.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFS_TEXTTYPE.DETAILS2_ENG
     *
     * @return the value of TFS_TEXTTYPE.DETAILS2_ENG
     */
    public String getDETAILS2_ENG() {
        return DETAILS2_ENG;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFS_TEXTTYPE.DETAILS2_ENG
     *
     * @param DETAILS2_ENG the value for TFS_TEXTTYPE.DETAILS2_ENG
     */
    public void setDETAILS2_ENG(String DETAILS2_ENG) {
        this.DETAILS2_ENG = DETAILS2_ENG == null ? null : DETAILS2_ENG.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFS_TEXTTYPE.DETAILS2_ARAB
     *
     * @return the value of TFS_TEXTTYPE.DETAILS2_ARAB
     */
    public String getDETAILS2_ARAB() {
        return DETAILS2_ARAB;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFS_TEXTTYPE.DETAILS2_ARAB
     *
     * @param DETAILS2_ARAB the value for TFS_TEXTTYPE.DETAILS2_ARAB
     */
    public void setDETAILS2_ARAB(String DETAILS2_ARAB) {
        this.DETAILS2_ARAB = DETAILS2_ARAB == null ? null : DETAILS2_ARAB.trim();
    }
}