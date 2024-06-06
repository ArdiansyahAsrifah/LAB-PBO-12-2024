import java.util.InputMismatchException;
import java.util.Scanner;

public class Keluarga{
    String inputStatus;
    Scanner scanner = new Scanner(System.in);

    public void status() {
        boolean valid = false;
        while (!valid) {
            try{
                System.out.print("Apakah sudah menikah? (y/t): ");
                String input = scanner.nextLine().toLowerCase();
                if (input.equalsIgnoreCase("y")){
                    this.inputStatus = "Sudah Menikah";
                    valid = true;
                }else if (input.equalsIgnoreCase("t")){
                    this.inputStatus = "Belum Menikah";
                    valid = true;
                }else{
                    System.out.println("Inputan hanya (y/t)");
                }
            }catch (InputMismatchException e) {
                System.out.println("Pilihan hanya (y/t)!");
                scanner.nextLine(); 
            }
        } 
    }
   
}
