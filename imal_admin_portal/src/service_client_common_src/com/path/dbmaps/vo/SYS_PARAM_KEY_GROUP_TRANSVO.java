package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class SYS_PARAM_KEY_GROUP_TRANSVO extends BaseVO {
    /**
     * This field corresponds to the database column SYS_PARAM_KEY_GROUP_TRANS.KEY_GROUP_ID
     */
    private BigDecimal KEY_GROUP_ID;

    /**
     * This field corresponds to the database column SYS_PARAM_KEY_GROUP_TRANS.LANG_CODE
     */
    private String LANG_CODE;

    /**
     * This field corresponds to the database column SYS_PARAM_KEY_GROUP_TRANS.VALUE_TRANS
     */
    private String VALUE_TRANS;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_PARAM_KEY_GROUP_TRANS.KEY_GROUP_ID
     *
     * @return the value of SYS_PARAM_KEY_GROUP_TRANS.KEY_GROUP_ID
     */
    public BigDecimal getKEY_GROUP_ID() {
        return KEY_GROUP_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PARAM_KEY_GROUP_TRANS.KEY_GROUP_ID
     *
     * @param KEY_GROUP_ID the value for SYS_PARAM_KEY_GROUP_TRANS.KEY_GROUP_ID
     */
    public void setKEY_GROUP_ID(BigDecimal KEY_GROUP_ID) {
        this.KEY_GROUP_ID = KEY_GROUP_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_PARAM_KEY_GROUP_TRANS.LANG_CODE
     *
     * @return the value of SYS_PARAM_KEY_GROUP_TRANS.LANG_CODE
     */
    public String getLANG_CODE() {
        return LANG_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PARAM_KEY_GROUP_TRANS.LANG_CODE
     *
     * @param LANG_CODE the value for SYS_PARAM_KEY_GROUP_TRANS.LANG_CODE
     */
    public void setLANG_CODE(String LANG_CODE) {
        this.LANG_CODE = LANG_CODE == null ? null : LANG_CODE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_PARAM_KEY_GROUP_TRANS.VALUE_TRANS
     *
     * @return the value of SYS_PARAM_KEY_GROUP_TRANS.VALUE_TRANS
     */
    public String getVALUE_TRANS() {
        return VALUE_TRANS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PARAM_KEY_GROUP_TRANS.VALUE_TRANS
     *
     * @param VALUE_TRANS the value for SYS_PARAM_KEY_GROUP_TRANS.VALUE_TRANS
     */
    public void setVALUE_TRANS(String VALUE_TRANS) {
        this.VALUE_TRANS = VALUE_TRANS == null ? null : VALUE_TRANS;
    }
}