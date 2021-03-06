package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class TFSCTRL1VOKey extends BaseVO {
    /**
     * This field corresponds to the database column TFSCTRL1.BRANCH
     */
    private BigDecimal BRANCH;

    /**
     * This field corresponds to the database column TFSCTRL1.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFSCTRL1.BRANCH
     *
     * @return the value of TFSCTRL1.BRANCH
     */
    public BigDecimal getBRANCH() {
        return BRANCH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFSCTRL1.BRANCH
     *
     * @param BRANCH the value for TFSCTRL1.BRANCH
     */
    public void setBRANCH(BigDecimal BRANCH) {
        this.BRANCH = BRANCH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFSCTRL1.COMP_CODE
     *
     * @return the value of TFSCTRL1.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFSCTRL1.COMP_CODE
     *
     * @param COMP_CODE the value for TFSCTRL1.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }
}