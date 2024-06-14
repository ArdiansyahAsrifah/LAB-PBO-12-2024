import java.util.ArrayList;
import java.util.Scanner;

class Karyawan {
    private String nama;
    private int umur;
    private String jabatan;
    private double gaji;

    public Karyawan(String nama, int umur, String jabatan, double gaji) {
        this.nama = nama;
        this.umur = umur;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void tampilkanDetail() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji: " + gaji);
    }
}

abstract class Kehidupan {
    public abstract void prosesKehidupan();
}

class Pengalaman extends Kehidupan {
    private String jenisPekerjaan;

    public Pengalaman(String jenisPekerjaan) {
        this.jenisPekerjaan = jenisPekerjaan;
    }

    public String getJenisPekerjaan() {
        return jenisPekerjaan;
    }

    public void setJenisPekerjaan(String jenisPekerjaan) {
        this.jenisPekerjaan = jenisPekerjaan;
    }

    @Override
    public void prosesKehidupan() {
        System.out.println("Pengalaman sedang diproses...");
    }

    public void prosesKehidupan(String sertifikasi) {
        System.out.println("Sertifikasi: " + sertifikasi + " sedang diproses...");
    }
}

class Pendidikan {
    public void tampilkanPendidikanTerakhir(String pendidikan) {
        System.out.println("Pendidikan terakhir: " + pendidikan);
    }

    public void tampilkanPendidikanTerakhir(String pendidikan, String tambahan) {
        System.out.println("Pendidikan terakhir: " + pendidikan + " dengan tambahan: " + tambahan);
    }
}

class Projek {
    public void tampilkanJumlahProjek(int jumlahProjek) {
        System.out.println("Jumlah projek IT: " + jumlahProjek);
    }

    public void tampilkanJumlahProjek(int jumlahProjek, String detail) {
        System.out.println("Jumlah projek IT: " + jumlahProjek + ", detail: " + detail);
    }
}

public class Main {
    private static ArrayList<Karyawan> karyawanList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Data karyawan:");
            System.out.println("a. Tambah data karyawan");
            System.out.println("b. Tampilkan detail karyawan");
            System.out.println("c. Keluar");
            System.out.print("Pilih opsi (a-c): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "a":
                    tambahKaryawan();
                    break;
                case "b":
                    tampilkanDetailKaryawan();
                    break;
                case "c":
                    System.out.println("Keluar dari sistem.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void tambahKaryawan() {
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        int umur = 0;
        while (true) {
            System.out.print("Masukkan umur: ");
            try {
                umur = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Inputan harus berupa integer.");
            }
        }

        System.out.println("Pengalaman sebelumnya:");
        System.out.println("1. Freelancer");
        System.out.println("2. Magang");
        System.out.println("3. Pekerja tetap");
        System.out.println("4. Tidak ada");
        int pengalaman = 0;
        while (true) {
            System.out.print("Input: ");
            try {
                pengalaman = Integer.parseInt(scanner.nextLine());
                if (pengalaman < 1 || pengalaman > 4) {
                    System.out.println("Pilihan tidak valid.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Inputan harus berupa integer.");
            }
        }

        System.out.print("Gaji sebelumnya: ");
        double gaji = Double.parseDouble(scanner.nextLine());

        System.out.print("Pendidikan terakhir (SD/SMP/SMA/SMK/S1/S2/S3): ");
        String pendidikan = scanner.nextLine();

        System.out.println("Projek IT:");
        System.out.println("1. Minimal 4");
        System.out.println("2. Minimal 8");
        System.out.println("3. Minimal 12");
        System.out.println("4. Lebih dari 15");
        int jumlahProjek = 0;
        while (true) {
            System.out.print("Input: ");
            try {
                jumlahProjek = Integer.parseInt(scanner.nextLine());
                if (jumlahProjek < 1 || jumlahProjek > 4) {
                    System.out.println("Pilihan tidak valid.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Inputan harus berupa integer.");
            }
        }

        boolean memenuhiSyarat = !(pendidikan.equals("SD") || pendidikan.equals("SMP") || jumlahProjek == 1 || umur < 18);

        if (!memenuhiSyarat) {
            System.out.println("Karyawan tidak memenuhi syarat.");
            return;
        }

        Karyawan karyawan = new Karyawan(nama, umur, "Karyawan", gaji);
        karyawanList.add(karyawan);
        System.out.println("Selamat, karyawan diterima!");
    }

    private static void tampilkanDetailKaryawan() {
        if (karyawanList.isEmpty()) {
            System.out.println("Belum ada data karyawan.");
            return;
        }

        for (Karyawan karyawan : karyawanList) {
            karyawan.tampilkanDetail();
        }
    }
}
