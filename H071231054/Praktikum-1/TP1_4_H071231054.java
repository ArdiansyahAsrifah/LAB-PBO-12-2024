package Praktikum1;

import java.util.Scanner;
 
class TP1_4_H071231054 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Masukkan jari-jari lingkaran: ");
            double jariJari = scan.nextDouble();
            double luas = hitungLuasLingkaran(jariJari);
            System.out.printf("Luas lingkaran: %.2f\n", luas);
        } catch (Exception e) {
            System.out.println("Input bukan angka. Silakan coba lagi.");
        }
        scan.close();
    }

    public static double hitungLuasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }
}
