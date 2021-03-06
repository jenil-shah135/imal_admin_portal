package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class RIFPFTVOKey extends BaseVO {
    /**
     * This field corresponds to the database column RIFPFT.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column RIFPFT.GROUP_CODE
     */
    private BigDecimal GROUP_CODE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RIFPFT.COMP_CODE
     *
     * @return the value of RIFPFT.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RIFPFT.COMP_CODE
     *
     * @param COMP_CODE the value for RIFPFT.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RIFPFT.GROUP_CODE
     *
     * @return the value of RIFPFT.GROUP_CODE
     */
    public BigDecimal getGROUP_CODE() {
        return GROUP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RIFPFT.GROUP_CODE
     *
     * @param GROUP_CODE the value for RIFPFT.GROUP_CODE
     */
    public void setGROUP_CODE(BigDecimal GROUP_CODE) {
        this.GROUP_CODE = GROUP_CODE;
    }
}