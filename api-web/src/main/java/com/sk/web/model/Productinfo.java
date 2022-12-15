package com.sk.web.model;

import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "tcrm_productinfo")
public class Productinfo {
    private Integer id;

    private String name;

    private String type;

    private String imgUrl;

    private String des;

    private String detail;

    private BigDecimal price;

    private BigDecimal priceDiscount;

    private String color;

    private String size;

    private String tag;

    private String subhead;

    private String isDiscount;

    private String store;

    private String createtime;

    private Integer orderNumber;

    public Integer getId() {
        return id;
    }

    public Productinfo setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Productinfo setName(String name) {
        this.name = name == null ? null : name.trim();
        return this;
    }

    public String getType() {
        return type;
    }

    public Productinfo setType(String type) {
        this.type = type == null ? null : type.trim();
        return this;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Productinfo setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
        return this;
    }

    public String getDes() {
        return des;
    }

    public Productinfo setDes(String des) {
        this.des = des == null ? null : des.trim();
        return this;
    }

    public String getDetail() {
        return detail;
    }

    public Productinfo setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Productinfo setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public BigDecimal getPriceDiscount() {
        return priceDiscount;
    }

    public Productinfo setPriceDiscount(BigDecimal priceDiscount) {
        this.priceDiscount = priceDiscount;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Productinfo setColor(String color) {
        this.color = color == null ? null : color.trim();
        return this;
    }

    public String getSize() {
        return size;
    }

    public Productinfo setSize(String size) {
        this.size = size == null ? null : size.trim();
        return this;
    }

    public String getTag() {
        return tag;
    }

    public Productinfo setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
        return this;
    }

    public String getSubhead() {
        return subhead;
    }

    public Productinfo setSubhead(String subhead) {
        this.subhead = subhead == null ? null : subhead.trim();
        return this;
    }

    public String getIsDiscount() {
        return isDiscount;
    }

    public Productinfo setIsDiscount(String isDiscount) {
        this.isDiscount = isDiscount == null ? null : isDiscount.trim();
        return this;
    }

    public String getStore() {
        return store;
    }

    public Productinfo setStore(String store) {
        this.store = store == null ? null : store.trim();
        return this;
    }

    public String getCreatetime() {
        return createtime;
    }

    public Productinfo setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
        return this;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public Productinfo setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }
}