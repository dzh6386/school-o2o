package com.deng.o2o.entity;

import java.util.Date;

//本地账户
public class LocalAccount {
    private Long localAccountId;
    private String username;
    private String password;
    private Date createTime;
    private Date LastEditTime;
    private PersonInfo personInfo;

    public Long getLocalAccountId() {
        return localAccountId;
    }

    public void setLocalAccountId(Long localAccountId) {
        this.localAccountId = localAccountId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return LastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        LastEditTime = lastEditTime;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
}
