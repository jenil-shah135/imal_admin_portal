package com.path.dbmaps.vo;

import java.math.BigDecimal;
import java.util.Date;

public class PMS_PF_SELECTIONVO extends PMS_PF_SELECTIONVOKey {
    /**
     * This field corresponds to the database column PMS_PF_SELECTION.NET_WORTH
     */
    private BigDecimal NET_WORTH;

    /**
     * This field corresponds to the database column PMS_PF_SELECTION.INCEPTION_DATE
     */
    private Date INCEPTION_DATE;

    /**
     * This field corresponds to the database column PMS_PF_SELECTION.QTY
     */
    private BigDecimal QTY;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PMS_PF_SELECTION.NET_WORTH
     *
     * @return the value of PMS_PF_SELECTION.NET_WORTH
     */
    public BigDecimal getNET_WORTH() {
        return NET_WORTH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PMS_PF_SELECTION.NET_WORTH
     *
     * @param NET_WORTH the value for PMS_PF_SELECTION.NET_WORTH
     */
    public void setNET_WORTH(BigDecimal NET_WORTH) {
        this.NET_WORTH = NET_WORTH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PMS_PF_SELECTION.INCEPTION_DATE
     *
     * @return the value of PMS_PF_SELECTION.INCEPTION_DATE
     */
    public Date getINCEPTION_DATE() {
        return INCEPTION_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PMS_PF_SELECTION.INCEPTION_DATE
     *
     * @param INCEPTION_DATE the value for PMS_PF_SELECTION.INCEPTION_DATE
     */
    public void setINCEPTION_DATE(Date INCEPTION_DATE) {
        this.INCEPTION_DATE = INCEPTION_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PMS_PF_SELECTION.QTY
     *
     * @return the value of PMS_PF_SELECTION.QTY
     */
    public BigDecimal getQTY() {
        return QTY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PMS_PF_SELECTION.QTY
     *
     * @param QTY the value for PMS_PF_SELECTION.QTY
     */
    public void setQTY(BigDecimal QTY) {
        this.QTY = QTY;
    }
}