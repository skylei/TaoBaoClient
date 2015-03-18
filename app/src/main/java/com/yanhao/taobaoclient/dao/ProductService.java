package com.yanhao.taobaoclient.dao;

import com.yanhao.taobaoclient.daoImpl.IProductService;
import com.yanhao.taobaoclient.data.DataInit;
import com.yanhao.taobaoclient.model.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 商品的操作
 * Created by yons on 2015/3/18.
 */
public class ProductService implements IProductService {
    List<Product> productList = Arrays.asList(DataInit.products);

    @Override
    public List<Product> getAllProduct(int pageIndex, int pageSize) {
        List<Product> products = new ArrayList<>();
        int beginIndex = pageIndex * pageSize;
        int endIndex = (pageIndex + 1) * pageSize;
        int size = productList.size();
        for (int i = beginIndex; i < endIndex && i < size; i++) {
            products.add(productList.get(i));
        }
        return products;
    }

    @Override
    public Product getProductById(int productId) {
        for (Product product : productList) {
            if (productId == product.getId()) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Product getProductByName(String name) {
        for (Product product : productList) {
            if (name == product.getName()) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void updateProduct(Product product) {
        Product productRaw = getProductById(product.getId());
        if (productRaw != null) {
            productList.remove(productRaw);
        }
        productList.add(product);
    }

    @Override
    public void addProduct(Product product) {
        Product productRaw = getProductById(product.getId());
        if (productRaw == null) {
            productList.add(product);
        }
    }

    @Override
    public void deleteProduct(int productId) {
        Product productRaw = getProductById(productId);
        if (productRaw != null) {
            productList.remove(productRaw);
        }
    }
}
