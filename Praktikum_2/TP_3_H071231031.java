package Praktikum_2;

public class TP_3_H071231031 {
    static class ukuran {
        double height;
        double width;
        double length;

        public double getVolume() {
            return height * width * length;
        }
    }

    public static void main(String[] args) {
        
        ukuran ukuran = new ukuran();
        ukuran.height = 15;
        ukuran.width = 15;
        ukuran.length = 22;

        System.out.printf("Volume = %.2f", ukuran.getVolume());
    }
}
