package TP4_1_H071231054.utils;

public class StringUtils {
    public static String nickname(String fullName) {
        String[] kata = fullName.split(" ");
        if (kata.length == 1) {
            return fullName;
        } else {
            return kata[1];
        }
    }
}