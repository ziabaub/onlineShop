package com.epam.shop.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *  There is class that describes products
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Products", propOrder = {
        "products"
})
public class Products implements Serializable {
    /**
     * list of product
     */
    @XmlElement(required = true)
    private Map<String , Product> products;

    /**
     * Constructor that creat new list
     */
    Products() {
        products = new HashMap<>();
    }

    /**
     * Getter for products
     * @return list of products
     */
    public Map<String, Product> getProducts() {
        return products;
    }

    /**
     * Setter for products
     * @param products list of products
     */
    public void setProducts(Map<String, Product> products) {
        this.products = products;
    }

    /**
     * Getter for product by name
     * @param name product name
     * @return required product
     */
    public Product getProduct(String name) {
        return products.get(name);
    }

    /**
     * Setter for product
     * @param product product whith needed to add at the list
     */
    public void setProduct(Product product) {
        products.put(product.getName(),product);
    }

    /**
     * This method check available product
     * @param name product name
     * @return list of product which have such name
     */
    public Map<String, Product> isAvailable(String name){
        return products.entrySet().stream()
                .filter(x->name.equals(x.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
