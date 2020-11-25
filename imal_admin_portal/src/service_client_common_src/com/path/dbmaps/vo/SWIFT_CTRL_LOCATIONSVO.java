package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class SWIFT_CTRL_LOCATIONSVO extends BaseVO {
    /**
     * This field corresponds to the database column SWIFT_CTRL_LOCATIONS.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column SWIFT_CTRL_LOCATIONS.RUN_EXT_PROG
     */
    private BigDecimal RUN_EXT_PROG;

    /**
     * This field corresponds to the database column SWIFT_CTRL_LOCATIONS.EXT_PROG_PATH
     */
    private String EXT_PROG_PATH;

    /**
     * This field corresponds to the database column SWIFT_CTRL_LOCATIONS.ARCHIVE_PATH
     */
    private String ARCHIVE_PATH;

    /**
     * This field corresponds to the database column SWIFT_CTRL_LOCATIONS.LOG_PATH
     */
    private String LOG_PATH;

    /**
     * This field corresponds to the database column SWIFT_CTRL_LOCATIONS.SAVE_PATH
     */
    private String SAVE_PATH;

    /**
     * This field corresponds to the database column SWIFT_CTRL_LOCATIONS.DYNAMIC_PATH
     */
    private String DYNAMIC_PATH;

    /**
     * This field corresponds to the database column SWIFT_CTRL_LOCATIONS.LOG_IN_PATH
     */
    private String LOG_IN_PATH;

    /**
     * This field corresponds to the database column SWIFT_CTRL_LOCATIONS.INWARD_PATH
     */
    private String INWARD_PATH;

    /**
     * This field corresponds to the database column SWIFT_CTRL_LOCATIONS.INWARD_ACK_PATH
     */
    private String INWARD_ACK_PATH;

    /**
     * This field corresponds to the database column SWIFT_CTRL_LOCATIONS.INWARD_NACK_PATH
     */
    private String INWARD_NACK_PATH;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_CTRL_LOCATIONS.COMP_CODE
     *
     * @return the value of SWIFT_CTRL_LOCATIONS.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_CTRL_LOCATIONS.COMP_CODE
     *
     * @param COMP_CODE the value for SWIFT_CTRL_LOCATIONS.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_CTRL_LOCATIONS.RUN_EXT_PROG
     *
     * @return the value of SWIFT_CTRL_LOCATIONS.RUN_EXT_PROG
     */
    public BigDecimal getRUN_EXT_PROG() {
        return RUN_EXT_PROG;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_CTRL_LOCATIONS.RUN_EXT_PROG
     *
     * @param RUN_EXT_PROG the value for SWIFT_CTRL_LOCATIONS.RUN_EXT_PROG
     */
    public void setRUN_EXT_PROG(BigDecimal RUN_EXT_PROG) {
        this.RUN_EXT_PROG = RUN_EXT_PROG;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_CTRL_LOCATIONS.EXT_PROG_PATH
     *
     * @return the value of SWIFT_CTRL_LOCATIONS.EXT_PROG_PATH
     */
    public String getEXT_PROG_PATH() {
        return EXT_PROG_PATH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_CTRL_LOCATIONS.EXT_PROG_PATH
     *
     * @param EXT_PROG_PATH the value for SWIFT_CTRL_LOCATIONS.EXT_PROG_PATH
     */
    public void setEXT_PROG_PATH(String EXT_PROG_PATH) {
        this.EXT_PROG_PATH = EXT_PROG_PATH == null ? null : EXT_PROG_PATH.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_CTRL_LOCATIONS.ARCHIVE_PATH
     *
     * @return the value of SWIFT_CTRL_LOCATIONS.ARCHIVE_PATH
     */
    public String getARCHIVE_PATH() {
        return ARCHIVE_PATH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_CTRL_LOCATIONS.ARCHIVE_PATH
     *
     * @param ARCHIVE_PATH the value for SWIFT_CTRL_LOCATIONS.ARCHIVE_PATH
     */
    public void setARCHIVE_PATH(String ARCHIVE_PATH) {
        this.ARCHIVE_PATH = ARCHIVE_PATH == null ? null : ARCHIVE_PATH.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_CTRL_LOCATIONS.LOG_PATH
     *
     * @return the value of SWIFT_CTRL_LOCATIONS.LOG_PATH
     */
    public String getLOG_PATH() {
        return LOG_PATH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_CTRL_LOCATIONS.LOG_PATH
     *
     * @param LOG_PATH the value for SWIFT_CTRL_LOCATIONS.LOG_PATH
     */
    public void setLOG_PATH(String LOG_PATH) {
        this.LOG_PATH = LOG_PATH == null ? null : LOG_PATH.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_CTRL_LOCATIONS.SAVE_PATH
     *
     * @return the value of SWIFT_CTRL_LOCATIONS.SAVE_PATH
     */
    public String getSAVE_PATH() {
        return SAVE_PATH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_CTRL_LOCATIONS.SAVE_PATH
     *
     * @param SAVE_PATH the value for SWIFT_CTRL_LOCATIONS.SAVE_PATH
     */
    public void setSAVE_PATH(String SAVE_PATH) {
        this.SAVE_PATH = SAVE_PATH == null ? null : SAVE_PATH.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_CTRL_LOCATIONS.DYNAMIC_PATH
     *
     * @return the value of SWIFT_CTRL_LOCATIONS.DYNAMIC_PATH
     */
    public String getDYNAMIC_PATH() {
        return DYNAMIC_PATH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_CTRL_LOCATIONS.DYNAMIC_PATH
     *
     * @param DYNAMIC_PATH the value for SWIFT_CTRL_LOCATIONS.DYNAMIC_PATH
     */
    public void setDYNAMIC_PATH(String DYNAMIC_PATH) {
        this.DYNAMIC_PATH = DYNAMIC_PATH == null ? null : DYNAMIC_PATH.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_CTRL_LOCATIONS.LOG_IN_PATH
     *
     * @return the value of SWIFT_CTRL_LOCATIONS.LOG_IN_PATH
     */
    public String getLOG_IN_PATH() {
        return LOG_IN_PATH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_CTRL_LOCATIONS.LOG_IN_PATH
     *
     * @param LOG_IN_PATH the value for SWIFT_CTRL_LOCATIONS.LOG_IN_PATH
     */
    public void setLOG_IN_PATH(String LOG_IN_PATH) {
        this.LOG_IN_PATH = LOG_IN_PATH == null ? null : LOG_IN_PATH.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_CTRL_LOCATIONS.INWARD_PATH
     *
     * @return the value of SWIFT_CTRL_LOCATIONS.INWARD_PATH
     */
    public String getINWARD_PATH() {
        return INWARD_PATH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_CTRL_LOCATIONS.INWARD_PATH
     *
     * @param INWARD_PATH the value for SWIFT_CTRL_LOCATIONS.INWARD_PATH
     */
    public void setINWARD_PATH(String INWARD_PATH) {
        this.INWARD_PATH = INWARD_PATH == null ? null : INWARD_PATH.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_CTRL_LOCATIONS.INWARD_ACK_PATH
     *
     * @return the value of SWIFT_CTRL_LOCATIONS.INWARD_ACK_PATH
     */
    public String getINWARD_ACK_PATH() {
        return INWARD_ACK_PATH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_CTRL_LOCATIONS.INWARD_ACK_PATH
     *
     * @param INWARD_ACK_PATH the value for SWIFT_CTRL_LOCATIONS.INWARD_ACK_PATH
     */
    public void setINWARD_ACK_PATH(String INWARD_ACK_PATH) {
        this.INWARD_ACK_PATH = INWARD_ACK_PATH == null ? null : INWARD_ACK_PATH.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_CTRL_LOCATIONS.INWARD_NACK_PATH
     *
     * @return the value of SWIFT_CTRL_LOCATIONS.INWARD_NACK_PATH
     */
    public String getINWARD_NACK_PATH() {
        return INWARD_NACK_PATH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_CTRL_LOCATIONS.INWARD_NACK_PATH
     *
     * @param INWARD_NACK_PATH the value for SWIFT_CTRL_LOCATIONS.INWARD_NACK_PATH
     */
    public void setINWARD_NACK_PATH(String INWARD_NACK_PATH) {
        this.INWARD_NACK_PATH = INWARD_NACK_PATH == null ? null : INWARD_NACK_PATH.trim();
    }
}