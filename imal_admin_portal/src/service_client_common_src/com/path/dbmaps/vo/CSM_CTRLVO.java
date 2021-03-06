package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class CSM_CTRLVO extends BaseVO {
    /**
     * This field corresponds to the database column CSM_CTRL.LINE_NO
     */
    private BigDecimal LINE_NO;

    /**
     * This field corresponds to the database column CSM_CTRL.SHOW_RDS_REPORT
     */
    private String SHOW_RDS_REPORT;

    /**
     * This field corresponds to the database column CSM_CTRL.BENEF_NAME_LEN
     */
    private BigDecimal BENEF_NAME_LEN;

    /**
     * This field corresponds to the database column CSM_CTRL.MAN_SERV_CARD_TYPE
     */
    private String MAN_SERV_CARD_TYPE;

    /**
     * This field corresponds to the database column CSM_CTRL.OFFLINE_REVERSAL
     */
    private String OFFLINE_REVERSAL;

    /**
     * This field corresponds to the database column CSM_CTRL.DEFAULT_REFERSAL_FLAG
     */
    private String DEFAULT_REFERSAL_FLAG;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CSM_CTRL.LINE_NO
     *
     * @return the value of CSM_CTRL.LINE_NO
     */
    public BigDecimal getLINE_NO() {
        return LINE_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CSM_CTRL.LINE_NO
     *
     * @param LINE_NO the value for CSM_CTRL.LINE_NO
     */
    public void setLINE_NO(BigDecimal LINE_NO) {
        this.LINE_NO = LINE_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CSM_CTRL.SHOW_RDS_REPORT
     *
     * @return the value of CSM_CTRL.SHOW_RDS_REPORT
     */
    public String getSHOW_RDS_REPORT() {
        return SHOW_RDS_REPORT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CSM_CTRL.SHOW_RDS_REPORT
     *
     * @param SHOW_RDS_REPORT the value for CSM_CTRL.SHOW_RDS_REPORT
     */
    public void setSHOW_RDS_REPORT(String SHOW_RDS_REPORT) {
        this.SHOW_RDS_REPORT = SHOW_RDS_REPORT == null ? null : SHOW_RDS_REPORT.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CSM_CTRL.BENEF_NAME_LEN
     *
     * @return the value of CSM_CTRL.BENEF_NAME_LEN
     */
    public BigDecimal getBENEF_NAME_LEN() {
        return BENEF_NAME_LEN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CSM_CTRL.BENEF_NAME_LEN
     *
     * @param BENEF_NAME_LEN the value for CSM_CTRL.BENEF_NAME_LEN
     */
    public void setBENEF_NAME_LEN(BigDecimal BENEF_NAME_LEN) {
        this.BENEF_NAME_LEN = BENEF_NAME_LEN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CSM_CTRL.MAN_SERV_CARD_TYPE
     *
     * @return the value of CSM_CTRL.MAN_SERV_CARD_TYPE
     */
    public String getMAN_SERV_CARD_TYPE() {
        return MAN_SERV_CARD_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CSM_CTRL.MAN_SERV_CARD_TYPE
     *
     * @param MAN_SERV_CARD_TYPE the value for CSM_CTRL.MAN_SERV_CARD_TYPE
     */
    public void setMAN_SERV_CARD_TYPE(String MAN_SERV_CARD_TYPE) {
        this.MAN_SERV_CARD_TYPE = MAN_SERV_CARD_TYPE == null ? null : MAN_SERV_CARD_TYPE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CSM_CTRL.OFFLINE_REVERSAL
     *
     * @return the value of CSM_CTRL.OFFLINE_REVERSAL
     */
    public String getOFFLINE_REVERSAL() {
        return OFFLINE_REVERSAL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CSM_CTRL.OFFLINE_REVERSAL
     *
     * @param OFFLINE_REVERSAL the value for CSM_CTRL.OFFLINE_REVERSAL
     */
    public void setOFFLINE_REVERSAL(String OFFLINE_REVERSAL) {
        this.OFFLINE_REVERSAL = OFFLINE_REVERSAL == null ? null : OFFLINE_REVERSAL.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CSM_CTRL.DEFAULT_REFERSAL_FLAG
     *
     * @return the value of CSM_CTRL.DEFAULT_REFERSAL_FLAG
     */
    public String getDEFAULT_REFERSAL_FLAG() {
        return DEFAULT_REFERSAL_FLAG;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CSM_CTRL.DEFAULT_REFERSAL_FLAG
     *
     * @param DEFAULT_REFERSAL_FLAG the value for CSM_CTRL.DEFAULT_REFERSAL_FLAG
     */
    public void setDEFAULT_REFERSAL_FLAG(String DEFAULT_REFERSAL_FLAG) {
        this.DEFAULT_REFERSAL_FLAG = DEFAULT_REFERSAL_FLAG == null ? null : DEFAULT_REFERSAL_FLAG.trim();
    }
}