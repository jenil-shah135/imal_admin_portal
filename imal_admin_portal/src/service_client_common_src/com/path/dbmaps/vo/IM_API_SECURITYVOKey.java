package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class IM_API_SECURITYVOKey extends BaseVO {
    /**
     * This field corresponds to the database column IM_API_SECURITY.API_CODE
     */
    private BigDecimal API_CODE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_API_SECURITY.API_CODE
     *
     * @return the value of IM_API_SECURITY.API_CODE
     */
    public BigDecimal getAPI_CODE() {
        return API_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_API_SECURITY.API_CODE
     *
     * @param API_CODE the value for IM_API_SECURITY.API_CODE
     */
    public void setAPI_CODE(BigDecimal API_CODE) {
        this.API_CODE = API_CODE;
    }
}