package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class SYS_DYN_TABLEVOKey extends BaseVO {
    /**
     * This field corresponds to the database column SYS_DYN_TABLE.TABLE_ID
     */
    private BigDecimal TABLE_ID;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_DYN_TABLE.TABLE_ID
     *
     * @return the value of SYS_DYN_TABLE.TABLE_ID
     */
    public BigDecimal getTABLE_ID() {
        return TABLE_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_DYN_TABLE.TABLE_ID
     *
     * @param TABLE_ID the value for SYS_DYN_TABLE.TABLE_ID
     */
    public void setTABLE_ID(BigDecimal TABLE_ID) {
        this.TABLE_ID = TABLE_ID;
    }
}