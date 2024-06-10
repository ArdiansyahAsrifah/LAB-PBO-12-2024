package TP4_1_H071231054;

import java.util.ArrayList;
import java.util.Scanner;
import TP4_1_H071231054.models.Profile;
import TP4_1_H071231054.models.User;
import TP4_1_H071231054.utils.StringUtils;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");

        int selectMenu = input.nextInt();
        input.nextLine();
        
        switch (selectMenu) {
            case 1:
            if (listUser.isEmpty()) {
                System.out.println("User tidak ada, silahkan register terlebih dahulu...");
                showRegisterMenu();
            } else {
                showLoginMenu();
            }
                break;
            case 2:
                showRegisterMenu();
                break;
            default:
                System.out.println("Silakan pilih 1 atau 2 !!");
                runApp();
        }
    }

    private static void showLoginMenu() {
        System.out.println("-------------------------");
        System.out.println("Login");
        System.out.println("Masukkan Username");
        System.out.print("> ");
        String username = input.nextLine();
        if (username.isEmpty()) {
            System.out.println("Username tidak boleh kosong...");
            showLoginMenu();
            return;
        }
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
            String password = input.next();
            boolean isPasswordMatch = listUser.get(userIndex).getPassword().equals(password);

            if (isPasswordMatch) {
                System.out.println("Berhasil Login");
                showDetailUser(listUserProfile.get(userIndex));
                System.exit(0);
            } else {
                System.out.println("Password Salah...");
                showLoginMenu();
            }
        }
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");
        System.out.println("Username");
        System.out.print("> ");
        String username = input.nextLine();
        if (username.isEmpty()) {
            System.out.println("Username tidak boleh kosong...");
            return;
        }

        for (User user : listUser) {
            if (user.getUsername().equals(username)) {
                System.out.println("Username sudah digunakan...");
                showRegisterMenu();
                return;
            }
        }

        System.out.println("Password");
        System.out.print("> ");
        String password = input.nextLine();
        if (password.isEmpty()) {
            System.out.println("Password tidak boleh kosong...");
            showRegisterMenu();
            return;
        }

        if (password.length() < 8) {
            System.out.println("Panjang password harus minimal 8 karakter");
            showRegisterMenu();
            return;
        }
        
        User user = new User(username, password);
        listUser.add(user);

        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = input.nextLine();
        if (fullName.isEmpty()) {
            System.out.println("Nama lengkap tidak boleh kosong...");
            showRegisterMenu();
            return;
        }
        
        System.out.println("Umur");
        System.out.print("> ");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = input.nextLine();

        Profile profile = new Profile(fullName, age, hobby, StringUtils.nickname(fullName));
        listUserProfile.add(profile);

        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static void showDetailUser(Profile profile) {
        System.out.println("-------------------------");
        System.out.println("SELAMAT DATANG !!");
        System.out.println("-------------------------");
        System.out.println("Nama Lengkap\t: " + profile.getFullName());
        System.out.println("Nama Panggilan\t: " + profile.getNickName());
        System.out.println("Umur\t\t: " + profile.getAge());
        System.out.println("Hobby\t\t: " + profile.getHobby());
        System.out.println("-------------------------");
    }
}