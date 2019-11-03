package com.epam.shop.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *  There is class that describes online shop
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "onlineShop", propOrder = {
        "products",
        "users"
})
public class OnlineShop {
    /**
     * List of product
     */
    @XmlElement(required = true)
    private Products products;
    /**
     * List of users
     */
    @XmlElement(required = true)
    private Users users;

    /**
     * Constructor that create new products and users
     */
    public OnlineShop() {
        products = new Products();
        users = new Users();
    }

    /**
     * Getter for products
     * @return products
     */
    public Products getProducts() {
        return products;
    }

    /*public void setProducts(Products products) {
        this.products = products;
    }*/

    /**
     * Getter for users
     * @return users
     */
    public Users getUsers() {
        return users;
    }

    /*public void setUsers(Users users) {
        this.users = users;
    }*/
}
