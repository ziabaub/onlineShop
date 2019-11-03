package com.epam.shop.dao;

import com.epam.shop.entity.User;
import com.epam.shop.entity.Users;
import com.epam.shop.singelton.SingletonOnlineShop;

import java.util.Optional;
/**
 * This class realize UserDAO
 */
public class UserDao {
    private Users users = SingletonOnlineShop.getInstance().getUsers();

    /**
     * Check user in database
     * @param login user's login
     * @param password user's password
     * @return user with data like login and password
     */
    public Optional<User> login(String login , String password){
        return users.isAvailable(login,password);
    }

    /**
     * Register new user
     * @param user user which want registered
     */
    public void register(User user) {
        users.setUser(user);
    }
}
