package Praktikum1;

import java.util.Scanner;

public class TP1_3_H071231074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tanggal dengan format dd-mm-yy: ");
        String masukan = scanner.nextLine();

        String hasil = konversiFormatTanggal(masukan);
        System.out.println(hasil);

        scanner.close();
    }

    public static String konversiFormatTanggal(String masukan) {
        String[] bagian = masukan.split("-");

        String hari = bagian[0];
        String bulan = bagian[1];
        String tahun = bagian[2];

        int hariInt = Integer.parseInt(hari);
        int bulanInt = Integer.parseInt(bulan);
        int tahunInt = Integer.parseInt(tahun);

        if (tahunInt < 100) { 
            if (tahunInt < 30) {
                tahunInt += 2000;
            } else {
                tahunInt += 1900;
            }
        }

        if (bulanInt < 1 | bulanInt > 12) {
            return "Masukkan bulan dengan benar";
        }
        
        String namaBulan = dapatkanNamaBulan(bulanInt);

        String hasil = hariInt + " " + namaBulan + " " + tahunInt;

        return hasil;
    }

    public static String dapatkanNamaBulan(int bulan) {
        switch (bulan) {
            case 1:
                return "Januari";
            case 2:
                return "Februari";
            case 3:
                return "Maret";
            case 4:
                return "April";
            case 5:
                return "Mei";
            case 6:
                return "Juni";
            case 7:
                return "Juli";
            case 8:
                return "Agustus";
            case 9:
                return "September";
            case 10:
                return "Oktober";
            case 11:
                return "November";
            case 12:
                return "Desember";
            default:
                return "Masukkan bulan dengan benar";
        }
    }
}
