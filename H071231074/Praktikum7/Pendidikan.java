package Praktikum7;

public class Pendidikan {
    private String tingkatPendidikan;

    public Pendidikan(String tingkatPendidikan) {
        this.tingkatPendidikan = tingkatPendidikan;
    }

    public String getTingkatPendidikan() {
        return tingkatPendidikan;
    }

    public void setTingkatPendidikan(String tingkatPendidikan) {
        this.tingkatPendidikan = tingkatPendidikan;
    }

    public void prosesPendidikan() {
        System.out.println("Proses pendidikan dengan tingkat " + tingkatPendidikan);
    }
}
