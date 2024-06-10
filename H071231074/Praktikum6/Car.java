package Praktikum6;

public class Car implements iMove {
    private int totalForwardGear, maxSpeed;
    private String color;
    
    public Car(int totalForwardGear, int maxSpeed, String color) {
        this.totalForwardGear = totalForwardGear;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    @Override
    public void move() {
        System.out.println("Mobil sedang berakselerasi");   
    }

    @Override
    public void describes() {
        System.out.println("Car: Color - " + color + ", Max Speed - " + maxSpeed + " km/h");
    }

    public int getTotalForwardGear() {
        return totalForwardGear;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }
}
