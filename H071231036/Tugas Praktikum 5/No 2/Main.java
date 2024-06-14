import java.util.ArrayList;
import java.util.Scanner;

// Abstract class Product
abstract class Product {
    String brand;
    int seriesNumber;
    double price;

    Product(String brand, int seriesNumber, double price) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
    }

    // Abstract method to be implemented by subclasses
    abstract void displayInfo();
}

// Smartphone class
class Smartphone extends Product {
    double screenSize;
    int storageCapacity;

    Smartphone(String brand, int seriesNumber, double price, double screenSize, int storageCapacity) {
        super(brand, seriesNumber, price);
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("Smartphone: " + brand + ", Series: " + seriesNumber + ", Price: " + price +
                           ", Screen Size: " + screenSize + " inches, Storage: " + storageCapacity + "GB");
    }
}

// Camera class
class Camera extends Product {
    int resolution;
    String lensType;

    Camera(String brand, int seriesNumber, double price, int resolution, String lensType) {
        super(brand, seriesNumber, price);
        this.resolution = resolution;
        this.lensType = lensType;
    }

    @Override
    void displayInfo() {
        System.out.println("Camera: " + brand + ", Series: " + seriesNumber + ", Price: " + price +
                           ", Resolution: " + resolution + "MP, Lens Type: " + lensType);
    }
}

// Laptop class
class Laptop extends Product {
    int ramSize;
    String processorType;

    Laptop(String brand, int seriesNumber, double price, int ramSize, String processorType) {
        super(brand, seriesNumber, price);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    @Override
    void displayInfo() {
        System.out.println("Laptop: " + brand + ", Series: " + seriesNumber + ", Price: " + price +
                           ", RAM Size: " + ramSize + "GB, Processor: " + processorType);
    }
}

// Main class
public class Main {
    private static ArrayList<Product> products = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");

            System.out.print(">>> Pilih menu (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tambahProduk();
                    break;
                case 2:
                    tampilkanSemuaProduk();
                    break;
                case 3:
                    beliProduk();
                    break;
                case 4:
                    System.out.println("Keluar dari sistem.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void tambahProduk() {
        System.out.print("Masukkan nama produk: ");
        scanner.nextLine(); // Consume newline
        String brand = scanner.nextLine();

        System.out.print("Masukkan nomor seri: ");
        int seriesNumber = scanner.nextInt();

        System.out.print("Masukkan harga: ");
        double price = scanner.nextDouble();

        System.out.println("Pilih tipe produk:");
        System.out.println("1. Smartphone");
        System.out.println("2. Laptop");
        System.out.println("3. Camera");
        System.out.print("Pilih tipe produk (1-3): ");
        int type = scanner.nextInt();

        switch (type) {
            case 1:
                System.out.print("Masukkan ukuran layar (inci): ");
                double screenSize = scanner.nextDouble();
                System.out.print("Masukkan kapasitas penyimpanan (GB): ");
                int storageCapacity = scanner.nextInt();
                products.add(new Smartphone(brand, seriesNumber, price, screenSize, storageCapacity));
                break;
            case 2:
                System.out.print("Masukkan ukuran RAM (GB): ");
                int ramSize = scanner.nextInt();
                System.out.print("Masukkan tipe prosesor: ");
                scanner.nextLine(); // Consume newline
                String processorType = scanner.nextLine();
                products.add(new Laptop(brand, seriesNumber, price, ramSize, processorType));
                break;
            case 3:
                System.out.print("Masukkan resolusi (MP): ");
                int resolution = scanner.nextInt();
                System.out.print("Masukkan tipe lensa: ");
                scanner.nextLine(); // Consume newline
                String lensType = scanner.nextLine();
                products.add(new Camera(brand, seriesNumber, price, resolution, lensType));
                break;
            default:
                System.out.println("Tipe produk tidak valid.");
        }
    }

    private static void tampilkanSemuaProduk() {
        if (products.isEmpty()) {
            System.out.println("Tidak ada produk di stok.");
        } else {
            for (Product product : products) {
                product.displayInfo();
            }
        }
    }

    private static void beliProduk() {
        System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
        int seriesNumber = scanner.nextInt();

        Product productToBuy = null;
        for (Product product : products) {
            if (product.seriesNumber == seriesNumber) {
                productToBuy = product;
                break;
            }
        }

        if (productToBuy != null) {
            System.out.println("Produk ditemukan:");
            productToBuy.displayInfo();
            System.out.println("Pembelian berhasil.");
            products.remove(productToBuy);
        } else {
            System.out.println("Produk tidak ditemukan.");
        }
    }
}
