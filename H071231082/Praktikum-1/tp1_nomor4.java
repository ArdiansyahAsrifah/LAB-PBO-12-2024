import java.util.Scanner;

public class tp1_nomor4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan keliling lingkaran : ");
        int jumlah = 0;

        if (input.hasNextInt()) {
            jumlah = input.nextInt();
        } else {
            System.out.print("Input harus angka.");
            System.exit(1);
        }

        double pi = 3.14;
        double l = pi * jumlah * jumlah;
        System.out.printf("%.2f", l);
        input.close();
    }
}
