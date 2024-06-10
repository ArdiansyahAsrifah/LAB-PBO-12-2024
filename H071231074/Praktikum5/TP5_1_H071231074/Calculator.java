package Praktikum5.TP5_1_H071231074;
import java.util.Scanner;

public class Calculator {
    private Scanner scanner;

    Calculator() {
        this.scanner = new Scanner(System.in);
    }

    void hitungBangunRuang(int pilihan) {
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi kubus: ");
                double sisiKubus = scanner.nextDouble();
                Kubus kubus = new Kubus(sisiKubus);
                System.out.println("Luas kubus: " + kubus.hitungLuas());
                System.out.println("Volume kubus: " + kubus.hitungVolume());
                garisgaris();
                break;
            case 2:
                System.out.print("Masukkan panjang balok: ");
                double panjangBalok = scanner.nextDouble();
                System.out.print("Masukkan lebar balok: ");
                double lebarBalok = scanner.nextDouble();
                System.out.print("Masukkan tinggi balok: ");
                double tinggiBalok = scanner.nextDouble();
                Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                System.out.println("Luas balok: " + balok.hitungLuas());
                System.out.println("Volume balok: " + balok.hitungVolume());
                garisgaris();
                break;
            case 3:
                System.out.print("Masukkan jari-jari bola: ");
                double jariJariBola = scanner.nextDouble();
                Bola bola = new Bola(jariJariBola);
                System.out.println("Luas bola: " + bola.hitungLuas());
                System.out.println("Volume bola: " + bola.hitungVolume());
                garisgaris();
                break;
            case 4:
                System.out.print("Masukkan jari-jari tabung: ");
                double jariJariTabung = scanner.nextDouble();
                System.out.print("Masukkan tinggi tabung: ");
                double tinggiTabung = scanner.nextDouble();
                Tabung tabung = new Tabung(jariJariTabung, tinggiTabung);
                System.out.println("Luas tabung: " + tabung.hitungLuas());
                System.out.println("Volume tabung: " + tabung.hitungVolume());
                garisgaris();
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                garisgaris();
        }
    }

    void hitungBangunDatar(int pilihan) {
        switch (pilihan) {
            case 5:
                System.out.print("Masukkan sisi persegi: ");
                double sisiPersegi = scanner.nextDouble();
                Persegi persegi = new Persegi(sisiPersegi);
                System.out.println("Luas persegi: " + persegi.hitungLuas());
                System.out.println("Keliling persegi: " + persegi.hitungKeliling());
                garisgaris();
                break;
            case 6:
                System.out.print("Masukkan panjang persegi panjang: ");
                double panjangPersegiPanjang = scanner.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                double lebarPersegiPanjang = scanner.nextDouble();
                PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
                System.out.println("Luas persegi panjang: " + persegiPanjang.hitungLuas());
                System.out.println("Keliling persegi panjang: " + persegiPanjang.hitungKeliling());
                garisgaris();
                break;
            case 7:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJariLingkaran = scanner.nextDouble();
                Lingkaran lingkaran = new Lingkaran(jariJariLingkaran);
                System.out.println("Luas lingkaran: " + lingkaran.hitungLuas());
                System.out.println("Keliling lingkaran: " + lingkaran.hitungKeliling());
                garisgaris();
                break;
            case 8:
                System.out.print("Masukkan sisi 1 trapesium: ");
                double sisi1Trapesium = scanner.nextDouble();
                System.out.print("Masukkan sisi 2 trapesium: ");
                double sisi2Trapesium = scanner.nextDouble();
                System.out.print("Masukkan sisi 3 trapesium: ");
                double sisi3Trapesium = scanner.nextDouble();
                System.out.print("Masukkan sisi 4 trapesium: ");
                double sisi4Trapesium = scanner.nextDouble();
                System.out.print("Masukkan tinggi trapesium: ");
                double tinggiTrapesium = scanner.nextDouble();
                Trapesium trapesium = new Trapesium(sisi1Trapesium, sisi2Trapesium, sisi3Trapesium, sisi4Trapesium, tinggiTrapesium);
                System.out.println("Luas trapesium: " + trapesium.hitungLuas());
                System.out.println("Keliling trapesium: " + trapesium.hitungKeliling());
                garisgaris();
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                garisgaris();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        garisgaris();
        System.out.println("==== BANGUN RUANG ====");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG");
        System.out.println("==== BANGUN DATAR ====");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. TRAPESIUM");
        garisgaris();
        System.out.print("Pilihan: ");
        int pilihan = scanner.nextInt();

        if (pilihan >= 1 && pilihan <= 4) {
            calculator.hitungBangunRuang(pilihan);
        } else if (pilihan >= 5 && pilihan <= 8) {
            calculator.hitungBangunDatar(pilihan);
        } else {
            System.out.println("Pilihan tidak valid!!!");
        }
        scanner.close();
    }
    static void garisgaris() {
        System.out.println("-".repeat(30));
    }
}