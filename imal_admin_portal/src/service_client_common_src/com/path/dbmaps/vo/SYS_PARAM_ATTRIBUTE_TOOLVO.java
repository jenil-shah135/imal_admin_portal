package com.path.dbmaps.vo;

public class SYS_PARAM_ATTRIBUTE_TOOLVO extends SYS_PARAM_ATTRIBUTE_TOOLVOKey {
    /**
     * This field corresponds to the database column SYS_PARAM_ATTRIBUTE_TOOL.ATTRIBUTE_TOOL_DESC
     */
    private String ATTRIBUTE_TOOL_DESC;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_PARAM_ATTRIBUTE_TOOL.ATTRIBUTE_TOOL_DESC
     *
     * @return the value of SYS_PARAM_ATTRIBUTE_TOOL.ATTRIBUTE_TOOL_DESC
     */
    public String getATTRIBUTE_TOOL_DESC() {
        return ATTRIBUTE_TOOL_DESC;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PARAM_ATTRIBUTE_TOOL.ATTRIBUTE_TOOL_DESC
     *
     * @param ATTRIBUTE_TOOL_Desc the value for SYS_PARAM_ATTRIBUTE_TOOL.ATTRIBUTE_TOOL_DESC
     */
    public void setATTRIBUTE_TOOL_DESC(String ATTRIBUTE_TOOL_DESC) {
        this.ATTRIBUTE_TOOL_DESC = ATTRIBUTE_TOOL_DESC == null ? null : ATTRIBUTE_TOOL_DESC.trim();
    }
}