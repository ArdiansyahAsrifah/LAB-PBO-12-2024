package TP5_1_H071231031;

abstract class BangunRuang {
    abstract double luasPermukaan();
    abstract double volume();
}

class Kubus extends BangunRuang {
    double sisi;

    Kubus(double sisi) {
        this.sisi = sisi;
    }

    double luasPermukaan() {
        return 6 * sisi * sisi;
    }

    double volume() {
        return sisi * sisi * sisi;
    }
}

class Balok extends BangunRuang {
    double panjang, lebar, tinggi;

    Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    double luasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    double volume() {
        return panjang * lebar * tinggi;
    }
}

class Bola extends BangunRuang {
    double jariJari;

    Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    double luasPermukaan() {
        return 4 * Math.PI * jariJari * jariJari;
    }

    double volume() {
        return (4.0 / 3.0) * Math.PI * jariJari * jariJari * jariJari;
    }
}

class Tabung extends BangunRuang {
    double jariJari, tinggi;

    Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    double luasPermukaan() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }

    double volume() {
        return Math.PI * jariJari * jariJari * tinggi;
    }
}