//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.04 at 02:25:15 PM MSK 
//


package com.epam.shop.entity;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Users {

    protected List<User> user;

    public Users() {
        user = new ArrayList<>();
    }

    public List<User> getUser() {
        if (user == null) {
            user = new ArrayList<User>();
        }
        return this.user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    //    /**
//     * Getter for user
//     * @param id user's id
//     * @return user
//     */
//    public Optional<User> getUser(Integer id) {
//        return user.stream()
//                .filter(u-> u.getId()==id)
//                .findFirst();
//    }

    /**
     * Setter for user
     * @param user user which need to add
     */
    public void addUser(User user) {
        this.user.add(user);
    }

    /**
     * Check This method check available user
     * @param login user's login
     * @param password user's password
     * @return list of product which have such login and password
     */
    public Optional<User> isAvailable(String login , String password){
        return user.stream()
                .filter(u->password.equals(u.getPassword())
                        && login.equals(u.getLogin()))
                .findFirst();
    }

}
