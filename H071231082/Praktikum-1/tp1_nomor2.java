import java.util.Scanner;

public class tp1_nomor2 {

    static String[] getText(Scanner scan) {
        System.out.println("Enter movie title : ");
        String text = scan.nextLine();
        String low = text.toLowerCase(); 
        String[] arr = low.split(" "); 
        return arr;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = getText(scan);

        for (String word : arr) {
            System.out.print(word.substring(0, 1).toUpperCase());
            System.out.print(word.substring(1) + " ");
        }
        scan.close();
    }
}
