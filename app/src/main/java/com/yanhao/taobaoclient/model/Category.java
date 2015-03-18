package com.yanhao.taobaoclient.model;

/**
 * 商品类别类
 * 含有属性: ID  类别名称
 *
 * Created by yons on 2015/3/18.
 */
public class Category {
    private int id;
    private String categoryName;

    public Category() {
        super();
    }

    public Category(int id, String categoryName) {
        this.id = id;
        this.categoryName = categoryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
