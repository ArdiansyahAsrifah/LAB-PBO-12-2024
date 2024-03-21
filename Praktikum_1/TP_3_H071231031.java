package Praktikum_1;

import java.util.Scanner;

public class TP_3_H071231031 {
    public static String formatDate(String Masukan) {
        String[] Tanggal = Masukan.split("-");

        String Bulan = "";
        switch (Tanggal[1]) {
            case "01":
                Bulan = "Januari";
                break;
            case "02":
                Bulan = "Februari";
                break;
            case "03":
                Bulan = "Maret";
                break;
            case "04":
                Bulan = "April";
                break;
            case "05":
                Bulan = "Mei";
                break;
            case "06":
                Bulan = "Juni";
                break;
            case "07":
                Bulan = "Juli";
                break;
            case "08":
                Bulan = "Agustus";
                break;
            case "09":
                Bulan = "September";
                break;
            case "10":
                Bulan = "Oktober";
                break;
            case "11":
                Bulan = "November";
                break;
            case "12":
                Bulan = "Desember";
                break;
        }

        String year = Integer.parseInt(Tanggal[2]) >= 25 ? "19" + Tanggal[2] : "20" + Tanggal[2];

        String newDateString = Tanggal[0] + " " + Bulan + " " + year;

        return newDateString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Masukan = scanner.nextLine();

        String formattedDate = formatDate(Masukan);
        System.out.println(formattedDate);

        scanner.close();
    }
}