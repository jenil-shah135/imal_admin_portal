package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class TRX_TEMPLATEVOKey extends BaseVO {
    /**
     * This field corresponds to the database column TRX_TEMPLATE.APP_NAME
     */
    private String APP_NAME;

    /**
     * This field corresponds to the database column TRX_TEMPLATE.BRANCH_CODE
     */
    private BigDecimal BRANCH_CODE;

    /**
     * This field corresponds to the database column TRX_TEMPLATE.CODE
     */
    private BigDecimal CODE;

    /**
     * This field corresponds to the database column TRX_TEMPLATE.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRX_TEMPLATE.APP_NAME
     *
     * @return the value of TRX_TEMPLATE.APP_NAME
     */
    public String getAPP_NAME() {
        return APP_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRX_TEMPLATE.APP_NAME
     *
     * @param APP_NAME the value for TRX_TEMPLATE.APP_NAME
     */
    public void setAPP_NAME(String APP_NAME) {
        this.APP_NAME = APP_NAME == null ? null : APP_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRX_TEMPLATE.BRANCH_CODE
     *
     * @return the value of TRX_TEMPLATE.BRANCH_CODE
     */
    public BigDecimal getBRANCH_CODE() {
        return BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRX_TEMPLATE.BRANCH_CODE
     *
     * @param BRANCH_CODE the value for TRX_TEMPLATE.BRANCH_CODE
     */
    public void setBRANCH_CODE(BigDecimal BRANCH_CODE) {
        this.BRANCH_CODE = BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRX_TEMPLATE.CODE
     *
     * @return the value of TRX_TEMPLATE.CODE
     */
    public BigDecimal getCODE() {
        return CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRX_TEMPLATE.CODE
     *
     * @param CODE the value for TRX_TEMPLATE.CODE
     */
    public void setCODE(BigDecimal CODE) {
        this.CODE = CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRX_TEMPLATE.COMP_CODE
     *
     * @return the value of TRX_TEMPLATE.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRX_TEMPLATE.COMP_CODE
     *
     * @param COMP_CODE the value for TRX_TEMPLATE.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }
}