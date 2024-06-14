import java.util.Scanner;

abstract class BangunDatar {
    abstract double hitungLuas();
    abstract double hitungKeliling();
}

abstract class BangunRuang {
    abstract double hitungVolume();
    abstract double hitungLuasPermukaan();
}

class Kubus extends BangunRuang {
    double sisi;

    Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double hitungVolume() {
        return Math.pow(sisi, 3);
    }

    @Override
    double hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }
}

class Balok extends BangunRuang {
    double panjang, lebar, tinggi;

    Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    @Override
    double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + lebar * tinggi + tinggi * panjang);
    }
}

class Bola extends BangunRuang {
    double radius;

    Bola(double radius) {
        this.radius = radius;
    }

    @Override
    double hitungVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    double hitungLuasPermukaan() {
        return 4 * Math.PI * radius * radius;
    }
}

class Tabung extends BangunRuang {
    double radius, tinggi;

    Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    @Override
    double hitungVolume() {
        return Math.PI * radius * radius * tinggi;
    }

    @Override
    double hitungLuasPermukaan() {
        return 2 * Math.PI * radius * (radius + tinggi);
    }
}

class Persegi extends BangunDatar {
    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    double hitungKeliling() {
        return 4 * sisi;
    }
}

class PersegiPanjang extends BangunDatar {
    double panjang, lebar;

    PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}

class Lingkaran extends BangunDatar {
    double radius;

    Lingkaran(double radius) {
        this.radius = radius;
    }

    @Override
    double hitungLuas() {
        return Math.PI * radius * radius;
    }

    @Override
    double hitungKeliling() {
        return 2 * Math.PI * radius;
    }
}

class Trapesium extends BangunDatar {
    double sisi1, sisi2, sisi3, sisi4, tinggi;

    Trapesium(double sisi1, double sisi2, double sisi3, double sisi4, double tinggi) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        this.sisi4 = sisi4;
        this.tinggi = tinggi;
    }

    @Override
    double hitungLuas() {
        return 0.5 * (sisi1 + sisi2) * tinggi;
    }

    @Override
    double hitungKeliling() {
        return sisi1 + sisi2 + sisi3 + sisi4;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueRunning = true;

        while (continueRunning) {
            System.out.println("Pilih bangun yang ingin dihitung:");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Bola");
            System.out.println("4. Tabung");
            System.out.println("5. Persegi");
            System.out.println("6. Persegi Panjang");
            System.out.println("7. Lingkaran");
            System.out.println("8. Trapesium");
            System.out.println("9. Keluar");
            System.out.print("Masukkan pilihan Anda: ");

            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan sisi kubus: ");
                    double sisi = scanner.nextDouble();
                    Kubus kubus = new Kubus(sisi);
                    System.out.println("Volume: " + kubus.hitungVolume());
                    System.out.println("Luas Permukaan: " + kubus.hitungLuasPermukaan());
                    break;
                case 2:
                    System.out.print("Masukkan panjang, lebar, dan tinggi balok: ");
                    double panjang = scanner.nextDouble();
                    double lebar = scanner.nextDouble();
                    double tinggi = scanner.nextDouble();
                    Balok balok = new Balok(panjang, lebar, tinggi);
                    System.out.println("Volume: " + balok.hitungVolume());
                    System.out.println("Luas Permukaan: " + balok.hitungLuasPermukaan());
                    break;
                case 3:
                    System.out.print("Masukkan radius bola: ");
                    double radiusBola = scanner.nextDouble();
                    Bola bola = new Bola(radiusBola);
                    System.out.println("Volume: " + bola.hitungVolume());
                    System.out.println("Luas Permukaan: " + bola.hitungLuasPermukaan());
                    break;
                case 4:
                    System.out.print("Masukkan radius dan tinggi tabung: ");
                    double radiusTabung = scanner.nextDouble();
                    double tinggiTabung = scanner.nextDouble();
                    Tabung tabung = new Tabung(radiusTabung, tinggiTabung);
                    System.out.println("Volume: " + tabung.hitungVolume());
                    System.out.println("Luas Permukaan: " + tabung.hitungLuasPermukaan());
                    break;
                case 5:
                    System.out.print("Masukkan sisi persegi: ");
                    double sisiPersegi = scanner.nextDouble();
                    Persegi persegi = new Persegi(sisiPersegi);
                    System.out.println("Luas: " + persegi.hitungLuas());
                    System.out.println("Keliling: " + persegi.hitungKeliling());
                    break;
                case 6:
                    System.out.print("Masukkan panjang dan lebar persegi panjang: ");
                    double panjangPP = scanner.nextDouble();
                    double lebarPP = scanner.nextDouble();
                    PersegiPanjang pp = new PersegiPanjang(panjangPP, lebarPP);
                    System.out.println("Luas: " + pp.hitungLuas());
                    System.out.println("Keliling: " + pp.hitungKeliling());
                    break;
                case 7:
                    System.out.print("Masukkan radius lingkaran: ");
                    double radiusLingkaran = scanner.nextDouble();
                    Lingkaran lingkaran = new Lingkaran(radiusLingkaran);
                    System.out.println("Luas: " + lingkaran.hitungLuas());
                    System.out.println("Keliling: " + lingkaran.hitungKeliling());
                    break;
                case 8:
                    System.out.print("Masukkan sisi1, sisi2, sisi3, sisi4, dan tinggi trapesium: ");
                    double sisi1 = scanner.nextDouble();
                    double sisi2 = scanner.nextDouble();
                    double sisi3 = scanner.nextDouble();
                    double sisi4 = scanner.nextDouble();
                    double tinggiTrapesium = scanner.nextDouble();
                    Trapesium trapesium = new Trapesium(sisi1, sisi2, sisi3, sisi4, tinggiTrapesium);
                    System.out.println("Luas: " + trapesium.hitungLuas());
                    System.out.println("Keliling: " + trapesium.hitungKeliling());
                    break;
                case 9:
                    continueRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    break;
            }
            System.out.println();
        }
        scanner.close();
    }
}

