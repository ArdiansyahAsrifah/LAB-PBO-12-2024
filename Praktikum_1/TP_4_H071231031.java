package Praktikum_1;

import java.util.Scanner;

public class TP_4_H071231031 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            if (input.hasNextDouble()) {
                double r = input.nextDouble();
                double luas = Math.PI * r * r;
                System.out.printf("Luas lingkaran: %.2f\n", luas);
            } else {
                System.out.println("Input yang dimasukkan bukan angka.");
            }

            input.close(); 
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan ");
        }
    }
}
