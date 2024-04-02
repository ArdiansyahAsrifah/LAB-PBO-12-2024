import java.util.InputMismatchException;
import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan jari-jari lingkaran: ");
            double jariJari = scanner.nextDouble();

            double luas = Math.PI * jariJari * jariJari;
            System.out.printf("Luas lingkaran adalah: %.2f\n", luas);
        } catch (InputMismatchException e) {
            System.out.println("Error: Anda harus memasukkan angka. Silakan coba lagi.");
        }
    }
}
