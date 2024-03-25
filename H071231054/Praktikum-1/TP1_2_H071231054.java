package Praktikum1;

import java.util.Scanner;

class TP1_2_H071231054 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Masukkan Judul Film :  \n> ");
        String film = scan.nextLine();

        CapitalFirstWord(film);
 
        scan.close();
    }

    public static void CapitalFirstWord(String film) {
        String[] Words = film.split(" ");

        for (String kata : Words) {
            char firstChar = Character.toUpperCase(kata.charAt(0));
            String restWord = kata.substring(1).toLowerCase();

            System.out.print(firstChar + restWord + " ");
        }
    }
}
