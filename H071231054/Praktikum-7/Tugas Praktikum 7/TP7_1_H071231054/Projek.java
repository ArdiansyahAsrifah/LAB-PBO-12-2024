import java.util.Scanner;

public class Projek extends Kehidupan{
    int inputProjek;

    public void jumlahProjek() {
        Scanner input = new Scanner(System.in);
        System.out.println("Projek IT:");
        System.out.println("1. Minimal 4");
        System.out.println("2. Minimal 8");
        System.out.println("3. Minimal 12");
        System.out.println("4. Lebih dari 15");

        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Input: ");
                inputProjek = Integer.parseInt(input.nextLine());
                if (inputProjek >= 1 && inputProjek <= 4) {
                    validInput = true;
                } else {
                    System.out.println("Pilihan hanya (1-4)...");
                }
            } catch (NumberFormatException e) {
                System.out.println("Inputan harus berupa angka.");
            }
        }
    }

    public int getInputProjek() {
        return inputProjek;
    }

    @Override
    public void prosesKehidupan() {
        switch (inputProjek) {
            case 1:
                System.out.println("4");
                break;
            case 2:
                System.out.println("8");
                break;
            case 3:
                System.out.println("12");
                break;
            case 4:
                System.out.println("15");
                break;
            default:
                break;
        
        }
    }
}
