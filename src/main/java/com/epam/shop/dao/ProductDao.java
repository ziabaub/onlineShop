package com.epam.shop.dao;

import com.epam.shop.entity.Product;
import com.epam.shop.entity.Products;
import com.epam.shop.singelton.SingletonOnlineShop;

import java.util.Map;

/**
 * This class realize ProductDAO
 */
public class ProductDao {

    private Products products = SingletonOnlineShop.getInstance().getProducts();

    /**
     *
     * @param name name of product
     * @return map with required
     */
    public Map<String, Product> getProduct(String name){
        return products.isAvailable(name);
    }

    public void setProduct(Product product){
        products.setProduct(product);
    }
}
