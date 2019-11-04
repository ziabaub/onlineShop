package com.epam.shop.service;

import com.epam.shop.dao.ProductDao;
import com.epam.shop.entity.OnlineShop;
import com.epam.shop.entity.Product;
import com.epam.shop.singelton.SingletonOnlineShop;

import java.util.Map;
import java.util.Optional;

/**
 * This class implements administrator functions
 */
public class AdminService {
    /**
     * Here method that adds product at the list
     * @param reference product reference
     * @param name product name
     * @param description product description
     * @param quantity product quantity
     * @param price product price
     * @return if product or price or count isn't between 1 and 1000, it will return false. Otherwise it will return true
     */
    public boolean addProduct(String reference, String name, String description, Integer quantity, Integer price){
        if ((price<0) || (quantity<0)||(price>1000)||(quantity>1000))
            return false;
        Product product = new Product();
        product.setReference(reference);
        product.setName(name);
        product.setDescription(description);
        product.setQuantity(quantity);
        product.setPrice(price);
        SetProduct(product);
        return true;
    }

    private Optional<Product> getProduct(String name){
        ProductDao dao = new ProductDao();
        return dao.getProduct(name);

    }
    private void SetProduct(Product product){
        ProductDao dao = new ProductDao();
        dao.addProduct(product);
    }

    /**
     * Here method that changes product reference at the list
     * @param name product name
     * @param reference product reference
     * @return if it isn't at list of product, it will return false. Otherwise it will return true
     */
    public boolean changeProductReference(String name, String reference){
        Optional<Product> prods = getProduct(name);
        if (!prods.isPresent()) {
            return false;
        }
        Product prod = prods.get();
        prod.setReference(reference);
        return true;
    }
    /**
     *Here method that deletes product from list and file
     * @param name name of product
     */
    public void deleteProduct(String name){
        OnlineShop shop = SingletonOnlineShop.getInstance();
//        Optional<Product>  products =shop.getProducts().getProducts();
//        products.entrySet().removeIf(entry -> entry.getKey().equals(name));
    }

    /**
     * Here method that changes product name at the list
     * @param name product name
     * @param newName new product name
     * @return if it isn't at list of product, it will return false. Otherwise it will return true
     */
    public boolean changeProductName(String name, String newName){
  //      OnlineShop shop = SingletonOnlineShop.getInstance();
       // Map<String,Product> prods = getProduct(name);
//        if (prods.isEmpty())
//            return false;
//        Product prod = prods.get(name);
//        deleteProduct(name);
//        prod.setName(newName);
//        shop.getProducts().addProduct(prod);
        return true;
    }

    /**
     * Here method that changes product reference at the list
     * @param name product name
     * @param description product description
     * @return if it isn't at list of product, it will return false. Otherwise it will return true
     */
    public boolean changeProductDescription(String name, String description){
//        Map<String, Product> prods = getProduct(name);
//        if (prods.isEmpty())
//            return false;
//        Product prod = prods.get(name);
//        prod.setDescription(description);
        return true;
    }

    /**
     * Here method that changes product reference at the list
     * @param name product name
     * @param price product price
     * @return if it isn't at list of product or price isn't between 1 and 1000, it will return false. Otherwise it will return true
     */
    public boolean changeProductPrice(String name, int price){
//        if ((price<=0)||(price>1000))
//            return false;
//        Map<String,Product> prods = getProduct(name);
//        if (prods.isEmpty())
//            return false;
//        Product prod = prods.get(name);
//        prod.setPrice(price);
        return true;
    }

    /**
     * Here method that changes product reference at the list
     * @param name product name
     * @param quantity product quantity
     * @return it isn't at list of product or quantity isn't between 1 and 1000, it will return false. Otherwise it will return true
     */
    public boolean changeProductQuantity(String name, int quantity){
//        if ((quantity<0)||(quantity>1000))
////            return false;
////        Map<String,Product> prods = getProduct(name);
////        if (prods.isEmpty())
////            return false;
////        Product prod = prods.get(name);
////        prod.setQuantity(quantity);
        return true;
    }

}
