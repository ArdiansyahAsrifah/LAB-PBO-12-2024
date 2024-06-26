package Praktikum4;

import java.util.ArrayList;
import java.util.Scanner;
import Praktikum4.models.Profile;
import Praktikum4.models.User;
import Praktikum4.utils.StringUtils;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

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


        int selectMenu = sc.nextInt();
        sc.nextLine();
        switch (selectMenu) {
            case 1:

                showLoginMenu();
                break;
            case 2:

                showRegisterMenu();
            default:

                runApp();
        }
    }

    private static void showLoginMenu() {

        System.out.println("-------------------------");
        System.out.println("Login");

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

            boolean isPasswordMatch = listUser.get(userIndex).getPassword().equals(password);


            if (isPasswordMatch) {
                System.out.println("Berhasil Login");

                showDetailUser(listUserProfile.get(userIndex));
                System.exit(0);
            } else {

                System.out.println("Password Salah");
            }
        } else {
            System.out.println("Username tidak ditemukan");
        }

        runApp();
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        String username = "";
        while (true) {

            System.out.println("Username");
            System.out.print("> ");
            username = sc.nextLine();
            if (username.isEmpty()) {
                System.out.println("Username tidak boleh kosong");
            } else if (isUsernameExists(username)) {
                System.out.println("Username sudah digunakan");
            } else {
                break;
            }
        }

        String password = "";
        while (true) {
            System.out.println("Password");
            System.out.print("> ");
            password = sc.nextLine();
            if (password.length() < 8) {
                System.out.println("Password minimal terdiri dari 8 jarakter");
                continue;
            }
            break;
        }


        User user = new User(username, password);


        Profile profile = new Profile();


        String fullName = "";
        while (true) {
            System.out.println("Nama Lengkap");
            System.out.print("> ");
            fullName = sc.nextLine();
            if (fullName.isEmpty()) {
                System.out.println("Nama lengkap tidak boleh kosong");
                continue;
            }
            break;
        }
        String ageInput = "";
        int age = 0;
        while (true) {
            System.out.println("Umur");
            System.out.print("> ");
            ageInput = sc.next();
            sc.nextLine();
            if (ageInput.isEmpty()) {
                System.out.println("Umur tidak boleh kosong");
                continue;
            }
            try {
                age = Integer.parseInt(ageInput);
            } catch (Exception e) {
  
                System.out.println("Inputan harus berupa angka");
                continue;
            }
            break;
        }
        String hobby = "";
        while (true) {
            System.out.println("Hobby");
            System.out.print("> ");
            hobby = sc.nextLine();
            if (hobby.isEmpty()) {
                System.out.println("Hobby tidak boleh kosong");
                continue;
            }
            break;
        }


        profile.setFullName(fullName);
        profile.setAge(age);
        profile.setHobby(hobby);

        profile.setNickName(StringUtils.getNickName(fullName));

      
        listUser.add(user);

        listUserProfile.add(profile);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static boolean isUsernameExists(String username) {
        for (User user : listUser) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    private static void showDetailUser(Profile profile) {
      
        System.out.println("-------------------------");
        System.out.println("SELAMAT DATANG !!");
        System.out.println("-------------------------");
        System.out.printf("%-15s: %s\n", "Nama Lengkap", profile.getFullName());
        System.out.printf("%-15s: %s\n", "Nama Panggilan", profile.getNickName());
        System.out.printf("%-15s: %d\n", "Umur", profile.getAge());
        System.out.printf("%-15s: %s\n", "Hobby", profile.getHobby());
        System.out.println("-------------------------");
    }
}