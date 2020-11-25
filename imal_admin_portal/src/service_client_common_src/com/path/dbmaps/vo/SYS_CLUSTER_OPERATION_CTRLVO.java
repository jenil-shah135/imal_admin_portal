package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.util.Date;

public class SYS_CLUSTER_OPERATION_CTRLVO extends BaseVO {
    /**
     * This field corresponds to the database column SYS_CLUSTER_OPERATION_CTRL.OPERATION_NAME
     */
    private String OPERATION_NAME;

    /**
     * This field corresponds to the database column SYS_CLUSTER_OPERATION_CTRL.MACHINE_NAME
     */
    private String MACHINE_NAME;

    /**
     * This field corresponds to the database column SYS_CLUSTER_OPERATION_CTRL.OPERATION_TYPE
     */
    private String OPERATION_TYPE;

    /**
     * This field corresponds to the database column SYS_CLUSTER_OPERATION_CTRL.OPERATION_TIME
     */
    private Date OPERATION_TIME;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CLUSTER_OPERATION_CTRL.OPERATION_NAME
     *
     * @return the value of SYS_CLUSTER_OPERATION_CTRL.OPERATION_NAME
     */
    public String getOPERATION_NAME() {
        return OPERATION_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CLUSTER_OPERATION_CTRL.OPERATION_NAME
     *
     * @param OPERATION_NAME the value for SYS_CLUSTER_OPERATION_CTRL.OPERATION_NAME
     */
    public void setOPERATION_NAME(String OPERATION_NAME) {
        this.OPERATION_NAME = OPERATION_NAME == null ? null : OPERATION_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CLUSTER_OPERATION_CTRL.MACHINE_NAME
     *
     * @return the value of SYS_CLUSTER_OPERATION_CTRL.MACHINE_NAME
     */
    public String getMACHINE_NAME() {
        return MACHINE_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CLUSTER_OPERATION_CTRL.MACHINE_NAME
     *
     * @param MACHINE_NAME the value for SYS_CLUSTER_OPERATION_CTRL.MACHINE_NAME
     */
    public void setMACHINE_NAME(String MACHINE_NAME) {
        this.MACHINE_NAME = MACHINE_NAME == null ? null : MACHINE_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CLUSTER_OPERATION_CTRL.OPERATION_TYPE
     *
     * @return the value of SYS_CLUSTER_OPERATION_CTRL.OPERATION_TYPE
     */
    public String getOPERATION_TYPE() {
        return OPERATION_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CLUSTER_OPERATION_CTRL.OPERATION_TYPE
     *
     * @param OPERATION_TYPE the value for SYS_CLUSTER_OPERATION_CTRL.OPERATION_TYPE
     */
    public void setOPERATION_TYPE(String OPERATION_TYPE) {
        this.OPERATION_TYPE = OPERATION_TYPE == null ? null : OPERATION_TYPE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CLUSTER_OPERATION_CTRL.OPERATION_TIME
     *
     * @return the value of SYS_CLUSTER_OPERATION_CTRL.OPERATION_TIME
     */
    public Date getOPERATION_TIME() {
        return OPERATION_TIME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CLUSTER_OPERATION_CTRL.OPERATION_TIME
     *
     * @param OPERATION_TIME the value for SYS_CLUSTER_OPERATION_CTRL.OPERATION_TIME
     */
    public void setOPERATION_TIME(Date OPERATION_TIME) {
        this.OPERATION_TIME = OPERATION_TIME;
    }
}