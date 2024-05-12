package Praktikum7;

public class Karyawan extends Pendidikan {
    private String nama;
    private int umur;
    private String jabatan;
    private double gaji;
    private Keluarga keluarga; // Menambahkan atribut untuk Keluarga

    public Karyawan(String nama, int umur, String jabatan, double gaji) {
        super("");
        this.nama = nama;
        this.umur = umur;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setKeluarga(Keluarga keluarga) {
        this.keluarga = keluarga;
    }

    public Keluarga getKeluarga() {
        return keluarga;
    }

    public void prosesKehidupan() {
        System.out.println("Proses kehidupan dengan nama " + nama);
    }
}
