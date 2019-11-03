package com.epam.shop.command.impl;

import com.epam.shop.command.Command;
import com.epam.shop.entity.User;
import com.epam.shop.entity.pages.Page;
import com.epam.shop.entity.pages.PageFactory;
import com.epam.shop.entity.pages.impl.BackPage;
import com.epam.shop.reader.Reader;
import com.epam.shop.service.UserService;
import com.epam.shop.view.View;

import java.util.Optional;

/**
 * Implement command login
 */
public class LoginCommand implements Command {
    /**
     * Implementation for find by name command
     * @return if login was success return user page, else return back page
     */
    @Override
    public Page execute() {
        UserService service = new UserService();
        View view = new View();
        view.askLogin();
        String login = Reader.nextString();
        view.askPassword();
        String password = Reader.nextString();
        Optional<User> user= service.login(login,password);
        if (user.isPresent()){
            User u = user.get();
            PageFactory factory = new PageFactory();
            return factory.getPage(u.getRole());
        }
        return new BackPage();
    }

}
