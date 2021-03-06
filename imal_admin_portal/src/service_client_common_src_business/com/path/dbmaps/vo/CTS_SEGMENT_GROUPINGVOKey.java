package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;
import java.util.Date;

public class CTS_SEGMENT_GROUPINGVOKey extends BaseVO {
    /**
     * This field corresponds to the database column CPT_DHOFAR_O12.CTS_SEGMENT_GROUPING.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column CPT_DHOFAR_O12.CTS_SEGMENT_GROUPING.GROUP_CODE
     */
    private BigDecimal GROUP_CODE;    

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CPT_DHOFAR_O12.CTS_SEGMENT_GROUPING.COMP_CODE
     *
     * @return the value of CPT_DHOFAR_O12.CTS_SEGMENT_GROUPING.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CPT_DHOFAR_O12.CTS_SEGMENT_GROUPING.COMP_CODE
     *
     * @param COMP_CODE the value for CPT_DHOFAR_O12.CTS_SEGMENT_GROUPING.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CPT_DHOFAR_O12.CTS_SEGMENT_GROUPING.GROUP_CODE
     *
     * @return the value of CPT_DHOFAR_O12.CTS_SEGMENT_GROUPING.GROUP_CODE
     */
    public BigDecimal getGROUP_CODE() {
        return GROUP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CPT_DHOFAR_O12.CTS_SEGMENT_GROUPING.GROUP_CODE
     *
     * @param GROUP_CODE the value for CPT_DHOFAR_O12.CTS_SEGMENT_GROUPING.GROUP_CODE
     */
    public void setGROUP_CODE(BigDecimal GROUP_CODE) {
        this.GROUP_CODE = GROUP_CODE;
    }
}