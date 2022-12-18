package com.sk.web.model;

import javax.persistence.Table;

@Table(name = "t_pss_role_menu")
public class RoleMenu {
    private Long id;

    private Long roleId;

    private Long menuId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public RoleMenu setRoleId(Long roleId) {
        this.roleId = roleId;
        return this;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }
}