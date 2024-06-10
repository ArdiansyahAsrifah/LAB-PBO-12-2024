import java.util.Scanner;

public class Pengalaman extends Kehidupan {
    String[] pengalaman = { "Freelancer", "Magang", "Pekerja tetap", "Tidak ada" };
    String organisasi;
    int inputPengalaman;
    double gajiSebelumnya;
    String inputOrganisasi;

    @Override
    void prosesKehidupan() {
        Scanner input = new Scanner(System.in);
        System.out.println("Pengalaman sebelumnya:");
        for (int i = 0; i < pengalaman.length; i++) {
            System.out.println((i + 1) + ". " + pengalaman[i]);
        }

        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Input: ");
                inputPengalaman = Integer.parseInt(input.nextLine());
                if (inputPengalaman >= 1 && inputPengalaman <= pengalaman.length) {
                    validInput = true;
                } else {
                    System.out.println("Pilihan tidak valid");
                }
            } catch (NumberFormatException e) {
                System.out.println("Inputan harus berupa angka");
            }
        }
        if (inputPengalaman != 4) {
            boolean notValidInput = true;
            while (notValidInput) {
                try {
                    System.out.print("Gaji sebelumnya: ");
                    gajiSebelumnya = (int) Integer.parseInt(input.nextLine());
                    notValidInput = false;
                } catch (NumberFormatException e) {
                    System.out.println("Inputan harus berupa angka");
                }
            }
        }
        

        System.out.print("Pengalaman Organisasi: ");
        inputOrganisasi = input.nextLine();
    }

    public int getInputPengalaman() {
        return inputPengalaman;
    }

    public double getGajiSebelumnya() {
        return gajiSebelumnya;
    }

    public String getInputOrganisasi() {
        return inputOrganisasi;
    }
}