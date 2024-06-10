package Praktikum2;

class Alamat {
    String jalan;
    String kota;

    String getAlamatString() {
        return jalan + ", " + kota;
    }
}

class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;

    String getNama() {
        return nama;
    }
    String getNim() {
        return nim;
    }
    String getAlamat() {
        return alamat.getAlamatString();
    }
}

public class TP2_4_H071231074 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = " JL. Maccini Raya";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Muh. Rinaldi Ruslan";
        mahasiswa.nim = "H071231074";

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Nim: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
    } 
}