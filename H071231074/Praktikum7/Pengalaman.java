package Praktikum7;

public class Pengalaman extends Kehidupan {
    private String jenisPekerjaan;

    public Pengalaman(String jenisPekerjaan) {
        this.jenisPekerjaan = jenisPekerjaan;
    }

    public String getJenisPekerjaan() {
        return jenisPekerjaan;
    }

    public void setJenisPekerjaan(String jenisPekerjaan) {
        this.jenisPekerjaan = jenisPekerjaan;
    }

    @Override
    public void prosesKehidupan() {
        System.out.println("Proses kehidupan dengan pengalaman " + jenisPekerjaan);
    }
}
