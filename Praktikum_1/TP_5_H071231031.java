package Praktikum_1;

import java.util.Scanner;

public class TP_5_H071231031 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.print("Masukkan bilangan yang ingin dicari: ");
        
        int bilangan;
        try {
            bilangan = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Input tidak valid. Masukkan bilangan bulat.");
            return;
        }

        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == bilangan) {
                    System.out.println("dapat " + bilangan + " di [" + i + "][" + j + "]");
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (!found) {
            System.out.println("Bilangan " + bilangan + " tidak ditemukan dalam array.");
        }
    }
}
