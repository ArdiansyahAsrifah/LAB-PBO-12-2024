package Praktikum6;

public class Main {
    public static void main(String[] args) {
        Pitbull pitbull = new Pitbull(0, 50);
        Smartphone smartphone = new Smartphone(1000000, "Samsung");
        Car car = new Car(5, 200, "Merah");

        pitbull.move();
        pitbull.describe();
        smartphone.move();
        smartphone.describes();
        car.move();
        car.describes();
    }
}
