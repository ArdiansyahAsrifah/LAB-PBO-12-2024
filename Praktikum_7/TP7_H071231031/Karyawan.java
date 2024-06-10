public class Karyawan {
    private String nama;
    private int umur;
    private String jabatan;
    private double gaji;

    // Constructor
    public Karyawan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
        this.jabatan = "Karyawan";
    }

    // Getter dan setter
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

    // Method overload
    public void printInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji: " + gaji);
    }

    public void printInfo(String additionalInfo) {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji: " + gaji);
        System.out.println(additionalInfo);
    }
}
