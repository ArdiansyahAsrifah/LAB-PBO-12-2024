interface Movable {
    void move();
    void describe();
}

abstract class Dog implements Movable {
    int position;
    int averageLength;

    Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    public abstract void move();
    public abstract void describe();
}

class SiberianHusky extends Dog {
    SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position += 2;
        System.out.println("Siberian Husky berpindah ke posisi " + position);
    }

    @Override
    public void describe() {
        System.out.println("Siberian Husky adalah jenis anjing pekerja berukuran sedang yang berasal dari Asia Timur Laut.");
    }
}

class Bulldog extends Dog {
    Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position += 1;
        System.out.println("Bulldog berpindah ke posisi " + position);
    }

    @Override
    public void describe() {
        System.out.println("Bulldog adalah jenis anjing berukuran sedang yang biasa disebut sebagai English Bulldog atau British Bulldog.");
    }
}

class GermanShepherd extends Dog {
    GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position += 3;
        System.out.println("German Shepherd berpindah ke posisi " + position);
    }

    @Override
    public void describe() {
        System.out.println("German Shepherd adalah jenis anjing pekerja berukuran sedang hingga besar yang berasal dari Jerman.");
    }
}

class Smartphone implements Movable {
    int price;
    String brand;

    Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println("Smartphone berpindah");
    }

    @Override
    public void describe() {
        System.out.println("Merek smartphone: " + brand + ", Harga: " + price);
    }
}

class Car implements Movable {
    int totalForwardGear;
    String color;
    int maxSpeed;

    Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }

    @Override
    public void describe() {
        System.out.println("Warna mobil: " + color + ", Kecepatan Maksimum: " + maxSpeed + "km/jam, Jumlah Gear Maju: " + totalForwardGear);
    }
}

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(5000, "iPhone");
        smartphone.move();
        smartphone.describe();

        Car car = new Car(6, "Hitam", 240);
        car.move();
        car.describe();

        Dog husky = new SiberianHusky(0, 60);
        husky.move();
        husky.describe();
    }
}
