import java.util.ArrayList;

class Karyawan {
    String nama, jabatan;
    int umur;
    double gaji;

    public Karyawan(String nama, String jabatan, int umur, double gaji) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.umur = umur;
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    void showInfo() {
        System.out.println("\nNama    : " + getNama());
        System.out.println("Umur    : " + getUmur());
        System.out.println("Jabatan : " + getJabatan());
        System.out.println("Gaji    : " + getGaji() + "\n");
    }
}

interface Kehidupan {
    void prosesKehidupan();
}

class Pengalaman extends audio implements Kehidupan {
    int pengalamanKerja;
    static double gaji;

    public static double getGaji() {
        return gaji;
    }

    public int getPengalamanKerja() {
        return pengalamanKerja;
    }

    @Override
    public void prosesKehidupan() {
        String word = """
                Pengalaman sebelumnya:
                1. Freelancer\n2. Magang\n3. Pekerja tetap\n4. Tidak ada\n>""";
        pengalamanKerja = Input.angkaInt(word);

        if (pengalamanKerja != 4) {
            String words = "Gaji sebelumnya :";
            gaji = Input.angkaDoub(words);
        }
    }

    public void acceptedSounnd() {
        play("sound_accepted.wav");
    }

    public void rejectedSound() {
        play("sound_rejected.wav");
    }
}

class Pendidikan {
    static String pendidikanAkhir;

    public static String getPendidikanAkhir() {
        return pendidikanAkhir;
    }

    public static void getPendidikan() {
        String word = "Pendidikan terakhir (SD/SMP/SMA/S1/S2/S3) :";
        while (true) {
            String z = Input.wordString(word);
            z = z.toUpperCase();
            if (z.equals("SD") || z.equals("SMP") || z.equals("SMA") || z.equals("S1") || z.equals("S2")
                    || z.equals("S3")) {
                pendidikanAkhir = z;
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
    }
}

class Projek {
    static int jumlahProjek;

    public static int getJumlahProjek() {
        return jumlahProjek;
    }

    public static void getProjek() {
        String word = """
                Projek IT :
                1. Minimal 4\n2. Minimal 8\n3. Minimal 12\n4.Lebih dari 15\n>""";
        jumlahProjek = Input.angkaInt(word);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Karyawan> listKaryawan = new ArrayList<>();
        while (true) {
            String word = """
                    Data Karyawan : 
                    1. Tambah karyawan\n2. Tampilkan data karyawan\n3. Keluar\n> """;
            int x = Input.angkaInt(word);

            switch (x) {
                case 1:
                    String inputNama = "Nama    : ";
                    String inputUmur = "Umur    : ";

                    String nama = Input.wordString(inputNama);
                    int umur = Input.angkaInt(inputUmur);

                    Pengalaman pengalaman = new Pengalaman();
                    pengalaman.prosesKehidupan();
                    Pendidikan.getPendidikan();
                    Projek.getProjek();

                    if (Pendidikan.getPendidikanAkhir() != "SD" && Pendidikan.getPendidikanAkhir() != "SMP"
                            && Projek.getJumlahProjek() != 1 && umur >= 18) {
                        System.out.println("Selamat, karyawan diterima");
                        pengalaman.acceptedSounnd();
                        Karyawan karyawan = new Karyawan(nama, "Karyawan", umur, Pengalaman.getGaji());
                        listKaryawan.add(karyawan);

                    } else {
                        System.out.println("Karyawan tidak memenuhi syarat");
                        pengalaman.rejectedSound();
                    }

                    break;
                case 2:
                    if (listKaryawan.isEmpty()) {
                        System.out.println("List kosong, silahkan masukkan data karyawan terlebih dahulu");
                    } else {
                        System.out.println("Data karyawan : ");
                        for (Karyawan karyawan : listKaryawan) {
                            karyawan.showInfo();
                        }
                    }
                    break;
                case 3:
                    System.out.println("==========GOODBYE==========");
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}