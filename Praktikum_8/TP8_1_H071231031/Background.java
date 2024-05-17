package TP8_1_H071231031;

public class Background implements Runnable {
    private final int id;
    private boolean sukses;

    public Background(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        int waktuEksekusi = TaskTimeHelper.waktuAcak();
        try {
            Thread.sleep(waktuEksekusi * 1000);
            if (waktuEksekusi > 4) {
                System.out.println("Request Timeout");
                sukses = false;
            } else {
                sukses = true;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            sukses = false;
        }
    }

    public boolean isSukses() {
        return sukses;
    }
}
