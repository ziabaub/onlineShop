package com.epam.shop.entity;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;

/**
 *  There is class that describes product
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", propOrder = {
        "reference",
        "name",
        "description",
        "quantity",
        "price"
})
public class Product extends Entity implements Comparable<Product> {
    /**
     * Product reference
     */
    @XmlElement(required = true)
    private String reference;
    /**
     * Product name
     */
    @XmlElement(required = true)
    private String name;
    /**
     * Product description
     */
    @XmlElement(required = true)
    private String description;
    /**
     * Product quality
     */
    @XmlElement(required = true)
    private int quantity;
    /**
     * Product price
     */
    @XmlElement(required = true)
    private int price;

    /**
     * Getter for reference
     * @return product reference
     */
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
    /**
     * Getter for name
     * @return product name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name
     * @param name product name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Getter for description
     * @return product description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter for description
     * @param description product description
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Getter for quantity
     * @return product reference
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Setter for quantity
     * @param quantity product quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    /**
     * Getter for price
     * @return product price
     */
    public int getPrice() {
        return price;
    }

    /**
     * Setter for price
     * @param price product price
     */
    public void setPrice(int price) {
        this.price = price;
    }
    /**
     * Compare object with this product
     * @param o object with which it will be compare
     * @return it will return true if objects are equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(reference, product.reference) &&
                Objects.equals(name, product.name) &&
                Objects.equals(description, product.description) &&
                Objects.equals(quantity, product.quantity);
    }
    /**
     * Do hash code
     * @return hash code of product
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), reference, name, description, quantity, price);
    }

    /**
     * Compare product by name
     * @param prod product with witch needs to compare this product
     * @return it will return 0, if names are equal. It will return positive value, if current product name lager than prod name.
     * Otherwise, it will return negative value
     */
    @Override
    public int compareTo(Product prod) {
        return price-prod.getPrice();
    }
}
