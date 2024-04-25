package TP5_2_H071231031;

public class Product {
    String brand;
    int seriesNumber;
    double price;

    public Product(String brand, int seriesNumber, double price) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
    }
    public void displayInfo() {
        System.out.printf("Brand         : %-15s\n", brand);
        System.out.printf("Series Number : %-15s\n", seriesNumber);
        System.out.printf("Price         : $%-15.2f\n", price);
    }
}
