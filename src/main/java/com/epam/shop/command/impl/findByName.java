package com.epam.shop.command.impl;

import com.epam.shop.command.Command;
import com.epam.shop.dao.ProductDao;
import com.epam.shop.entity.Product;
import com.epam.shop.entity.pages.Page;
import com.epam.shop.entity.pages.impl.BackPage;
import com.epam.shop.reader.Reader;
import com.epam.shop.view.View;

import java.util.Map;

/**
 * Implement command find by name
 */
public class findByName implements Command {
    /**
     * Implementation for find by name command
     * @return back page
     */
    @Override
    public Page execute() {
        View view = new View();
        view.askName();
        String name = Reader.nextString();
        ProductDao dao = new ProductDao();
        Map<String,Product> prods = dao.getProduct(name);
        if (prods.isEmpty())
            view.sayIncorrectValue();
        else {
            Product prod = prods.get(name);
            view.printProduct(prod);
        }
        return new BackPage();
    }
}