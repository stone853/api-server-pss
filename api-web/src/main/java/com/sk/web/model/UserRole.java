package com.sk.web.model;

import javax.persistence.Table;

@Table(name = "t_pss_user_role")
public class UserRole {
    private Long id;

    private String userId;

    private String roleCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public UserRole setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getRoleId() {
        return roleCode;
    }

    public void setRoleId(String roleCode) {
        this.roleCode = roleCode;
    }
}