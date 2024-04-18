public class TP2_3_H071231054 {

    double height;
    double width;
    double length;

    double getVolume() {
        return height * width * length;
    }
    public static void main(String[] args) {
        TP2_3_H071231054 cuboid = new TP2_3_H071231054();
        cuboid.height = 15;
        cuboid.width = 10;
        cuboid.length = 30;
        
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}