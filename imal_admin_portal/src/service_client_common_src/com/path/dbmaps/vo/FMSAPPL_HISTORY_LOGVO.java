package com.path.dbmaps.vo;

import java.math.BigDecimal;
import java.util.Date;

import com.path.lib.vo.BaseVO;

public class FMSAPPL_HISTORY_LOGVO extends BaseVO {
    /**
     * This field corresponds to the database column FMSAPPL_HISTORY_LOG.BRANCH
     */
    private BigDecimal BRANCH;

    /**
     * This field corresponds to the database column FMSAPPL_HISTORY_LOG.CODE
     */
    private BigDecimal CODE;

    /**
     * This field corresponds to the database column FMSAPPL_HISTORY_LOG.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column FMSAPPL_HISTORY_LOG.LINE_NBR
     */
    private BigDecimal LINE_NBR;

    /**
     * This field corresponds to the database column
     * FMSAPPL_HISTORY_LOG.TRX_LEVEL_LINE_NO
     */
    private BigDecimal TRX_LEVEL_LINE_NO;

    /**
     * This field corresponds to the database column FMSAPPL_HISTORY_LOG.ACTION
     */
    private String ACTION;

    /**
     * This field corresponds to the database column FMSAPPL_HISTORY_LOG.USER_ID
     */
    private String USER_ID;

    /**
     * This field corresponds to the database column FMSAPPL_HISTORY_LOG.ACTION_DATE
     */
    private Date ACTION_DATE;

    /**
     * This field corresponds to the database column FMSAPPL_HISTORY_LOG.REASON
     */
    private String REASON;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSAPPL_HISTORY_LOG.BRANCH
     *
     * @return the value of FMSAPPL_HISTORY_LOG.BRANCH
     */
    public BigDecimal getBRANCH() {
        return BRANCH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSAPPL_HISTORY_LOG.BRANCH
     *
     * @param BRANCH the value for FMSAPPL_HISTORY_LOG.BRANCH
     */
    public void setBRANCH(BigDecimal BRANCH) {
        this.BRANCH = BRANCH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSAPPL_HISTORY_LOG.CODE
     *
     * @return the value of FMSAPPL_HISTORY_LOG.CODE
     */
    public BigDecimal getCODE() {
        return CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSAPPL_HISTORY_LOG.CODE
     *
     * @param CODE the value for FMSAPPL_HISTORY_LOG.CODE
     */
    public void setCODE(BigDecimal CODE) {
        this.CODE = CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSAPPL_HISTORY_LOG.COMP_CODE
     *
     * @return the value of FMSAPPL_HISTORY_LOG.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSAPPL_HISTORY_LOG.COMP_CODE
     *
     * @param COMP_CODE the value for FMSAPPL_HISTORY_LOG.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSAPPL_HISTORY_LOG.LINE_NBR
     *
     * @return the value of FMSAPPL_HISTORY_LOG.LINE_NBR
     */
    public BigDecimal getLINE_NBR() {
        return LINE_NBR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSAPPL_HISTORY_LOG.LINE_NBR
     *
     * @param LINE_NBR the value for FMSAPPL_HISTORY_LOG.LINE_NBR
     */
    public void setLINE_NBR(BigDecimal LINE_NBR) {
        this.LINE_NBR = LINE_NBR;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSAPPL_HISTORY_LOG.TRX_LEVEL_LINE_NO
     *
     * @return the value of FMSAPPL_HISTORY_LOG.TRX_LEVEL_LINE_NO
     */
    public BigDecimal getTRX_LEVEL_LINE_NO()
    {
	return TRX_LEVEL_LINE_NO;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSAPPL_HISTORY_LOG.TRX_LEVEL_LINE_NO
     *
     * @param TRX_LEVEL_LINE_NO the value for
     *            FMSAPPL_HISTORY_LOG.TRX_LEVEL_LINE_NO
     */
    public void setTRX_LEVEL_LINE_NO(BigDecimal TRX_LEVEL_LINE_NO)
    {
	this.TRX_LEVEL_LINE_NO = TRX_LEVEL_LINE_NO;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSAPPL_HISTORY_LOG.ACTION
     *
     * @return the value of FMSAPPL_HISTORY_LOG.ACTION
     */
    public String getACTION() {
        return ACTION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSAPPL_HISTORY_LOG.ACTION
     *
     * @param ACTION the value for FMSAPPL_HISTORY_LOG.ACTION
     */
    public void setACTION(String ACTION) {
        this.ACTION = ACTION == null ? null : ACTION.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSAPPL_HISTORY_LOG.USER_ID
     *
     * @return the value of FMSAPPL_HISTORY_LOG.USER_ID
     */
    public String getUSER_ID() {
        return USER_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSAPPL_HISTORY_LOG.USER_ID
     *
     * @param USER_ID the value for FMSAPPL_HISTORY_LOG.USER_ID
     */
    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID == null ? null : USER_ID.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSAPPL_HISTORY_LOG.ACTION_DATE
     *
     * @return the value of FMSAPPL_HISTORY_LOG.ACTION_DATE
     */
    public Date getACTION_DATE() {
        return ACTION_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSAPPL_HISTORY_LOG.ACTION_DATE
     *
     * @param ACTION_DATE the value for FMSAPPL_HISTORY_LOG.ACTION_DATE
     */
    public void setACTION_DATE(Date ACTION_DATE) {
        this.ACTION_DATE = ACTION_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSAPPL_HISTORY_LOG.REASON
     *
     * @return the value of FMSAPPL_HISTORY_LOG.REASON
     */
    public String getREASON() {
        return REASON;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSAPPL_HISTORY_LOG.REASON
     *
     * @param REASON the value for FMSAPPL_HISTORY_LOG.REASON
     */
    public void setREASON(String REASON) {
        this.REASON = REASON == null ? null : REASON.trim();
    }
}