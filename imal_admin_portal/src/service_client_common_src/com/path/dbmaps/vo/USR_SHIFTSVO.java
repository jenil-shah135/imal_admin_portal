package com.path.dbmaps.vo;

import java.math.BigDecimal;
import java.util.Date;

public class USR_SHIFTSVO extends USR_SHIFTSVOKey {
    /**
     * This field corresponds to the database column USR_SHIFTS.FROM_TIME
     */
    private Date FROM_TIME;

    /**
     * This field corresponds to the database column USR_SHIFTS.TO_TIME
     */
    private Date TO_TIME;

    /**
     * This field corresponds to the database column USR_SHIFTS.FROM_TEMPLATE
     */
    private BigDecimal FROM_TEMPLATE;
    
    private Date DATE_UPDATED;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USR_SHIFTS.FROM_TIME
     *
     * @return the value of USR_SHIFTS.FROM_TIME
     */
    public Date getFROM_TIME() {
        return FROM_TIME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USR_SHIFTS.FROM_TIME
     *
     * @param FROM_TIME the value for USR_SHIFTS.FROM_TIME
     */
    public void setFROM_TIME(Date FROM_TIME) {
        this.FROM_TIME = FROM_TIME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USR_SHIFTS.TO_TIME
     *
     * @return the value of USR_SHIFTS.TO_TIME
     */
    public Date getTO_TIME() {
        return TO_TIME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USR_SHIFTS.TO_TIME
     *
     * @param TO_TIME the value for USR_SHIFTS.TO_TIME
     */
    public void setTO_TIME(Date TO_TIME) {
        this.TO_TIME = TO_TIME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USR_SHIFTS.FROM_TEMPLATE
     *
     * @return the value of USR_SHIFTS.FROM_TEMPLATE
     */
    public BigDecimal getFROM_TEMPLATE() {
        return FROM_TEMPLATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USR_SHIFTS.FROM_TEMPLATE
     *
     * @param FROM_TEMPLATE the value for USR_SHIFTS.FROM_TEMPLATE
     */
    public void setFROM_TEMPLATE(BigDecimal FROM_TEMPLATE) {
        this.FROM_TEMPLATE = FROM_TEMPLATE;
    }

		
		public Date getDATE_UPDATED()
		{
			return DATE_UPDATED;
		}

		
		public void setDATE_UPDATED(Date dATE_UPDATED)
		{
			DATE_UPDATED = dATE_UPDATED;
		}
}