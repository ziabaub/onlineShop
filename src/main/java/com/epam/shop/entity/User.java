package com.epam.shop.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;

/**
 *  There is class that describes user
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
        "name",
        "login",
        "password",
        "role"
})
public class User extends Entity {
    /**
     * User's name
     */
    @XmlElement(required = true)
    private String name;
    /**
     * User's login
     */
    @XmlElement(required = true)
    private String login;
    /**
     * User's password
     */
    @XmlElement(required = true)
    private String password;
    /**
     * User's role
     */
    @XmlElement(required = true)
    private String role;
    /**
     * Getter for name
     * @return product name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name
     * @param name user's name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Getter for login
     * @return product login
     */
    public String getLogin() {
        return login;
    }

    /**
     * Setter for login
     * @param login user's login
     */
    public void setLogin(String login) {
        this.login = login;
    }
    /**
     * Getter for password
     * @return product password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter for password
     * @param password user's password
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * Getter for role
     * @return product role
     */
    public String getRole() {
        return role;
    }

    /**
     * Setter for role
     * @param role user's role
     */
    public void setRole(String role) {
        this.role = role;
    }
    /**
     * Compare object with this user
     * @param o object with which it will be compare
     * @return it will return true if objects are equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(login, user.login) &&
                Objects.equals(password, user.password) &&
                Objects.equals(role, user.role);
    }
    /**
     * Do hash code
     * @return hash code of user
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, login, password, role);
    }
}
