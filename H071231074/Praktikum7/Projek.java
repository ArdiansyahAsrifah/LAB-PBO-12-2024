package Praktikum7;

public class Projek {
    private int jumlahProjek;

    public Projek(int jumlahProjek) {
        this.jumlahProjek = jumlahProjek;
    }

    public int getJumlahProjek() {
        return jumlahProjek;
    }

    public void setJumlahProjek(int jumlahProjek) {
        this.jumlahProjek = jumlahProjek;
    }

    public void prosesProjek() {
        System.out.println("Proses projek dengan jumlah " + jumlahProjek);
    }
}
