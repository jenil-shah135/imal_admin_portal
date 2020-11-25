package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class PMSORDERVOKey extends BaseVO {
    /**
     * This field corresponds to the database column PMSORDER.BRANCH_CODE
     */
    private BigDecimal BRANCH_CODE;

    /**
     * This field corresponds to the database column PMSORDER.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column PMSORDER.TRX_LINE_NBR
     */
    private BigDecimal TRX_LINE_NBR;

    /**
     * This field corresponds to the database column PMSORDER.TRX_NBR
     */
    private BigDecimal TRX_NBR;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PMSORDER.BRANCH_CODE
     *
     * @return the value of PMSORDER.BRANCH_CODE
     */
    public BigDecimal getBRANCH_CODE() {
        return BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PMSORDER.BRANCH_CODE
     *
     * @param BRANCH_CODE the value for PMSORDER.BRANCH_CODE
     */
    public void setBRANCH_CODE(BigDecimal BRANCH_CODE) {
        this.BRANCH_CODE = BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PMSORDER.COMP_CODE
     *
     * @return the value of PMSORDER.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PMSORDER.COMP_CODE
     *
     * @param COMP_CODE the value for PMSORDER.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PMSORDER.TRX_LINE_NBR
     *
     * @return the value of PMSORDER.TRX_LINE_NBR
     */
    public BigDecimal getTRX_LINE_NBR() {
        return TRX_LINE_NBR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PMSORDER.TRX_LINE_NBR
     *
     * @param TRX_LINE_NBR the value for PMSORDER.TRX_LINE_NBR
     */
    public void setTRX_LINE_NBR(BigDecimal TRX_LINE_NBR) {
        this.TRX_LINE_NBR = TRX_LINE_NBR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PMSORDER.TRX_NBR
     *
     * @return the value of PMSORDER.TRX_NBR
     */
    public BigDecimal getTRX_NBR() {
        return TRX_NBR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PMSORDER.TRX_NBR
     *
     * @param TRX_NBR the value for PMSORDER.TRX_NBR
     */
    public void setTRX_NBR(BigDecimal TRX_NBR) {
        this.TRX_NBR = TRX_NBR;
    }
}