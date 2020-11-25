package com.path.dbmaps.vo;

import java.math.BigDecimal;
import java.util.Date;

public class CIF_PROXY_BENEFVO extends CIF_PROXY_BENEFVOKey {
    
    private String NICKNAME;
    
    /**
     * This field corresponds to the database column CIF_PROXY_BENEF.LINK_COMP_CODE
     */
    private BigDecimal LINK_COMP_CODE;

    /**
     * This field corresponds to the database column CIF_PROXY_BENEF.LINK_CIF_NO
     */
    private BigDecimal LINK_CIF_NO;

    /**
     * This field corresponds to the database column CIF_PROXY_BENEF.TYPE
     */
    private String TYPE;

    /**
     * This field corresponds to the database column CIF_PROXY_BENEF.PROXY_TYPE
     */
    private String PROXY_TYPE;

    /**
     * This field corresponds to the database column CIF_PROXY_BENEF.AGENT_MATURITY_DATE
     */
    private Date AGENT_MATURITY_DATE;

    /**
     * This field corresponds to the database column CIF_PROXY_BENEF.REAL_MATURITY_DATE
     */
    private Date REAL_MATURITY_DATE;
    
    private String STATUS;
    private String ACTIVATED_BY;
    private Date ACTIVATED_DATE;
    private String CREATED_BY;
    private Date CREATED_DATE;
    private String DEACTIVATED_BY;
    private Date DEACTIVATED_DATE;
    private String DELETED_BY;
    private Date DELETED_DATE;
    private String MODIFIED_BY;
    private Date MODIFIED_DATE;
    private String PURPOSE_REGISTER;

    private Date TO_CANCEL_DATE;
    private String TO_CANCEL_BY;
    private Date CANCEL_DATE;
    private String CANCEL_BY;
    private String TO_DELETE_BY;
    private Date TO_DELETE_DATE;

