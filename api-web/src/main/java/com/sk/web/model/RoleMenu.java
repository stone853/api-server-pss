package com.sk.web.model;

import javax.persistence.Table;

@Table(name = "t_pss_role_menu")
public class RoleMenu {
    private Long id;

    private String roleCode;

    private Long menuId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public RoleMenu setRoleCode(String roleCode) {
        this.roleCode = roleCode;
        return this;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }
}