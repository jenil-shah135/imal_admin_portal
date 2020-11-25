package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class S_SCANVOKey extends BaseVO {
    /**
     * This field corresponds to the database column S_SCAN.BRANCH_CODE
     */
    private BigDecimal BRANCH_CODE;

    /**
     * This field corresponds to the database column S_SCAN.CODE
     */
    private BigDecimal CODE;

    /**
     * This field corresponds to the database column S_SCAN.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column S_SCAN.DOC_TYPE
     */
    private String DOC_TYPE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_SCAN.BRANCH_CODE
     *
     * @return the value of S_SCAN.BRANCH_CODE
     */
    public BigDecimal getBRANCH_CODE() {
        return BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_SCAN.BRANCH_CODE
     *
     * @param BRANCH_CODE the value for S_SCAN.BRANCH_CODE
     */
    public void setBRANCH_CODE(BigDecimal BRANCH_CODE) {
        this.BRANCH_CODE = BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_SCAN.CODE
     *
     * @return the value of S_SCAN.CODE
     */
    public BigDecimal getCODE() {
        return CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_SCAN.CODE
     *
     * @param CODE the value for S_SCAN.CODE
     */
    public void setCODE(BigDecimal CODE) {
        this.CODE = CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_SCAN.COMP_CODE
     *
     * @return the value of S_SCAN.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_SCAN.COMP_CODE
     *
     * @param COMP_CODE the value for S_SCAN.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_SCAN.DOC_TYPE
     *
     * @return the value of S_SCAN.DOC_TYPE
     */
    public String getDOC_TYPE() {
        return DOC_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_SCAN.DOC_TYPE
     *
     * @param DOC_TYPE the value for S_SCAN.DOC_TYPE
     */
    public void setDOC_TYPE(String DOC_TYPE) {
        this.DOC_TYPE = DOC_TYPE == null ? null : DOC_TYPE.trim();
    }
}