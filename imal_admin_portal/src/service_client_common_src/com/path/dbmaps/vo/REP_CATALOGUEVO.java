package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class REP_CATALOGUEVO extends BaseVO {
    /**
     * This field corresponds to the database column REP_CATALOGUE.REP_ID
     */
    private BigDecimal REP_ID;

    /**
     * This field corresponds to the database column REP_CATALOGUE.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column REP_CATALOGUE.REP_OBJECT
     */
    private byte[] REP_OBJECT;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REP_CATALOGUE.REP_ID
     *
     * @return the value of REP_CATALOGUE.REP_ID
     */
    public BigDecimal getREP_ID() {
        return REP_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REP_CATALOGUE.REP_ID
     *
     * @param REP_ID the value for REP_CATALOGUE.REP_ID
     */
    public void setREP_ID(BigDecimal REP_ID) {
        this.REP_ID = REP_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REP_CATALOGUE.COMP_CODE
     *
     * @return the value of REP_CATALOGUE.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REP_CATALOGUE.COMP_CODE
     *
     * @param COMP_CODE the value for REP_CATALOGUE.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REP_CATALOGUE.REP_OBJECT
     *
     * @return the value of REP_CATALOGUE.REP_OBJECT
     */
    public byte[] getREP_OBJECT() {
        return REP_OBJECT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REP_CATALOGUE.REP_OBJECT
     *
     * @param REP_OBJECT the value for REP_CATALOGUE.REP_OBJECT
     */
    public void setREP_OBJECT(byte[] REP_OBJECT) {
        this.REP_OBJECT = REP_OBJECT;
    }
}