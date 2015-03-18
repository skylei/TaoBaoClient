package com.yanhao.taobaoclient.daoImpl;

import com.yanhao.taobaoclient.model.Category;

import java.util.List;

/**
 * 类别实体类的操作接口
 * Created by yons on 2015/3/18.
 */
public interface ICategoryService {
    /**
     * 获得所有类别
     * @return 类别集合
     */
    public List<Category> getAllCategory();

    /**
     * 根据类别id获取类别实体
     * @param categoryId 类别id
     * @return 类别实体
     */
    public Category getCategoryById(int categoryId);
}
