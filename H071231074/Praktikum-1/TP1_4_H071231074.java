package Tugas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan jari-jari lingkaran: ");
            double jariJari = scanner.nextDouble();

            double luas = hitungLuasLingkaran(jariJari);
            System.out.printf("Luas lingkaran adalah %.2f\n", luas);

        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid: Harap masukkan angka.");
        } finally {
            scanner.close();
        }
    }

    public static double hitungLuasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }
}
