import java.util.Scanner;

public class TP1_2_H071231039 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan teks: ");
        String teks = input.nextLine();
        String terkapital = capitalize(teks);
        System.out.println(terkapital);
        input.close();
    }

    public static String capitalize(String input) {
        input = input.toLowerCase();
        String[] kata = input.split(" ");
        String terkapital = "";
        for (int i = 0; i < kata.length; i++) {
            if (i != 0) {
                terkapital += " ";
            }
            terkapital += kata[i].substring(0, 1).toUpperCase() + kata[i].substring(1);
        }
        return terkapital;
    }
}

