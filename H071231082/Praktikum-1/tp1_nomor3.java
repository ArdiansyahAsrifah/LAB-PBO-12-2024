import java.util.Scanner;

public class tp1_nomor3 {

    static int[] getY(Scanner scan) {
        System.out.println("Enter date (dd-mm-yy) = ");
        String date = scan.nextLine(); 
        String[] x = date.split("-"); 

        int[] y = new int[3];
        for (int i = 0; i < x.length; i++) {
            y[i] = Integer.parseInt(x[i]);
        }
        return y;
    }

    static void convertDate(int[] y) {
        // Day
        System.out.print(y[0] + " ");

        // Month
        String[] month = {"January", "February", "March", "April", "May", 
                        "June", "July", "August", "September", "October", 
                        "November", "December"};
        System.out.print(month[y[1] - 1] + " ");

        // Year
        if (y[2] >= 0 && y[2] <= 30) {
            System.out.println(2000 + y[2]);
        } else { System.out.println(1900 + y[2]);
    }
}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                int[] y = getY(scan);
                convertDate(y);
                scan.close();
                break;
            } catch (Exception e) {
                System.out.println("invalid input, please try again");
            }
        }
    }
}