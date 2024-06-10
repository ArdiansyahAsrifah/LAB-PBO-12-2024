import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Karyawan karyawan = null;
        List<Karyawan> daftarKaryawan = new ArrayList<>();
        Sound sound = new Sound();

        while (true) {
            System.out.println("========= Data karyawan =========");
            System.out.println("a. Tambah data karyawan");
            System.out.println("b. Tampilkan detail karyawan");
            System.out.println("c. Keluar");
            System.out.print("Pilih opsi (a-c): ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "a":
                    System.out.println("================================");
                    System.out.print("Masukkan nama\t: ");
                    String nama = scanner.nextLine();

                    int umur = 0;
                    boolean validInput = false;
                    while (!validInput) {
                        try {
                            System.out.print("Masukkan umur\t: ");
                            umur = Integer.parseInt(scanner.nextLine());
                            validInput = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Inputan harus berupa angka");
                        }
                    }

                    Keluarga keluarga = new Keluarga();
                    keluarga.status();

                    Pengalaman pengalaman = new Pengalaman();
                    pengalaman.prosesKehidupan();

                    Pendidikan pendidikan = new Pendidikan();
                    pendidikan.prosesKehidupan();

                    Projek projek = new Projek();
                    projek.jumlahProjek();

                    if ((pendidikan.getInputPendidikan() <= 1 || projek.getInputProjek() < 2 || umur < 18
                            || pengalaman.getInputOrganisasi() == "Tidak ada"
                            || pengalaman.getInputPengalaman() <= 0)) {

                        System.out.println("Karyawan tidak memenuhi syarat.");
                        Sound.playSound("sadSound.wav");
                        System.out.println("=================================");
                    } else {
                        System.out.println("Pengalaman sedang diproses....");
                        System.out.println("Pendidikan terakhir\t: " + pendidikan.getJenjang());
                        System.out.print("Jumlah projek IT\t: ");
                        projek.prosesKehidupan();
                        System.out.println();
                        System.out.println("=================================");
                        System.out.println("Selamat, karyawan diterima");
                        System.out.println("=================================");
                        Sound.playSound("funSound.wav");
                        karyawan = new Karyawan(nama, umur, "Karyawan", pengalaman.getGajiSebelumnya(), keluarga.inputStatus);
                        daftarKaryawan.add(karyawan);
                    }
                    break;
                case "b":

                    if (daftarKaryawan.isEmpty()) {
                        System.out.println("=================================");
                        System.out.println("Belum ada data karyawan...");
                        System.out.println("=================================");
                    } else {
                        System.out.println("\n=================================");
                        System.out.println("Detail Karyawan yang Diterima:");
                        for (Karyawan karyawan1 : daftarKaryawan) {
                            karyawan1.displayInfo();
                        }
                    }
                    break;
                case "c":
                    System.out.println("=================================");
                    System.out.println("Program selesai");
                    System.out.println("=================================");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid");
                    System.out.println("=================================");
            }
        }
    }
}
