package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;

public class S_ROLEVOKey extends BaseVO {
    /**
     * This field corresponds to the database column S_ROLE.ROLE_NAME
     */
    private String ROLE_NAME;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_ROLE.ROLE_NAME
     *
     * @return the value of S_ROLE.ROLE_NAME
     */
    public String getROLE_NAME() {
        return ROLE_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_ROLE.ROLE_NAME
     *
     * @param ROLE_NAME the value for S_ROLE.ROLE_NAME
     */
    public void setROLE_NAME(String ROLE_NAME) {
        this.ROLE_NAME = ROLE_NAME == null ? null : ROLE_NAME.trim();
    }
}