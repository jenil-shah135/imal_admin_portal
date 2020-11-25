package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class CTS_UPLOAD_FILE_TYPE_VALVOKey extends BaseVO {
    /**
     * This field corresponds to the database column CTS_UPLOAD_FILE_TYPE_VAL.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column CTS_UPLOAD_FILE_TYPE_VAL.FILE_TYPE
     */
    private BigDecimal FILE_TYPE;

    /**
     * This field corresponds to the database column CTS_UPLOAD_FILE_TYPE_VAL.VALIDATION_CODE
     */
    private BigDecimal VALIDATION_CODE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_UPLOAD_FILE_TYPE_VAL.COMP_CODE
     *
     * @return the value of CTS_UPLOAD_FILE_TYPE_VAL.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_UPLOAD_FILE_TYPE_VAL.COMP_CODE
     *
     * @param COMP_CODE the value for CTS_UPLOAD_FILE_TYPE_VAL.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_UPLOAD_FILE_TYPE_VAL.FILE_TYPE
     *
     * @return the value of CTS_UPLOAD_FILE_TYPE_VAL.FILE_TYPE
     */
    public BigDecimal getFILE_TYPE() {
        return FILE_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_UPLOAD_FILE_TYPE_VAL.FILE_TYPE
     *
     * @param FILE_TYPE the value for CTS_UPLOAD_FILE_TYPE_VAL.FILE_TYPE
     */
    public void setFILE_TYPE(BigDecimal FILE_TYPE) {
        this.FILE_TYPE = FILE_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_UPLOAD_FILE_TYPE_VAL.VALIDATION_CODE
     *
     * @return the value of CTS_UPLOAD_FILE_TYPE_VAL.VALIDATION_CODE
     */
    public BigDecimal getVALIDATION_CODE() {
        return VALIDATION_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_UPLOAD_FILE_TYPE_VAL.VALIDATION_CODE
     *
     * @param VALIDATION_CODE the value for CTS_UPLOAD_FILE_TYPE_VAL.VALIDATION_CODE
     */
    public void setVALIDATION_CODE(BigDecimal VALIDATION_CODE) {
        this.VALIDATION_CODE = VALIDATION_CODE;
    }
}