    private String PARENT_CHILD_IND;
    private String PARENT_NICKNAME;
    private BigDecimal PARENT_CIF_NO;
    
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CIF_PROXY_BENEF.LINK_COMP_CODE
     *
     * @return the value of CIF_PROXY_BENEF.LINK_COMP_CODE
     */
    public BigDecimal getLINK_COMP_CODE() {
        return LINK_COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CIF_PROXY_BENEF.LINK_COMP_CODE
     *
     * @param LINK_COMP_CODE the value for CIF_PROXY_BENEF.LINK_COMP_CODE
     */
    public void setLINK_COMP_CODE(BigDecimal LINK_COMP_CODE) {
        this.LINK_COMP_CODE = LINK_COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CIF_PROXY_BENEF.LINK_CIF_NO
     *
     * @return the value of CIF_PROXY_BENEF.LINK_CIF_NO
     */
    public BigDecimal getLINK_CIF_NO() {
        return LINK_CIF_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CIF_PROXY_BENEF.LINK_CIF_NO
     *
     * @param LINK_CIF_NO the value for CIF_PROXY_BENEF.LINK_CIF_NO
     */
    public void setLINK_CIF_NO(BigDecimal LINK_CIF_NO) {
        this.LINK_CIF_NO = LINK_CIF_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CIF_PROXY_BENEF.TYPE
     *
     * @return the value of CIF_PROXY_BENEF.TYPE
     */
    public String getTYPE() {
        return TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CIF_PROXY_BENEF.TYPE
     *
     * @param TYPE the value for CIF_PROXY_BENEF.TYPE
     */
    public void setTYPE(String TYPE) {
        this.TYPE = TYPE == null ? null : TYPE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CIF_PROXY_BENEF.PROXY_TYPE
     *
     * @return the value of CIF_PROXY_BENEF.PROXY_TYPE
     */
    public String getPROXY_TYPE() {
        return PROXY_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CIF_PROXY_BENEF.PROXY_TYPE
     *
     * @param PROXY_TYPE the value for CIF_PROXY_BENEF.PROXY_TYPE
     */
    public void setPROXY_TYPE(String PROXY_TYPE) {
        this.PROXY_TYPE = PROXY_TYPE == null ? null : PROXY_TYPE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CIF_PROXY_BENEF.AGENT_MATURITY_DATE
     *
     * @return the value of CIF_PROXY_BENEF.AGENT_MATURITY_DATE
     */
    public Date getAGENT_MATURITY_DATE() {
        return AGENT_MATURITY_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CIF_PROXY_BENEF.AGENT_MATURITY_DATE
     *
     * @param AGENT_MATURITY_DATE the value for CIF_PROXY_BENEF.AGENT_MATURITY_DATE
     */
    public void setAGENT_MATURITY_DATE(Date AGENT_MATURITY_DATE) {
        this.AGENT_MATURITY_DATE = AGENT_MATURITY_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CIF_PROXY_BENEF.REAL_MATURITY_DATE
     *
     * @return the value of CIF_PROXY_BENEF.REAL_MATURITY_DATE
     */
    public Date getREAL_MATURITY_DATE() {
        return REAL_MATURITY_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CIF_PROXY_BENEF.REAL_MATURITY_DATE
     *
     * @param REAL_MATURITY_DATE the value for CIF_PROXY_BENEF.REAL_MATURITY_DATE
     */
    public void setREAL_MATURITY_DATE(Date REAL_MATURITY_DATE) {
        this.REAL_MATURITY_DATE = REAL_MATURITY_DATE;
    }

    public String getNICKNAME()
    {
        return NICKNAME;
    }

    public void setNICKNAME(String nICKNAME)
    {
        NICKNAME = nICKNAME;
    }

    public String getSTATUS()
    {
        return STATUS;
    }

    public void setSTATUS(String sTATUS)
    {
        STATUS = sTATUS;
    }

    public String getACTIVATED_BY()
    {
        return ACTIVATED_BY;
    }

    public void setACTIVATED_BY(String aCTIVATED_BY)
    {
        ACTIVATED_BY = aCTIVATED_BY;
    }

    public Date getACTIVATED_DATE()
    {
        return ACTIVATED_DATE;
    }

    public void setACTIVATED_DATE(Date aCTIVATED_DATE)
    {
        ACTIVATED_DATE = aCTIVATED_DATE;
    }

    public String getCREATED_BY()
    {
        return CREATED_BY;
    }

    public void setCREATED_BY(String cREATED_BY)
    {
        CREATED_BY = cREATED_BY;
    }

    public Date getCREATED_DATE()
    {
        return CREATED_DATE;
    }

    public void setCREATED_DATE(Date cREATED_DATE)
    {
        CREATED_DATE = cREATED_DATE;
    }

    public String getDEACTIVATED_BY()
    {
        return DEACTIVATED_BY;
    }

    public void setDEACTIVATED_BY(String dEACTIVATED_BY)
    {
        DEACTIVATED_BY = dEACTIVATED_BY;
    }

    public Date getDEACTIVATED_DATE()
    {
        return DEACTIVATED_DATE;
    }

    public void setDEACTIVATED_DATE(Date dEACTIVATED_DATE)
    {
        DEACTIVATED_DATE = dEACTIVATED_DATE;
    }

    public String getDELETED_BY()
    {
        return DELETED_BY;
    }

    public void setDELETED_BY(String dELETED_BY)
    {
        DELETED_BY = dELETED_BY;
    }

    public Date getDELETED_DATE()
    {
        return DELETED_DATE;
    }

    public void setDELETED_DATE(Date dELETED_DATE)
    {
        DELETED_DATE = dELETED_DATE;
    }

    public String getMODIFIED_BY()
    {
        return MODIFIED_BY;
    }

    public void setMODIFIED_BY(String mODIFIED_BY)
    {
        MODIFIED_BY = mODIFIED_BY;
    }

    public Date getMODIFIED_DATE()
    {
        return MODIFIED_DATE;
    }

    public void setMODIFIED_DATE(Date mODIFIED_DATE)
    {
        MODIFIED_DATE = mODIFIED_DATE;
    }

    public String getPURPOSE_REGISTER()
    {
        return PURPOSE_REGISTER;
    }

    public void setPURPOSE_REGISTER(String pURPOSE_REGISTER)
    {
        PURPOSE_REGISTER = pURPOSE_REGISTER;
    }
    
    public Date getCANCEL_DATE()
    {
        return CANCEL_DATE;
    }

    public void setCANCEL_DATE(Date cANCEL_DATE)
    {
        CANCEL_DATE = cANCEL_DATE;
    }

    public String getCANCEL_BY()
    {
        return CANCEL_BY;
    }

    public void setCANCEL_BY(String cANCEL_BY)
    {
        CANCEL_BY = cANCEL_BY;
    }

    public String getTO_DELETE_BY()
    {
        return TO_DELETE_BY;
    }

    public void setTO_DELETE_BY(String tO_DELETE_BY)
    {
        TO_DELETE_BY = tO_DELETE_BY;
    }

    public Date getTO_DELETE_DATE()
    {
        return TO_DELETE_DATE;
    }

    public void setTO_DELETE_DATE(Date tO_DELETE_DATE)
    {
        TO_DELETE_DATE = tO_DELETE_DATE;
    }

    public Date getTO_CANCEL_DATE()
    {
        return TO_CANCEL_DATE;
    }

    public void setTO_CANCEL_DATE(Date tO_CANCEL_DATE)
    {
        TO_CANCEL_DATE = tO_CANCEL_DATE;
    }

    public String getTO_CANCEL_BY()
    {
        return TO_CANCEL_BY;
    }

    public void setTO_CANCEL_BY(String tO_CANCEL_BY)
    {
        TO_CANCEL_BY = tO_CANCEL_BY;
    }

    public String getPARENT_CHILD_IND()
    {
        return PARENT_CHILD_IND;
    }

    public void setPARENT_CHILD_IND(String pARENT_CHILD_IND)
    {
        PARENT_CHILD_IND = pARENT_CHILD_IND;
    }

    public String getPARENT_NICKNAME()
    {
        return PARENT_NICKNAME;
    }

    public void setPARENT_NICKNAME(String pARENT_NICKNAME)
    {
        PARENT_NICKNAME = pARENT_NICKNAME;
    }

    public BigDecimal getPARENT_CIF_NO()
    {
        return PARENT_CIF_NO;
    }

    public void setPARENT_CIF_NO(BigDecimal pARENT_CIF_NO)
    {
        PARENT_CIF_NO = pARENT_CIF_NO;
    }
}