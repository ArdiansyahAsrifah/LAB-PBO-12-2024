package TP5_1_H071231031;

abstract class BangunDatar {
    abstract double luas();
    abstract double keliling();
}

class Persegi extends BangunDatar {
    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    double luas() {
        return sisi * sisi;
    }

    double keliling() {
        return 4 * sisi;
    }
}

class PersegiPanjang extends BangunDatar {
    double panjang, lebar;

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
    double jariJari;

    Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    double luas() {
        return Math.PI * jariJari * jariJari;
    }

    double keliling() {
        return 2 * Math.PI * jariJari;
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

    double luas() {
        return (sisi1 + sisi2) * tinggi / 2;
    }

    double keliling() {
        return sisi1 + sisi2 + sisi3 + sisi4;
    }
}