package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;

public class CTS_DYN_INTERMEDIATE_BANKVOKey extends BaseVO {
    /**
     * This field corresponds to the database column CTS_DYN_INTERMEDIATE_BANK.CODE
     */
    private String CODE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_DYN_INTERMEDIATE_BANK.CODE
     *
     * @return the value of CTS_DYN_INTERMEDIATE_BANK.CODE
     */
    public String getCODE() {
        return CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_DYN_INTERMEDIATE_BANK.CODE
     *
     * @param CODE the value for CTS_DYN_INTERMEDIATE_BANK.CODE
     */
    public void setCODE(String CODE) {
        this.CODE = CODE == null ? null : CODE.trim();
    }
}