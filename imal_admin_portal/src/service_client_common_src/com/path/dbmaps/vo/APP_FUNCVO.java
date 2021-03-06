package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class APP_FUNCVO extends BaseVO {
    /**
     * This field corresponds to the database column APP_FUNC.APP_FUNC_ID
     */
    private String APP_FUNC_ID;

    /**
     * This field corresponds to the database column APP_FUNC.APP_FN_DESC
     */
    private String APP_FN_DESC;

    /**
     * This field corresponds to the database column APP_FUNC.APP_FN_ENABLED
     */
    private BigDecimal APP_FN_ENABLED;

    /**
     * This field corresponds to the database column APP_FUNC.APP_ID
     */
    private BigDecimal APP_ID;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_FUNC.APP_FUNC_ID
     *
     * @return the value of APP_FUNC.APP_FUNC_ID
     */
    public String getAPP_FUNC_ID() {
        return APP_FUNC_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_FUNC.APP_FUNC_ID
     *
     * @param APP_FUNC_ID the value for APP_FUNC.APP_FUNC_ID
     */
    public void setAPP_FUNC_ID(String APP_FUNC_ID) {
        this.APP_FUNC_ID = APP_FUNC_ID == null ? null : APP_FUNC_ID.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_FUNC.APP_FN_DESC
     *
     * @return the value of APP_FUNC.APP_FN_DESC
     */
    public String getAPP_FN_DESC() {
        return APP_FN_DESC;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_FUNC.APP_FN_DESC
     *
     * @param APP_FN_DESC the value for APP_FUNC.APP_FN_DESC
     */
    public void setAPP_FN_DESC(String APP_FN_DESC) {
        this.APP_FN_DESC = APP_FN_DESC == null ? null : APP_FN_DESC.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_FUNC.APP_FN_ENABLED
     *
     * @return the value of APP_FUNC.APP_FN_ENABLED
     */
    public BigDecimal getAPP_FN_ENABLED() {
        return APP_FN_ENABLED;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_FUNC.APP_FN_ENABLED
     *
     * @param APP_FN_ENABLED the value for APP_FUNC.APP_FN_ENABLED
     */
    public void setAPP_FN_ENABLED(BigDecimal APP_FN_ENABLED) {
        this.APP_FN_ENABLED = APP_FN_ENABLED;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APP_FUNC.APP_ID
     *
     * @return the value of APP_FUNC.APP_ID
     */
    public BigDecimal getAPP_ID() {
        return APP_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APP_FUNC.APP_ID
     *
     * @param APP_ID the value for APP_FUNC.APP_ID
     */
    public void setAPP_ID(BigDecimal APP_ID) {
        this.APP_ID = APP_ID;
    }
}