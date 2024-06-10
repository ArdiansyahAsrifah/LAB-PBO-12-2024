package TP5_2_H071231031;

public class Laptop extends Product {
    int ramSize;
    String processorType;

    public Laptop(String brand, int seriesNumber, double price, int ramSize, String processorType) {
        super(brand, seriesNumber, price);
        this.ramSize = ramSize;
        this.processorType = processorType;
    } 
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("RAM Size      : %-15s\n", ramSize + "GB");
        System.out.printf("Processor Type: %-15s\n", processorType);
    }
}