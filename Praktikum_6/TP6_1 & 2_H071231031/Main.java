public class Main {
    public static void main(String[] args) {
        Avanza avanza = new Avanza(0, "Silver", 180);

        Rubicon rubicon = new Rubicon(0, "Black", 220);

        Jeep jeep = new Jeep(0, "Red", 200);

        Samsung samsung = new Samsung(800, "Fold Z");

        Pitbull pitbull = new Pitbull(0, 60);

        System.out.println("=== Cars ===");
        avanza.move();
        avanza.playMusic();

        rubicon.move();
        rubicon.offRoad();

        jeep.move();
        jeep.fourWheelDrive();

        System.out.println("=== Smartphone ===");
        samsung.displayInfo();
        samsung.move();
        samsung.GalaxyAI();

        System.out.println("=== Dog ===");
        pitbull.move();
        pitbull.describe();
    }
}
