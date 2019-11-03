package com.epam.shop.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *  There is class that describes users
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Users", propOrder = {
        "users"
})
public class Users implements Serializable {
    /**
     * list of users
     */
    @XmlElement(required = true)
    private List<User> users;

    /**
     * Getter for users
     * @return list of users
     */
    public List<User> getUsers() {
        return users;
    }

    /**
     * Setter for users
     * @param users list of user
     */
    public void setUsers(List<User> users) {
        this.users = users;
    }

    /**
     * Constructor that create new list of users
     */
    Users() {
        users = new ArrayList<>();
    }

    /**
     * Getter for user
     * @param id user's id
     * @return user
     */
    public Optional<User> getUser(Integer id) {
        return users.stream()
                .filter(u-> u.getId()==id)
                .findFirst();
    }

    /**
     * Setter for user
     * @param user user which need to add
     */
    public void setUser(User user) {
        users.add(user);
    }

    /**
     * Check This method check available user
     * @param login user's login
     * @param password user's password
     * @return list of product which have such login and password
     */
    public Optional<User> isAvailable(String login , String password){
        return users.stream()
                .filter(u->password.equals(u.getPassword())
                        && login.equals(u.getLogin()))
                .findFirst();
    }
}
