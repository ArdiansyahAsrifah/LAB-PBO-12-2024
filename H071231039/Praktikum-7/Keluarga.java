import java.util.Scanner;

public class Keluarga {
    boolean sudahMenikah;

    public void prosesNikah() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Apakah sudah menikah? (y/t): ");
        String input = scanner.nextLine().toLowerCase();
        sudahMenikah = input.equals("y");
    }

    public void SudahMenikah() {
        if (sudahMenikah == true) {
            System.out.println("Status\t: Sudah menikah");
        } else {
            System.out.println("Status\t: Belum menikah");
        }

    }
}
