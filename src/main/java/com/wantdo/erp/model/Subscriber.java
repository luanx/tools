package com.wantdo.erp.model;

import java.util.Date;

public class Subscriber {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subscriber.id
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subscriber.custid
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private Integer custid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subscriber.username
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subscriber.userpwd
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private String userpwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subscriber.role
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private Integer role;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subscriber.phone
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subscriber.email
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subscriber.createon
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private Date createon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subscriber.substatus
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private Integer substatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subscriber.im
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private String im;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subscriber.ext1
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private String ext1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subscriber.ext2
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private String ext2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subscriber.ext3
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private String ext3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subscriber.remark
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subscriber
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public Subscriber(Integer id, Integer custid, String username, String userpwd, Integer role, String phone, String email, Date createon, Integer substatus, String im, String ext1, String ext2, String ext3, String remark) {
        this.id = id;
        this.custid = custid;
        this.username = username;
        this.userpwd = userpwd;
        this.role = role;
        this.phone = phone;
        this.email = email;
        this.createon = createon;
        this.substatus = substatus;
        this.im = im;
        this.ext1 = ext1;
        this.ext2 = ext2;
        this.ext3 = ext3;
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subscriber
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public Subscriber() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subscriber.id
     *
     * @return the value of subscriber.id
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subscriber.id
     *
     * @param id the value for subscriber.id
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subscriber.custid
     *
     * @return the value of subscriber.custid
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public Integer getCustid() {
        return custid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subscriber.custid
     *
     * @param custid the value for subscriber.custid
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setCustid(Integer custid) {
        this.custid = custid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subscriber.username
     *
     * @return the value of subscriber.username
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subscriber.username
     *
     * @param username the value for subscriber.username
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subscriber.userpwd
     *
     * @return the value of subscriber.userpwd
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public String getUserpwd() {
        return userpwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subscriber.userpwd
     *
     * @param userpwd the value for subscriber.userpwd
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd == null ? null : userpwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subscriber.role
     *
     * @return the value of subscriber.role
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public Integer getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subscriber.role
     *
     * @param role the value for subscriber.role
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setRole(Integer role) {
        this.role = role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subscriber.phone
     *
     * @return the value of subscriber.phone
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subscriber.phone
     *
     * @param phone the value for subscriber.phone
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subscriber.email
     *
     * @return the value of subscriber.email
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subscriber.email
     *
     * @param email the value for subscriber.email
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subscriber.createon
     *
     * @return the value of subscriber.createon
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public Date getCreateon() {
        return createon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subscriber.createon
     *
     * @param createon the value for subscriber.createon
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setCreateon(Date createon) {
        this.createon = createon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subscriber.substatus
     *
     * @return the value of subscriber.substatus
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public Integer getSubstatus() {
        return substatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subscriber.substatus
     *
     * @param substatus the value for subscriber.substatus
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setSubstatus(Integer substatus) {
        this.substatus = substatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subscriber.im
     *
     * @return the value of subscriber.im
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public String getIm() {
        return im;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subscriber.im
     *
     * @param im the value for subscriber.im
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setIm(String im) {
        this.im = im == null ? null : im.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subscriber.ext1
     *
     * @return the value of subscriber.ext1
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public String getExt1() {
        return ext1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subscriber.ext1
     *
     * @param ext1 the value for subscriber.ext1
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setExt1(String ext1) {
        this.ext1 = ext1 == null ? null : ext1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subscriber.ext2
     *
     * @return the value of subscriber.ext2
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public String getExt2() {
        return ext2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subscriber.ext2
     *
     * @param ext2 the value for subscriber.ext2
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setExt2(String ext2) {
        this.ext2 = ext2 == null ? null : ext2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subscriber.ext3
     *
     * @return the value of subscriber.ext3
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public String getExt3() {
        return ext3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subscriber.ext3
     *
     * @param ext3 the value for subscriber.ext3
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setExt3(String ext3) {
        this.ext3 = ext3 == null ? null : ext3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subscriber.remark
     *
     * @return the value of subscriber.remark
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subscriber.remark
     *
     * @param remark the value for subscriber.remark
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}