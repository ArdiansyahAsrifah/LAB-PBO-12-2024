import java.util.Scanner;

public class TP1_4_H071231039 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        boolean isTrue;
        System.out.println("Masukkan jari-jari lingkaran: ");
        
        
        try {
            double jariJari = n.nextDouble();
            isTrue = (jariJari > 0);
            if (!isTrue) {
                System.out.print("Inputan Salah, masukkan lagi: ");
            } else {
                double luasLingkaran = Math.PI * Math.pow(jariJari, 2);
                System.out.printf("Luas lingkaran yaitu  : %.2f", luasLingkaran);
            }
        } catch (Exception e) {
            isTrue  = false;
            System.out.println("Inputan Salah");
            
        }
        n.close();
    }
}
