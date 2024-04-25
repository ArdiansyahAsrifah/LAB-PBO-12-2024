package TP5_2_H071231031;

public class Camera extends Product {
    int resolution;
    String lensType;

    public Camera(String brand, int seriesNumber, double price, int resolution, String lensType) {
        super(brand, seriesNumber, price);
        this.resolution = resolution;
        this.lensType = lensType;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Resolution  : %-15s\n", resolution + "MP");
        System.out.printf("Lens Type   : %-15s\n", lensType);
    }
}
