import java.util.Scanner;

public class Pendidikan {
    private String jenjang;

    public String getJenjang() {
        return jenjang;
    }

    public void pendidikanTerakhir() {
        Scanner scanner = new Scanner(System.in);
        boolean inputValid = false;
        while (!inputValid) {
            System.out.print("Pendidikan terakhir (SD/SMP/SMA/SMK/S1/S2/S3): ");
            jenjang = scanner.nextLine().toUpperCase();

            String[] validJenjang = {"SD", "SMP", "SMA", "SMK", "S1", "S2", "S3"};
            for (String jenjangValid : validJenjang) {
                if (jenjangValid.equals(jenjang)) {
                    inputValid = true;
                    break;
                }
            }

            if (!inputValid) {
                System.out.println("Pilihan pendidikan tidak valid. Silakan masukkan pilihan yang benar.");
            }
        }
    }
}
