package Praktikum7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Karyawan[] karyawans = new Karyawan[10];
        int index = 0;

        while (true) {
            System.out.println("Data karyawan:");
            System.out.println("a. Tambah data karyawan");
            System.out.println("b. Tampilkan detail karyawan");
            System.out.println("c. Keluar");
            System.out.print("Pilih opsi (a-c): ");
            String input = scanner.nextLine();

            switch (input) {
                case "a":
                    System.out.print("Masukkan nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan umur: ");
                    int umur = Integer.parseInt(scanner.nextLine());
                    System.out.println("Pengalaman sebelumnya: ");
                    System.out.println("1. Freelancer");
                    System.out.println("2. Magang");
                    System.out.println("3. Pekerja tetap");
                    System.out.println("4. Tidak ada");
                    System.out.print("Input: ");
                    int pengalaman = Integer.parseInt(scanner.nextLine());
                    String jenisPekerjaan = "";
                    switch (pengalaman) {
                        case 1:
                            jenisPekerjaan = "Freelancer";
                            break;
                        case 2:
                            jenisPekerjaan = "Magang";
                            break;
                        case 3:
                            jenisPekerjaan = "Pekerja tetap";
                            break;
                        case 4:
                            jenisPekerjaan = "Tidak ada";
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                            continue;
                    }
                    int gajiSebelumnya = 0;
                    if (pengalaman != 4) {
                        System.out.print("Gaji sebelumnya:");
                        gajiSebelumnya = Integer.parseInt(scanner.nextLine());
                    }

                    // Organisasi
                    System.out.println("Organisasi sebelumnya: ");
                    System.out.println("1. Google");
                    System.out.println("2. Microsoft");
                    System.out.println("3. Apple");
                    System.out.println("4. Organisasi Lain");
                    System.out.println("5. Tidak ada");
                    System.out.print("Input: ");
                    int organisasi = Integer.parseInt(scanner.nextLine());
                    String jenisOrganisasi = "";
                    switch (organisasi) {
                        case 1:
                            jenisOrganisasi = "Google";
                            break;
                        case 2:
                            jenisOrganisasi = "Microsoft";
                            break;
                        case 3:
                            jenisOrganisasi = "Apple";
                            break;
                        case 4:
                            jenisOrganisasi = "Organisasi Lain";
                            break;
                        case 5:
                            jenisOrganisasi = "Tidak ada";
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                            continue;
                    }

                    if (jenisOrganisasi.equals("Tidak ada")) {
                        System.out.println("Karyawan tidak dapat diterima.");
                        continue;
                    }

                    System.out.print("Pendidikan terakhir (SD/SMP/SMA/SMK/S1/S2/S3): ");
                    String tingkatPendidikan = scanner.nextLine();
                    System.out.println("Jumlah proyek yang pernah dijalankan: ");
                    System.out.println("1. Minimal 4");
                    System.out.println("2. Minimal 8");
                    System.out.println("3. Minimal 12");
                    System.out.println("4. Lebih dari 15");
                    System.out.print("Input: ");
                    int jumlahProjek = Integer.parseInt(scanner.nextLine());

                    if (tingkatPendidikan.equalsIgnoreCase("SD") && (jumlahProjek == 1 || umur < 18)) {
                        System.out.println("Karyawan tidak dapat diterima.");
                        continue;
                    }

                    double gaji = calculateGaji(jenisPekerjaan, jumlahProjek, gajiSebelumnya);
                    karyawans[index] = new Karyawan(nama, umur, jenisPekerjaan, gaji);
                    karyawans[index].setTingkatPendidikan(tingkatPendidikan);

                    // Keluarga
                    System.out.print("Apakah sudah menikah? (true/false): ");
                    boolean sudahMenikah = Boolean.parseBoolean(scanner.nextLine());
                    System.out.print("Jumlah anak: ");
                    int jumlahAnak = Integer.parseInt(scanner.nextLine());

                    Keluarga keluarga = new Keluarga(sudahMenikah, jumlahAnak);
                    karyawans[index].setKeluarga(keluarga);

                    index++;

                    System.out.println("Karyawan berhasil ditambahkan.");
                    break;
                case "b":
                    if (index == 0) {
                        System.out.println("Belum ada data karyawan.");
                        continue;
                    }
                    for (int i = 0; i < index; i++) {
                        Karyawan tampilkanKeluarga = karyawans[i];
                        System.out.println("Nama: " + tampilkanKeluarga.getNama());
                        System.out.println("Umur: " + tampilkanKeluarga.getUmur());
                        System.out.println("Pengalaman: " + tampilkanKeluarga.getJabatan());
                        System.out.println("Gaji: " + tampilkanKeluarga.getGaji());
                        System.out.println("Pendidikan: " + tampilkanKeluarga.getTingkatPendidikan());
                        
                        Keluarga tampilkankKeluarga = tampilkanKeluarga.getKeluarga();
                        tampilkankKeluarga.tentangNikah();
                        tampilkankKeluarga.tentangAnak();
                    }
                    break;
                case "c":
                    System.out.println("Sampai jumpa!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static double calculateGaji(String jenisPekerjaan, int jumlahProjek, int gajiSebelumnya) {
        double gaji = 0;
        if (gajiSebelumnya != 0) {
            switch (jenisPekerjaan) {
                case "Freelancer":
                    gaji = 1000000 * jumlahProjek + gajiSebelumnya;
                    break;
                case "Magang":
                    gaji = 500000 * jumlahProjek + gajiSebelumnya;
                    break;
                case "Pekerja tetap":
                    gaji = 1500000 * jumlahProjek + gajiSebelumnya;
                    break;
                case "Tidak ada":
                    gaji = 0;
                    break;
                default:
                    System.out.println("Jenis pekerjaan tidak valid.");
                    break;
            }
        } else {
            return 2000000;
        }
        return gaji;
    }
}
