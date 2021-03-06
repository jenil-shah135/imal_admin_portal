package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class CTS_PRODUCT_TRX_CHARGESVOKey extends BaseVO {
    
    /**
     * This field corresponds to the database column CTS_PRODUCT_TRX_CHARGES.COMP_CODE
     */
    private BigDecimal COMP_CODE;
    
    /**
     * This field corresponds to the database column CTS_PRODUCT_TRX_CHARGES.BRANCH_CODE
     */
    private BigDecimal BRANCH_CODE;
    
    /**
     * This field corresponds to the database column CTS_PRODUCT_TRX_CHARGES.PRODUCT_CODE
     */    
    private BigDecimal PRODUCT_CODE;
    
    /**
     * This field corresponds to the database column CTS_PRODUCT_TRX_CHARGES.PRODUCT_TYPE
     */
    private String PRODUCT_TYPE;

    
    /**
     * This field corresponds to the database column CTS_PRODUCT_TRX_CHARGES.TRS_NO
     */    
    private BigDecimal TRS_NO;
    
    
    /**
     * This field corresponds to the database column CTS_PRODUCT_TRX_CHARGES.TRS_BRANCH_CODE
     */    
    private BigDecimal TRS_BRANCH_CODE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_PRODUCT_TRX_CHARGES.COMP_CODE
     *
     * @return the value of CTS_PRODUCT_TRX_CHARGES.COMP_CODE
     */
    public BigDecimal getCOMP_CODE()
    {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_PRODUCT_TRX_CHARGES.COMP_CODE
     *
     * @return the value of CTS_PRODUCT_TRX_CHARGES.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal cOMP_CODE)
    {
        COMP_CODE = cOMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_PRODUCT_TRX_CHARGES.BRANCH_CODE
     *
     * @return the value of CTS_PRODUCT_TRX_CHARGES.BRANCH_CODE
     */
    public BigDecimal getBRANCH_CODE()
    {
        return BRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_PRODUCT_TRX_CHARGES.BRANCH_CODE
     *
     * @return the value of CTS_PRODUCT_TRX_CHARGES.BRANCH_CODE
     */
    public void setBRANCH_CODE(BigDecimal bRANCH_CODE)
    {
        BRANCH_CODE = bRANCH_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_PRODUCT_TRX_CHARGES.PRODUCT_CODE
     *
     * @return the value of CTS_PRODUCT_TRX_CHARGES.PRODUCT_CODE
     */
    public BigDecimal getPRODUCT_CODE()
    {
        return PRODUCT_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_PRODUCT_TRX_CHARGES.PRODUCT_CODE
     *
     * @param TRS_BRANCH_CODE the value for CTS_PRODUCT_TRX_CHARGES.PRODUCT_CODE
     */   
    public void setPRODUCT_CODE(BigDecimal pRODUCT_CODE)
    {
        PRODUCT_CODE = pRODUCT_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_PRODUCT_TRX_CHARGES.PRODUCT_TYPE
     *
     * @return the value of CTS_PRODUCT_TRX_CHARGES.PRODUCT_TYPE
     */
    public String getPRODUCT_TYPE()
    {
        return PRODUCT_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_PRODUCT_TRX_CHARGES.PRODUCT_TYPE
     *
     * @param TRS_BRANCH_CODE the value for CTS_PRODUCT_TRX_CHARGES.PRODUCT_TYPE
     */   
    public void setPRODUCT_TYPE(String pRODUCT_TYPE)
    {
        PRODUCT_TYPE = pRODUCT_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_PRODUCT_TRX_CHARGES.TRS_NO
     *
     * @return the value of CTS_PRODUCT_TRX_CHARGES.TRS_NO
     */
    public BigDecimal getTRS_NO()
    {
        return TRS_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_PRODUCT_TRX_CHARGES.TRS_NO
     *
     * @param TRS_BRANCH_CODE the value for CTS_PRODUCT_TRX_CHARGES.TRS_NO
     */   
    public void setTRS_NO(BigDecimal tRS_NO)
    {
        TRS_NO = tRS_NO;
    }


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CTS_PRODUCT_TRX_CHARGES.TRS_BRANCH_CODE
     *
     * @return the value of CTS_PRODUCT_TRX_CHARGES.TRS_BRANCH_CODE
     */
    public BigDecimal getTRS_BRANCH_CODE()
    {
        return TRS_BRANCH_CODE;
    }

    
    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CTS_PRODUCT_TRX_CHARGES.CIF_NO
     *
     * @param TRS_BRANCH_CODE the value for CTS_PRODUCT_TRX_CHARGES.TRS_BRANCH_CODE
     */   
    public void setTRS_BRANCH_CODE(BigDecimal tRS_BRANCH_CODE)
    {
        TRS_BRANCH_CODE = tRS_BRANCH_CODE;
    }
    
    
    
   
    
    
 
}