package Praktikum_1;

import java.util.Scanner;

public class TP_1_H071231031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        String input = "";
        for (int i = 0; i < n; i++) {
            input += scanner.next();
            if (i != n - 1) {
                input += " ";
            }
        }

        String[] parts = input.split(" ");

        int bilanganBulat = 0;
        int bilanganDesimal = 0;

        for (String part : parts) {
            try {
                double bilangan = Double.parseDouble(part);

                if (bilangan % 1 != 0) {
                    bilanganDesimal++;
                } else {
                    bilanganBulat++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Bilangan yang dimasukkan tidak valid!");
            }
        }
        System.out.println();
        System.out.print(bilanganBulat + " Bilangan Bulat, " + bilanganDesimal + " Bilangan Desimal");
    }
}

