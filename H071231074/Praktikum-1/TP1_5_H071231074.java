package Tugas;

import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan yang ingin dicari: ");
        try {
            int target = scanner.nextInt(); 
            try {
                boolean ditemukan = false;
                for (int i = 0; i < nums.length; i++) {
                    for (int j = 0; j < nums[i].length; j++) {
                        if (nums[i][j] == target) {
                            System.out.println("Found " + target + " at [" + i + "][" + j + "]");
                            ditemukan = true;
                            break; 
                        }
                    }
                    if (ditemukan) break; 
                }
                if (!ditemukan) {
                    System.out.println("Angka " + target + " tidak ditemukan dalam array.");
                }
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
            } finally {
                scanner.close();
            }
        } catch(Exception e) {
            System.out.println("Masukkan bilangan dengan benar");
        }
        
        
    }
}
