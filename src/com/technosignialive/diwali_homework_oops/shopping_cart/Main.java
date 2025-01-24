package com.technosignialive.diwali_homework_oops.shopping_cart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Create some products
        Product p1 = new Product("Laptop", 999.99, 1);
        Product p2 = new Product("Smartphone", 499.99, 2);
        Product p3 = new Product("Headphones", 89.99, 3);

        // Add products to the shopping cart
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        // List all products
        cart.listProducts();

        // Calculate total price
        double totalPrice = cart.calculateTotalPrice();
        System.out.println("Total Price: $" + totalPrice);

        // Remove a product
        cart.removeProduct("Smartphone");

        // List products after removal
        cart.listProducts();

        // Total price after removal
        totalPrice = cart.calculateTotalPrice();
        System.out.println("Total price after removal: $" + totalPrice);


    }
}
