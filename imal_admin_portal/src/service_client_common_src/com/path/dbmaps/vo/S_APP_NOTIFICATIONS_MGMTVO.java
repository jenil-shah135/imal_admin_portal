package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;
import java.util.Date;

public class S_APP_NOTIFICATIONS_MGMTVO extends BaseVO {
    /**
     * This field corresponds to the database column S_APP_NOTIFICATIONS_MGMT.APP_NAME
     */
    private String APP_NAME;

    /**
     * This field corresponds to the database column S_APP_NOTIFICATIONS_MGMT.ENABLE_EMAIL_NOTIF_YN
     */
    private String ENABLE_EMAIL_NOTIF_YN;

    /**
     * This field corresponds to the database column S_APP_NOTIFICATIONS_MGMT.ENABLE_SMS_NOTIF_YN
     */
    private String ENABLE_SMS_NOTIF_YN;

    /**
     * This field corresponds to the database column S_APP_NOTIFICATIONS_MGMT.ADMIN_EMAIL_ADDRESS
     */
    private String ADMIN_EMAIL_ADDRESS;

    /**
     * This field corresponds to the database column S_APP_NOTIFICATIONS_MGMT.ADMIN_MOBILE_NUMBER
     */
    private String ADMIN_MOBILE_NUMBER;

    /**
     * This field corresponds to the database column S_APP_NOTIFICATIONS_MGMT.MSG_SUBJECT
     */
    private String MSG_SUBJECT;

    /**
     * This field corresponds to the database column S_APP_NOTIFICATIONS_MGMT.MSG_BODY
     */
    private String MSG_BODY;

    /**
     * This field corresponds to the database column S_APP_NOTIFICATIONS_MGMT.THRESHOLD
     */
    private BigDecimal THRESHOLD;

