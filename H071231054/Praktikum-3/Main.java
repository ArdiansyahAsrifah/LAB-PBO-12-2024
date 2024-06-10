import java.util.ArrayList;
import TP3_1_H071231054.Runner;
import TP3_1_H071231054.Peserta;


public class Main {
    public static void main(String[] args) {

        ArrayList<Peserta> pesertas = new ArrayList<>();
        
        Peserta peserta1 = new Peserta("Michael", 19, "Makassar", 10);
        Peserta peserta2 = new Peserta("Richard", 20, "Surabaya", 8 );
        pesertas.add(peserta1);
        pesertas.add(peserta2);
        Runner runner1 = new Runner("Runner", peserta1, 2024);
        runner1.setListPeserta(pesertas);

        printBarriers();
        runner1.displayRunnerInfo();
        printBarriers();
        peserta1.displayPesertaInfo();
        printBarriers();
        peserta1.upgradeDistance(12);
        printBarriers();
        peserta1.winnerDistance();

        peserta2.displayPesertaInfo();
        printBarriers();
        peserta2.upgradeDistance(10);
        printBarriers();
        peserta2.winnerDistance();

        printBarriers();
        runner1.displayPemenang();

    }

    public static void printBarriers() {
        System.out.println("===============================================");
    }
}