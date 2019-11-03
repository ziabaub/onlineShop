package com.epam.shop.command.impl.admin;

import com.epam.shop.command.Command;
import com.epam.shop.entity.pages.Page;
import com.epam.shop.entity.pages.impl.BackPage;
import com.epam.shop.reader.Reader;
import com.epam.shop.service.AdminService;
import com.epam.shop.view.View;
/**
 * Implement command change reference for admin
 */
public class changeReference implements Command {
    /**
     * Implementation for change reference command
     * @return back page
     */
    @Override
    public Page execute() {
        View view = new View();
        view.askName();
        String name = Reader.nextString();
        view.askReference();
        String reference = Reader.nextString();
        AdminService service = new AdminService();
        if (!service.changeProductReference(name, reference))
            view.sayIncorrectValue();
        return new BackPage();
    }
}