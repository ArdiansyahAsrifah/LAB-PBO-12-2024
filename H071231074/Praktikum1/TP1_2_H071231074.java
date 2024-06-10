package Praktikum1;
import java.util.Scanner;;

public class TP1_2_H071231074 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan Judul Film : ");
        String input = scan.nextLine();

        String hasil = HurufKapital(input);

        System.out.println(hasil);

        scan.close();
    }

    public static String HurufKapital(String input) {
        String[] kalimat = input.split("\\s+");
        String result = "";
        
        for (String kata : kalimat) {
            if (!kata.isEmpty()) {
                String firstLetter = kata.substring(0, 1).toUpperCase();
                String restOfWord = kata.substring(1).toLowerCase();
                result += firstLetter + restOfWord + " ";
            }
        }
        
        return result;
    }
}
