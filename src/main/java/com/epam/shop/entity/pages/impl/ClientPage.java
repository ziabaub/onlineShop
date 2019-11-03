package com.epam.shop.entity.pages.impl;

import com.epam.shop.command.Command;
import com.epam.shop.command.CommandFactory;
import com.epam.shop.entity.pages.Page;
import com.epam.shop.reader.Reader;
import com.epam.shop.view.View;
/**
 * Implement client page
 */
public class ClientPage implements Page {
    /**
     * Show information for client
     */
    @Override
    public void show() {
        View view = new View();
        view.printWelcome("client");
        int result;
        CommandFactory commandFactory = new CommandFactory();
        while(true) {
            view.printClientFunc();
            result = Reader.nextInt();
            if (result == 0){
                break;
            }
            Command command = commandFactory.getCommand(result+2);
            Page page = command.execute();
            page.show();
        }
    }
}
