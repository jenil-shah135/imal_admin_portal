package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;
import java.util.Date;

public class TFS_REJECT_REASON_HSTVO extends BaseVO {
    /**
     * This field corresponds to the database column TFS_REJECT_REASON_HST.BRANCH
     */
    private BigDecimal BRANCH;

    /**
     * This field corresponds to the database column TFS_REJECT_REASON_HST.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column TFS_REJECT_REASON_HST.LC_TYPE
     */
    private String LC_TYPE;

    /**
     * This field corresponds to the database column TFS_REJECT_REASON_HST.REJECT_DATE
     */
    private Date REJECT_DATE;

    /**
     * This field corresponds to the database column TFS_REJECT_REASON_HST.TRX_NBR
     */
    private BigDecimal TRX_NBR;

    /**
     * This field corresponds to the database column TFS_REJECT_REASON_HST.TRX_TYPE
     */
    private BigDecimal TRX_TYPE;

    /**
     * This field corresponds to the database column TFS_REJECT_REASON_HST.REJECT_REASON
     */
    private String REJECT_REASON;

    /**
     * This field corresponds to the database column TFS_REJECT_REASON_HST.REJECTED_BY
     */
    private String REJECTED_BY;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFS_REJECT_REASON_HST.BRANCH
     *
     * @return the value of TFS_REJECT_REASON_HST.BRANCH
     */
    public BigDecimal getBRANCH() {
        return BRANCH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFS_REJECT_REASON_HST.BRANCH
     *
     * @param BRANCH the value for TFS_REJECT_REASON_HST.BRANCH
     */
    public void setBRANCH(BigDecimal BRANCH) {
        this.BRANCH = BRANCH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFS_REJECT_REASON_HST.COMP_CODE
     *
     * @return the value of TFS_REJECT_REASON_HST.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFS_REJECT_REASON_HST.COMP_CODE
     *
     * @param COMP_CODE the value for TFS_REJECT_REASON_HST.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFS_REJECT_REASON_HST.LC_TYPE
     *
     * @return the value of TFS_REJECT_REASON_HST.LC_TYPE
     */
    public String getLC_TYPE() {
        return LC_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFS_REJECT_REASON_HST.LC_TYPE
     *
     * @param LC_TYPE the value for TFS_REJECT_REASON_HST.LC_TYPE
     */
    public void setLC_TYPE(String LC_TYPE) {
        this.LC_TYPE = LC_TYPE == null ? null : LC_TYPE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFS_REJECT_REASON_HST.REJECT_DATE
     *
     * @return the value of TFS_REJECT_REASON_HST.REJECT_DATE
     */
    public Date getREJECT_DATE() {
        return REJECT_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFS_REJECT_REASON_HST.REJECT_DATE
     *
     * @param REJECT_DATE the value for TFS_REJECT_REASON_HST.REJECT_DATE
     */
    public void setREJECT_DATE(Date REJECT_DATE) {
        this.REJECT_DATE = REJECT_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFS_REJECT_REASON_HST.TRX_NBR
     *
     * @return the value of TFS_REJECT_REASON_HST.TRX_NBR
     */
    public BigDecimal getTRX_NBR() {
        return TRX_NBR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFS_REJECT_REASON_HST.TRX_NBR
     *
     * @param TRX_NBR the value for TFS_REJECT_REASON_HST.TRX_NBR
     */
    public void setTRX_NBR(BigDecimal TRX_NBR) {
        this.TRX_NBR = TRX_NBR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFS_REJECT_REASON_HST.TRX_TYPE
     *
     * @return the value of TFS_REJECT_REASON_HST.TRX_TYPE
     */
    public BigDecimal getTRX_TYPE() {
        return TRX_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFS_REJECT_REASON_HST.TRX_TYPE
     *
     * @param TRX_TYPE the value for TFS_REJECT_REASON_HST.TRX_TYPE
     */
    public void setTRX_TYPE(BigDecimal TRX_TYPE) {
        this.TRX_TYPE = TRX_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFS_REJECT_REASON_HST.REJECT_REASON
     *
     * @return the value of TFS_REJECT_REASON_HST.REJECT_REASON
     */
    public String getREJECT_REASON() {
        return REJECT_REASON;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFS_REJECT_REASON_HST.REJECT_REASON
     *
     * @param REJECT_REASON the value for TFS_REJECT_REASON_HST.REJECT_REASON
     */
    public void setREJECT_REASON(String REJECT_REASON) {
        this.REJECT_REASON = REJECT_REASON == null ? null : REJECT_REASON.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFS_REJECT_REASON_HST.REJECTED_BY
     *
     * @return the value of TFS_REJECT_REASON_HST.REJECTED_BY
     */
    public String getREJECTED_BY() {
        return REJECTED_BY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFS_REJECT_REASON_HST.REJECTED_BY
     *
     * @param REJECTED_BY the value for TFS_REJECT_REASON_HST.REJECTED_BY
     */
    public void setREJECTED_BY(String REJECTED_BY) {
        this.REJECTED_BY = REJECTED_BY == null ? null : REJECTED_BY.trim();
    }
}