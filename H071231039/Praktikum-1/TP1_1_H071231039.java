import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TP1_1_H071231039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan: ");
        int n = scanner.nextInt();

        ArrayList<Double> numbers = new ArrayList<>();
        System.out.println("Masukkan bilangan:");
        

        try {
            for (int i = 0; i < n; i++) {
                double num = scanner.nextDouble();
                numbers.add(num);
            }

            int bulat = 0;
            int desimal = 0;

            for (double num : numbers) {
                if (num % 1 == 0) {
                    bulat++;
                } else {
                    desimal++;
                }
            }

            System.out.println(bulat + " Bilangan Bulat");
            System.out.println(desimal + " Bilangan Desimal");

        } catch (InputMismatchException e) {
            System.out.println("Input yang dimasukkan bukan angka.");
        }
    scanner.close();
    }
    
    
}


