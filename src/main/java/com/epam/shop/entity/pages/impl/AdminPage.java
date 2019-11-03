package com.epam.shop.entity.pages.impl;

import com.epam.shop.command.Command;
import com.epam.shop.command.CommandFactory;
import com.epam.shop.entity.pages.Page;
import com.epam.shop.reader.Reader;
import com.epam.shop.view.View;
/**
 * Implement admin's page
 */
public class AdminPage implements Page {
    /**
     * Show information from admin
     */
    public void show() {
        View view = new View();
        view.printWelcome("admin");
        int result;
        CommandFactory commandFactory = new CommandFactory();
        while(true) {

            view.printAdminFunc();
            result = Reader.nextInt();
            if (result == 0){
                break;
            }
            Command command = commandFactory.getCommand(result+6);
            Page page = command.execute();
            page.show();
        }
    }
}
