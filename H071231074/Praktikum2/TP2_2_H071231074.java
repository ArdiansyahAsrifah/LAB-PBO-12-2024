package Praktikum2;
import java.util.Scanner;

class Product {
    int id;
    String name;
    int stock;
    double price;

    // Setter untuk ID
    public void setId(int newId) {
        id = newId;
    }

    // Getter untuk ID
    public int getId() {
        return id;
    }

    // Setter untuk nama
    public void setName(String newName) {
        name = newName;
    }

    // Getter untuk nama
    public String getName() {
        return name;
    }

    // Setter untuk stok
    public void setStock(int newStock) {
        stock = newStock;
    }

    // Getter untuk stok
    public int getStock() {
        return stock;
    }

    // Setter untuk harga
    public void setPrice(double newPrice) {
        price = newPrice;
    }

    // Getter untuk harga
    public double getPrice() {
        return price;
    }

    // Metode untuk mengecek ketersediaan stok
    public boolean isAvailable() {
        return stock > 0;
    }
}

public class TP2_2_H071231074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek produk
        Product product = new Product();

        // Meminta input dari pengguna
        System.out.println("Masukkan ID produk: ");
        int id = scanner.nextInt();
        product.setId(id);

        scanner.nextLine(); // Membersihkan newline di buffer

        System.out.println("Masukkan nama produk: ");
        String name = scanner.nextLine();
        product.setName(name);

        System.out.println("Masukkan stok produk: ");
        int stock = scanner.nextInt();
        product.setStock(stock);

        System.out.println("Masukkan harga produk: ");
        double price = scanner.nextDouble();
        product.setPrice(price);

        // Menampilkan informasi produk
        System.out.println("\nInformasi Produk:");
        System.out.println("ID: " + product.getId());
        System.out.println("Nama: " + product.getName());
        System.out.println("Stok: " + product.getStock());
        System.out.println("Harga: " + product.getPrice());

        // Melakukan pengecekan ketersediaan stok
        if (product.isAvailable()) {
            System.out.println("Produk tersedia.");
        } else {
            System.out.println("Produk tidak tersedia.");
        }

        // Menutup scanner
        scanner.close();
    }
}
