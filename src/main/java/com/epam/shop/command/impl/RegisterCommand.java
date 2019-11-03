package com.epam.shop.command.impl;

import com.epam.shop.command.Command;
import com.epam.shop.entity.User;
import com.epam.shop.entity.pages.Page;
import com.epam.shop.entity.pages.impl.BackPage;
import com.epam.shop.reader.Reader;
import com.epam.shop.service.UserService;
import com.epam.shop.view.View;
/**
 * Implement command registration
 */
public class RegisterCommand implements Command {
    /**
     * Implementation for registration command
     * @return back page
     */
    @Override
    public Page execute() {
        UserService service = new UserService();
        User user = new User();
        View view = new View();
        view.askUserName();
        String name = Reader.nextString();
        user.setName(name);
        view.askLogin();
        String login = Reader.nextString();
        user.setLogin(login);
        view.askPassword();
        String password = Reader.nextString();
        user.setPassword(password);
        view.askRole();
        int role = Reader.nextInt();
        if (role ==1){
            user.setRole("admin");
        }else if (role ==2){
            user.setRole("client");
        }else {
            view.sayIncorrectValue();
            return new BackPage();
        }

        service.register(user);

        return new BackPage();
    }
}
