package com.wantdo.erp.model;

public class OrderAttrs {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_attrs.id
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_attrs.objectid
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private Integer objectid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_attrs.attrkey
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private String attrkey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_attrs.attrvalue
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private String attrvalue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_attrs.type
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private String type;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_attrs
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public OrderAttrs(Integer id, Integer objectid, String attrkey, String attrvalue, String type) {
        this.id = id;
        this.objectid = objectid;
        this.attrkey = attrkey;
        this.attrvalue = attrvalue;
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_attrs
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public OrderAttrs() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_attrs.id
     *
     * @return the value of order_attrs.id
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_attrs.id
     *
     * @param id the value for order_attrs.id
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_attrs.objectid
     *
     * @return the value of order_attrs.objectid
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public Integer getObjectid() {
        return objectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_attrs.objectid
     *
     * @param objectid the value for order_attrs.objectid
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setObjectid(Integer objectid) {
        this.objectid = objectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_attrs.attrkey
     *
     * @return the value of order_attrs.attrkey
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public String getAttrkey() {
        return attrkey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_attrs.attrkey
     *
     * @param attrkey the value for order_attrs.attrkey
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setAttrkey(String attrkey) {
        this.attrkey = attrkey == null ? null : attrkey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_attrs.attrvalue
     *
     * @return the value of order_attrs.attrvalue
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public String getAttrvalue() {
        return attrvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_attrs.attrvalue
     *
     * @param attrvalue the value for order_attrs.attrvalue
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setAttrvalue(String attrvalue) {
        this.attrvalue = attrvalue == null ? null : attrvalue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_attrs.type
     *
     * @return the value of order_attrs.type
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_attrs.type
     *
     * @param type the value for order_attrs.type
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}