package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class RIFMESSAGEVOKey extends BaseVO {
    /**
     * This field corresponds to the database column RIFMESSAGE.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column RIFMESSAGE.MSG_CODE
     */
    private BigDecimal MSG_CODE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RIFMESSAGE.COMP_CODE
     *
     * @return the value of RIFMESSAGE.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RIFMESSAGE.COMP_CODE
     *
     * @param COMP_CODE the value for RIFMESSAGE.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RIFMESSAGE.MSG_CODE
     *
     * @return the value of RIFMESSAGE.MSG_CODE
     */
    public BigDecimal getMSG_CODE() {
        return MSG_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RIFMESSAGE.MSG_CODE
     *
     * @param MSG_CODE the value for RIFMESSAGE.MSG_CODE
     */
    public void setMSG_CODE(BigDecimal MSG_CODE) {
        this.MSG_CODE = MSG_CODE;
    }
}