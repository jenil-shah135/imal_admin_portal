package com.path.dbmaps.vo;

import java.math.BigDecimal;

public class SYS_PARAM_ATTRIBUTEVO extends SYS_PARAM_ATTRIBUTEVOKey {
    /**
     * This field corresponds to the database column SYS_PARAM_ATTRIBUTE.ATTRIBUTE_TECH_NAME
     */
    private String ATTRIBUTE_TECH_NAME;

    /**
     * This field corresponds to the database column SYS_PARAM_ATTRIBUTE.ATTRIBUTE_TOOL_ID
     */
    private BigDecimal ATTRIBUTE_TOOL_ID;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_PARAM_ATTRIBUTE.ATTRIBUTE_TECH_NAME
     *
     * @return the value of SYS_PARAM_ATTRIBUTE.ATTRIBUTE_TECH_NAME
     */
    public String getATTRIBUTE_TECH_NAME() {
        return ATTRIBUTE_TECH_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PARAM_ATTRIBUTE.ATTRIBUTE_TECH_NAME
     *
     * @param ATTRIBUTE_TECH_NAME the value for SYS_PARAM_ATTRIBUTE.ATTRIBUTE_TECH_NAME
     */
    public void setATTRIBUTE_TECH_NAME(String ATTRIBUTE_TECH_NAME) {
        this.ATTRIBUTE_TECH_NAME = ATTRIBUTE_TECH_NAME == null ? null : ATTRIBUTE_TECH_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_PARAM_ATTRIBUTE.ATTRIBUTE_TOOL_ID
     *
     * @return the value of SYS_PARAM_ATTRIBUTE.ATTRIBUTE_TOOL_ID
     */
    public BigDecimal getATTRIBUTE_TOOL_ID() {
        return ATTRIBUTE_TOOL_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PARAM_ATTRIBUTE.ATTRIBUTE_TOOL_ID
     *
     * @param ATTRIBUTE_TOOL_ID the value for SYS_PARAM_ATTRIBUTE.ATTRIBUTE_TOOL_ID
     */
    public void setATTRIBUTE_TOOL_ID(BigDecimal ATTRIBUTE_TOOL_ID) {
        this.ATTRIBUTE_TOOL_ID = ATTRIBUTE_TOOL_ID;
    }
}