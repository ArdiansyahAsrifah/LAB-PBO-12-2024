package TP8_1_H071231031;

public class UiThread extends Thread {
    private final int totalTugas;
    private final long waktuMulai;
    private int berhasil;
    private int gagal;

    public UiThread(int totalTugas, long waktuMulai) {
        this.totalTugas = totalTugas;
        this.waktuMulai = waktuMulai;
    }

    public synchronized void perbaruiProgres(boolean sukses) {
        if (sukses) {
            berhasil++;
        } else {
            gagal++;
        }
        notify();
    }

    @Override
    public void run() {
        System.out.println("Start load " + totalTugas + " Data");
        while (berhasil + gagal < totalTugas) {
            try {
                Thread.sleep(1000);
                long waktuLalu = (System.currentTimeMillis() - waktuMulai) / 1000;
                System.out.println("Loading... (" + waktuLalu + "s)");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long waktuAkhir = (System.currentTimeMillis() - waktuMulai) / 1000;
        System.out.println("Task Finish.");
        System.out.println("Time Execution: " + waktuAkhir + "s");

        if (gagal == 0) {
            System.out.println("All data is successfully loaded");
        } else {
            System.out.println(berhasil + " Data Successfully Loaded & " + gagal + " Data Failed to load");
        }
    }
}