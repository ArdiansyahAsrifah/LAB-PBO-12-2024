package Praktikum5.TP5_1_H071231074;

public class Tabung extends BangunRuang {
    private double jariJari;
    private double tinggi;
    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    double hitungLuas() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }

    double hitungVolume() {
        return Math.PI * jariJari * jariJari * tinggi;
    }
}
