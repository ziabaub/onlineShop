package com.epam.shop.command.impl.client;

import com.epam.shop.command.Command;
import com.epam.shop.entity.OnlineShop;
import com.epam.shop.entity.Product;
import com.epam.shop.entity.pages.Page;
import com.epam.shop.entity.pages.impl.BackPage;
import com.epam.shop.service.ProductService;
import com.epam.shop.singelton.SingletonOnlineShop;
import com.epam.shop.view.View;

import java.util.*;
/**
 * Implement command show list sorted by price
 */
public class showListByPrice implements Command {
    /**
     * Implementation for show list sorted by price command
     * @return back page
     */
    @Override
    public Page execute() {
        OnlineShop shop = SingletonOnlineShop.getInstance();
        View view = new View();
        Map<String, Product> sortedMap = ProductService.sortByPrice(shop.getProducts().getProducts());
        for (Product product : sortedMap.values()) {
            view.printProduct(product);
        }
        return new BackPage();
    }



}

