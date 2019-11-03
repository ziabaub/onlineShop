package com.epam.shop.command.impl.admin;

import com.epam.shop.command.Command;
import com.epam.shop.entity.pages.Page;
import com.epam.shop.entity.pages.impl.BackPage;
import com.epam.shop.reader.Reader;
import com.epam.shop.service.AdminService;
import com.epam.shop.view.View;

/**
 * Implement command add product for admin
 */
public class addProduct implements Command {
    @Override
    public Page execute() {
        View view = new View();
        view.askReference();
        String reference = Reader.nextString();
        view.askName();
        String name = Reader.nextString();
        view.askDescription();
        String description = Reader.nextString();
        view.askQuantity();
        Integer quantity = Reader.nextInt();
        view.askPrice();
        Integer price = Reader.nextInt();
        AdminService service = new AdminService();
        if (!service.addProduct(reference,name,description, quantity, price))
            view.sayIncorrectValue();
        return new BackPage();
    }
}