import java.util.Scanner;

class BangunDatar {
    double sisi, panjang, lebar, radius, atas, bawah, tinggi, sisiMiring;
}

class BangunRuang {
    double sisi,panjang, lebar, tinggi, radius;
}

class Kubus extends BangunRuang {
    Kubus(double sisi) {
        this.sisi = sisi;
    }

    double volume() {
        return Math.pow(sisi, 3);
    }

    double luasPermukaan() {
        return 6 * Math.pow(sisi, 2);
    }
}

class Balok extends BangunRuang {
    Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    double volume() {
        return panjang * lebar * tinggi;
    }

    double luasPermukaan() {
        return 2 * (panjang * lebar + lebar * tinggi + tinggi * panjang);
    }
}

class Bola extends BangunRuang {
    Bola(double radius) {
        this.radius = radius;
    }
   
    double volume() {
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }

    double luasPermukaan() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

class Tabung extends BangunRuang {

    Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    double volume() {
        return Math.PI * Math.pow(radius, 2) * tinggi;
    }

    double luasPermukaan() {
        return 2 * Math.PI * radius * (radius + tinggi);
    }
}

class Persegi extends BangunDatar {

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    double luas() {
        return Math.pow(sisi, 2);
    }

    double keliling() {
        return 4 * sisi;
    }
}

class PersegiPanjang extends BangunDatar {

    PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    double luas() {
        return panjang * lebar;
    }

    double keliling() {
        return 2 * (panjang + lebar);
    }
}

class Lingkaran extends BangunDatar {

    Lingkaran(double radius) {
        this.radius = radius;
    }

    double luas() {
        return Math.PI * Math.pow(radius, 2);
    }

    double keliling() {
        return 2 * Math.PI * radius;
    }
}

class Trapesium extends BangunDatar {
    Trapesium(double atas, double bawah, double tinggi, double sisiMiring) {
        this.atas = atas;
        this.bawah = bawah;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    double luas() {
        return 0.5 * (atas + bawah) * tinggi;
    }

    double keliling() {
        return atas + bawah + 2 * sisiMiring;
    }
}

public class TP5_1_H071231054 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------------------------");
        System.out.println("================ BANGUN RUANG ================");
        System.out.println("1. Kubus\n2. Balok\n3. Bola\n4. Tabung");
        System.out.println("================ BANGUN DATAR ================");
        System.out.println("5. Persegi\n6. Persegi Panjang\n7. Lingkaran\n8. Trapesium");
        System.out.println("------------------------------------------------");
        System.out.print("Pilihan : ");
        int pilihan = scanner.nextInt();
        System.out.println("------------------------------------------------");

        switch (pilihan) {
            case 1: // Kubus
                System.out.print("Masukkan panjang sisi : ");
                double sisiKubus = scanner.nextDouble();
                Kubus kubus = new Kubus(sisiKubus);
                System.out.println("------------------------------------------------");
                System.out.println("Volume Kubus        : " + kubus.volume());
                System.out.println("Luas Permukaan Kubus: " + kubus.luasPermukaan());
                System.out.println("------------------------------------------------");
                break;
            case 2: // Balok
                System.out.print("Masukkan panjang    : ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar      : ");
                double lebar = scanner.nextDouble();
                System.out.print("Masukkan tinggi     : ");
                double tinggiBalok = scanner.nextDouble();
                Balok balok = new Balok(panjang, lebar, tinggiBalok);
                System.out.println("------------------------------------------------");
                System.out.println("Volume Balok        : " + balok.volume());
                System.out.println("Luas Permukaan Balok: " + balok.luasPermukaan());
                System.out.println("------------------------------------------------");
                break;
            case 3: // Bola
                System.out.print("Masukkan radius : ");
                double radiusBola = scanner.nextDouble();
                Bola bola = new Bola(radiusBola);
                System.out.println("------------------------------------------------");
                System.out.println("Volume Bola         : " + bola.volume());
                System.out.println("Luas Permukaan Bola : " + bola.luasPermukaan());
                System.out.println("------------------------------------------------");
                break;
            case 4: // Tabung
                System.out.print("Masukkan radius : ");
                double radiusTabung = scanner.nextDouble();
                System.out.print("Masukkan tinggi : ");
                double tinggiTabung = scanner.nextDouble();
                Tabung tabung = new Tabung(radiusTabung, tinggiTabung);
                System.out.println("------------------------------------------------");
                System.out.println("Volume Tabung           : " + tabung.volume());
                System.out.println("Luas Permukaan Tabung   : " + tabung.luasPermukaan());
                System.out.println("------------------------------------------------");
                break;
            case 5: // Persegi
                System.out.print("Masukkan panjang sisi   :");
                double sisiPersegi = scanner.nextDouble();
                Persegi persegi = new Persegi(sisiPersegi);
                System.out.println("Luas Persegi    : " + persegi.luas());
                System.out.println("Keliling Persegi: " + persegi.keliling());
                break;
            case 6: // Persegi Panjang
                System.out.print("Masukkan panjang    : ");
                double panjangPP = scanner.nextDouble();
                System.out.print("Masukkan lebar      : ");
                double lebarPP = scanner.nextDouble();
                PersegiPanjang pp = new PersegiPanjang(panjangPP, lebarPP);
                System.out.println("------------------------------------------------");
                System.out.println("Luas Persegi Panjang    : " + pp.luas());
                System.out.println("Keliling Persegi Panjang: " + pp.keliling());
                System.out.println("------------------------------------------------");
                break;
            case 7: // Lingkaran
                System.out.print("Masukkan radius : ");
                double radiusLingkaran = scanner.nextDouble();
                Lingkaran lingkaran = new Lingkaran(radiusLingkaran);
                System.out.println("------------------------------------------------");
                System.out.println("Luas Lingkaran      : " + lingkaran.luas());
                System.out.println("Keliling Lingkaran  : " + lingkaran.keliling());
                System.out.println("------------------------------------------------");
                break;
            case 8: // Trapesium
                System.out.print("Masukkan panjang sisi atas  : ");
                double atas = scanner.nextDouble();
                System.out.print("Masukkan panjang sisi bawah : ");
                double bawah = scanner.nextDouble();
                System.out.print("Masukkan tinggi             : ");
                double tinggiTrap = scanner.nextDouble();
                System.out.print("Masukkan panjang sisi miring: ");
                double sisiMiring = scanner.nextDouble();
                Trapesium trapesium = new Trapesium(atas, bawah, tinggiTrap, sisiMiring);
                System.out.println("------------------------------------------------");
                System.out.println("Luas Trapesium      : " + trapesium.luas());
                System.out.println("Keliling Trapesium  : " + trapesium.keliling());
                System.out.println("------------------------------------------------");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }
}