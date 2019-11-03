package com.epam.shop.command.impl.admin;

import com.epam.shop.command.Command;
import com.epam.shop.entity.pages.Page;
import com.epam.shop.entity.pages.impl.BackPage;
import com.epam.shop.reader.Reader;
import com.epam.shop.service.AdminService;
import com.epam.shop.view.View;
/**
 * Implement command change description for admin
 */
public class changeDescription implements Command {
    @Override
    public Page execute() {
        View view = new View();
        view.askName();
        String name = Reader.nextString();
        view.askDescription();
        String description = Reader.nextString();
        AdminService service = new AdminService();
        if (!service.changeProductDescription(name, description))
            view.sayIncorrectValue();
        return new BackPage();
    }
}
