package com.wantdo.erp.model;

import java.util.Date;

public class Account {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.id
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.custid
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private Integer custid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.accountname
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private String accountname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.amount
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private Integer amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.curency
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private String curency;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.amountlimit
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private Integer amountlimit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.remindlevel
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private Integer remindlevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.remindtimes
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private Integer remindtimes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.contact
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private String contact;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.phone
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.mobile
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.email
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.custstatus
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private Integer custstatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.createon
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private Date createon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.ext1
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private String ext1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.ext2
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private String ext2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.ext3
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private String ext3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.remark
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public Account(Integer id, Integer custid, String accountname, Integer amount, String curency, Integer amountlimit, Integer remindlevel, Integer remindtimes, String contact, String phone, String mobile, String email, Integer custstatus, Date createon, String ext1, String ext2, String ext3, String remark) {
        this.id = id;
        this.custid = custid;
        this.accountname = accountname;
        this.amount = amount;
        this.curency = curency;
        this.amountlimit = amountlimit;
        this.remindlevel = remindlevel;
        this.remindtimes = remindtimes;
        this.contact = contact;
        this.phone = phone;
        this.mobile = mobile;
        this.email = email;
        this.custstatus = custstatus;
        this.createon = createon;
        this.ext1 = ext1;
        this.ext2 = ext2;
        this.ext3 = ext3;
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public Account() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.id
     *
     * @return the value of account.id
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.id
     *
     * @param id the value for account.id
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.custid
     *
     * @return the value of account.custid
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public Integer getCustid() {
        return custid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.custid
     *
     * @param custid the value for account.custid
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setCustid(Integer custid) {
        this.custid = custid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.accountname
     *
     * @return the value of account.accountname
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public String getAccountname() {
        return accountname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.accountname
     *
     * @param accountname the value for account.accountname
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setAccountname(String accountname) {
        this.accountname = accountname == null ? null : accountname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.amount
     *
     * @return the value of account.amount
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.amount
     *
     * @param amount the value for account.amount
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.curency
     *
     * @return the value of account.curency
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public String getCurency() {
        return curency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.curency
     *
     * @param curency the value for account.curency
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setCurency(String curency) {
        this.curency = curency == null ? null : curency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.amountlimit
     *
     * @return the value of account.amountlimit
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public Integer getAmountlimit() {
        return amountlimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.amountlimit
     *
     * @param amountlimit the value for account.amountlimit
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setAmountlimit(Integer amountlimit) {
        this.amountlimit = amountlimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.remindlevel
     *
     * @return the value of account.remindlevel
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public Integer getRemindlevel() {
        return remindlevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.remindlevel
     *
     * @param remindlevel the value for account.remindlevel
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setRemindlevel(Integer remindlevel) {
        this.remindlevel = remindlevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.remindtimes
     *
     * @return the value of account.remindtimes
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public Integer getRemindtimes() {
        return remindtimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.remindtimes
     *
     * @param remindtimes the value for account.remindtimes
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setRemindtimes(Integer remindtimes) {
        this.remindtimes = remindtimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.contact
     *
     * @return the value of account.contact
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public String getContact() {
        return contact;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.contact
     *
     * @param contact the value for account.contact
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.phone
     *
     * @return the value of account.phone
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.phone
     *
     * @param phone the value for account.phone
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.mobile
     *
     * @return the value of account.mobile
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.mobile
     *
     * @param mobile the value for account.mobile
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.email
     *
     * @return the value of account.email
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.email
     *
     * @param email the value for account.email
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.custstatus
     *
     * @return the value of account.custstatus
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public Integer getCuststatus() {
        return custstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.custstatus
     *
     * @param custstatus the value for account.custstatus
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setCuststatus(Integer custstatus) {
        this.custstatus = custstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.createon
     *
     * @return the value of account.createon
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public Date getCreateon() {
        return createon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.createon
     *
     * @param createon the value for account.createon
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setCreateon(Date createon) {
        this.createon = createon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.ext1
     *
     * @return the value of account.ext1
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public String getExt1() {
        return ext1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.ext1
     *
     * @param ext1 the value for account.ext1
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setExt1(String ext1) {
        this.ext1 = ext1 == null ? null : ext1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.ext2
     *
     * @return the value of account.ext2
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public String getExt2() {
        return ext2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.ext2
     *
     * @param ext2 the value for account.ext2
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setExt2(String ext2) {
        this.ext2 = ext2 == null ? null : ext2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.ext3
     *
     * @return the value of account.ext3
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public String getExt3() {
        return ext3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.ext3
     *
     * @param ext3 the value for account.ext3
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setExt3(String ext3) {
        this.ext3 = ext3 == null ? null : ext3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.remark
     *
     * @return the value of account.remark
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.remark
     *
     * @param remark the value for account.remark
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}