package Praktikum1;

import java.util.Scanner;

class TP1_1_H071231054 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();

        String input = scan.nextLine();

        String[] bilanganStrings = input.split(" ");
        scan.close();

        if (bilanganStrings.length != n) {
            System.out.println("Input tidak valid: Jumlah bilangan tidak sesuai");
            return;
        }

        int BilanganBulat = 0;
        int BilanganDesimal = 0;

        for (String bilanganStr : bilanganStrings) {
            try {
                double bilangan = Double.parseDouble(bilanganStr);
                if (bilangan % 1 == 0) {
                    BilanganBulat++;
                } else {
                    BilanganDesimal++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input bukan angka, silakan coba lagi.");
                return; 
            }
        }

        System.out.println(BilanganBulat + " Bilangan Bulat");
        System.out.println(BilanganDesimal + " Bilangan Desimal");

    }
}

