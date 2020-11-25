package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class FMSAPPLDOCUMENTSVOKey extends BaseVO {
    /**
     * This field corresponds to the database column FMSAPPLDOCUMENTS.APP_REF
     */
    private BigDecimal APP_REF;

    /**
     * This field corresponds to the database column FMSAPPLDOCUMENTS.BRANCH
     */
    private BigDecimal BRANCH;

    /**
     * This field corresponds to the database column FMSAPPLDOCUMENTS.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column FMSAPPLDOCUMENTS.DOC_CODE
     */
    private BigDecimal DOC_CODE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSAPPLDOCUMENTS.APP_REF
     *
     * @return the value of FMSAPPLDOCUMENTS.APP_REF
     */
    public BigDecimal getAPP_REF() {
        return APP_REF;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSAPPLDOCUMENTS.APP_REF
     *
     * @param APP_REF the value for FMSAPPLDOCUMENTS.APP_REF
     */
    public void setAPP_REF(BigDecimal APP_REF) {
        this.APP_REF = APP_REF;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSAPPLDOCUMENTS.BRANCH
     *
     * @return the value of FMSAPPLDOCUMENTS.BRANCH
     */
    public BigDecimal getBRANCH() {
        return BRANCH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSAPPLDOCUMENTS.BRANCH
     *
     * @param BRANCH the value for FMSAPPLDOCUMENTS.BRANCH
     */
    public void setBRANCH(BigDecimal BRANCH) {
        this.BRANCH = BRANCH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSAPPLDOCUMENTS.COMP_CODE
     *
     * @return the value of FMSAPPLDOCUMENTS.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSAPPLDOCUMENTS.COMP_CODE
     *
     * @param COMP_CODE the value for FMSAPPLDOCUMENTS.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FMSAPPLDOCUMENTS.DOC_CODE
     *
     * @return the value of FMSAPPLDOCUMENTS.DOC_CODE
     */
    public BigDecimal getDOC_CODE() {
        return DOC_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FMSAPPLDOCUMENTS.DOC_CODE
     *
     * @param DOC_CODE the value for FMSAPPLDOCUMENTS.DOC_CODE
     */
    public void setDOC_CODE(BigDecimal DOC_CODE) {
        this.DOC_CODE = DOC_CODE;
    }
}