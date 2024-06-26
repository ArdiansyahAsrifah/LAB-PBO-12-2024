package Praktikum5.TP5_2_H071231074;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Integer, Product> products = new HashMap<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");
            System.out.println();
            System.out.print(">>> Pilih menu (1-4): ");

            if (!scan.hasNextInt()) {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                scan.next();
                continue;
            }
            int pilihan = scan.nextInt();
            scan.nextLine();
            
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama produk: ");
                    String brand = scan.nextLine();
                    System.out.print("Masukkan nomor seri: ");
                    int seriesNumber = scan.nextInt();
                    System.out.print("Masukkan harga: ");
                    double price = scan.nextDouble();
                    System.out.println("Pilih tipe produk:");
                    System.out.println("1. Smartphone");
                    System.out.println("2. Laptop");
                    System.out.println("3. Camera");
                    System.out.print("Pilih tipe produk (1-3): ");
                    int tipeproduk = scan.nextInt();

                    switch (tipeproduk) {
                        case 1:
                            System.out.print("Masukkan ukuran layar (inci): ");
                            double screenSize = scan.nextDouble();
                            System.out.print("Masukkan kapasitas penyimpanan (GB): ");
                            int storageCapacity = scan.nextInt();
                            products.put(seriesNumber, new Smartphone(brand, seriesNumber, price, screenSize, storageCapacity));
                            break;
                        case 2:
                            System.out.print("Masukkan ukuran RAM (GB): ");
                            int ramSize = scan.nextInt();
                            System.out.print("Masukka tipe prosesor: ");
                            String processorType = scan.next();
                            products.put(seriesNumber, new Laptop(brand, seriesNumber, price, ramSize, processorType));
                            break;
                        case 3:
                            System.out.print("Masukkan resolusi kamera: ");
                            int resolution = scan.nextInt();
                            System.out.print("Masukkan tipe lensa: ");
                            String lensType = scan.next();
                            products.put(seriesNumber, new Camera(brand, seriesNumber, price, resolution, lensType));
                            break;
                        default:
                            System.out.println("Pilihan tidak valid!!!");
                    }
                    break;
                case 2:
                    System.out.println("Daftar produk:");
                    for (Product product : products.values()) {
                        product.displayinfo();
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
                    int nomotseri = scan.nextInt();
                    Product product = products.get(nomotseri);
                    if (product != null) {
                        System.out.println("Anda telah membei produk:");
                        product.displayinfo();;
                    } else {
                        System.out.println("Produk dengan nomor seri tersebut tidak ditemukan");
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
                    scan.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!!!");
            }
        }
    }
}
