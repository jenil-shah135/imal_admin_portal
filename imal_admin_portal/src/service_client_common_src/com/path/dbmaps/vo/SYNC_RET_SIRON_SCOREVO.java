package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class SYNC_RET_SIRON_SCOREVO extends BaseVO {  
    /**
     * This field corresponds to the database column SYNC_RET_SIRON_SCORE.ID
     */
    private BigDecimal ID;

    /**
     * This field corresponds to the database column SYNC_RET_SIRON_SCORE.LINE_NO
     */
    private BigDecimal LINE_NO;

    /**
     * This field corresponds to the database column SYNC_RET_SIRON_SCORE.SCORE
     */
    private BigDecimal SCORE;

    /**
     * This field corresponds to the database column SYNC_RET_SIRON_SCORE.SCORE_SPECIFIED_YN
     */
    private String SCORE_SPECIFIED_YN;

    /**
     * This field corresponds to the database column SYNC_RET_SIRON_SCORE.LONG_DESC
     */
    private String LONG_DESC;

    /**
     * This field corresponds to the database column SYNC_RET_SIRON_SCORE.SHORT_DESC
     */
    private String SHORT_DESC;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYNC_RET_SIRON_SCORE.ID
     *
     * @return the value of SYNC_RET_SIRON_SCORE.ID
     */
    public BigDecimal getID() {
        return ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYNC_RET_SIRON_SCORE.ID
     *
     * @param ID the value for SYNC_RET_SIRON_SCORE.ID
     */
    public void setID(BigDecimal ID) {
        this.ID = ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYNC_RET_SIRON_SCORE.LINE_NO
     *
     * @return the value of SYNC_RET_SIRON_SCORE.LINE_NO
     */
    public BigDecimal getLINE_NO() {
        return LINE_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYNC_RET_SIRON_SCORE.LINE_NO
     *
     * @param LINE_NO the value for SYNC_RET_SIRON_SCORE.LINE_NO
     */
    public void setLINE_NO(BigDecimal LINE_NO) {
        this.LINE_NO = LINE_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYNC_RET_SIRON_SCORE.SCORE
     *
     * @return the value of SYNC_RET_SIRON_SCORE.SCORE
     */
    public BigDecimal getSCORE() {
        return SCORE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYNC_RET_SIRON_SCORE.SCORE
     *
     * @param SCORE the value for SYNC_RET_SIRON_SCORE.SCORE
     */
    public void setSCORE(BigDecimal SCORE) {
        this.SCORE = SCORE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYNC_RET_SIRON_SCORE.SCORE_SPECIFIED_YN
     *
     * @return the value of SYNC_RET_SIRON_SCORE.SCORE_SPECIFIED_YN
     */
    public String getSCORE_SPECIFIED_YN() {
        return SCORE_SPECIFIED_YN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYNC_RET_SIRON_SCORE.SCORE_SPECIFIED_YN
     *
     * @param SCORE_SPECIFIED_YN the value for SYNC_RET_SIRON_SCORE.SCORE_SPECIFIED_YN
     */
    public void setSCORE_SPECIFIED_YN(String SCORE_SPECIFIED_YN) {
        this.SCORE_SPECIFIED_YN = SCORE_SPECIFIED_YN == null ? null : SCORE_SPECIFIED_YN.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYNC_RET_SIRON_SCORE.LONG_DESC
     *
     * @return the value of SYNC_RET_SIRON_SCORE.LONG_DESC
     */
    public String getLONG_DESC() {
        return LONG_DESC;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYNC_RET_SIRON_SCORE.LONG_DESC
     *
     * @param LONG_DESC the value for SYNC_RET_SIRON_SCORE.LONG_DESC
     */
    public void setLONG_DESC(String LONG_DESC) {
        this.LONG_DESC = LONG_DESC == null ? null : LONG_DESC.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYNC_RET_SIRON_SCORE.SHORT_DESC
     *
     * @return the value of SYNC_RET_SIRON_SCORE.SHORT_DESC
     */
    public String getSHORT_DESC() {
        return SHORT_DESC;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYNC_RET_SIRON_SCORE.SHORT_DESC
     *
     * @param SHORT_DESC the value for SYNC_RET_SIRON_SCORE.SHORT_DESC
     */
    public void setSHORT_DESC(String SHORT_DESC) {
        this.SHORT_DESC = SHORT_DESC == null ? null : SHORT_DESC.trim();
    }
}