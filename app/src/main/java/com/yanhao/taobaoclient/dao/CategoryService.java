package com.yanhao.taobaoclient.dao;

import com.yanhao.taobaoclient.daoImpl.ICategoryService;
import com.yanhao.taobaoclient.data.DataInit;
import com.yanhao.taobaoclient.model.Category;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 类别类的操作
 * Created by yons on 2015/3/18.
 */
public class CategoryService implements ICategoryService {
    @Override
    public List<Category> getAllCategory() {
        List<Category> categories=new ArrayList<>();
        categories.addAll(Arrays.asList(DataInit.categories));
        return categories;
    }

    @Override
    public Category getCategoryById(int categoryId) {
       for (Category category:DataInit.categories){
           if (categoryId==category.getId()){
               return category;
           }
       }
       return null;
    }
}
