package Praktikum5.TP5_1_H071231074;

public class Kubus extends BangunRuang {
    private double sisi;

    Kubus(double sisi) {
        this.sisi = sisi;
    }

    double hitungLuas() {
        return 6 * sisi * sisi;
    }

    double hitungVolume() {
        return sisi * sisi * sisi;
    }
}
