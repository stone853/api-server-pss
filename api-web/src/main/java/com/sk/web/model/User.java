package com.sk.web.model;

import javax.persistence.Table;

@Table(name = "t_pss_user")
public class User {

    private Long id;

    private String userId;

    private String mobile;

    private String name;

    private String password;

    private Byte isDelete;

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public User setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public String getMobile() {
        return mobile;
    }

    public User setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name == null ? null : name.trim();
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password == null ? null : password.trim();
        return this;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public User setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
        return this;
    }
}
