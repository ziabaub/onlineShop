package com.epam.shop.view;

import com.epam.shop.entity.Product;

/**
 * This class responsible for displaying data to the user
 */
public class View {
    /**
     * This method asks user about name of product
     */
    public  void  askName(){
        System.out.println("Enter name");
    }

    /**
     * This method asks user about new name of product
     */
    public  void  askNewName(){
        System.out.println("Enter new name");
    }

    /**
     * This method asks user about quality of product
     */
    public  void  askQuantity(){
        System.out.println("Enter quantity");
    }

    /**
     * This method asks user about description of product
     */
    public  void  askDescription(){
        System.out.println("Enter description");
    }

    /**
     * This method asks user about price of product
     */
    public  void  askPrice(){
        System.out.println("Enter price");
    }

    /**
     * This method asks user about reference of product
     */
    public  void  askReference(){
        System.out.println("Enter reference");
    }

    /**
     * This method says user about incorrect value
     */
    public  void  sayIncorrectValue(){
        System.out.println("Incorrect value");
    }

    /**
     * This method asks user about his/her name
     */
    public  void  askUserName(){
        System.out.println("Enter your name");
    }

    /**
     * This method asks user about login
     */
    public  void  askLogin(){
        System.out.println("Enter your login");
    }
    /**
     * This method asks user about his/her password
     */
    public  void  askPassword(){
        System.out.println("Enter your password");
    }

    /**
     * his method print product information
     * @param product product
     */
    public  void  printProduct(Product product){
        System.out.println(product.getReference());
        System.out.println("    *name: " + product.getName());
        System.out.println("    *description: " + product.getDescription());
        System.out.println("    *price: " + product.getPrice());
        System.out.println("    *count: " + product.getQuantity());
    }

    /**
     * This method asks user about his/her role
     */
    public void askRole(){
        System.out.println("enter role ");
        System.out.println("1-admin , 2- client ");
    }
    /**
     *Here method that describes all functions of customer
     */
    public void printClientFunc(){
        System.out.println("1-list of product");
        System.out.println("2-list of product sorted by name");
        System.out.println("3-find product");
        System.out.println("4-buy products");
        System.out.println("0-exit");
    }

    /**
     *Here method that describes all functions of admin
     */
    public void printAdminFunc(){
        System.out.println("1-list of product");
        System.out.println("2-add product");
        System.out.println("3-delete product");
        System.out.println("4-change reference");
        System.out.println("5-change name");
        System.out.println("6-change description");
        System.out.println("7-change price");
        System.out.println("8-change quality");
        System.out.println("9-find by name");
        System.out.println("0-exit");
    }

    /**
     * Here method says welcome to user
     * @param role user's role
     */
    public void printWelcome(String role){
        System.out.println("Welcome " + role + "!");

    }

    /**
     *Here method that describes all functions of guest
     */
    public void printGuestFunc(){
        System.out.println("1-login");
        System.out.println("2-register");
        System.out.println("0-close");
    }
}
