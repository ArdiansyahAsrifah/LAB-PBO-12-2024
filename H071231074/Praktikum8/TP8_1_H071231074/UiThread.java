package Praktikum8.TP8_1_H071231074;

public class UiThread {
    public void mulai(int jumlahdata) {
        System.out.println("Start load " + jumlahdata + " Data.");
    }

    public void updateLoading(int seconds) {
        System.out.println("Loading... (" + seconds + "s)");
    }

    public void taskFinish(int totalTime, int success, int failed) {
        if (failed > 0) {
            System.out.println("Task Finish.");
            System.out.println("Time Execution: " + totalTime + "s");
            System.out.println(success + " Data Successfully Loaded & " + failed + " Data failed to load.");
        } else {
            System.out.println("Task Finish.");
            System.out.println("Time Execution: " + totalTime + "s");
            System.out.println("All data is successfully loaded");
        }
    }
}
