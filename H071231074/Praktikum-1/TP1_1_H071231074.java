package Tugas;
import java.util.InputMismatchException;
import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Masukkan jumlah bilangan: ");
            int jumlahBilangan = scan.nextInt();
            scan.nextLine(); // Membuang karakter newline setelah nextInt()

            System.out.print("Masukkan semua bilangan dipisahkan oleh spasi: ");
            String inputLine = scan.nextLine(); // Membaca seluruh baris input

            String[] bilanganStr = inputLine.split("\\s+"); // Memisahkan baris input menjadi array token bilangan

            double[] array = new double[jumlahBilangan]; // Menggunakan tipe data double untuk menyimpan bilangan desimal

            // Mengonversi token-token bilangan dari string menjadi double dan menyimpannya ke dalam array
            for (int i = 0; i < jumlahBilangan; i++) {
                try {
                    array[i] = Double.parseDouble(bilanganStr[i]);
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid: Salah satu bilangan bukan angka.");
                    return; // Menghentikan program jika ada bilangan yang tidak valid
                }
            }

            int bilbul = 0;
            int bildes = 0;

            for (int i = 0; i < jumlahBilangan; i++) {
                // Memeriksa apakah bilangan tersebut merupakan bilangan bulat atau desimal
                if (array[i] % 1 == 0) { // Jika hasil modulo dengan 1 adalah 0, maka bilangan tersebut adalah bilangan bulat
                    bilbul++;
                } else { // Jika bukan, maka bilangan tersebut adalah bilangan desimal
                    bildes++;
                }
            }

            System.out.println(bilbul + " Bilangan Bulat");
            System.out.println(bildes + " Bilangan Desimal");

        } catch (InputMismatchException e) {
            System.out.println("Terjadi kesalahan. Pastikan input berupa bilangan bulat.");
        } finally {
            scan.close();
        }
    }
}
