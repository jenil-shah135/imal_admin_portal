package com.path.dbmaps.vo;

import java.math.BigDecimal;
import java.util.Date;

public class FMSCOLLATERAL_INSURVO extends FMSCOLLATERAL_INSURVOKey
{
    /**
     * This field corresponds to the database column
     * FMSCOLLATERAL_INSUR.INSURANCE_TYPE
     */
    private BigDecimal INSURANCE_TYPE;

    /**
     * This field corresponds to the database column
     * FMSCOLLATERAL_INSUR.COMPANY_CIF
     */
    private BigDecimal COMPANY_CIF;

    /**
     * This field corresponds to the database column
     * FMSCOLLATERAL_INSUR.COMPANY_CIF_DESC
     */
    private String COMPANY_CIF_DESC;

    /**
     * This field corresponds to the database column
     * FMSCOLLATERAL_INSUR.POLICY_NO
     */
    private String POLICY_NO;

    /**
     * This field corresponds to the database column
     * FMSCOLLATERAL_INSUR.COVERAGE_TYPE
     */
    private String COVERAGE_TYPE;

    /**
     * This field corresponds to the database column
     * FMSCOLLATERAL_INSUR.PARTICIPANT_CIF
     */
    private BigDecimal PARTICIPANT_CIF;

    /**
     * This field corresponds to the database column
     * FMSCOLLATERAL_INSUR.PARTICIPANT_DESC
     */
    private String PARTICIPANT_DESC;

    /**
     * This field corresponds to the database column
     * FMSCOLLATERAL_INSUR.START_DATE
     */
    private Date START_DATE;

    /**
     * This field corresponds to the database column
     * FMSCOLLATERAL_INSUR.EXPIRY_DATE
     */
    private Date EXPIRY_DATE;

    /**
     * This field corresponds to the database column
     * FMSCOLLATERAL_INSUR.PREMIUM_AMOUNT
     */
    private BigDecimal PREMIUM_AMOUNT;

    /**
     * This field corresponds to the database column
     * FMSCOLLATERAL_INSUR.INSURED_AMOUNT
     */
    private BigDecimal INSURED_AMOUNT;

    /**
     * This field corresponds to the database column
     * FMSCOLLATERAL_INSUR.CURRENCY
     */
    private BigDecimal CURRENCY;

    /**
     * This field corresponds to the database column FMSCOLLATERAL_INSUR.CY_DEC
     */
    private BigDecimal CY_DEC;

    /**
     * This field corresponds to the database column
     * FMSCOLLATERAL_INSUR.MASTER_INDIVIDUAL
     */
    private String MASTER_INDIVIDUAL;

    /**
     * This field corresponds to the database column
     * FMSCOLLATERAL_INSUR.COMMENTS
     */
    private String COMMENTS;

    /**
     * This field corresponds to the database column
     * FMSCOLLATERAL_INSUR.UNDERWRITER
     */
    private String UNDERWRITER;

    /**
     * This field corresponds to the database column
     * FMSCOLLATERAL_INSUR.COVER_DATE
     */
    private Date COVER_DATE;

    /**
     * This field corresponds to the database column
     * FMSCOLLATERAL_INSUR.COVER_NOTE
     */
    private String COVER_NOTE;

    /**
     * This field corresponds to the database column
     * FMSCOLLATERAL_INSUR.COMPLETED_FOLLOWUP_REQUIRED
     */
    private String COMPLETED_FOLLOWUP_REQUIRED;

    /**
     * This field corresponds to the database column
     * FMSCOLLATERAL_INSUR.INSURED_PERC
     */
    private BigDecimal INSURED_PERC;

    /**
     * This field corresponds to the database column
     * FMSCOLLATERAL_INSUR.PREMIUM_PERC
     */
    private BigDecimal PREMIUM_PERC;

