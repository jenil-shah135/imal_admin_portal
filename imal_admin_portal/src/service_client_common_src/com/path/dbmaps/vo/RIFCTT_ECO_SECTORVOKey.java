package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class RIFCTT_ECO_SECTORVOKey extends BaseVO {
    /**
     * This field corresponds to the database column RIFCTT_ECO_SECTOR.CIF_TYPE_CODE
     */
    private BigDecimal CIF_TYPE_CODE;

    /**
     * This field corresponds to the database column RIFCTT_ECO_SECTOR.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column RIFCTT_ECO_SECTOR.SECTOR_CODE
     */
    private BigDecimal SECTOR_CODE;

    /**
     * This field corresponds to the database column RIFCTT_ECO_SECTOR.SUB_SECTOR_CODE
     */
    private BigDecimal SUB_SECTOR_CODE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RIFCTT_ECO_SECTOR.CIF_TYPE_CODE
     *
     * @return the value of RIFCTT_ECO_SECTOR.CIF_TYPE_CODE
     */
    public BigDecimal getCIF_TYPE_CODE() {
        return CIF_TYPE_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RIFCTT_ECO_SECTOR.CIF_TYPE_CODE
     *
     * @param CIF_TYPE_CODE the value for RIFCTT_ECO_SECTOR.CIF_TYPE_CODE
     */
    public void setCIF_TYPE_CODE(BigDecimal CIF_TYPE_CODE) {
        this.CIF_TYPE_CODE = CIF_TYPE_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RIFCTT_ECO_SECTOR.COMP_CODE
     *
     * @return the value of RIFCTT_ECO_SECTOR.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RIFCTT_ECO_SECTOR.COMP_CODE
     *
     * @param COMP_CODE the value for RIFCTT_ECO_SECTOR.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RIFCTT_ECO_SECTOR.SECTOR_CODE
     *
     * @return the value of RIFCTT_ECO_SECTOR.SECTOR_CODE
     */
    public BigDecimal getSECTOR_CODE() {
        return SECTOR_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RIFCTT_ECO_SECTOR.SECTOR_CODE
     *
     * @param SECTOR_CODE the value for RIFCTT_ECO_SECTOR.SECTOR_CODE
     */
    public void setSECTOR_CODE(BigDecimal SECTOR_CODE) {
        this.SECTOR_CODE = SECTOR_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RIFCTT_ECO_SECTOR.SUB_SECTOR_CODE
     *
     * @return the value of RIFCTT_ECO_SECTOR.SUB_SECTOR_CODE
     */
    public BigDecimal getSUB_SECTOR_CODE() {
        return SUB_SECTOR_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RIFCTT_ECO_SECTOR.SUB_SECTOR_CODE
     *
     * @param SUB_SECTOR_CODE the value for RIFCTT_ECO_SECTOR.SUB_SECTOR_CODE
     */
    public void setSUB_SECTOR_CODE(BigDecimal SUB_SECTOR_CODE) {
        this.SUB_SECTOR_CODE = SUB_SECTOR_CODE;
    }
}