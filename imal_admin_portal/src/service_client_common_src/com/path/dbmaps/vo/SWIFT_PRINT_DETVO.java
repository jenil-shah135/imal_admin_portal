package com.path.dbmaps.vo;

import java.math.BigDecimal;

public class SWIFT_PRINT_DETVO extends SWIFT_PRINT_DETVOKey {
    /**
     * This field corresponds to the database column SWIFT_PRINT_DET.COLUMN_NAME
     */
    private String COLUMN_NAME;

    /**
     * This field corresponds to the database column SWIFT_PRINT_DET.COLUMN_TYPE
     */
    private String COLUMN_TYPE;

    /**
     * This field corresponds to the database column SWIFT_PRINT_DET.POSITION_FR
     */
    private BigDecimal POSITION_FR;

    /**
     * This field corresponds to the database column SWIFT_PRINT_DET.POSITION_TO
     */
    private BigDecimal POSITION_TO;

    /**
     * This field corresponds to the database column SWIFT_PRINT_DET.KEY_VALUE_TYPE
     */
    private String KEY_VALUE_TYPE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_PRINT_DET.COLUMN_NAME
     *
     * @return the value of SWIFT_PRINT_DET.COLUMN_NAME
     */
    public String getCOLUMN_NAME() {
        return COLUMN_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_PRINT_DET.COLUMN_NAME
     *
     * @param COLUMN_NAME the value for SWIFT_PRINT_DET.COLUMN_NAME
     */
    public void setCOLUMN_NAME(String COLUMN_NAME) {
        this.COLUMN_NAME = COLUMN_NAME == null ? null : COLUMN_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_PRINT_DET.COLUMN_TYPE
     *
     * @return the value of SWIFT_PRINT_DET.COLUMN_TYPE
     */
    public String getCOLUMN_TYPE() {
        return COLUMN_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_PRINT_DET.COLUMN_TYPE
     *
     * @param COLUMN_TYPE the value for SWIFT_PRINT_DET.COLUMN_TYPE
     */
    public void setCOLUMN_TYPE(String COLUMN_TYPE) {
        this.COLUMN_TYPE = COLUMN_TYPE == null ? null : COLUMN_TYPE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_PRINT_DET.POSITION_FR
     *
     * @return the value of SWIFT_PRINT_DET.POSITION_FR
     */
    public BigDecimal getPOSITION_FR() {
        return POSITION_FR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_PRINT_DET.POSITION_FR
     *
     * @param POSITION_FR the value for SWIFT_PRINT_DET.POSITION_FR
     */
    public void setPOSITION_FR(BigDecimal POSITION_FR) {
        this.POSITION_FR = POSITION_FR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_PRINT_DET.POSITION_TO
     *
     * @return the value of SWIFT_PRINT_DET.POSITION_TO
     */
    public BigDecimal getPOSITION_TO() {
        return POSITION_TO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_PRINT_DET.POSITION_TO
     *
     * @param POSITION_TO the value for SWIFT_PRINT_DET.POSITION_TO
     */
    public void setPOSITION_TO(BigDecimal POSITION_TO) {
        this.POSITION_TO = POSITION_TO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SWIFT_PRINT_DET.KEY_VALUE_TYPE
     *
     * @return the value of SWIFT_PRINT_DET.KEY_VALUE_TYPE
     */
    public String getKEY_VALUE_TYPE() {
        return KEY_VALUE_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SWIFT_PRINT_DET.KEY_VALUE_TYPE
     *
     * @param KEY_VALUE_TYPE the value for SWIFT_PRINT_DET.KEY_VALUE_TYPE
     */
    public void setKEY_VALUE_TYPE(String KEY_VALUE_TYPE) {
        this.KEY_VALUE_TYPE = KEY_VALUE_TYPE == null ? null : KEY_VALUE_TYPE.trim();
    }
}