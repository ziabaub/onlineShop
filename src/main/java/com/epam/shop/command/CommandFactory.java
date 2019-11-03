package com.epam.shop.command;

import com.epam.shop.command.impl.LoginCommand;
import com.epam.shop.command.impl.RegisterCommand;
import com.epam.shop.command.impl.GoToHomePage;
import com.epam.shop.command.impl.admin.*;
import com.epam.shop.command.impl.client.buyProduct;
import com.epam.shop.command.impl.findByName;
import com.epam.shop.command.impl.client.showListByPrice;
import com.epam.shop.command.impl.showList;

/**
 * Factory for command
 */
public class CommandFactory {

    /**
     * Defined command
     * @param number number of command
     * @return command with user want do
     */
    public Command getCommand(int number) {
        switch (number) {
            case 1:
                return new LoginCommand();
            case 2:
                return new RegisterCommand();
            case 3:
            case 7:
                return new showList();
            case 4:
                return new showListByPrice();
            case 15:
            case 5:
                return  new findByName();
            case 6:
                return  new buyProduct();
            case 8:
                return  new addProduct();
            case 9:
                return new deleteProduct();
            case 10:
                return new changeReference();
            case 11:
                return  new changeName();
            case 12:
                return  new changeDescription();
            case 13:
                return new changePrice();
            case 14:
                return new changeQuantity();
            default:
                return new GoToHomePage();
        }
    }
}
