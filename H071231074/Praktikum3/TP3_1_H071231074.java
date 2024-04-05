package Praktikum3;

import java.text.DecimalFormat;

public class TP3_1_H071231074 {
    public static void main(String[] args) {
        Jabatan manager = new Jabatan("Manager", 5000000);
        Karyawan karyawan1 = new Karyawan("Rinaldi", 30, manager, "HRD");

        karyawan1.tampilkanInfo();

        manager.setGaji(6000000);

        karyawan1.tampilkanInfo();

        karyawan1.promosi("Senior Manager", 7000000);

        karyawan1.tampilkanInfo();
    }
}

class Karyawan {
    // Memiliki 3 Atribut
    String nama;
    int usia;
    Jabatan jabatan;
    String departemen;

    // Memliki 2 Konstruktor
    public Karyawan() {
        this.nama = "";
        this.usia = 0;
        this.jabatan = new Jabatan();
        this.departemen = "";
    }

    public Karyawan(String nama, int usia, Jabatan jabatan, String departemen) {
        this.nama = nama;
        this.usia = usia;
        this.jabatan = jabatan;
        this.departemen = departemen;
    }

    private static DecimalFormat df = new DecimalFormat("#,##0.00");
    // Perilaku
    public void tampilkanInfo() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Usia: " + this.usia);
        System.out.println("Departemen: " + this.departemen);
        System.out.println("Jabatan: " + this.jabatan.getJabatan());
        System.out.println("Gaji: " + df.format(this.jabatan.getGaji()));
    }

    public void promosi(String jabatanBaru, double gajiBaru) {
        jabatan.setJabatan(jabatanBaru);
        jabatan.setGaji(gajiBaru);
        System.out.println("Promosi! Jabatan " + this.nama + " menjadi " + jabatanBaru + " dengan gaji baru Rp." + gajiBaru);
    }

    // Setter dan Getter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public Jabatan getJabatan() {
        return jabatan;
    }

    public void setJabatan(Jabatan jabatan) {
        this.jabatan = jabatan;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }
}

class Jabatan {
    // Atribut
    String jabatan;
    double gaji;

    // Konstruktor
    public Jabatan() {
        this.jabatan = "";
        this.gaji = 0.0;
    }

    public Jabatan(String jabatan, double gaji) {
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    // Setter dan Getter
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
}

