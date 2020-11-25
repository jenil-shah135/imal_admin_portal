package com.path.dbmaps.vo;

import java.math.BigDecimal;

public class CTS_BATCH_TMPVO extends CTS_BATCH_TMPVOKey {
    /**
     * This field corresponds to the database column CTS_BATCH_TMP.PROCESSED
     */
    private BigDecimal PROCESSED;

    /**
     * This field corresponds to the database column CTS_BATCH_TMP.FAILURE_REASON
     */
    private String FAILURE_REASON;
    
    /**
     * This field corresponds to the database column CTS_BATCH_TMP.BATCH_NO
     */
    private BigDecimal BATCH_NO;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_BATCH_TMP.PROCESSED
     *
     * @return the value of CTS_BATCH_TMP.PROCESSED
     */
    public BigDecimal getPROCESSED() {
        return PROCESSED;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_BATCH_TMP.PROCESSED
     *
     * @param PROCESSED the value for CTS_BATCH_TMP.PROCESSED
     */
    public void setPROCESSED(BigDecimal PROCESSED) {
        this.PROCESSED = PROCESSED;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_BATCH_TMP.FAILURE_REASON
     *
     * @return the value of CTS_BATCH_TMP.FAILURE_REASON
     */
    public String getFAILURE_REASON() {
        return FAILURE_REASON;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_BATCH_TMP.FAILURE_REASON
     *
     * @param FAILURE_REASON the value for CTS_BATCH_TMP.FAILURE_REASON
     */
    public void setFAILURE_REASON(String FAILURE_REASON) {
        this.FAILURE_REASON = FAILURE_REASON == null ? null : FAILURE_REASON.trim();
    }

    
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_BATCH_TMP.BATCH_NO
     *
     * @return the value of CTS_BATCH_TMP.BATCH_NO
     */
    public BigDecimal getBATCH_NO()
    {
        return BATCH_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_BATCH_TMP.BATCH_NO
     *
     * @param BATCH_NO the value for CTS_BATCH_TMP.BATCH_NO
     */
    public void setBATCH_NO(BigDecimal bATCH_NO)
    {
        BATCH_NO = bATCH_NO;
    }
    
    
    
}