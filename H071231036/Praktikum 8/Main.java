import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static final int JUMLAH_DATA_SUMBER = 4;
    private static final int JUMLAH_BOT = 3;
    private static int dataLoaded = 0;

    public static void main(String[] args) {
        System.out.println(String.format("Start load %d data", JUMLAH_DATA_SUMBER));

        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        ExecutorService fixedThreadPoolExecutor = Executors.newFixedThreadPool(JUMLAH_BOT);

        UiThread uiThread = new UiThread();
        singleThreadExecutor.execute(uiThread);

        for (int i = 1; i <= JUMLAH_DATA_SUMBER; i++) {
            Bot bot = new Bot();
            fixedThreadPoolExecutor.execute(bot);
        }

        fixedThreadPoolExecutor.shutdown();
        while (!fixedThreadPoolExecutor.isTerminated()) {
            // Waiting for all bot threads to finish
        }

        uiThread.eits();  // Stop the UiThread
        singleThreadExecutor.shutdown();
        while (!singleThreadExecutor.isTerminated()) {
            // Waiting for UiThread to finish
        }

        System.out.println("Task Finish");
        System.out.println("Time Execution: " + uiThread.getJumlah());

        if (dataLoaded == JUMLAH_DATA_SUMBER) {
            System.out.println("All Data are successfully Loaded");
        } else {
            int failedToLoad = JUMLAH_DATA_SUMBER - dataLoaded;
            System.out.printf("%d Successfully Loaded & %d Data failed to Load", dataLoaded, failedToLoad);
        }
    }

    public static synchronized void increaseDataLoaded() {
        dataLoaded++;
    }
}

class Bot extends Thread {
    public void run() {
        int d = TaskTimeHelper.getTaskExecutionTime();
        if (d > 4) {
            System.out.println("Request Time Out");
        } else {
            try {
                Thread.sleep(d * 1000);
                Main.increaseDataLoaded();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class UiThread extends Thread {
    private boolean yes = true;
    private int jumlah = 0;

    public void run() {
        while (yes) {
            jumlah++;
            try {
                Thread.sleep(1000);
                System.out.printf("Loading...(%ds)\n", jumlah);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void eits() {
        yes = false;
    }

    public int getJumlah() {
        return jumlah;
    }
}

class TaskTimeHelper {
    public static int getTaskExecutionTime() {
        return (int) (Math.random() * 6) + 1;
    }
}
