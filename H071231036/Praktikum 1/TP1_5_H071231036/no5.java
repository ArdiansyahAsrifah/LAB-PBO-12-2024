import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        boolean found = false;

        try {
            System.out.print("Masukkan bilangan yang ingin dicari: ");
            int target = scanner.nextInt();

            for (int i = 0; i < nums.length && !found; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] == target) {
                        System.out.println("Found " + target + " at [" + i + "][" + j + "]");
                        found = true; 
                        break;
                    }
                }
            }

            if (!found) {
                System.out.println("Bilangan " + target + " tidak ditemukan dalam array.");
            }
        } catch (Exception e) {
            System.out.println("Input bukan angka. Silakan masukkan angka.");
        }
    }
}