    /**
     * This field corresponds to the database column S_APP_NOTIFICATIONS_MGMT.LAST_PING_DATE
     */
    private Date LAST_PING_DATE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_APP_NOTIFICATIONS_MGMT.APP_NAME
     *
     * @return the value of S_APP_NOTIFICATIONS_MGMT.APP_NAME
     */
    public String getAPP_NAME() {
        return APP_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_APP_NOTIFICATIONS_MGMT.APP_NAME
     *
     * @param APP_NAME the value for S_APP_NOTIFICATIONS_MGMT.APP_NAME
     */
    public void setAPP_NAME(String APP_NAME) {
        this.APP_NAME = APP_NAME == null ? null : APP_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_APP_NOTIFICATIONS_MGMT.ENABLE_EMAIL_NOTIF_YN
     *
     * @return the value of S_APP_NOTIFICATIONS_MGMT.ENABLE_EMAIL_NOTIF_YN
     */
    public String getENABLE_EMAIL_NOTIF_YN() {
        return ENABLE_EMAIL_NOTIF_YN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_APP_NOTIFICATIONS_MGMT.ENABLE_EMAIL_NOTIF_YN
     *
     * @param ENABLE_EMAIL_NOTIF_YN the value for S_APP_NOTIFICATIONS_MGMT.ENABLE_EMAIL_NOTIF_YN
     */
    public void setENABLE_EMAIL_NOTIF_YN(String ENABLE_EMAIL_NOTIF_YN) {
        this.ENABLE_EMAIL_NOTIF_YN = ENABLE_EMAIL_NOTIF_YN == null ? null : ENABLE_EMAIL_NOTIF_YN.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_APP_NOTIFICATIONS_MGMT.ENABLE_SMS_NOTIF_YN
     *
     * @return the value of S_APP_NOTIFICATIONS_MGMT.ENABLE_SMS_NOTIF_YN
     */
    public String getENABLE_SMS_NOTIF_YN() {
        return ENABLE_SMS_NOTIF_YN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_APP_NOTIFICATIONS_MGMT.ENABLE_SMS_NOTIF_YN
     *
     * @param ENABLE_SMS_NOTIF_YN the value for S_APP_NOTIFICATIONS_MGMT.ENABLE_SMS_NOTIF_YN
     */
    public void setENABLE_SMS_NOTIF_YN(String ENABLE_SMS_NOTIF_YN) {
        this.ENABLE_SMS_NOTIF_YN = ENABLE_SMS_NOTIF_YN == null ? null : ENABLE_SMS_NOTIF_YN.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_APP_NOTIFICATIONS_MGMT.ADMIN_EMAIL_ADDRESS
     *
     * @return the value of S_APP_NOTIFICATIONS_MGMT.ADMIN_EMAIL_ADDRESS
     */
    public String getADMIN_EMAIL_ADDRESS() {
        return ADMIN_EMAIL_ADDRESS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_APP_NOTIFICATIONS_MGMT.ADMIN_EMAIL_ADDRESS
     *
     * @param ADMIN_EMAIL_ADDRESS the value for S_APP_NOTIFICATIONS_MGMT.ADMIN_EMAIL_ADDRESS
     */
    public void setADMIN_EMAIL_ADDRESS(String ADMIN_EMAIL_ADDRESS) {
        this.ADMIN_EMAIL_ADDRESS = ADMIN_EMAIL_ADDRESS == null ? null : ADMIN_EMAIL_ADDRESS.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_APP_NOTIFICATIONS_MGMT.ADMIN_MOBILE_NUMBER
     *
     * @return the value of S_APP_NOTIFICATIONS_MGMT.ADMIN_MOBILE_NUMBER
     */
    public String getADMIN_MOBILE_NUMBER() {
        return ADMIN_MOBILE_NUMBER;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_APP_NOTIFICATIONS_MGMT.ADMIN_MOBILE_NUMBER
     *
     * @param ADMIN_MOBILE_NUMBER the value for S_APP_NOTIFICATIONS_MGMT.ADMIN_MOBILE_NUMBER
     */
    public void setADMIN_MOBILE_NUMBER(String ADMIN_MOBILE_NUMBER) {
        this.ADMIN_MOBILE_NUMBER = ADMIN_MOBILE_NUMBER == null ? null : ADMIN_MOBILE_NUMBER.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_APP_NOTIFICATIONS_MGMT.MSG_SUBJECT
     *
     * @return the value of S_APP_NOTIFICATIONS_MGMT.MSG_SUBJECT
     */
    public String getMSG_SUBJECT() {
        return MSG_SUBJECT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_APP_NOTIFICATIONS_MGMT.MSG_SUBJECT
     *
     * @param MSG_SUBJECT the value for S_APP_NOTIFICATIONS_MGMT.MSG_SUBJECT
     */
    public void setMSG_SUBJECT(String MSG_SUBJECT) {
        this.MSG_SUBJECT = MSG_SUBJECT == null ? null : MSG_SUBJECT.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_APP_NOTIFICATIONS_MGMT.MSG_BODY
     *
     * @return the value of S_APP_NOTIFICATIONS_MGMT.MSG_BODY
     */
    public String getMSG_BODY() {
        return MSG_BODY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_APP_NOTIFICATIONS_MGMT.MSG_BODY
     *
     * @param MSG_BODY the value for S_APP_NOTIFICATIONS_MGMT.MSG_BODY
     */
    public void setMSG_BODY(String MSG_BODY) {
        this.MSG_BODY = MSG_BODY == null ? null : MSG_BODY.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_APP_NOTIFICATIONS_MGMT.THRESHOLD
     *
     * @return the value of S_APP_NOTIFICATIONS_MGMT.THRESHOLD
     */
    public BigDecimal getTHRESHOLD() {
        return THRESHOLD;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_APP_NOTIFICATIONS_MGMT.THRESHOLD
     *
     * @param THRESHOLD the value for S_APP_NOTIFICATIONS_MGMT.THRESHOLD
     */
    public void setTHRESHOLD(BigDecimal THRESHOLD) {
        this.THRESHOLD = THRESHOLD;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_APP_NOTIFICATIONS_MGMT.LAST_PING_DATE
     *
     * @return the value of S_APP_NOTIFICATIONS_MGMT.LAST_PING_DATE
     */
    public Date getLAST_PING_DATE() {
        return LAST_PING_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_APP_NOTIFICATIONS_MGMT.LAST_PING_DATE
     *
     * @param LAST_PING_DATE the value for S_APP_NOTIFICATIONS_MGMT.LAST_PING_DATE
     */
    public void setLAST_PING_DATE(Date LAST_PING_DATE) {
        this.LAST_PING_DATE = LAST_PING_DATE;
    }
}