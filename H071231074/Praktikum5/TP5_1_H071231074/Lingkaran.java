package Praktikum5.TP5_1_H071231074;

public class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    
    double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}
