package com.yanhao.taobaoclient.daoImpl;

import com.yanhao.taobaoclient.model.Product;

import java.util.List;

/**
 * 商品类的操作接口
 * Created by yons on 2015/3/18.
 */
public interface IProductService {
    /**
     * 获取分页商品信息
     * @param pageIndex 页码
     * @param pageSize 页面商品数量
     * @return 商品集合
     */
    public List<Product> getAllProduct(int pageIndex,int pageSize);

    /**
     * 根据商品id 获取商品商品信息
     * @param productId 商品id
     * @return 商品实体
     */
    public Product getProductById(int productId);

    /**
     * 根据商品名称获取商品信息(模糊查询)
     * @param name 商品名称
     * @return 商品实体
     */
    public Product getProductByName(String name);

    /**
     * 修改商品信息
     * @param product 商品
     */
    public void updateProduct(Product product);

    /**
     * 添加商品
     * @param product 商品
     */
    public void addProduct(Product product);

    /**
     * 删除商品信息
     * @param productId 商品id
     */
    public void deleteProduct(int productId);
}
