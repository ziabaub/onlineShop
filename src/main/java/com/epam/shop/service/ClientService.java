package com.epam.shop.service;

import com.epam.shop.entity.Product;
import com.epam.shop.singelton.SingletonOnlineShop;

/**
 * This class implements client functions
 */
public class ClientService {
    /**
     * This method emulates a purchase in shop
     * @param name product name
     * @param quantity product quantity
     * @return If quantity isn't between 1 and 1000 or such product isn't available, it will return false.
     * Otherwise it will return true
     */
    public boolean BuyProduct(String name, Integer quantity){
        if ((quantity < 1) || (quantity > 1000))
            return false;
        Product product = SingletonOnlineShop.getInstance().getProducts().getProduct(name);
        if (product == null)
            return false;
        if (quantity > product.getQuantity())
            return false;
        product.setQuantity(product.getQuantity() - quantity);
        return true;
    }
}
