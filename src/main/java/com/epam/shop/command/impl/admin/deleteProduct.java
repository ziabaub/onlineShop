package com.epam.shop.command.impl.admin;

import com.epam.shop.command.Command;
import com.epam.shop.entity.pages.Page;
import com.epam.shop.entity.pages.impl.BackPage;
import com.epam.shop.reader.Reader;
import com.epam.shop.service.AdminService;
import com.epam.shop.view.View;
/**
 * Implement command delete product for admin
 */
public class deleteProduct implements Command {
    /**
     * Implementation for delete product command
     * @return back page
     */
    @Override
    public Page execute() {
        View view = new View();
        view.askName();
        String name = Reader.nextString();
                AdminService service = new AdminService();
        service.deleteProduct(name);
        return new BackPage();
    }
}