package com.path.dbmaps.vo;

public class IMCO_PWS_TEST_MASTERVO extends IMCO_PWS_TEST_MASTERVOKey {
    /**
     * This field corresponds to the database column IMCO_PWS_TEST_MASTER.CONFIG_NAME
     */
    private String CONFIG_NAME;

    /**
     * This field corresponds to the database column IMCO_PWS_TEST_MASTER.APPLICATION_NAME
     */
    private String APPLICATION_NAME;

    /**
     * This field corresponds to the database column IMCO_PWS_TEST_MASTER.OPERATION_NAME
     */
    private String OPERATION_NAME;

    /**
     * This field corresponds to the database column IMCO_PWS_TEST_MASTER.ENDPOINT_NAME
     */
    private String ENDPOINT_NAME;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IMCO_PWS_TEST_MASTER.CONFIG_NAME
     *
     * @return the value of IMCO_PWS_TEST_MASTER.CONFIG_NAME
     */
    public String getCONFIG_NAME() {
        return CONFIG_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IMCO_PWS_TEST_MASTER.CONFIG_NAME
     *
     * @param CONFIG_NAME the value for IMCO_PWS_TEST_MASTER.CONFIG_NAME
     */
    public void setCONFIG_NAME(String CONFIG_NAME) {
        this.CONFIG_NAME = CONFIG_NAME == null ? null : CONFIG_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IMCO_PWS_TEST_MASTER.APPLICATION_NAME
     *
     * @return the value of IMCO_PWS_TEST_MASTER.APPLICATION_NAME
     */
    public String getAPPLICATION_NAME() {
        return APPLICATION_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IMCO_PWS_TEST_MASTER.APPLICATION_NAME
     *
     * @param APPLICATION_NAME the value for IMCO_PWS_TEST_MASTER.APPLICATION_NAME
     */
    public void setAPPLICATION_NAME(String APPLICATION_NAME) {
        this.APPLICATION_NAME = APPLICATION_NAME == null ? null : APPLICATION_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IMCO_PWS_TEST_MASTER.OPERATION_NAME
     *
     * @return the value of IMCO_PWS_TEST_MASTER.OPERATION_NAME
     */
    public String getOPERATION_NAME() {
        return OPERATION_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IMCO_PWS_TEST_MASTER.OPERATION_NAME
     *
     * @param OPERATION_NAME the value for IMCO_PWS_TEST_MASTER.OPERATION_NAME
     */
    public void setOPERATION_NAME(String OPERATION_NAME) {
        this.OPERATION_NAME = OPERATION_NAME == null ? null : OPERATION_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IMCO_PWS_TEST_MASTER.ENDPOINT_NAME
     *
     * @return the value of IMCO_PWS_TEST_MASTER.ENDPOINT_NAME
     */
    public String getENDPOINT_NAME() {
        return ENDPOINT_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IMCO_PWS_TEST_MASTER.ENDPOINT_NAME
     *
     * @param ENDPOINT_NAME the value for IMCO_PWS_TEST_MASTER.ENDPOINT_NAME
     */
    public void setENDPOINT_NAME(String ENDPOINT_NAME) {
        this.ENDPOINT_NAME = ENDPOINT_NAME == null ? null : ENDPOINT_NAME.trim();
    }
}