    /**
     * This field corresponds to the database column
     * FMSCOLLATERAL_INSUR.COVERAGE_TYPE_CODE
     */
    private BigDecimal COVERAGE_TYPE_CODE;

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOLLATERAL_INSUR.INSURANCE_TYPE
     *
     * @return the value of FMSCOLLATERAL_INSUR.INSURANCE_TYPE
     */
    public BigDecimal getINSURANCE_TYPE()
    {
	return INSURANCE_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOLLATERAL_INSUR.INSURANCE_TYPE
     *
     * @param INSURANCE_TYPE the value for FMSCOLLATERAL_INSUR.INSURANCE_TYPE
     */
    public void setINSURANCE_TYPE(BigDecimal INSURANCE_TYPE)
    {
	this.INSURANCE_TYPE = INSURANCE_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOLLATERAL_INSUR.COMPANY_CIF
     *
     * @return the value of FMSCOLLATERAL_INSUR.COMPANY_CIF
     */
    public BigDecimal getCOMPANY_CIF()
    {
	return COMPANY_CIF;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOLLATERAL_INSUR.COMPANY_CIF
     *
     * @param COMPANY_CIF the value for FMSCOLLATERAL_INSUR.COMPANY_CIF
     */
    public void setCOMPANY_CIF(BigDecimal COMPANY_CIF)
    {
	this.COMPANY_CIF = COMPANY_CIF;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOLLATERAL_INSUR.COMPANY_CIF_DESC
     *
     * @return the value of FMSCOLLATERAL_INSUR.COMPANY_CIF_DESC
     */
    public String getCOMPANY_CIF_DESC()
    {
	return COMPANY_CIF_DESC;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOLLATERAL_INSUR.COMPANY_CIF_DESC
     *
     * @param COMPANY_CIF_DESC the value for
     *            FMSCOLLATERAL_INSUR.COMPANY_CIF_DESC
     */
    public void setCOMPANY_CIF_DESC(String COMPANY_CIF_DESC)
    {
	this.COMPANY_CIF_DESC = COMPANY_CIF_DESC == null ? null : COMPANY_CIF_DESC.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOLLATERAL_INSUR.POLICY_NO
     *
     * @return the value of FMSCOLLATERAL_INSUR.POLICY_NO
     */
    public String getPOLICY_NO()
    {
	return POLICY_NO;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOLLATERAL_INSUR.POLICY_NO
     *
     * @param POLICY_NO the value for FMSCOLLATERAL_INSUR.POLICY_NO
     */
    public void setPOLICY_NO(String POLICY_NO)
    {
	this.POLICY_NO = POLICY_NO == null ? null : POLICY_NO.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOLLATERAL_INSUR.COVERAGE_TYPE
     *
     * @return the value of FMSCOLLATERAL_INSUR.COVERAGE_TYPE
     */
    public String getCOVERAGE_TYPE()
    {
	return COVERAGE_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOLLATERAL_INSUR.COVERAGE_TYPE
     *
     * @param COVERAGE_TYPE the value for FMSCOLLATERAL_INSUR.COVERAGE_TYPE
     */
    public void setCOVERAGE_TYPE(String COVERAGE_TYPE)
    {
	this.COVERAGE_TYPE = COVERAGE_TYPE == null ? null : COVERAGE_TYPE.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOLLATERAL_INSUR.PARTICIPANT_CIF
     *
     * @return the value of FMSCOLLATERAL_INSUR.PARTICIPANT_CIF
     */
    public BigDecimal getPARTICIPANT_CIF()
    {
	return PARTICIPANT_CIF;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOLLATERAL_INSUR.PARTICIPANT_CIF
     *
     * @param PARTICIPANT_CIF the value for FMSCOLLATERAL_INSUR.PARTICIPANT_CIF
     */
    public void setPARTICIPANT_CIF(BigDecimal PARTICIPANT_CIF)
    {
	this.PARTICIPANT_CIF = PARTICIPANT_CIF;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOLLATERAL_INSUR.PARTICIPANT_DESC
     *
     * @return the value of FMSCOLLATERAL_INSUR.PARTICIPANT_DESC
     */
    public String getPARTICIPANT_DESC()
    {
	return PARTICIPANT_DESC;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOLLATERAL_INSUR.PARTICIPANT_DESC
     *
     * @param PARTICIPANT_DESC the value for
     *            FMSCOLLATERAL_INSUR.PARTICIPANT_DESC
     */
    public void setPARTICIPANT_DESC(String PARTICIPANT_DESC)
    {
	this.PARTICIPANT_DESC = PARTICIPANT_DESC == null ? null : PARTICIPANT_DESC.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOLLATERAL_INSUR.START_DATE
     *
     * @return the value of FMSCOLLATERAL_INSUR.START_DATE
     */
    public Date getSTART_DATE()
    {
	return START_DATE;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOLLATERAL_INSUR.START_DATE
     *
     * @param START_DATE the value for FMSCOLLATERAL_INSUR.START_DATE
     */
    public void setSTART_DATE(Date START_DATE)
    {
	this.START_DATE = START_DATE;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOLLATERAL_INSUR.EXPIRY_DATE
     *
     * @return the value of FMSCOLLATERAL_INSUR.EXPIRY_DATE
     */
    public Date getEXPIRY_DATE()
    {
	return EXPIRY_DATE;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOLLATERAL_INSUR.EXPIRY_DATE
     *
     * @param EXPIRY_DATE the value for FMSCOLLATERAL_INSUR.EXPIRY_DATE
     */
    public void setEXPIRY_DATE(Date EXPIRY_DATE)
    {
	this.EXPIRY_DATE = EXPIRY_DATE;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOLLATERAL_INSUR.PREMIUM_AMOUNT
     *
     * @return the value of FMSCOLLATERAL_INSUR.PREMIUM_AMOUNT
     */
    public BigDecimal getPREMIUM_AMOUNT()
    {
	return PREMIUM_AMOUNT;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOLLATERAL_INSUR.PREMIUM_AMOUNT
     *
     * @param PREMIUM_AMOUNT the value for FMSCOLLATERAL_INSUR.PREMIUM_AMOUNT
     */
    public void setPREMIUM_AMOUNT(BigDecimal PREMIUM_AMOUNT)
    {
	this.PREMIUM_AMOUNT = PREMIUM_AMOUNT;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOLLATERAL_INSUR.INSURED_AMOUNT
     *
     * @return the value of FMSCOLLATERAL_INSUR.INSURED_AMOUNT
     */
    public BigDecimal getINSURED_AMOUNT()
    {
	return INSURED_AMOUNT;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOLLATERAL_INSUR.INSURED_AMOUNT
     *
     * @param INSURED_AMOUNT the value for FMSCOLLATERAL_INSUR.INSURED_AMOUNT
     */
    public void setINSURED_AMOUNT(BigDecimal INSURED_AMOUNT)
    {
	this.INSURED_AMOUNT = INSURED_AMOUNT;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOLLATERAL_INSUR.CURRENCY
     *
     * @return the value of FMSCOLLATERAL_INSUR.CURRENCY
     */
    public BigDecimal getCURRENCY()
    {
	return CURRENCY;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOLLATERAL_INSUR.CURRENCY
     *
     * @param CURRENCY the value for FMSCOLLATERAL_INSUR.CURRENCY
     */
    public void setCURRENCY(BigDecimal CURRENCY)
    {
	this.CURRENCY = CURRENCY;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOLLATERAL_INSUR.CY_DEC
     *
     * @return the value of FMSCOLLATERAL_INSUR.CY_DEC
     */
    public BigDecimal getCY_DEC()
    {
	return CY_DEC;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOLLATERAL_INSUR.CY_DEC
     *
     * @param CY_DEC the value for FMSCOLLATERAL_INSUR.CY_DEC
     */
    public void setCY_DEC(BigDecimal CY_DEC)
    {
	this.CY_DEC = CY_DEC;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOLLATERAL_INSUR.MASTER_INDIVIDUAL
     *
     * @return the value of FMSCOLLATERAL_INSUR.MASTER_INDIVIDUAL
     */
    public String getMASTER_INDIVIDUAL()
    {
	return MASTER_INDIVIDUAL;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOLLATERAL_INSUR.MASTER_INDIVIDUAL
     *
     * @param MASTER_INDIVIDUAL the value for
     *            FMSCOLLATERAL_INSUR.MASTER_INDIVIDUAL
     */
    public void setMASTER_INDIVIDUAL(String MASTER_INDIVIDUAL)
    {
	this.MASTER_INDIVIDUAL = MASTER_INDIVIDUAL == null ? null : MASTER_INDIVIDUAL.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOLLATERAL_INSUR.COMMENTS
     *
     * @return the value of FMSCOLLATERAL_INSUR.COMMENTS
     */
    public String getCOMMENTS()
    {
	return COMMENTS;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOLLATERAL_INSUR.COMMENTS
     *
     * @param COMMENTS the value for FMSCOLLATERAL_INSUR.COMMENTS
     */
    public void setCOMMENTS(String COMMENTS)
    {
	this.COMMENTS = COMMENTS == null ? null : COMMENTS.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOLLATERAL_INSUR.UNDERWRITER
     *
     * @return the value of FMSCOLLATERAL_INSUR.UNDERWRITER
     */
    public String getUNDERWRITER()
    {
	return UNDERWRITER;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOLLATERAL_INSUR.UNDERWRITER
     *
     * @param UNDERWRITER the value for FMSCOLLATERAL_INSUR.UNDERWRITER
     */
    public void setUNDERWRITER(String UNDERWRITER)
    {
	this.UNDERWRITER = UNDERWRITER == null ? null : UNDERWRITER.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOLLATERAL_INSUR.COVER_DATE
     *
     * @return the value of FMSCOLLATERAL_INSUR.COVER_DATE
     */
    public Date getCOVER_DATE()
    {
	return COVER_DATE;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOLLATERAL_INSUR.COVER_DATE
     *
     * @param COVER_DATE the value for FMSCOLLATERAL_INSUR.COVER_DATE
     */
    public void setCOVER_DATE(Date COVER_DATE)
    {
	this.COVER_DATE = COVER_DATE;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOLLATERAL_INSUR.COVER_NOTE
     *
     * @return the value of FMSCOLLATERAL_INSUR.COVER_NOTE
     */
    public String getCOVER_NOTE()
    {
	return COVER_NOTE;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOLLATERAL_INSUR.COVER_NOTE
     *
     * @param COVER_NOTE the value for FMSCOLLATERAL_INSUR.COVER_NOTE
     */
    public void setCOVER_NOTE(String COVER_NOTE)
    {
	this.COVER_NOTE = COVER_NOTE == null ? null : COVER_NOTE.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column
     * FMSCOLLATERAL_INSUR.COMPLETED_FOLLOWUP_REQUIRED
     *
     * @return the value of FMSCOLLATERAL_INSUR.COMPLETED_FOLLOWUP_REQUIRED
     */
    public String getCOMPLETED_FOLLOWUP_REQUIRED()
    {
	return COMPLETED_FOLLOWUP_REQUIRED;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column
     * FMSCOLLATERAL_INSUR.COMPLETED_FOLLOWUP_REQUIRED
     *
     * @param COMPLETED_FOLLOWUP_REQUIRED the value for
     *            FMSCOLLATERAL_INSUR.COMPLETED_FOLLOWUP_REQUIRED
     */
    public void setCOMPLETED_FOLLOWUP_REQUIRED(String COMPLETED_FOLLOWUP_REQUIRED)
    {
	this.COMPLETED_FOLLOWUP_REQUIRED = COMPLETED_FOLLOWUP_REQUIRED == null ? null
		: COMPLETED_FOLLOWUP_REQUIRED.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOLLATERAL_INSUR.INSURED_PERC
     *
     * @return the value of FMSCOLLATERAL_INSUR.INSURED_PERC
     */
    public BigDecimal getINSURED_PERC()
    {
	return INSURED_PERC;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOLLATERAL_INSUR.INSURED_PERC
     *
     * @param INSURED_PERC the value for FMSCOLLATERAL_INSUR.INSURED_PERC
     */
    public void setINSURED_PERC(BigDecimal INSURED_PERC)
    {
	this.INSURED_PERC = INSURED_PERC;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOLLATERAL_INSUR.PREMIUM_PERC
     *
     * @return the value of FMSCOLLATERAL_INSUR.PREMIUM_PERC
     */
    public BigDecimal getPREMIUM_PERC()
    {
	return PREMIUM_PERC;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOLLATERAL_INSUR.PREMIUM_PERC
     *
     * @param PREMIUM_PERC the value for FMSCOLLATERAL_INSUR.PREMIUM_PERC
     */
    public void setPREMIUM_PERC(BigDecimal PREMIUM_PERC)
    {
	this.PREMIUM_PERC = PREMIUM_PERC;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column FMSCOLLATERAL_INSUR.COVERAGE_TYPE_CODE
     *
     * @return the value of FMSCOLLATERAL_INSUR.COVERAGE_TYPE_CODE
     */
    public BigDecimal getCOVERAGE_TYPE_CODE()
    {
	return COVERAGE_TYPE_CODE;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column FMSCOLLATERAL_INSUR.COVERAGE_TYPE_CODE
     *
     * @param COVERAGE_TYPE_CODE the value for
     *            FMSCOLLATERAL_INSUR.COVERAGE_TYPE_CODE
     */
    public void setCOVERAGE_TYPE_CODE(BigDecimal COVERAGE_TYPE_CODE)
    {
	this.COVERAGE_TYPE_CODE = COVERAGE_TYPE_CODE;
    }
}