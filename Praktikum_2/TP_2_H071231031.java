package Praktikum_2;

public class TP_2_H071231031 {
    public static class Produk {
        int id;
        String nama;
        int stok;
        double harga;
    
        public void setId(int id) {
            this.id = id;
        }
    
        public int getId() {
            return id;
        }
    
        public void setNama(String nama) {
            this.nama = nama;
        }
    
        public String getNama() {
            return nama;
        }
    
        public void setStok(int stok) {
            this.stok = stok;
        }
    
        public int getStok() {
            return stok;
        }
    
        public void setHarga(double harga) {
            this.harga = harga;
        }
    
        public double getHarga() {
            return harga;
        }
    
        public boolean isTersedia() {
            return stok > 0;
        }
    
        public static void main(String[] args) {
            Produk produk = new Produk();
            produk.setId(1);
            produk.setNama("Sabun");
            produk.setStok(0);
            produk.setHarga(5000);
    
            System.out.println("Informasi Produk:");
            System.out.println("ID: " + produk.getId());
            System.out.println("Nama: " + produk.getNama());
            System.out.println("Stok: " + produk.getStok());
            System.out.println("Harga: " + produk.getHarga());
    
            if (produk.isTersedia()) {
                System.out.println("Produk tersedia di stok");
            } else {
                System.out.println("Produk tidak tersedia di stok");
            }
        }
    }
}
