package com.path.dbmaps.vo;

import java.math.BigDecimal;
import java.util.Date;

public class ATM_ENG_ACTION_LOGVO extends ATM_ENG_ACTION_LOGVOKey {
    /**
     * This field corresponds to the database column ATM_ENG_ACTION_LOG.INTERFACE_CODE
     */
    private BigDecimal INTERFACE_CODE;

    /**
     * This field corresponds to the database column ATM_ENG_ACTION_LOG.ATM_ENG_ACTION
     */
    private String ATM_ENG_ACTION;

    /**
     * This field corresponds to the database column ATM_ENG_ACTION_LOG.START_TIME
     */
    private Date START_TIME;

    /**
     * This field corresponds to the database column ATM_ENG_ACTION_LOG.END_TIME
     */
    private Date END_TIME;

    /**
     * This field corresponds to the database column ATM_ENG_ACTION_LOG.MESSAGE
     */
    private String MESSAGE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ATM_ENG_ACTION_LOG.INTERFACE_CODE
     *
     * @return the value of ATM_ENG_ACTION_LOG.INTERFACE_CODE
     */
    public BigDecimal getINTERFACE_CODE() {
        return INTERFACE_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ATM_ENG_ACTION_LOG.INTERFACE_CODE
     *
     * @param INTERFACE_CODE the value for ATM_ENG_ACTION_LOG.INTERFACE_CODE
     */
    public void setINTERFACE_CODE(BigDecimal INTERFACE_CODE) {
        this.INTERFACE_CODE = INTERFACE_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ATM_ENG_ACTION_LOG.ATM_ENG_ACTION
     *
     * @return the value of ATM_ENG_ACTION_LOG.ATM_ENG_ACTION
     */
    public String getATM_ENG_ACTION() {
        return ATM_ENG_ACTION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ATM_ENG_ACTION_LOG.ATM_ENG_ACTION
     *
     * @param ATM_ENG_ACTION the value for ATM_ENG_ACTION_LOG.ATM_ENG_ACTION
     */
    public void setATM_ENG_ACTION(String ATM_ENG_ACTION) {
        this.ATM_ENG_ACTION = ATM_ENG_ACTION == null ? null : ATM_ENG_ACTION.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ATM_ENG_ACTION_LOG.START_TIME
     *
     * @return the value of ATM_ENG_ACTION_LOG.START_TIME
     */
    public Date getSTART_TIME() {
        return START_TIME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ATM_ENG_ACTION_LOG.START_TIME
     *
     * @param START_TIME the value for ATM_ENG_ACTION_LOG.START_TIME
     */
    public void setSTART_TIME(Date START_TIME) {
        this.START_TIME = START_TIME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ATM_ENG_ACTION_LOG.END_TIME
     *
     * @return the value of ATM_ENG_ACTION_LOG.END_TIME
     */
    public Date getEND_TIME() {
        return END_TIME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ATM_ENG_ACTION_LOG.END_TIME
     *
     * @param END_TIME the value for ATM_ENG_ACTION_LOG.END_TIME
     */
    public void setEND_TIME(Date END_TIME) {
        this.END_TIME = END_TIME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ATM_ENG_ACTION_LOG.MESSAGE
     *
     * @return the value of ATM_ENG_ACTION_LOG.MESSAGE
     */
    public String getMESSAGE() {
        return MESSAGE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ATM_ENG_ACTION_LOG.MESSAGE
     *
     * @param MESSAGE the value for ATM_ENG_ACTION_LOG.MESSAGE
     */
    public void setMESSAGE(String MESSAGE) {
        this.MESSAGE = MESSAGE == null ? null : MESSAGE.trim();
    }
}