package com.path.dbmaps.vo;

import java.math.BigDecimal;
import java.util.Date;

public class SWIFT_DWSCHEDVO extends SWIFT_DWSCHEDVOKey {
    /**
     * This field corresponds to the database column SWIFT_DWSCHED.NEXT_REPLICATION
     */
    private Date NEXT_REPLICATION;

    /**
     * This field corresponds to the database column SWIFT_DWSCHED.PERIOD
     */
    private BigDecimal PERIOD;

    /**
     * This field corresponds to the database column SWIFT_DWSCHED.PERIOD_TYPE
     */
    private String PERIOD_TYPE;

    /**
     * This field corresponds to the database column SWIFT_DWSCHED.PERIOD_DAY
     */
    private BigDecimal PERIOD_DAY;

    /**
     * This field corresponds to the database column SWIFT_DWSCHED.TRANS_FROM
     */
    private BigDecimal TRANS_FROM;

    /**
     * This field corresponds to the database column SWIFT_DWSCHED.TRANS_TO
     */
    private BigDecimal TRANS_TO;

    /**
     * This field corresponds to the database column SWIFT_DWSCHED.DATE_FROM
     */
    private String DATE_FROM;

    /**
     * This field corresponds to the database column SWIFT_DWSCHED.DATE_TO
     */
    private String DATE_TO;

    /**
     * This field corresponds to the database column SWIFT_DWSCHED.SUSPEND_REPLICATION
     */
    private BigDecimal SUSPEND_REPLICATION;

    /**
     * This field corresponds to the database column SWIFT_DWSCHED.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column SWIFT_DWSCHED.BRANCH_FROM
     */
    private BigDecimal BRANCH_FROM;

    /**
     * This field corresponds to the database column SWIFT_DWSCHED.BRANCH_TO
     */
    private BigDecimal BRANCH_TO;

    /**
     * This field corresponds to the database column SWIFT_DWSCHED.CY_FROM
     */
    private BigDecimal CY_FROM;

    /**
     * This field corresponds to the database column SWIFT_DWSCHED.CY_TO
     */
    private BigDecimal CY_TO;

    /**
     * This field corresponds to the database column SWIFT_DWSCHED.GL_FROM
     */
    private BigDecimal GL_FROM;

    /**
     * This field corresponds to the database column SWIFT_DWSCHED.GL_TO
     */
    private BigDecimal GL_TO;

    /**
     * This field corresponds to the database column SWIFT_DWSCHED.CIF_FROM
     */
    private BigDecimal CIF_FROM;

    /**
     * This field corresponds to the database column SWIFT_DWSCHED.CIF_TO
     */
    private BigDecimal CIF_TO;

    /**
     * This field corresponds to the database column SWIFT_DWSCHED.SL_FROM
     */
    private BigDecimal SL_FROM;

    /**
     * This field corresponds to the database column SWIFT_DWSCHED.SL_TO
     */
    private BigDecimal SL_TO;

    /**
     * This field corresponds to the database column SWIFT_DWSCHED.RECEIVER_CIF
     */
    private BigDecimal RECEIVER_CIF;

    /**
     * This field corresponds to the database column SWIFT_DWSCHED.REQ_GEN_950
     */
    private BigDecimal REQ_GEN_950;

    /**
     * This field corresponds to the database column SWIFT_DWSCHED.ADDITIONAL_REFERENCE_TO
     */
    private String ADDITIONAL_REFERENCE_TO;

    /**
     * This field corresponds to the database column SWIFT_DWSCHED.ADDITIONAL_REFERENCE_FROM
     */
    private String ADDITIONAL_REFERENCE_FROM;

    /**
     * This field corresponds to the database column SWIFT_DWSCHED.SCHED_TIME
     */
    private String SCHED_TIME;

    /**
     * This field corresponds to the database column SWIFT_DWSCHED.LAST_REPLICATION
     */
    private Date LAST_REPLICATION;

    /**
     * This field corresponds to the database column SWIFT_DWSCHED.MSG_CODE
     */
    private String MSG_CODE;

    /**
     * This field corresponds to the database column SWIFT_DWSCHED.GENERATE_MESSAGE
     */
    private BigDecimal GENERATE_MESSAGE;

    /**
     * This field corresponds to the database column SWIFT_DWSCHED.NEXT_DATE_AFTER_HOL
     */
    private Date NEXT_DATE_AFTER_HOL;

