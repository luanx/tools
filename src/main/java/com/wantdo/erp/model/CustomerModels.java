package com.wantdo.erp.model;

import java.util.Date;

public class CustomerModels {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_models.id
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_models.custid
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private Integer custid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_models.modelid
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private Integer modelid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_models.createon
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private Date createon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_models.remark
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_models
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public CustomerModels(Integer id, Integer custid, Integer modelid, Date createon, String remark) {
        this.id = id;
        this.custid = custid;
        this.modelid = modelid;
        this.createon = createon;
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_models
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public CustomerModels() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_models.id
     *
     * @return the value of customer_models.id
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_models.id
     *
     * @param id the value for customer_models.id
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_models.custid
     *
     * @return the value of customer_models.custid
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public Integer getCustid() {
        return custid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_models.custid
     *
     * @param custid the value for customer_models.custid
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setCustid(Integer custid) {
        this.custid = custid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_models.modelid
     *
     * @return the value of customer_models.modelid
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public Integer getModelid() {
        return modelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_models.modelid
     *
     * @param modelid the value for customer_models.modelid
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setModelid(Integer modelid) {
        this.modelid = modelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_models.createon
     *
     * @return the value of customer_models.createon
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public Date getCreateon() {
        return createon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_models.createon
     *
     * @param createon the value for customer_models.createon
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setCreateon(Date createon) {
        this.createon = createon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_models.remark
     *
     * @return the value of customer_models.remark
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_models.remark
     *
     * @param remark the value for customer_models.remark
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}