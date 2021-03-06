package com.path.dbmaps.vo;

import java.math.BigDecimal;
import java.util.Date;

public class FMSCOMMITTEEVO extends FMSCOMMITTEEVOKey
{
    /**
     * This field corresponds to the database column FMSCOMMITTEE.BRIEF_NAME_ENG
     */
    private String BRIEF_NAME_ENG;

    /**
     * This field corresponds to the database column FMSCOMMITTEE.LONG_NAME_ENG
     */
    private String LONG_NAME_ENG;

    /**
     * This field corresponds to the database column
     * FMSCOMMITTEE.BRIEF_NAME_ARAB
     */
    private String BRIEF_NAME_ARAB;

    /**
     * This field corresponds to the database column FMSCOMMITTEE.LONG_NAME_ARAB
     */
    private String LONG_NAME_ARAB;

    /**
     * This field corresponds to the database column FMSCOMMITTEE.MAX_VALUE
     */
    private BigDecimal MAX_VALUE;

    /**
     * This field corresponds to the database column FMSCOMMITTEE.MAX_TENOR
     */
    private BigDecimal MAX_TENOR;

    /**
     * This field corresponds to the database column
     * FMSCOMMITTEE.LOW_GRADE_SCORE
     */
    private BigDecimal LOW_GRADE_SCORE;

    /**
     * This field corresponds to the database column
     * FMSCOMMITTEE.MAX_CLI_EXPOSURE
     */
    private BigDecimal MAX_CLI_EXPOSURE;

    /**
     * This field corresponds to the database column FMSCOMMITTEE.MAX_GUARANTOR
     */
    private BigDecimal MAX_GUARANTOR;

    /**
     * This field corresponds to the database column
     * FMSCOMMITTEE.MAX_CURRENCY_EXPOSURE
     */
    private BigDecimal MAX_CURRENCY_EXPOSURE;

    /**
     * This field corresponds to the database column
     * FMSCOMMITTEE.MAX_COUNTRY_EXPOSURE
     */
    private BigDecimal MAX_COUNTRY_EXPOSURE;

    /**
     * This field corresponds to the database column
     * FMSCOMMITTEE.MAX_MAIN_ECOSEC_EXPOSURE
     */
    private BigDecimal MAX_MAIN_ECOSEC_EXPOSURE;

    /**
     * This field corresponds to the database column
     * FMSCOMMITTEE.MAX_SUB_ECOSEC_EXPOSURE
     */
    private BigDecimal MAX_SUB_ECOSEC_EXPOSURE;

    /**
     * This field corresponds to the database column FMSCOMMITTEE.FROM_VALUE
     */
    private BigDecimal FROM_VALUE;

    /**
     * This field corresponds to the database column FMSCOMMITTEE.STATUS
     */
    private String STATUS;

    /**
     * This field corresponds to the database column FMSCOMMITTEE.CREATED_BY
     */
    private String CREATED_BY;

    /**
     * This field corresponds to the database column FMSCOMMITTEE.CREATED_DATE
     */
    private Date CREATED_DATE;

    /**
     * This field corresponds to the database column FMSCOMMITTEE.DELETED_BY
     */
    private String DELETED_BY;

    /**
     * This field corresponds to the database column FMSCOMMITTEE.DELETED_DATE
     */
    private Date DELETED_DATE;

    /**
     * This field corresponds to the database column
     * FMSCOMMITTEE.APPROVED_BY_LEVEL1
     */
    private String APPROVED_BY_LEVEL1;

    /**
     * This field corresponds to the database column
     * FMSCOMMITTEE.APPROVED_DATE_LEVEL1
     */
    private Date APPROVED_DATE_LEVEL1;

    /**
     * This field corresponds to the database column
     * FMSCOMMITTEE.APPROVED_BY_LEVEL2
     */
    private String APPROVED_BY_LEVEL2;

    /**
     * This field corresponds to the database column
     * FMSCOMMITTEE.APPROVED_DATE_LEVEL2
     */
    private Date APPROVED_DATE_LEVEL2;

    /**
     * This field corresponds to the database column FMSCOMMITTEE.SUSPENDED_BY
     */
    private String SUSPENDED_BY;

    /**
     * This field corresponds to the database column FMSCOMMITTEE.SUSPENDED_DATE
     */
    private Date SUSPENDED_DATE;

    /**
     * This field corresponds to the database column FMSCOMMITTEE.REACTIVATED_BY
     */
    private String REACTIVATED_BY;

    /**
     * This field corresponds to the database column
     * FMSCOMMITTEE.REACTIVATED_DATE
     */
    private Date REACTIVATED_DATE;

