class Smartphone implements Moveable {
    protected int price;
    protected String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println("Smartphone berpindah");
    }
    public void displayInfo() {
        System.out.println("========= Smartphone=========");
        System.out.println("Brand:               " + brand);
        System.out.println("Price:               $" + price);
        System.out.println("===================================");
    }
}
