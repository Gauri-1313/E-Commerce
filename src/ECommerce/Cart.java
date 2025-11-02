package ECommerce;

import java.util.*;

public class Cart {
    private List<Product> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addProduct(Product product) {
        items.add(product);
        System.out.println(product.getName() + " added to cart!");
    }

    public void removeProduct(int id) {
        boolean removed = items.removeIf(p -> p.getId() == id);
        if (removed) {
            System.out.println("Product removed from cart.");
        } else {
            System.out.println("Product not found in cart.");
        }
    }

    public void viewCart() {
        if (items.isEmpty()) {
            System.out.println("🛒 Your cart is empty.");
        } else {
            System.out.println("\n🛍️ Your Cart Items:");
            for (Product p : items) {
                System.out.println(p);
            }
            System.out.println("Total Amount: ₹" + getTotal());
        }
    }

    public double getTotal() {
        double sum = 0;
        for (Product p : items) {
            sum += p.getPrice();
        }
        return sum;
    }

    public void checkout() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty. Add products first!");
            return;
        }
        System.out.println("\n✅ Order placed successfully!");
        System.out.println("Total Bill: ₹" + getTotal());
        items.clear();
    }
}
