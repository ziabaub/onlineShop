package com.epam.shop.command.impl;

import com.epam.shop.command.Command;
import com.epam.shop.entity.OnlineShop;
import com.epam.shop.entity.Product;
import com.epam.shop.entity.pages.Page;
import com.epam.shop.entity.pages.impl.BackPage;
import com.epam.shop.singelton.SingletonOnlineShop;
import com.epam.shop.view.View;
/**
 * Implement command show list of product
 */
public class showList implements Command {
    /**
     * Implementation for show list command
     * @return back page
     */
    @Override
    public Page execute() {
        OnlineShop shop = SingletonOnlineShop.getInstance();
        View view= new View();
        for (Product product : shop.getProducts().getProducts().values()) {
            view.printProduct(product);
        }
        return new BackPage();
    }
}
