package com.path.dbmaps.vo;

public class SYS_DYN_PARAM_TABLESVO extends SYS_DYN_PARAM_TABLESVOKey {
    /**
     * This field corresponds to the database column SYS_DYN_PARAM_TABLES.TABLE_DESC
     */
    private String TABLE_DESC;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_DYN_PARAM_TABLES.TABLE_DESC
     *
     * @return the value of SYS_DYN_PARAM_TABLES.TABLE_DESC
     */
    public String getTABLE_DESC() {
        return TABLE_DESC;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_DYN_PARAM_TABLES.TABLE_DESC
     *
     * @param TABLE_DESC the value for SYS_DYN_PARAM_TABLES.TABLE_DESC
     */
    public void setTABLE_DESC(String TABLE_DESC) {
        this.TABLE_DESC = TABLE_DESC == null ? null : TABLE_DESC.trim();
    }
}