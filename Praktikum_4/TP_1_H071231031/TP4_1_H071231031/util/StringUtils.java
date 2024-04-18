package TP4_1_H071231031.util;


public class StringUtils {

    public static String buatnama(String fullName) {
        String[] nameParts = fullName.split(" ");
        if (nameParts.length == 1) {
            return nameParts[0];
        } else {
            return nameParts[1];
        }
    }
}
