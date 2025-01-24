package com.technosignialive.diwali_homework_oops.shopping_cart;

import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Added: " + product);
    }

    public void removeProduct(String productName) {
        Product productToRemove = null;
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                productToRemove = product;
                break;
            }
        }

        if (productToRemove != null) {
            products.remove(productToRemove);
            System.out.println("Removed: " + productToRemove);
        } else {
            System.out.println("Product not found: " + productName);
        }
    }

    public double calculateTotalPrice() {
        double total = 0.0;
        for (Product product : products) {
            total += product.getPrice() * product.getQuantity();
        }
        return total;
    }

    public void listProducts() {
        if (products.isEmpty()) {
            System.out.println("Shopping cart is empty.");
        } else {
            System.out.println("Products in the cart:");
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }
}
