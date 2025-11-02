package ECommerce;

import java.util.*;

public class Store {
    private List<Product> products;

    public Store() {
        products = new ArrayList<>();
        products.add(new Product(1, "T-shirt", 499.0, "Cotton round neck"));
        products.add(new Product(2, "Shoes", 999.0, "Running sneakers"));
        products.add(new Product(3, "Watch", 1499.0, "Analog wristwatch"));
        products.add(new Product(4, "Cap", 299.0, "Sports cap"));
    }

    public void showProducts() {
        System.out.println("\nAvailable Products:");
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public Product getProductById(int id) {
        for (Product p : products) {
            if (p.getId() == id) return p;
        }
        return null;
    }
}
