import java.util.Scanner;

public class Organisasi {
    private String[] organisasi = {"Organisasi A", "Organisasi B", "Organisasi C", "Tidak ada"};

    public void prosesOrganisasi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Organisasi yang pernah diikuti:");
        for (int i = 0; i < organisasi.length; i++) {
            System.out.println((i + 1) + ". " + organisasi[i]);
        }

        System.out.print("Input: ");
        int input = scanner.nextInt();

        try {
            System.out.println("Organisasi yang pernah diikuti: " + organisasi[input - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Organisasi tidak valid.");
        }
    }
}
