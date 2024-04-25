package Praktikum5.TP5_2_H071231074;

public class Camera extends Product {
    int resolution;
    String lensType;

    public Camera(String brand, int seriesNumber, double price, int resolution, String lensType) {
        super(brand, seriesNumber, price);
        this.resolution = resolution;
        this.lensType = lensType;
    }

    @Override
    void displayinfo() {
        super.displayinfo();
        System.out.println("Resolution: " + resolution);
        System.out.println("Lens Type: " + lensType);
    }
}
