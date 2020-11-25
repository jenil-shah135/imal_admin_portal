package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class SWFT_SCHED_MANAGERVO extends BaseVO {
    /**
     * This field corresponds to the database column SWFT_SCHED_MANAGER.THREAD_ID
     */
    private long THREAD_ID;

    /**
     * This field corresponds to the database column SWFT_SCHED_MANAGER.THREAD_STATUS
     */
    private String THREAD_STATUS;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWFT_SCHED_MANAGER.THREAD_ID
     *
     * @return the value of SWFT_SCHED_MANAGER.THREAD_ID
     */
    public long getTHREAD_ID() {
        return THREAD_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWFT_SCHED_MANAGER.THREAD_ID
     *
     * @param idThread the value for SWFT_SCHED_MANAGER.THREAD_ID
     */
    public void setTHREAD_ID(long idThread) {
        this.THREAD_ID = idThread;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWFT_SCHED_MANAGER.THREAD_STATUS
     *
     * @return the value of SWFT_SCHED_MANAGER.THREAD_STATUS
     */
    public String getTHREAD_STATUS() {
        return THREAD_STATUS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWFT_SCHED_MANAGER.THREAD_STATUS
     *
     * @param THREAD_STATUS the value for SWFT_SCHED_MANAGER.THREAD_STATUS
     */
    public void setTHREAD_STATUS(String THREAD_STATUS) {
        this.THREAD_STATUS = THREAD_STATUS == null ? null : THREAD_STATUS.trim();
    }
}