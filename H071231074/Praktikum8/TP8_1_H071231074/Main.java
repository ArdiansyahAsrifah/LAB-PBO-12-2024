package Praktikum8.TP8_1_H071231074;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    private static int failedLoads = 0;

    public static void incrementFailedLoad() {
        failedLoads++;
    }

    public static void main(String[] args) {
        int jumlahdata = 4;
        UiThread uiThread = new UiThread();
        uiThread.mulai(jumlahdata);
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < jumlahdata; i++) {
            executor.submit(new BackgroundThread());
        }
        executor.shutdown();

        try {
            int totalTime = 0;
            while (!executor.awaitTermination(1, TimeUnit.SECONDS)) {
                totalTime++;
                uiThread.updateLoading(totalTime);
            }
            uiThread.taskFinish(totalTime, jumlahdata - failedLoads, failedLoads);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
