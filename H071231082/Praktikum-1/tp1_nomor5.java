import java.util.Scanner;

public class tp1_nomor5 {

    static void finder(int[][] nums, int x) {
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == x) {
                    System.out.println("Found " + x + " at [" + i + "][" + j + "]");
                    found = true;
                    break; 
                }
            }
            if (found) {
                break;
            }
        }
        if (!found) {
            System.out.println(x + " Not found");
        }
    }                    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.print("Enter a number = ");
        int x = input.nextInt();
        finder(nums, x);
        input.close();
    }
}