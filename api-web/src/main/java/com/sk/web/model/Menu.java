package com.sk.web.model;

import com.sk.web.model.api.BaseModel;

import javax.persistence.Table;
import java.util.List;

@Table(name = "t_pss_menu")
public class Menu extends BaseModel {
    private Long id;

    private String name;

    private String menuCode;

    private Long parentId;

    private Byte nodeType;

    private String iconUrl;

    private Integer sort;

    private String linkUrl;

    private Integer level;

    private String path;

    private Byte isDelete;




    /**

     * 子菜单集合

     */

    private List<Menu> childMenu;

    public void setChildMenu(List<Menu> childMenu) {
        this.childMenu = childMenu;
    }

    public List<Menu> getChildMenu() {
        return childMenu;
    }

    public Long getId() {
        return id;
    }

    public Menu setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Menu setName(String name) {
        this.name = name == null ? null : name.trim();
        return this;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public Menu setMenuCode(String menuCode) {
        this.menuCode = menuCode == null ? null : menuCode.trim();
        return this;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Byte getNodeType() {
        return nodeType;
    }

    public void setNodeType(Byte nodeType) {
        this.nodeType = nodeType;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl == null ? null : iconUrl.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}