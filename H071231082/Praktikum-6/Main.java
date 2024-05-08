interface Move {
    void move();
}

abstract class Dog implements Move {
    int position;
    int averageLength;

    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    abstract void describe();
}

class Pitbull extends Dog {
    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.position += 3;
    }

    @Override
    public void describe() {
        System.out.println("Pitbull, kuat dan berotot.");
    }
}

class SiberianHusky extends Dog {
    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.position += 2;
    }

    @Override
    public void describe() {
        System.out.println("Siberian husky, energetik dan bersahabat.");
    }
}

class Bulldog extends Dog {
    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.position += 1;
    }

    @Override
    public void describe() {
        System.out.println("Bulldog, pendek, tangguh dan loyal");
    }
}

class GermanShepherd extends Dog {
    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.position += 3;
    }

    @Override
    public void describe() {
        System.out.println("German shepherd, pintar dan serbaguna.");
    }
}

class Smartphone implements Move {
    int price;
    String brand;
    
    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public void move() {
        System.out.println("smartphone bergerak");
    }
}

class Car implements Move {
    int totalForwardGear, maxSpeed;
    String color;

    Car(int totalForwardGear, int maxSpeed, String color) {
        this.totalForwardGear = totalForwardGear;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public void move() {
        System.out.println("mobil berakselerasi");
    }
}

public class Main {
    public static void main(String[] args) {
        GermanShepherd germanShepherd = new GermanShepherd(1, 65);
        germanShepherd.move();
        germanShepherd.describe();
        System.out.println("panjang rata-rata : " + germanShepherd.averageLength + " cm");
        System.out.println("posisi baru german shepherd : " + germanShepherd.position);

        Bulldog guguk = new Bulldog(1, 32);
        guguk.move();
        guguk.describe();
        System.out.println("panjang rata-rata : " + guguk.averageLength + " cm");
        System.out.println("posisi baru bulldog : " + guguk.position);

        Smartphone samsung = new Smartphone(10000, "Samsung");
        samsung.move();

        Car car = new Car(5, 120, "black");
        car.move();
    }
}
