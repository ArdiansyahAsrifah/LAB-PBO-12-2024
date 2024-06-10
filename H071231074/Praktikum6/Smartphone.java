package Praktikum6;

public class Smartphone implements iMove {
    private int price;
    private String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println("Smartphone berpindah");
    }

    @Override
    public void describes() {
        System.out.println("Smartphone: Brand - " + brand + ", Price - Rp." + price);
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }
}
