package Praktikum7;

public class Keluarga {
    private boolean sudahMenikah;
    private int jumlahAnak;

    public Keluarga(boolean sudahMenikah, int jumlahAnak) {
        this.sudahMenikah = sudahMenikah;
        this.jumlahAnak = jumlahAnak;
    }

    public boolean isSudahMenikah() {
        return sudahMenikah;
    }

    public void tentangNikah() {
        System.out.print("Status: ");
        if (sudahMenikah) {
            System.out.println("Sudah menikah.");
        } else {
            System.out.println("Belum menikah.");
        }
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void tentangAnak() {
        System.out.println("Jumlah anak: " + jumlahAnak);
    }
}
