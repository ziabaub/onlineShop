package com.epam.shop.command.impl.client;

import com.epam.shop.command.Command;
import com.epam.shop.entity.pages.Page;
import com.epam.shop.entity.pages.impl.BackPage;
import com.epam.shop.reader.Reader;
import com.epam.shop.view.View;
/**
 * Implement command buy product
 */
public class buyProduct implements Command {
    /**
     * Implementation for buy product command
     * @return back page
     */
    @Override
    public Page execute() {
//        View view = new View();
//        view.askName();
//        String name = Reader.nextString();
//        view.askQuantity();
//        Integer quality = Reader.nextInt();
//        ClientService service = new ClientService();
//        if (!service.BuyProduct(name, quality))
//            view.sayIncorrectValue();
         return new BackPage();

    }
}