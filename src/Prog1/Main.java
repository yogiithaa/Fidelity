package Prog1;

public class Main {

    public static void main(String[] args) {
        // Create 5 product objects
        Product product1 = new Product(101, "Laptop", 50000);
        Product product2 = new Product(102, "Smartphone", 15000);
        Product product3 = new Product(103, "Tablet", 25000);
        Product product4 = new Product(104, "Headphones", 2000);
        Product product5 = new Product(105, "Smartwatch", 10000);

        // Display details of the products
        System.out.println("--- Product Details ---");
        product1.display();
        product2.display();
        product3.display();
        product4.display();
        product5.display();
    }
}
