class Cuboid{
    double height;
    double width;
    double length;



    double getVolume(){
        return height*width*length;
    }
}

public class livecoding{
    public static void main(String[] args) {
        Cuboid kubus = new Cuboid();
        kubus.height  = 20;
        kubus.width = 15;
        kubus.length = 10;

        System.out.printf("Volume = %.2f", kubus.getVolume());
    }
}




