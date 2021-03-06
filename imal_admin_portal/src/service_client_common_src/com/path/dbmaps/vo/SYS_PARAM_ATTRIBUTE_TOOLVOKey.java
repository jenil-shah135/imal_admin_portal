package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class SYS_PARAM_ATTRIBUTE_TOOLVOKey extends BaseVO {
    /**
     * This field corresponds to the database column SYS_PARAM_ATTRIBUTE_TOOL.ATTRIBUTE_TOOL_ID
     */
    private BigDecimal ATTRIBUTE_TOOL_ID;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_PARAM_ATTRIBUTE_TOOL.ATTRIBUTE_TOOL_ID
     *
     * @return the value of SYS_PARAM_ATTRIBUTE_TOOL.ATTRIBUTE_TOOL_ID
     */
    public BigDecimal getATTRIBUTE_TOOL_ID() {
        return ATTRIBUTE_TOOL_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PARAM_ATTRIBUTE_TOOL.ATTRIBUTE_TOOL_ID
     *
     * @param ATTRIBUTE_TOOL_ID the value for SYS_PARAM_ATTRIBUTE_TOOL.ATTRIBUTE_TOOL_ID
     */
    public void setATTRIBUTE_TOOL_ID(BigDecimal ATTRIBUTE_TOOL_ID) {
        this.ATTRIBUTE_TOOL_ID = ATTRIBUTE_TOOL_ID;
    }
}