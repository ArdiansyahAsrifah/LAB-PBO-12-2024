package Praktikum3.TP3_2_H071231074;

public class Main {
    public static void main(String[] args) {
        HotWheels mercedesDenz = new HotWheels("Mercebes-Denz",4,20000);

        HotWheels ferharri = new HotWheels();
        ferharri.setName("Ferharri");
        ferharri.setSpeed(4);
        ferharri.setCash(50000);

        System.out.println();
        mercedesDenz.showSpec();
        ferharri.showSpec();

        printBarriers();
        mercedesDenz.upgrade(50000);
        printBarriers();
        ferharri.upgrade(50000);
        printBarriers();

        System.out.println();
        ferharri.showSpec();

        printBarriers();
        ferharri.raceTo(mercedesDenz);
        printBarriers();
        mercedesDenz.raceTo(ferharri);
        printBarriers();

        System.out.println();
        mercedesDenz.showSpec();
        ferharri.showSpec();
    }

    public static void printBarriers() {
        System.out.println("================================");
    }
}
