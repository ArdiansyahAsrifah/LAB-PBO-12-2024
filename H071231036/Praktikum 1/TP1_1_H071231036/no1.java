import java.util.Scanner;

public class BilanganChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahBilanganBulat = 0;
        int jumlahBilanganDesimal = 0;

        System.out.print("Masukkan jumlah bilangan: ");
        int n = scanner.nextInt();

        System.out.println("Masukkan " + n + " bilangan: ");
        for (int i = 0; i < n; i++) {
            try {
                double bilangan = scanner.nextDouble();

                if (bilangan == Math.floor(bilangan)) {
                    jumlahBilanganBulat++;
                } else {
                    jumlahBilanganDesimal++;
                }
            } catch (Exception e) {
                System.out.println("Input bukan angka, silakan coba lagi.");
                scanner.next(); 
                i--; 
            }
        }

        System.out.println(jumlahBilanganBulat + " Bilangan Bulat");
        System.out.println(jumlahBilanganDesimal + " Bilangan Desimal");
    }
}

