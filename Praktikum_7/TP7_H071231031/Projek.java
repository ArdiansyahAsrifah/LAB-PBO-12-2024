import java.util.Scanner;

public class Projek {
    private int input;

    public int getInput() {
        return input;
    }

    public void jumlahProjek() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Projek IT:");
        System.out.println("1. Minimal 4");
        System.out.println("2. Minimal 8");
        System.out.println("3. Minimal 12");
        System.out.println("4. Lebih dari 15");
        System.out.print("Input: ");
        input = scanner.nextInt();

        if (input < 1 || input > 4) {
            System.out.println("Input tidak valid.");
            input = 0;
        }
    }
}
