package Praktikum2;

class Alamat {
    String jalan;
    String kota;

    String getAlamatbaru() {
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
        return alamat.getAlamatbaru();
    }
}

public class LiveCoding {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea Indah";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Farhan";
        mahasiswa.nim = "H071231074";

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Nim: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
    }
}
