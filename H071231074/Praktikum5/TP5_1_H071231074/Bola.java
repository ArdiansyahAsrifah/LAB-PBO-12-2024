package Praktikum5.TP5_1_H071231074;

public class Bola extends BangunRuang {
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    double hitungLuas() {
        return 4 * Math.PI * jariJari * jariJari;
    }

    double hitungVolume() {
        return (4/3) * Math.PI * jariJari * jariJari *jariJari;
    }
}
