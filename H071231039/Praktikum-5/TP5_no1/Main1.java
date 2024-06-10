import java.util.Scanner;

abstract class BangunRuang {
    abstract double hitungVolume();
    abstract double hitungLuasPermukaan();
}

abstract class BangunDatar {
    abstract double hitungLuas();
    abstract double hitungKeliling();
}

class Kubus extends BangunRuang {
    private double sisi;

    Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double hitungVolume() {
        return Math.pow(sisi, 3);
    }

    @Override
    double hitungLuasPermukaan() {
        return 6 * Math.pow(sisi, 2);
    }
}

class Balok extends BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

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
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
}

class Bola extends BangunRuang {
    private double jariJari;

    Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }

    @Override
    double hitungLuasPermukaan() {
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }
}

class Tabung extends BangunRuang {
    private double jariJari;
    private double tinggi;

    Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    double hitungVolume() {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    @Override
    double hitungLuasPermukaan() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }
}

class Persegi extends BangunDatar {
    private double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double hitungLuas() {
        return Math.pow(sisi, 2);
    }

    @Override
    double hitungKeliling() {
        return 4 * sisi;
    }
}

class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

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
    private double jariJari;

    Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    double hitungLuas() {
        return Math.PI * Math.pow(jariJari, 2);
    }

    @Override
    double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}

class Trapesium extends BangunDatar {
    private double sisi1;
    private double sisi2;
    private double sisi3;
    private double sisi4;
    private double tinggi;

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

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======= BANGUN RUANG =======");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Bola");
        System.out.println("4. Tabung");
        System.out.println("======= BANGUN DATAR =======");
        System.out.println("5. Persegi");
        System.out.println("6. Persegi Panjang");
        System.out.println("7. Lingkaran");
        System.out.println("8. Trapesium");
        System.out.println("=============================");

        System.out.print("Pilihan: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi kubus: ");
                double sisiKubus = scanner.nextDouble();
                Kubus kubus = new Kubus(sisiKubus);
                System.out.println("Volume kubus: " + kubus.hitungVolume());
                System.out.println("Luas permukaan kubus: " + kubus.hitungLuasPermukaan());
                break;
            case 2:
                System.out.print("Masukkan panjang balok: ");
                double panjangBalok = scanner.nextDouble();
                System.out.print("Masukkan lebar balok: ");
                double lebarBalok = scanner.nextDouble();
                System.out.print("Masukkan tinggi balok: ");
                double tinggiBalok = scanner.nextDouble();
                Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                System.out.println("Volume balok: " + balok.hitungVolume());
                System.out.println("Luas permukaan balok: " + balok.hitungLuasPermukaan());
                break;
            case 3:
                System.out.print("Masukkan jari-jari bola: ");
                double jariJariBola = scanner.nextDouble();
                Bola bola = new Bola(jariJariBola);
                System.out.println("Volume bola: " + bola.hitungVolume());
                System.out.println("Luas permukaan bola: " + bola.hitungLuasPermukaan());
                break;
            case 4:
                System.out.print("Masukkan jari-jari tabung: ");
                double jariJariTabung = scanner.nextDouble();
                System.out.print("Masukkan tinggi tabung: ");
                double tinggiTabung = scanner.nextDouble();
                Tabung tabung = new Tabung(jariJariTabung, tinggiTabung);
                System.out.println("Volume tabung: " + tabung.hitungVolume());
                System.out.println("Luas permukaan tabung: " + tabung.hitungLuasPermukaan());
                break;
            case 5:
                System.out.print("Masukkan sisi persegi: ");
                double sisiPersegi = scanner.nextDouble();
                Persegi persegi = new Persegi(sisiPersegi);
                System.out.println("Luas persegi: " + persegi.hitungLuas());
                System.out.println("Keliling persegi: " + persegi.hitungKeliling());
                break;
            case 6:
                System.out.print("Masukkan panjang persegi panjang: ");
                double panjangPersegiPanjang = scanner.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                double lebarPersegiPanjang = scanner.nextDouble();
                PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
                System.out.println("Luas persegi panjang: " + persegiPanjang.hitungLuas());
                System.out.println("Keliling persegi panjang: " + persegiPanjang.hitungKeliling());
                break;
            case 7:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJariLingkaran = scanner.nextDouble();
                Lingkaran lingkaran = new Lingkaran(jariJariLingkaran);
                System.out.println("Luas lingkaran: " + lingkaran.hitungLuas());
                System.out.println("Keliling lingkaran: " + lingkaran.hitungKeliling());
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
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }
}
