package TP5_2_H071231031;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");
            System.out.print(">> Pilih menu (1-4): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Masukkan angka antara 1 hingga 4.");
                scanner.next(); 
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addProduct(products);
                    break;
                case 2:
                    displayAllProducts(products);
                    break;
                case 3:
                    buyProduct(products);
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan kami.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih angka antara 1 hingga 4.");
            }
        } while (choice != 4);

        scanner.close();
    }

    public static void addProduct(ArrayList<Product> products) {
        Scanner scanner = new Scanner(System.in);
        int type;
    
        System.out.println("\nTambah Produk:");
        System.out.println("1. Smartphone");
        System.out.println("2. Kamera");
        System.out.println("3. Laptop");
        System.out.print(">> Pilih tipe produk (1-3): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Masukkan angka antara 1 hingga 3.");
            scanner.next(); 
        }
        type = scanner.nextInt();
        scanner.nextLine(); 
    
        System.out.print("Merek: ");
        String brand = scanner.nextLine();
        System.out.print("Nomor Seri: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Masukkan nomor seri dalam bentuk angka.");
            scanner.next(); 
        }
        int seriesNumber = scanner.nextInt();
        scanner.nextLine(); 
    
        System.out.print("Harga: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Masukkan harga dalam bentuk angka.");
            scanner.next(); 
        }
        double price = scanner.nextDouble();
        scanner.nextLine(); 
    
        switch (type) {
            case 1:
                System.out.print("Ukuran Layar (inci): ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Masukkan ukuran layar dalam bentuk angka.");
                    scanner.next(); 
                }
                double screenSize = scanner.nextDouble();
                System.out.print("Kapasitas Penyimpanan (GB): ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Masukkan kapasitas penyimpanan dalam bentuk angka.");
                    scanner.next(); 
                }
                int storageCapacity = scanner.nextInt();
                scanner.nextLine(); 
                products.add(new Smartphone(brand, seriesNumber, price, screenSize, storageCapacity));
                break;
            case 2:
                System.out.print("Resolusi (MP): ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Masukkan resolusi dalam bentuk angka.");
                    scanner.next(); 
                }
                int resolution = scanner.nextInt();
                System.out.print("Tipe Lensa: ");
                String lensType = scanner.next();
                scanner.nextLine(); 
                products.add(new Camera(brand, seriesNumber, price, resolution, lensType));
                break;
            case 3:
                System.out.print("Ukuran RAM (GB): ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Masukkan ukuran RAM dalam bentuk angka.");
                    scanner.next(); 
                }
                int ramSize = scanner.nextInt();
                System.out.print("Tipe Prosesor: ");
                String processorType = scanner.next();
                scanner.nextLine(); 
                products.add(new Laptop(brand, seriesNumber, price, ramSize, processorType));
                break;
            default:
                System.out.println("Jenis produk tidak valid.");
        }
    
        System.out.println("Produk berhasil ditambahkan.");
    }

    public static void displayAllProducts(ArrayList<Product> products) {
        System.out.println("\nDaftar Produk:");

        if (products.isEmpty()) {
            System.out.println("Belum ada produk yang ditambahkan.");
        } else {
            for (Product product : products) {
                product.displayInfo();
                System.out.println();
            }
        }
    }

    public static void buyProduct(ArrayList<Product> products) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Masukkan nomor seri dalam bentuk angka.");
            scanner.next(); 
        }
        int seriesNumber = scanner.nextInt();
        scanner.nextLine();

        boolean found = false;
        for (Product product : products) {
            if (product.seriesNumber == seriesNumber) {
                found = true;
                System.out.println("\nAnda telah membeli produk:");
                product.displayInfo();
                System.out.println("Pembelian berhasil.");
                break;
            }
        }

        if (!found) {
            System.out.println("Produk tidak ditemukan.");
        }
    }
}
