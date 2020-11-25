package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class DYN_CHRG_TEMPLATEVOKey extends BaseVO {
    /**
     * This field corresponds to the database column DYN_CHRG_TEMPLATE.APP_NAME
     */
    private String APP_NAME;

    /**
     * This field corresponds to the database column DYN_CHRG_TEMPLATE.DYN_TEMP_ID
     */
    private BigDecimal DYN_TEMP_ID;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DYN_CHRG_TEMPLATE.APP_NAME
     *
     * @return the value of DYN_CHRG_TEMPLATE.APP_NAME
     */
    public String getAPP_NAME() {
        return APP_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DYN_CHRG_TEMPLATE.APP_NAME
     *
     * @param APP_NAME the value for DYN_CHRG_TEMPLATE.APP_NAME
     */
    public void setAPP_NAME(String APP_NAME) {
        this.APP_NAME = APP_NAME == null ? null : APP_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DYN_CHRG_TEMPLATE.DYN_TEMP_ID
     *
     * @return the value of DYN_CHRG_TEMPLATE.DYN_TEMP_ID
     */
    public BigDecimal getDYN_TEMP_ID() {
        return DYN_TEMP_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DYN_CHRG_TEMPLATE.DYN_TEMP_ID
     *
     * @param DYN_TEMP_ID the value for DYN_CHRG_TEMPLATE.DYN_TEMP_ID
     */
    public void setDYN_TEMP_ID(BigDecimal DYN_TEMP_ID) {
        this.DYN_TEMP_ID = DYN_TEMP_ID;
    }
}