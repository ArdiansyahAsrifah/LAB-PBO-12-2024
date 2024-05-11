import java.util.Scanner;

public class Keluarga {
    private boolean sudahMenikah;

    public boolean isSudahMenikah() {
        return sudahMenikah;
    }

    public void nikah() {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Apakah sudah menikah? (ya/tidak): ");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("ya")) {
                sudahMenikah = true;
                validInput = true;
            } else if (input.equals("tidak")) {
                sudahMenikah = false;
                validInput = true;
            } else {
                System.out.println("Input tidak valid. Masukkan 'ya' atau 'tidak'.");
            }
        }
    }
}
