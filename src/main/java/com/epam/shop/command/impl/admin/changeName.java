package com.epam.shop.command.impl.admin;

import com.epam.shop.command.Command;
import com.epam.shop.entity.pages.Page;
import com.epam.shop.entity.pages.impl.BackPage;
import com.epam.shop.reader.Reader;
import com.epam.shop.service.AdminService;
import com.epam.shop.view.View;
/**
 * Implement command change name for admin
 */
public class changeName implements Command {
    @Override
    public Page execute() {
        View view = new View();
        view.askName();
        String name = Reader.nextString();
        view.askNewName();
        String newName = Reader.nextString();
        AdminService service = new AdminService();
        if (!service.changeProductName(name, newName))
            view.sayIncorrectValue();
        return new BackPage();
    }
}