package com.epam.shop.command.impl.admin;

import com.epam.shop.command.Command;
import com.epam.shop.entity.pages.Page;
import com.epam.shop.entity.pages.impl.BackPage;
import com.epam.shop.reader.Reader;
import com.epam.shop.service.AdminService;
import com.epam.shop.view.View;
/**
 * Implement command change price for admin
 */
public class changePrice implements Command {
    @Override
    public Page execute() {
        View view = new View();
        view.askName();
        String name = Reader.nextString();
        view.askPrice();
        int price = Reader.nextInt();
        AdminService service = new AdminService();
        if (!service.changeProductPrice(name, price))
            view.sayIncorrectValue();
        return new BackPage();
    }
}