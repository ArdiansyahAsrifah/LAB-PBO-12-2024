package Praktikum_1;

import java.util.Scanner;

public class TP_2_H071231031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan :");
        String kata = scanner.nextLine();
    

        char[] charArray = kata.toCharArray();
        boolean spasi = true;
    
        for(int i = 0; i < charArray.length; i++) {
    
          if(Character.isLetter(charArray[i])) {
    
            if(spasi) {
              if (charArray[i] >= 'a' && charArray[i] <= 'z') {
                charArray[i] = (char)(charArray[i] - 'a' + 'A');
              }
              spasi = false;
            }
          }
          else {

            spasi = true;
          }
        }
    
        kata = String.valueOf(charArray);
        System.out.println(kata);
    
        scanner.close();
      }
    }
