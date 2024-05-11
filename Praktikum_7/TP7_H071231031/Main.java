import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Karyawan karyawan = null;
        boolean exit = false;

        while (!exit) {
            System.out.println("Data karyawan:");
            System.out.println("a. Tambah data karyawan");
            System.out.println("b. Tampilkan detail karyawan");
            System.out.println("c. Keluar");
            System.out.print("Pilih opsi (a-c): ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "a":
                    karyawan = tambahDataKaryawan();
                    break;
                case "b":
                    tampilkanDetailKaryawan(karyawan);
                    break;
                case "c":
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static Karyawan tambahDataKaryawan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        int umur = 0;
        boolean validUmur = false;
        while (!validUmur) {
            try {
                System.out.print("Masukkan umur: ");
                umur = scanner.nextInt();
                validUmur = true;
            } catch (InputMismatchException e) {
                System.out.println("Input umur harus berupa angka integer.");
                scanner.nextLine(); 
            }
        }

        Karyawan karyawan = new Karyawan(nama, umur);
        Pengalaman pengalaman = new Pengalaman();
        Pendidikan pendidikan = new Pendidikan();
        Projek projek = new Projek();
        Organisasi organisasi = new Organisasi();
        Keluarga keluarga = new Keluarga();

        System.out.println("Pengalaman:");
        pengalaman.prosesKehidupan();
        pendidikan.pendidikanTerakhir();
        projek.jumlahProjek();
        organisasi.prosesOrganisasi();
        karyawan.setGaji(mintaJumlahGaji());
        keluarga.nikah();

        if (karyawan.getUmur() < 18 || pendidikan.getJenjang().equalsIgnoreCase("SD")
                || pendidikan.getJenjang().equalsIgnoreCase("SMP") || projek.getInput() == 4) {
            System.out.println("Karyawan tidak memenuhi syarat.");
            playSound("Sad.mp3");
        } else {
            System.out.println("Selamat, karyawan diterima!");
            playSound("Happy.mp3");
        }

        return karyawan;
    }

    private static void tampilkanDetailKaryawan(Karyawan karyawan) {
        if (karyawan == null) {
            System.out.println("Belum ada data karyawan.");
        } else {
            System.out.println("Detail karyawan:");
            karyawan.printInfo();
        }
    }

    private static int mintaJumlahGaji() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah gaji: ");
        return scanner.nextInt();
    }

    private static void playSound(String filename) {
        try {
            File file = new File(filename);
            if (file.exists()) {
                Desktop.getDesktop().open(file);
            } else {
                System.out.println("File " + filename + " tidak ditemukan.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}