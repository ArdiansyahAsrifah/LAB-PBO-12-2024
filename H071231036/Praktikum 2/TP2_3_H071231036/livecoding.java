class Cuboid {
    double heigth;
    double width;
    double length;

    double getVolume(){
        return heigth * width * length;
    }
}

public class livecoding{
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.heigth = 15;
        cuboid.width = 20;
        cuboid.length = 30;
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}