    /**
     * This field corresponds to the database column
     * FMSCOMMITTEE.MAX_TENOR_PERIOD
     */
    private String MAX_TENOR_PERIOD;

    private Date DATE_UPDATED;

    /**
     * This field corresponds to the database column FMSAPPL.UPDATED_BY
     */
    private String UPDATED_BY;

    public Date getDATE_UPDATED()
    {
	return DATE_UPDATED;
    }

    public void setDATE_UPDATED(Date dATE_UPDATED)
    {
	DATE_UPDATED = dATE_UPDATED;
    }

    public String getUPDATED_BY()
    {
	return UPDATED_BY;
    }

    public void setUPDATED_BY(String uPDATED_BY)
    {
	UPDATED_BY = uPDATED_BY;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOMMITTEE.BRIEF_NAME_ENG
     *
     * @return the value of FMSCOMMITTEE.BRIEF_NAME_ENG
     */
    public String getBRIEF_NAME_ENG()
    {
	return BRIEF_NAME_ENG;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOMMITTEE.BRIEF_NAME_ENG
     *
     * @param BRIEF_NAME_ENG the value for FMSCOMMITTEE.BRIEF_NAME_ENG
     */
    public void setBRIEF_NAME_ENG(String BRIEF_NAME_ENG)
    {
	this.BRIEF_NAME_ENG = BRIEF_NAME_ENG == null ? null : BRIEF_NAME_ENG.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOMMITTEE.LONG_NAME_ENG
     *
     * @return the value of FMSCOMMITTEE.LONG_NAME_ENG
     */
    public String getLONG_NAME_ENG()
    {
	return LONG_NAME_ENG;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOMMITTEE.LONG_NAME_ENG
     *
     * @param LONG_NAME_ENG the value for FMSCOMMITTEE.LONG_NAME_ENG
     */
    public void setLONG_NAME_ENG(String LONG_NAME_ENG)
    {
	this.LONG_NAME_ENG = LONG_NAME_ENG == null ? null : LONG_NAME_ENG.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOMMITTEE.BRIEF_NAME_ARAB
     *
     * @return the value of FMSCOMMITTEE.BRIEF_NAME_ARAB
     */
    public String getBRIEF_NAME_ARAB()
    {
	return BRIEF_NAME_ARAB;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOMMITTEE.BRIEF_NAME_ARAB
     *
     * @param BRIEF_NAME_ARAB the value for FMSCOMMITTEE.BRIEF_NAME_ARAB
     */
    public void setBRIEF_NAME_ARAB(String BRIEF_NAME_ARAB)
    {
	this.BRIEF_NAME_ARAB = BRIEF_NAME_ARAB == null ? null : BRIEF_NAME_ARAB.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOMMITTEE.LONG_NAME_ARAB
     *
     * @return the value of FMSCOMMITTEE.LONG_NAME_ARAB
     */
    public String getLONG_NAME_ARAB()
    {
	return LONG_NAME_ARAB;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOMMITTEE.LONG_NAME_ARAB
     *
     * @param LONG_NAME_ARAB the value for FMSCOMMITTEE.LONG_NAME_ARAB
     */
    public void setLONG_NAME_ARAB(String LONG_NAME_ARAB)
    {
	this.LONG_NAME_ARAB = LONG_NAME_ARAB == null ? null : LONG_NAME_ARAB.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOMMITTEE.MAX_VALUE
     *
     * @return the value of FMSCOMMITTEE.MAX_VALUE
     */
    public BigDecimal getMAX_VALUE()
    {
	return MAX_VALUE;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOMMITTEE.MAX_VALUE
     *
     * @param MAX_VALUE the value for FMSCOMMITTEE.MAX_VALUE
     */
    public void setMAX_VALUE(BigDecimal MAX_VALUE)
    {
	this.MAX_VALUE = MAX_VALUE;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOMMITTEE.MAX_TENOR
     *
     * @return the value of FMSCOMMITTEE.MAX_TENOR
     */
    public BigDecimal getMAX_TENOR()
    {
	return MAX_TENOR;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOMMITTEE.MAX_TENOR
     *
     * @param MAX_TENOR the value for FMSCOMMITTEE.MAX_TENOR
     */
    public void setMAX_TENOR(BigDecimal MAX_TENOR)
    {
	this.MAX_TENOR = MAX_TENOR;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOMMITTEE.LOW_GRADE_SCORE
     *
     * @return the value of FMSCOMMITTEE.LOW_GRADE_SCORE
     */
    public BigDecimal getLOW_GRADE_SCORE()
    {
	return LOW_GRADE_SCORE;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOMMITTEE.LOW_GRADE_SCORE
     *
     * @param LOW_GRADE_SCORE the value for FMSCOMMITTEE.LOW_GRADE_SCORE
     */
    public void setLOW_GRADE_SCORE(BigDecimal LOW_GRADE_SCORE)
    {
	this.LOW_GRADE_SCORE = LOW_GRADE_SCORE;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOMMITTEE.MAX_CLI_EXPOSURE
     *
     * @return the value of FMSCOMMITTEE.MAX_CLI_EXPOSURE
     */
    public BigDecimal getMAX_CLI_EXPOSURE()
    {
	return MAX_CLI_EXPOSURE;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOMMITTEE.MAX_CLI_EXPOSURE
     *
     * @param MAX_CLI_EXPOSURE the value for FMSCOMMITTEE.MAX_CLI_EXPOSURE
     */
    public void setMAX_CLI_EXPOSURE(BigDecimal MAX_CLI_EXPOSURE)
    {
	this.MAX_CLI_EXPOSURE = MAX_CLI_EXPOSURE;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOMMITTEE.MAX_GUARANTOR
     *
     * @return the value of FMSCOMMITTEE.MAX_GUARANTOR
     */
    public BigDecimal getMAX_GUARANTOR()
    {
	return MAX_GUARANTOR;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOMMITTEE.MAX_GUARANTOR
     *
     * @param MAX_GUARANTOR the value for FMSCOMMITTEE.MAX_GUARANTOR
     */
    public void setMAX_GUARANTOR(BigDecimal MAX_GUARANTOR)
    {
	this.MAX_GUARANTOR = MAX_GUARANTOR;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOMMITTEE.MAX_CURRENCY_EXPOSURE
     *
     * @return the value of FMSCOMMITTEE.MAX_CURRENCY_EXPOSURE
     */
    public BigDecimal getMAX_CURRENCY_EXPOSURE()
    {
	return MAX_CURRENCY_EXPOSURE;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOMMITTEE.MAX_CURRENCY_EXPOSURE
     *
     * @param MAX_CURRENCY_EXPOSURE the value for
     *            FMSCOMMITTEE.MAX_CURRENCY_EXPOSURE
     */
    public void setMAX_CURRENCY_EXPOSURE(BigDecimal MAX_CURRENCY_EXPOSURE)
    {
	this.MAX_CURRENCY_EXPOSURE = MAX_CURRENCY_EXPOSURE;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOMMITTEE.MAX_COUNTRY_EXPOSURE
     *
     * @return the value of FMSCOMMITTEE.MAX_COUNTRY_EXPOSURE
     */
    public BigDecimal getMAX_COUNTRY_EXPOSURE()
    {
	return MAX_COUNTRY_EXPOSURE;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOMMITTEE.MAX_COUNTRY_EXPOSURE
     *
     * @param MAX_COUNTRY_EXPOSURE the value for
     *            FMSCOMMITTEE.MAX_COUNTRY_EXPOSURE
     */
    public void setMAX_COUNTRY_EXPOSURE(BigDecimal MAX_COUNTRY_EXPOSURE)
    {
	this.MAX_COUNTRY_EXPOSURE = MAX_COUNTRY_EXPOSURE;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOMMITTEE.MAX_MAIN_ECOSEC_EXPOSURE
     *
     * @return the value of FMSCOMMITTEE.MAX_MAIN_ECOSEC_EXPOSURE
     */
    public BigDecimal getMAX_MAIN_ECOSEC_EXPOSURE()
    {
	return MAX_MAIN_ECOSEC_EXPOSURE;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOMMITTEE.MAX_MAIN_ECOSEC_EXPOSURE
     *
     * @param MAX_MAIN_ECOSEC_EXPOSURE the value for
     *            FMSCOMMITTEE.MAX_MAIN_ECOSEC_EXPOSURE
     */
    public void setMAX_MAIN_ECOSEC_EXPOSURE(BigDecimal MAX_MAIN_ECOSEC_EXPOSURE)
    {
	this.MAX_MAIN_ECOSEC_EXPOSURE = MAX_MAIN_ECOSEC_EXPOSURE;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOMMITTEE.MAX_SUB_ECOSEC_EXPOSURE
     *
     * @return the value of FMSCOMMITTEE.MAX_SUB_ECOSEC_EXPOSURE
     */
    public BigDecimal getMAX_SUB_ECOSEC_EXPOSURE()
    {
	return MAX_SUB_ECOSEC_EXPOSURE;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOMMITTEE.MAX_SUB_ECOSEC_EXPOSURE
     *
     * @param MAX_SUB_ECOSEC_EXPOSURE the value for
     *            FMSCOMMITTEE.MAX_SUB_ECOSEC_EXPOSURE
     */
    public void setMAX_SUB_ECOSEC_EXPOSURE(BigDecimal MAX_SUB_ECOSEC_EXPOSURE)
    {
	this.MAX_SUB_ECOSEC_EXPOSURE = MAX_SUB_ECOSEC_EXPOSURE;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOMMITTEE.FROM_VALUE
     *
     * @return the value of FMSCOMMITTEE.FROM_VALUE
     */
    public BigDecimal getFROM_VALUE()
    {
	return FROM_VALUE;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOMMITTEE.FROM_VALUE
     *
     * @param FROM_VALUE the value for FMSCOMMITTEE.FROM_VALUE
     */
    public void setFROM_VALUE(BigDecimal FROM_VALUE)
    {
	this.FROM_VALUE = FROM_VALUE;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOMMITTEE.STATUS
     *
     * @return the value of FMSCOMMITTEE.STATUS
     */
    public String getSTATUS()
    {
	return STATUS;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOMMITTEE.STATUS
     *
     * @param STATUS the value for FMSCOMMITTEE.STATUS
     */
    public void setSTATUS(String STATUS)
    {
	this.STATUS = STATUS == null ? null : STATUS.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOMMITTEE.CREATED_BY
     *
     * @return the value of FMSCOMMITTEE.CREATED_BY
     */
    public String getCREATED_BY()
    {
	return CREATED_BY;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOMMITTEE.CREATED_BY
     *
     * @param CREATED_BY the value for FMSCOMMITTEE.CREATED_BY
     */
    public void setCREATED_BY(String CREATED_BY)
    {
	this.CREATED_BY = CREATED_BY == null ? null : CREATED_BY.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOMMITTEE.CREATED_DATE
     *
     * @return the value of FMSCOMMITTEE.CREATED_DATE
     */
    public Date getCREATED_DATE()
    {
	return CREATED_DATE;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOMMITTEE.CREATED_DATE
     *
     * @param CREATED_DATE the value for FMSCOMMITTEE.CREATED_DATE
     */
    public void setCREATED_DATE(Date CREATED_DATE)
    {
	this.CREATED_DATE = CREATED_DATE;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOMMITTEE.DELETED_BY
     *
     * @return the value of FMSCOMMITTEE.DELETED_BY
     */
    public String getDELETED_BY()
    {
	return DELETED_BY;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOMMITTEE.DELETED_BY
     *
     * @param DELETED_BY the value for FMSCOMMITTEE.DELETED_BY
     */
    public void setDELETED_BY(String DELETED_BY)
    {
	this.DELETED_BY = DELETED_BY == null ? null : DELETED_BY.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOMMITTEE.DELETED_DATE
     *
     * @return the value of FMSCOMMITTEE.DELETED_DATE
     */
    public Date getDELETED_DATE()
    {
	return DELETED_DATE;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOMMITTEE.DELETED_DATE
     *
     * @param DELETED_DATE the value for FMSCOMMITTEE.DELETED_DATE
     */
    public void setDELETED_DATE(Date DELETED_DATE)
    {
	this.DELETED_DATE = DELETED_DATE;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOMMITTEE.APPROVED_BY_LEVEL1
     *
     * @return the value of FMSCOMMITTEE.APPROVED_BY_LEVEL1
     */
    public String getAPPROVED_BY_LEVEL1()
    {
	return APPROVED_BY_LEVEL1;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOMMITTEE.APPROVED_BY_LEVEL1
     *
     * @param APPROVED_BY_LEVEL1 the value for FMSCOMMITTEE.APPROVED_BY_LEVEL1
     */
    public void setAPPROVED_BY_LEVEL1(String APPROVED_BY_LEVEL1)
    {
	this.APPROVED_BY_LEVEL1 = APPROVED_BY_LEVEL1 == null ? null : APPROVED_BY_LEVEL1.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOMMITTEE.APPROVED_DATE_LEVEL1
     *
     * @return the value of FMSCOMMITTEE.APPROVED_DATE_LEVEL1
     */
    public Date getAPPROVED_DATE_LEVEL1()
    {
	return APPROVED_DATE_LEVEL1;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOMMITTEE.APPROVED_DATE_LEVEL1
     *
     * @param APPROVED_DATE_LEVEL1 the value for
     *            FMSCOMMITTEE.APPROVED_DATE_LEVEL1
     */
    public void setAPPROVED_DATE_LEVEL1(Date APPROVED_DATE_LEVEL1)
    {
	this.APPROVED_DATE_LEVEL1 = APPROVED_DATE_LEVEL1;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOMMITTEE.APPROVED_BY_LEVEL2
     *
     * @return the value of FMSCOMMITTEE.APPROVED_BY_LEVEL2
     */
    public String getAPPROVED_BY_LEVEL2()
    {
	return APPROVED_BY_LEVEL2;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOMMITTEE.APPROVED_BY_LEVEL2
     *
     * @param APPROVED_BY_LEVEL2 the value for FMSCOMMITTEE.APPROVED_BY_LEVEL2
     */
    public void setAPPROVED_BY_LEVEL2(String APPROVED_BY_LEVEL2)
    {
	this.APPROVED_BY_LEVEL2 = APPROVED_BY_LEVEL2 == null ? null : APPROVED_BY_LEVEL2.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOMMITTEE.APPROVED_DATE_LEVEL2
     *
     * @return the value of FMSCOMMITTEE.APPROVED_DATE_LEVEL2
     */
    public Date getAPPROVED_DATE_LEVEL2()
    {
	return APPROVED_DATE_LEVEL2;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOMMITTEE.APPROVED_DATE_LEVEL2
     *
     * @param APPROVED_DATE_LEVEL2 the value for
     *            FMSCOMMITTEE.APPROVED_DATE_LEVEL2
     */
    public void setAPPROVED_DATE_LEVEL2(Date APPROVED_DATE_LEVEL2)
    {
	this.APPROVED_DATE_LEVEL2 = APPROVED_DATE_LEVEL2;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOMMITTEE.SUSPENDED_BY
     *
     * @return the value of FMSCOMMITTEE.SUSPENDED_BY
     */
    public String getSUSPENDED_BY()
    {
	return SUSPENDED_BY;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOMMITTEE.SUSPENDED_BY
     *
     * @param SUSPENDED_BY the value for FMSCOMMITTEE.SUSPENDED_BY
     */
    public void setSUSPENDED_BY(String SUSPENDED_BY)
    {
	this.SUSPENDED_BY = SUSPENDED_BY == null ? null : SUSPENDED_BY.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOMMITTEE.SUSPENDED_DATE
     *
     * @return the value of FMSCOMMITTEE.SUSPENDED_DATE
     */
    public Date getSUSPENDED_DATE()
    {
	return SUSPENDED_DATE;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOMMITTEE.SUSPENDED_DATE
     *
     * @param SUSPENDED_DATE the value for FMSCOMMITTEE.SUSPENDED_DATE
     */
    public void setSUSPENDED_DATE(Date SUSPENDED_DATE)
    {
	this.SUSPENDED_DATE = SUSPENDED_DATE;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOMMITTEE.REACTIVATED_BY
     *
     * @return the value of FMSCOMMITTEE.REACTIVATED_BY
     */
    public String getREACTIVATED_BY()
    {
	return REACTIVATED_BY;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOMMITTEE.REACTIVATED_BY
     *
     * @param REACTIVATED_BY the value for FMSCOMMITTEE.REACTIVATED_BY
     */
    public void setREACTIVATED_BY(String REACTIVATED_BY)
    {
	this.REACTIVATED_BY = REACTIVATED_BY == null ? null : REACTIVATED_BY.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOMMITTEE.REACTIVATED_DATE
     *
     * @return the value of FMSCOMMITTEE.REACTIVATED_DATE
     */
    public Date getREACTIVATED_DATE()
    {
	return REACTIVATED_DATE;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOMMITTEE.REACTIVATED_DATE
     *
     * @param REACTIVATED_DATE the value for FMSCOMMITTEE.REACTIVATED_DATE
     */
    public void setREACTIVATED_DATE(Date REACTIVATED_DATE)
    {
	this.REACTIVATED_DATE = REACTIVATED_DATE;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOMMITTEE.MAX_TENOR_PERIOD
     *
     * @return the value of FMSCOMMITTEE.MAX_TENOR_PERIOD
     */
    public String getMAX_TENOR_PERIOD()
    {
	return MAX_TENOR_PERIOD;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOMMITTEE.MAX_TENOR_PERIOD
     *
     * @param MAX_TENOR_PERIOD the value for FMSCOMMITTEE.MAX_TENOR_PERIOD
     */
    public void setMAX_TENOR_PERIOD(String MAX_TENOR_PERIOD)
    {
	this.MAX_TENOR_PERIOD = MAX_TENOR_PERIOD == null ? null : MAX_TENOR_PERIOD.trim();
    }
}