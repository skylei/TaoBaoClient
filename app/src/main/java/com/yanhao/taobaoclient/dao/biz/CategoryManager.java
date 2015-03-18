package com.yanhao.taobaoclient.dao.biz;

import com.yanhao.taobaoclient.dao.CategoryService;
import com.yanhao.taobaoclient.daoImpl.ICategoryService;
import com.yanhao.taobaoclient.model.Category;

import java.util.List;

/**
 * 类别类的服务层
 * Created by yons on 2015/3/18.
 */
public class CategoryManager {
    private ICategoryService dao;
    public CategoryManager(){
        dao=new CategoryService();
    }
    /**
     * 获得所有类别
     * @return 类别集合
     */
    public List<Category> getAllCategory(){
     return dao.getAllCategory();
    }

    /**
     * 根据类别id获取类别实体
     * @param categoryId 类别id
     * @return 类别实体
     */
    public Category getCategoryById(int categoryId){
        return dao.getCategoryById(categoryId);
    }
}
