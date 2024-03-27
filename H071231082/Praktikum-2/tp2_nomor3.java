class Cuboid {
    double height;
    double width;
    double length;

    double getVolume() {
        return height * width * length;
    }
}

public class tp2_nomor3 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();

        cuboid.height = 23;
        cuboid.width = 32;
        cuboid.length = 54;

        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}

