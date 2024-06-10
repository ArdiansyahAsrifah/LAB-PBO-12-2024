import java.util.Scanner;

public class TP2_2_H071231039 {
    static class Produk {
        String nama;
        int ID, stok;
        double harga;

        void cekDataProduk() {
            System.out.println("Data Produk");
            System.out.println("Nama      : " + nama);
            System.out.println("ID Produk : " + ID);
            System.out.println("Stok      : " + stok);
            System.out.printf("Harga     : Rp." + harga + "\n");
        }

        void cekProduk() {
            if (stok <= 0) {
                System.out.println("Tidak tersedia");
            } else {
                System.out.println("Stok tersedia: " + stok);
                
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Produk product = new Produk();

            // Meminta pengguna untuk memasukkan data produk
            System.out.print("Masukkan nama produk: ");
            product.nama = scanner.nextLine();

            System.out.print("Masukkan ID produk: ");
            product.ID = scanner.nextInt();

            System.out.print("Masukkan stok produk: ");
            product.stok = scanner.nextInt();

            System.out.print("Masukkan harga produk: ");
            product.harga = scanner.nextDouble();

            scanner.close();

            product.cekDataProduk();

            product.cekProduk();
        }
    }
}
