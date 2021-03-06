package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class TRSCLASS_LIMIT_GLVOKey extends BaseVO {
    /**
     * This field corresponds to the database column TRSCLASS_LIMIT_GL.CLASS
     */
    private BigDecimal CLASS;

    /**
     * This field corresponds to the database column TRSCLASS_LIMIT_GL.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column TRSCLASS_LIMIT_GL.GL_CODE
     */
    private BigDecimal GL_CODE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSCLASS_LIMIT_GL.CLASS
     *
     * @return the value of TRSCLASS_LIMIT_GL.CLASS
     */
    public BigDecimal getCLASS() {
        return CLASS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSCLASS_LIMIT_GL.CLASS
     *
     * @param CLASS the value for TRSCLASS_LIMIT_GL.CLASS
     */
    public void setCLASS(BigDecimal CLASS) {
        this.CLASS = CLASS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSCLASS_LIMIT_GL.COMP_CODE
     *
     * @return the value of TRSCLASS_LIMIT_GL.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSCLASS_LIMIT_GL.COMP_CODE
     *
     * @param COMP_CODE the value for TRSCLASS_LIMIT_GL.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRSCLASS_LIMIT_GL.GL_CODE
     *
     * @return the value of TRSCLASS_LIMIT_GL.GL_CODE
     */
    public BigDecimal getGL_CODE() {
        return GL_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRSCLASS_LIMIT_GL.GL_CODE
     *
     * @param GL_CODE the value for TRSCLASS_LIMIT_GL.GL_CODE
     */
    public void setGL_CODE(BigDecimal GL_CODE) {
        this.GL_CODE = GL_CODE;
    }
}