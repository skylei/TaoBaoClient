package com.yanhao.taobaoclient.model;

/**
 * 淘宝商品的实体类
 * 含有属性: ID 名称 类别号 图像 价格 介绍
 * Created by yons on 2015/3/18.
 */
public class Product {
    private int id;
    private String name;
    private int categoryId;
    private int photo;
    private double unitPrice;
    private String note;

    public Product() {
        super();
    }

    public Product(int id, String name, int categoryId, int photo, double unitPrice, String note) {
        this.id = id;
        this.name = name;
        this.categoryId = categoryId;
        this.photo = photo;
        this.unitPrice = unitPrice;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", categoryId=" + categoryId +
                ", photo=" + photo +
                ", unitPrice=" + unitPrice +
                ", note='" + note + '\'' +
                '}';
    }
}
