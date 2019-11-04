package com.epam.shop.command.impl.admin;

import com.epam.shop.command.Command;
import com.epam.shop.entity.pages.Page;
import com.epam.shop.entity.pages.impl.BackPage;
import com.epam.shop.reader.Reader;
import com.epam.shop.view.View;
/**
 * Implement command change quality for admin
 */
public class changeQuantity implements Command {
    /**
     * Implementation for change quality command
     * @return back page
     */
    @Override
    public Page execute() {
//        View view = new View();
//        view.askName();
//        String name = Reader.nextString();
//        view.askQuantity();
//        int quality = Reader.nextInt();
//        AdminService service = new AdminService();
//        if (!service.changeProductQuantity(name, quality))
//            view.sayIncorrectValue();
        return new BackPage();
    }
}