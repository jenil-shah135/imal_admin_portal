package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class FX_DEALER_LIMITSVOKey extends BaseVO {
    /**
     * This field corresponds to the database column FX_DEALER_LIMITS.BRANCH_CODE
     */
    private BigDecimal BRANCH_CODE;

    /**
     * This field corresponds to the database column FX_DEALER_LIMITS.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column FX_DEALER_LIMITS.USER_ID
     */
    private String USER_ID;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FX_DEALER_LIMITS.BRANCH_CODE
     *
     * @return the value of FX_DEALER_LIMITS.BRANCH_CODE
     */
    public BigDecimal getBRANCH_CODE() {
        return BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FX_DEALER_LIMITS.BRANCH_CODE
     *
     * @param BRANCH_CODE the value for FX_DEALER_LIMITS.BRANCH_CODE
     */
    public void setBRANCH_CODE(BigDecimal BRANCH_CODE) {
        this.BRANCH_CODE = BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FX_DEALER_LIMITS.COMP_CODE
     *
     * @return the value of FX_DEALER_LIMITS.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FX_DEALER_LIMITS.COMP_CODE
     *
     * @param COMP_CODE the value for FX_DEALER_LIMITS.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FX_DEALER_LIMITS.USER_ID
     *
     * @return the value of FX_DEALER_LIMITS.USER_ID
     */
    public String getUSER_ID() {
        return USER_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FX_DEALER_LIMITS.USER_ID
     *
     * @param USER_ID the value for FX_DEALER_LIMITS.USER_ID
     */
    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID == null ? null : USER_ID.trim();
    }
}