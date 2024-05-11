import java.util.Scanner;

public class Pengalaman extends Kehidupan {
    private String[] pengalaman = {"Freelancer", "Magang", "Pekerja tetap", "Tidak ada"};

    @Override
    public void prosesKehidupan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pengalaman sebelumnya:");
        for (int i = 0; i < pengalaman.length; i++) {
            System.out.println((i + 1) + ". " + pengalaman[i]);
        }

        System.out.print("Input: ");
        int input = scanner.nextInt();

        try {
            System.out.println("Pengalaman sebelumnya: " + pengalaman[input - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Pengalaman tidak valid.");
        }
    }
}
