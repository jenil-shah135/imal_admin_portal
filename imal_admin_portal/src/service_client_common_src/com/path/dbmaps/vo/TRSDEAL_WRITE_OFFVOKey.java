package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class TRSDEAL_WRITE_OFFVOKey extends BaseVO {
    /**
     * This field corresponds to the database column TRSDEAL_WRITE_OFF.BRANCH_CODE
     */
    private BigDecimal BRANCH_CODE;

    /**
     * This field corresponds to the database column TRSDEAL_WRITE_OFF.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column TRSDEAL_WRITE_OFF.TRS_NO
     */
    private BigDecimal TRS_NO;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSDEAL_WRITE_OFF.BRANCH_CODE
     *
     * @return the value of TRSDEAL_WRITE_OFF.BRANCH_CODE
     */
    public BigDecimal getBRANCH_CODE() {
        return BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSDEAL_WRITE_OFF.BRANCH_CODE
     *
     * @param BRANCH_CODE the value for TRSDEAL_WRITE_OFF.BRANCH_CODE
     */
    public void setBRANCH_CODE(BigDecimal BRANCH_CODE) {
        this.BRANCH_CODE = BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSDEAL_WRITE_OFF.COMP_CODE
     *
     * @return the value of TRSDEAL_WRITE_OFF.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSDEAL_WRITE_OFF.COMP_CODE
     *
     * @param COMP_CODE the value for TRSDEAL_WRITE_OFF.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSDEAL_WRITE_OFF.TRS_NO
     *
     * @return the value of TRSDEAL_WRITE_OFF.TRS_NO
     */
    public BigDecimal getTRS_NO() {
        return TRS_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSDEAL_WRITE_OFF.TRS_NO
     *
     * @param TRS_NO the value for TRSDEAL_WRITE_OFF.TRS_NO
     */
    public void setTRS_NO(BigDecimal TRS_NO) {
        this.TRS_NO = TRS_NO;
    }
}