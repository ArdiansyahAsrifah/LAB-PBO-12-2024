public class TP3_1_H071231039 {
    public static void main(String[] args) {
        // Membuat objek pemain
        Pemain pemain1 = new Pemain("David Beckham", 7, "Gelandang");
        Pemain pemain2 = new Pemain("Cristiano Ronaldo", 10, "Penyerang");

        // Membuat objek tim sepakbola
        Sepakbola tim = new Sepakbola("Real Madrid", 11);
        tim.setKapten(pemain1);

        // Menampilkan informasi tim
        tim.tampilkanInfoTim();

        // Menampilkan informasi pemain
        System.out.println("Pemain 1:");
        System.out.println("Nama: " + pemain1.getNama());
        System.out.println("Nomor Punggung: " + pemain1.getNomorPunggung());
        System.out.println("Posisi: " + pemain1.getPosisi());

        System.out.println("\nPemain 2:");
        System.out.println("Nama: " + pemain2.getNama());
        System.out.println("Nomor Punggung: " + pemain2.getNomorPunggung());
        System.out.println("Posisi: " + pemain2.getPosisi());
    }
}
