package Praktikum5.TP5_2_H071231074;

public class Laptop extends Product {
    int ramSize;
    String processorType;

    public Laptop(String brand, int seriesNumber, double price, int ramSize, String processorType) {
        super(brand, seriesNumber, price);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    @Override
    void displayinfo() {
        super.displayinfo();
        System.out.println("Processor Type: " + processorType);
        System.out.println("Ram Size: " + ramSize);
    }
}
