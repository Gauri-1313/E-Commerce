package ECommerce;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("🛒 Welcome to Local Store E-Commerce Platform!");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Remove from Cart");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    store.showProducts();
                    break;
                case 2:
                    System.out.print("Enter Product ID to add: ");
                    int id = sc.nextInt();
                    Product p = store.getProductById(id);
                    if (p != null) cart.addProduct(p);
                    else System.out.println("Invalid Product ID!");
                    break;
                case 3:
                    cart.viewCart();
                    break;
                case 4:
                    System.out.print("Enter Product ID to remove: ");
                    int removeId = sc.nextInt();
                    cart.removeProduct(removeId);
                    break;
                case 5:
                    cart.checkout();
                    break;
                case 6:
                    System.out.println("Thank you for visiting! 😊");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);
        sc.close();
    }
}