    /**
     * This field corresponds to the database column SWIFT_DWSCHED.JAVA_PROCESS
     */
    private BigDecimal JAVA_PROCESS;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.NEXT_REPLICATION
     *
     * @return the value of SWIFT_DWSCHED.NEXT_REPLICATION
     */
    public Date getNEXT_REPLICATION() {
        return NEXT_REPLICATION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.NEXT_REPLICATION
     *
     * @param NEXT_REPLICATION the value for SWIFT_DWSCHED.NEXT_REPLICATION
     */
    public void setNEXT_REPLICATION(Date NEXT_REPLICATION) {
        this.NEXT_REPLICATION = NEXT_REPLICATION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.PERIOD
     *
     * @return the value of SWIFT_DWSCHED.PERIOD
     */
    public BigDecimal getPERIOD() {
        return PERIOD;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.PERIOD
     *
     * @param PERIOD the value for SWIFT_DWSCHED.PERIOD
     */
    public void setPERIOD(BigDecimal PERIOD) {
        this.PERIOD = PERIOD;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.PERIOD_TYPE
     *
     * @return the value of SWIFT_DWSCHED.PERIOD_TYPE
     */
    public String getPERIOD_TYPE() {
        return PERIOD_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.PERIOD_TYPE
     *
     * @param PERIOD_TYPE the value for SWIFT_DWSCHED.PERIOD_TYPE
     */
    public void setPERIOD_TYPE(String PERIOD_TYPE) {
        this.PERIOD_TYPE = PERIOD_TYPE == null ? null : PERIOD_TYPE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.PERIOD_DAY
     *
     * @return the value of SWIFT_DWSCHED.PERIOD_DAY
     */
    public BigDecimal getPERIOD_DAY() {
        return PERIOD_DAY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.PERIOD_DAY
     *
     * @param PERIOD_DAY the value for SWIFT_DWSCHED.PERIOD_DAY
     */
    public void setPERIOD_DAY(BigDecimal PERIOD_DAY) {
        this.PERIOD_DAY = PERIOD_DAY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.TRANS_FROM
     *
     * @return the value of SWIFT_DWSCHED.TRANS_FROM
     */
    public BigDecimal getTRANS_FROM() {
        return TRANS_FROM;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.TRANS_FROM
     *
     * @param TRANS_FROM the value for SWIFT_DWSCHED.TRANS_FROM
     */
    public void setTRANS_FROM(BigDecimal TRANS_FROM) {
        this.TRANS_FROM = TRANS_FROM;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.TRANS_TO
     *
     * @return the value of SWIFT_DWSCHED.TRANS_TO
     */
    public BigDecimal getTRANS_TO() {
        return TRANS_TO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.TRANS_TO
     *
     * @param TRANS_TO the value for SWIFT_DWSCHED.TRANS_TO
     */
    public void setTRANS_TO(BigDecimal TRANS_TO) {
        this.TRANS_TO = TRANS_TO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.DATE_FROM
     *
     * @return the value of SWIFT_DWSCHED.DATE_FROM
     */
    public String getDATE_FROM() {
        return DATE_FROM;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.DATE_FROM
     *
     * @param DATE_FROM the value for SWIFT_DWSCHED.DATE_FROM
     */
    public void setDATE_FROM(String DATE_FROM) {
        this.DATE_FROM = DATE_FROM == null ? null : DATE_FROM.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.DATE_TO
     *
     * @return the value of SWIFT_DWSCHED.DATE_TO
     */
    public String getDATE_TO() {
        return DATE_TO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.DATE_TO
     *
     * @param DATE_TO the value for SWIFT_DWSCHED.DATE_TO
     */
    public void setDATE_TO(String DATE_TO) {
        this.DATE_TO = DATE_TO == null ? null : DATE_TO.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.SUSPEND_REPLICATION
     *
     * @return the value of SWIFT_DWSCHED.SUSPEND_REPLICATION
     */
    public BigDecimal getSUSPEND_REPLICATION() {
        return SUSPEND_REPLICATION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.SUSPEND_REPLICATION
     *
     * @param SUSPEND_REPLICATION the value for SWIFT_DWSCHED.SUSPEND_REPLICATION
     */
    public void setSUSPEND_REPLICATION(BigDecimal SUSPEND_REPLICATION) {
        this.SUSPEND_REPLICATION = SUSPEND_REPLICATION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.COMP_CODE
     *
     * @return the value of SWIFT_DWSCHED.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.COMP_CODE
     *
     * @param COMP_CODE the value for SWIFT_DWSCHED.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.BRANCH_FROM
     *
     * @return the value of SWIFT_DWSCHED.BRANCH_FROM
     */
    public BigDecimal getBRANCH_FROM() {
        return BRANCH_FROM;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.BRANCH_FROM
     *
     * @param BRANCH_FROM the value for SWIFT_DWSCHED.BRANCH_FROM
     */
    public void setBRANCH_FROM(BigDecimal BRANCH_FROM) {
        this.BRANCH_FROM = BRANCH_FROM;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.BRANCH_TO
     *
     * @return the value of SWIFT_DWSCHED.BRANCH_TO
     */
    public BigDecimal getBRANCH_TO() {
        return BRANCH_TO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.BRANCH_TO
     *
     * @param BRANCH_TO the value for SWIFT_DWSCHED.BRANCH_TO
     */
    public void setBRANCH_TO(BigDecimal BRANCH_TO) {
        this.BRANCH_TO = BRANCH_TO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.CY_FROM
     *
     * @return the value of SWIFT_DWSCHED.CY_FROM
     */
    public BigDecimal getCY_FROM() {
        return CY_FROM;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.CY_FROM
     *
     * @param CY_FROM the value for SWIFT_DWSCHED.CY_FROM
     */
    public void setCY_FROM(BigDecimal CY_FROM) {
        this.CY_FROM = CY_FROM;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.CY_TO
     *
     * @return the value of SWIFT_DWSCHED.CY_TO
     */
    public BigDecimal getCY_TO() {
        return CY_TO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.CY_TO
     *
     * @param CY_TO the value for SWIFT_DWSCHED.CY_TO
     */
    public void setCY_TO(BigDecimal CY_TO) {
        this.CY_TO = CY_TO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.GL_FROM
     *
     * @return the value of SWIFT_DWSCHED.GL_FROM
     */
    public BigDecimal getGL_FROM() {
        return GL_FROM;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.GL_FROM
     *
     * @param GL_FROM the value for SWIFT_DWSCHED.GL_FROM
     */
    public void setGL_FROM(BigDecimal GL_FROM) {
        this.GL_FROM = GL_FROM;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.GL_TO
     *
     * @return the value of SWIFT_DWSCHED.GL_TO
     */
    public BigDecimal getGL_TO() {
        return GL_TO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.GL_TO
     *
     * @param GL_TO the value for SWIFT_DWSCHED.GL_TO
     */
    public void setGL_TO(BigDecimal GL_TO) {
        this.GL_TO = GL_TO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.CIF_FROM
     *
     * @return the value of SWIFT_DWSCHED.CIF_FROM
     */
    public BigDecimal getCIF_FROM() {
        return CIF_FROM;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.CIF_FROM
     *
     * @param CIF_FROM the value for SWIFT_DWSCHED.CIF_FROM
     */
    public void setCIF_FROM(BigDecimal CIF_FROM) {
        this.CIF_FROM = CIF_FROM;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.CIF_TO
     *
     * @return the value of SWIFT_DWSCHED.CIF_TO
     */
    public BigDecimal getCIF_TO() {
        return CIF_TO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.CIF_TO
     *
     * @param CIF_TO the value for SWIFT_DWSCHED.CIF_TO
     */
    public void setCIF_TO(BigDecimal CIF_TO) {
        this.CIF_TO = CIF_TO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.SL_FROM
     *
     * @return the value of SWIFT_DWSCHED.SL_FROM
     */
    public BigDecimal getSL_FROM() {
        return SL_FROM;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.SL_FROM
     *
     * @param SL_FROM the value for SWIFT_DWSCHED.SL_FROM
     */
    public void setSL_FROM(BigDecimal SL_FROM) {
        this.SL_FROM = SL_FROM;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.SL_TO
     *
     * @return the value of SWIFT_DWSCHED.SL_TO
     */
    public BigDecimal getSL_TO() {
        return SL_TO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.SL_TO
     *
     * @param SL_TO the value for SWIFT_DWSCHED.SL_TO
     */
    public void setSL_TO(BigDecimal SL_TO) {
        this.SL_TO = SL_TO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.RECEIVER_CIF
     *
     * @return the value of SWIFT_DWSCHED.RECEIVER_CIF
     */
    public BigDecimal getRECEIVER_CIF() {
        return RECEIVER_CIF;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.RECEIVER_CIF
     *
     * @param RECEIVER_CIF the value for SWIFT_DWSCHED.RECEIVER_CIF
     */
    public void setRECEIVER_CIF(BigDecimal RECEIVER_CIF) {
        this.RECEIVER_CIF = RECEIVER_CIF;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.REQ_GEN_950
     *
     * @return the value of SWIFT_DWSCHED.REQ_GEN_950
     */
    public BigDecimal getREQ_GEN_950() {
        return REQ_GEN_950;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.REQ_GEN_950
     *
     * @param REQ_GEN_950 the value for SWIFT_DWSCHED.REQ_GEN_950
     */
    public void setREQ_GEN_950(BigDecimal REQ_GEN_950) {
        this.REQ_GEN_950 = REQ_GEN_950;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.ADDITIONAL_REFERENCE_TO
     *
     * @return the value of SWIFT_DWSCHED.ADDITIONAL_REFERENCE_TO
     */
    public String getADDITIONAL_REFERENCE_TO() {
        return ADDITIONAL_REFERENCE_TO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.ADDITIONAL_REFERENCE_TO
     *
     * @param ADDITIONAL_REFERENCE_TO the value for SWIFT_DWSCHED.ADDITIONAL_REFERENCE_TO
     */
    public void setADDITIONAL_REFERENCE_TO(String ADDITIONAL_REFERENCE_TO) {
        this.ADDITIONAL_REFERENCE_TO = ADDITIONAL_REFERENCE_TO == null ? null : ADDITIONAL_REFERENCE_TO.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.ADDITIONAL_REFERENCE_FROM
     *
     * @return the value of SWIFT_DWSCHED.ADDITIONAL_REFERENCE_FROM
     */
    public String getADDITIONAL_REFERENCE_FROM() {
        return ADDITIONAL_REFERENCE_FROM;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.ADDITIONAL_REFERENCE_FROM
     *
     * @param ADDITIONAL_REFERENCE_FROM the value for SWIFT_DWSCHED.ADDITIONAL_REFERENCE_FROM
     */
    public void setADDITIONAL_REFERENCE_FROM(String ADDITIONAL_REFERENCE_FROM) {
        this.ADDITIONAL_REFERENCE_FROM = ADDITIONAL_REFERENCE_FROM == null ? null : ADDITIONAL_REFERENCE_FROM.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.SCHED_TIME
     *
     * @return the value of SWIFT_DWSCHED.SCHED_TIME
     */
    public String getSCHED_TIME() {
        return SCHED_TIME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.SCHED_TIME
     *
     * @param SCHED_TIME the value for SWIFT_DWSCHED.SCHED_TIME
     */
    public void setSCHED_TIME(String SCHED_TIME) {
        this.SCHED_TIME = SCHED_TIME == null ? null : SCHED_TIME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.LAST_REPLICATION
     *
     * @return the value of SWIFT_DWSCHED.LAST_REPLICATION
     */
    public Date getLAST_REPLICATION() {
        return LAST_REPLICATION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.LAST_REPLICATION
     *
     * @param LAST_REPLICATION the value for SWIFT_DWSCHED.LAST_REPLICATION
     */
    public void setLAST_REPLICATION(Date LAST_REPLICATION) {
        this.LAST_REPLICATION = LAST_REPLICATION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.MSG_CODE
     *
     * @return the value of SWIFT_DWSCHED.MSG_CODE
     */
    public String getMSG_CODE() {
        return MSG_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.MSG_CODE
     *
     * @param MSG_CODE the value for SWIFT_DWSCHED.MSG_CODE
     */
    public void setMSG_CODE(String MSG_CODE) {
        this.MSG_CODE = MSG_CODE == null ? null : MSG_CODE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.GENERATE_MESSAGE
     *
     * @return the value of SWIFT_DWSCHED.GENERATE_MESSAGE
     */
    public BigDecimal getGENERATE_MESSAGE() {
        return GENERATE_MESSAGE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.GENERATE_MESSAGE
     *
     * @param GENERATE_MESSAGE the value for SWIFT_DWSCHED.GENERATE_MESSAGE
     */
    public void setGENERATE_MESSAGE(BigDecimal GENERATE_MESSAGE) {
        this.GENERATE_MESSAGE = GENERATE_MESSAGE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.NEXT_DATE_AFTER_HOL
     *
     * @return the value of SWIFT_DWSCHED.NEXT_DATE_AFTER_HOL
     */
    public Date getNEXT_DATE_AFTER_HOL() {
        return NEXT_DATE_AFTER_HOL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.NEXT_DATE_AFTER_HOL
     *
     * @param NEXT_DATE_AFTER_HOL the value for SWIFT_DWSCHED.NEXT_DATE_AFTER_HOL
     */
    public void setNEXT_DATE_AFTER_HOL(Date NEXT_DATE_AFTER_HOL) {
        this.NEXT_DATE_AFTER_HOL = NEXT_DATE_AFTER_HOL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_DWSCHED.JAVA_PROCESS
     *
     * @return the value of SWIFT_DWSCHED.JAVA_PROCESS
     */
    public BigDecimal getJAVA_PROCESS() {
        return JAVA_PROCESS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_DWSCHED.JAVA_PROCESS
     *
     * @param JAVA_PROCESS the value for SWIFT_DWSCHED.JAVA_PROCESS
     */
    public void setJAVA_PROCESS(BigDecimal JAVA_PROCESS) {
        this.JAVA_PROCESS = JAVA_PROCESS;
    }
}