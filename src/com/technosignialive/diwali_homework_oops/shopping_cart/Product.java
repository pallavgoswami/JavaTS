package com.technosignialive.diwali_homework_oops.shopping_cart;
// 7.	Online Shopping Cart
//	•	Design a Product class with attributes such as name, price, and quantity.
//	Create a ShoppingCart class that allows adding products, removing products, and calculating the total price of items in the cart.
public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int Quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
