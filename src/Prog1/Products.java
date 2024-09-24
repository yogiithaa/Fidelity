package Prog1;

class Product {
    // Data members
    int proID;
    String proName;
    double price;

    // Constructor to initialize the product
    public Product(int proID, String proName, double price) {
        this.proID = proID;
        this.proName = proName;
        this.price = price;
    }

    // Member function to display product details
    public void display() {
        System.out.println("Product ID: " + proID);
        System.out.println("Product Name: " + proName);
        System.out.println("Product Price: Rs. " + price);
        System.out.println("------------------------");
    }
}
