public class no3 {

    public static String konversiTanggal(String tanggalInput) {
        String[] bagian = tanggalInput.split("-");

        int hari = Integer.parseInt(bagian[0]);
        int bulan = Integer.parseInt(bagian[1]);
        int tahun = Integer.parseInt(bagian[2]);

        if (tahun < 100) {
            tahun += (tahun < 50) ? 2000 : 1900;
        }

        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        String bulanKonversi = namaBulan[bulan - 1]; 
        return hari + " " + bulanKonversi + " " + tahun;
    }

    public static void main(String[] args) {
        String tanggal1 = "01-04-03";
        System.out.println(konversiTanggal(tanggal1)); 

        String tanggal2 = "02-01-98";
        System.out.println(konversiTanggal(tanggal2));
    }
}
