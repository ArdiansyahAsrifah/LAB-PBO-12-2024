import java.util.Scanner;

public class tp1_nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        int expectedCount = input.nextInt();

        if (expectedCount <= 0) {
            System.out.println("Error: Please enter a positive number of values.");
            return;
        }

        int actualCount = 0;
        int bulat = 0;
        int desimal = 0;

        for (int i = 0; i < expectedCount; i++) {
            System.out.println("");
            double hitung = input.nextDouble();

            actualCount++; 

            if (hitung == (int) hitung) {
                bulat++;
            } else {
                desimal++;
            }
        }

        input.close();

        if (actualCount != expectedCount) {
            System.out.println("Error: You entered " + actualCount + " values, but expected " + expectedCount + ".");
        } else {
            System.out.println(bulat + " bilangan bulat" + "\n" + desimal + " bilangan desimal");
        }
    }
}
