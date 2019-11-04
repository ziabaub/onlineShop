package com.epam.shop.dao;

import com.epam.shop.entity.Product;
import com.epam.shop.singelton.SingletonOnlineShop;

import java.util.List;
import java.util.Optional;

/**
 * This class realize ProductDAO
 */
public class ProductDao {

    private List<Product> products = SingletonOnlineShop.getInstance().getProduct();

    /**
     * Setter for product
     *
     * @param product product whith needed to add at the list
     */
    public void addProduct(Product product) {
        products.add(product);
    }

    /**
     * This method check available product
     *
     * @param name product name
     * @return list of product which have such name
     */
    public Optional<Product> getProduct(String name) {
        return products.stream()
                .filter(p -> name.equals(p.getName()))
                .findFirst();
    }
}
