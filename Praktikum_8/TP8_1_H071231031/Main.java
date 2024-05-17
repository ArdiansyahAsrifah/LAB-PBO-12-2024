package TP8_1_H071231031;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        int totalTugas = 4;
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Background[] tugas = new Background[totalTugas];
        Future<?>[] futures = new Future<?>[totalTugas];

        UiThread uiThread = new UiThread(totalTugas, System.currentTimeMillis());
        uiThread.start();

        for (int i = 0; i < totalTugas; i++) {
            tugas[i] = new Background(i);
            futures[i] = executor.submit(tugas[i]);
        }

        for (int i = 0; i < totalTugas; i++) {
            try {
                futures[i].get();
                uiThread.perbaruiProgres(tugas[i].isSukses());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
    }
}

