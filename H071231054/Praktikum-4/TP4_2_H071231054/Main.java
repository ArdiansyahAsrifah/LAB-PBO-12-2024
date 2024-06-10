package TP4_2_H071231054;
import TP4_2_H071231054.Buku;
import TP4_2_H071231054.SelfUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("=============================================");
        Buku buku = new Buku();
        buku.displayInfo();
        System.out.println("=============================================");
        Buku buku1 = new Buku("The Girl's", 3, "Banny", "Thriller", "Kelas dipenuhi peringkat");
        buku1.displayInfo();
        System.out.println("=============================================");
        SelfUtils.displaySelfData();
        System.out.println("=============================================");        
    }
}
