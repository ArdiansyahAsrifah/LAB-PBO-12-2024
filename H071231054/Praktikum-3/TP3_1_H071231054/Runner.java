package TP3_1_H071231054;
import java.util.ArrayList;


public class Runner {
    String name;
    Peserta peserta;
    int year;
    ArrayList<Peserta> pesertas;

    public Runner() {
    }

    public Runner(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Runner(String name, Peserta peserta, int year) {
        this.name = name;
        this.peserta = peserta;
        this.year = year;
    }

    public void setListPeserta(ArrayList<Peserta> pesertas) {
        this.pesertas = pesertas;
    }

    public void displayPemenang() {
        Peserta bestPeserta = this.pesertas.get(0);
        for (Peserta peserta : this.pesertas) {
            if (peserta.getDistance() > bestPeserta.getDistance()) {
                bestPeserta = peserta;
            }
        }

        System.out.println("================= The Winner ==================");
        System.out.println("Name    : " + bestPeserta.getName());
        System.out.println("Distance   : " + bestPeserta.getDistance());
        System.out.println("City    : " + bestPeserta.getCity());
    }

    public void displayRunnerInfo() {
        System.out.println("============ Runner Information =============");
        System.out.println("Name        : " + this.getName());
        System.out.println("Year        : " + this.getYear());
        System.out.println("Participant : ");
        for (Peserta peserta : this.pesertas) {
            System.out.println("Name    : " + peserta.getName());
            System.out.println("City    : " + peserta.getCity());
            System.out.println("------------------------------");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Peserta getPeserta() {
        return peserta;
    }

    public void setPeserta(Peserta peserta) {
        this.peserta = peserta;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<Peserta> getPesertas() {
        return pesertas;
    }

    public void setPesertas(ArrayList<Peserta> pesertas) {
        this.pesertas = pesertas;
    }
}