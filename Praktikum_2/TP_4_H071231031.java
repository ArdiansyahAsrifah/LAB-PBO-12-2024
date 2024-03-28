package Praktikum_2;

public class TP_4_H071231031 {
    static class Alamat {
        String jalan;
        String kota;
    
        public Alamat(String jalan, String kota) {
            this.jalan = jalan;
            this.kota = kota;
        }
    
        public void setJalan(String jalan) {
            this.jalan = jalan;
        }
    
        public String getJalan() {
            return jalan;
        }
    
        public void setKota(String kota) {
            this.kota = kota;
        }
    
        public String getKota() {
            return kota;
        }
    }
    
    public static class Mahasiswa {
        String nama;
        String nim;
        Alamat alamat;
    
        public void setNama(String nama) {
            this.nama = nama;
        }
    
        public void setNim(String nim) {
            this.nim = nim;
        }
    
        public String getNama() {
            return nama;
        }
    
        public String getNim() {
            return nim;
        }
    
        public void setAlamat(Alamat alamat) {
            this.alamat = alamat;
        }
    
        public static void main(String[] args) {
            Mahasiswa mahasiswa = new Mahasiswa();
            mahasiswa.setNama("Farhan");
            mahasiswa.setNim("H071231031");
    
            mahasiswa.setAlamat(new Alamat("Tamalanrea Indah, ", "Makassar"));
    
            System.out.println("Nama : " + mahasiswa.getNama());
            System.out.println("Nim : " + mahasiswa.getNim());
            System.out.println("Alamat : " + mahasiswa.alamat.getJalan() + mahasiswa.alamat.getKota());
        }
    }
}
