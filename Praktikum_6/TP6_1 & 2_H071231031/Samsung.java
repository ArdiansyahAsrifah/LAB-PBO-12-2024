class Samsung extends Smartphone {
    public Samsung(int price, String brand) {
        super(price, "Samsung " + brand); // Menambahkan "Samsung " sebelum merek yang diberikan
    }

    public void GalaxyAI() {
        System.out.println("Samsung brand new AI systems");
    }

    public void displayInfo() {
        System.out.println("Smartphone Brand: " + brand);
        System.out.println("Price: $" + price);
    }
}
