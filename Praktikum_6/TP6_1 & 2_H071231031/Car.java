class Car implements Moveable {
    private int totalForward;
    private String color;
    private int maxSpeed;

    public Car(int totalForward, String color, int maxSpeed) {
        this.totalForward = totalForward;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }
    public void displayInfo() {
        System.out.println("========== Mobil ==========");
        System.out.println("Total Forward:       " + totalForward + " km");
        System.out.println("Color:               " + color);
        System.out.println("Max Speed:           " + maxSpeed + " km/h");
        System.out.println("==============================");
    }
}
