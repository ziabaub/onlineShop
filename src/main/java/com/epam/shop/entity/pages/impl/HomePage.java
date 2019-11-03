package com.epam.shop.entity.pages.impl;

import com.epam.shop.command.Command;
import com.epam.shop.command.CommandFactory;
import com.epam.shop.entity.pages.Page;
import com.epam.shop.reader.Reader;
import com.epam.shop.view.View;
/**
 * Implement home page
 */
public class HomePage implements Page {
    @Override
    public void show() {
        View view = new View();
        view.printWelcome("guest");
        int result;
        CommandFactory commandFactory = new CommandFactory();
        while(true) {
            view.printGuestFunc();
            result = Reader.nextInt();
            if (result ==0){
                break;
            }
            Command command = commandFactory.getCommand(result);
            Page page = command.execute();
            page.show();
        }

    }
}
