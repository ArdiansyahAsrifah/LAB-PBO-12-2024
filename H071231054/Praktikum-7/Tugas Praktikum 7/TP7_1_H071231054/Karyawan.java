public class Karyawan extends Keluarga {
    Keluarga keluarga = new Keluarga();
    String nama;
    int umur;
    String jabatan;
    double gaji;

    public Karyawan(String nama, int umur, String jabatan, double gaji, String inputStatus) {
        this.nama = nama;
        this.umur = umur;
        this.jabatan = jabatan;
        this.gaji = gaji;
        this.inputStatus = inputStatus;
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

    public void displayInfo() {
        System.out.println("Nama\t: " + nama);
        System.out.println("Umur\t: " + umur);
        System.out.println("Status\t: " + inputStatus);
        System.out.println("Jabatan\t: " + jabatan);
        System.out.println("Gaji\t: Rp. " + gaji);
        System.out.println();
    }
}
