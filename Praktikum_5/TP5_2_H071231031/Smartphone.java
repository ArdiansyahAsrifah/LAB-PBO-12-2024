package TP5_2_H071231031;

public class Smartphone extends Product {
    double screenSize;
    int storageCapacity;

    public Smartphone(String brand, int seriesNumber, double price, double screenSize, int storageCapacity) {
        super(brand, seriesNumber, price);
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Screen Size      : %-15s\n", screenSize + " inches");
        System.out.printf("Storage Capacity : %-15s\n", storageCapacity + "GB");
    }
}
