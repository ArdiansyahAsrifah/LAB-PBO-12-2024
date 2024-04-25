package Praktikum5.TP5_2_H071231074;

public class Smartphone extends Product {
    double screenSize;
    int storageCapacity;

    public Smartphone(String brand, int seriesNumber, double price, double screenSize, int storageCapacity) {
        super(brand, seriesNumber, price);
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }

    @Override
    void displayinfo() {
        super.displayinfo();
        System.out.println("Screen Size: " + screenSize);
        System.out.println("Storage Capacity: " + storageCapacity);
    }
}
