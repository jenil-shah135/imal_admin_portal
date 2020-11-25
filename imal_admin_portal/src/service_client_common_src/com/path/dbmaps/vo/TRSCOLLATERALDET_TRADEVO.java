package com.path.dbmaps.vo;

import java.math.BigDecimal;

public class TRSCOLLATERALDET_TRADEVO extends TRSCOLLATERALDET_TRADEVOKey {
    /**
     * This field corresponds to the database column TRSCOLLATERALDET_TRADE.DEAL_ALLOCATED
     */
    private BigDecimal DEAL_ALLOCATED;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSCOLLATERALDET_TRADE.DEAL_ALLOCATED
     *
     * @return the value of TRSCOLLATERALDET_TRADE.DEAL_ALLOCATED
     */
    public BigDecimal getDEAL_ALLOCATED() {
        return DEAL_ALLOCATED;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSCOLLATERALDET_TRADE.DEAL_ALLOCATED
     *
     * @param DEAL_ALLOCATED the value for TRSCOLLATERALDET_TRADE.DEAL_ALLOCATED
     */
    public void setDEAL_ALLOCATED(BigDecimal DEAL_ALLOCATED) {
        this.DEAL_ALLOCATED = DEAL_ALLOCATED;
    }
}