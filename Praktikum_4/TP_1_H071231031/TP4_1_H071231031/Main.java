package TP4_1_H071231031;

import java.util.ArrayList;
import java.util.Scanner;
import TP4_1_H071231031.Models.user;
import TP4_1_H071231031.Models.Profile;
import TP4_1_H071231031.util.StringUtils;

public class Main {
    private static ArrayList<user> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Memanggil method runApp();
        runApp();
    }

    private static void runApp() {
        // Menu Utama Aplikasi
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");

        // Menginput pilihan menu
        int selectMenu = sc.nextInt();
        sc.nextLine();
        switch (selectMenu) {
            case 1:
                // Membuka Halaman Login
                showLoginMenu();
                break;
            case 2:
                // Membuka Halaman Register
                showRegisterMenu();
                break; // tambahkan break di sini
            default:
                // Mengulang Pemanggilan Menu Utama
                runApp();
        }
    }

    private static void showLoginMenu() {
        // Halaman Login
        System.out.println("-------------------------");
        System.out.println("Login");
        // Menginput Username dan Menyimpannya di attribute username;
        System.out.println("Masukkan Username");
        System.out.print("> ");

        String username = sc.next();
        int userIndex = -1;
        for (int i = 0; i < listUser.size(); i++) {

            if (listUser.get(i).getUsername().equals(username)) {
                userIndex = i;
                break;
            }
        }

        if (userIndex != -1) {
            System.out.println("Password");
            System.out.print("> ");
            String password = sc.next();

            boolean isPasswordMatch = listUser.get(userIndex).checkPassword(password);

            if (isPasswordMatch) {
                System.out.println("Berhasil Login");
                showDetailUser(listUserProfile.get(userIndex)); 
                System.exit(0);
            } else {
                System.out.println("Password Salah");
            }
        }
    }
    private static void showDetailUser(Profile profile) {
        System.out.println("-------------------------");
        System.out.println("SELAMAT DATANG !!");
        System.out.println("-------------------------");
        System.out.printf("%-15s: %s\n", "Nama Lengkap", profile.getNamaLengkap());
        System.out.printf("%-15s: %s\n", "Nama Panggilan", profile.getNamaPanggil());
        System.out.printf("%-15s: %d\n", "Umur", profile.getUmur());
        System.out.printf("%-15s: %s\n", "Hobby", profile.getHobby());
        System.out.println("-------------------------");
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        // Menginput username dan password
        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();

        String password = "";
        while(true){
            System.out.println("Password");
            System.out.print("> ");
            password = sc.nextLine();
            if (password.length() < 8) {
                System.out.println("Password harus 8 karakter atau lebih");
                continue;
            }
            break;
        }

        // Instance objek User baru dan tambahkan username dan password yang diinput
        user user = new user(username, password);

        // Instance objek Profile baru
        Profile profile = new Profile();

        // Menginput Data Profile
        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = sc.nextLine();
        profile.setNamaLengkap(fullName);

        // Meminta pengguna untuk memasukkan nama panggilan
        profile.setNamaPanggil(StringUtils.buatnama(fullName));
        System.out.println("Umur");
        System.out.print("> ");
        int age = sc.nextInt();
        sc.nextLine();

        if (age < 17) {
            System.out.println("Anda tidak cukup umur. Coba lagi kalau sudah cukup.");
            return; 
        }
        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = sc.nextLine();

        // Berikan nilai age dan hobby ke objek Profile
        profile.setUmur(age);
        profile.setHobby(hobby);

        // Menambahkan user yang dibuat ke list user
        listUser.add(user);
        // Menambahkan Profile user yang dibuat ke list Profile
        listUserProfile.add(profile);
        System.out.println("-------------------------");
        System.out.println("Berhasil Login!!");
        runApp();
    }
}