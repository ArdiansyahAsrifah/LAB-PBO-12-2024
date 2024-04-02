import java.util.Scanner;

public class no2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan judul film:");
        String title = scanner.nextLine();
        String capitalizedTitle = capitalizeTitle(title);
        System.out.println("Judul Film dengan Kapitalisasi: " + capitalizedTitle);
    }

    public static String capitalizeTitle(String title) {
        StringBuilder capitalizedTitle = new StringBuilder();
        boolean capitalizeNext = true;

        for (char ch : title.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                ch = Character.toUpperCase(ch);
                capitalizeNext = false;
            } else {
                ch = Character.toLowerCase(ch);
            }
            capitalizedTitle.append(ch);
        }

        return capitalizedTitle.toString();
    }
}

