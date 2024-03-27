package Praktikum2;
import java.util.Scanner;

class Person {
    String name;
    int age;
    boolean isMale;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public int getAge() {
        return age;
    }

    public void setGender(boolean newIsmale) {
        isMale = newIsmale;
    }

    public String getGender() {
        if (isMale) {
            return "Male";
        } else {
            return "Female";
        }
    }
}

public class TP2_1_H071231074 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person person1 = new Person();

        System.out.println("Masukkan nama: ");
        String name = scan.nextLine();
        person1.setName(name);

        System.out.println("Masukkan usia: ");
        int age = scan.nextInt();
        person1.setAge(age);

        System.out.println("Apakah jenis kelaminnya laki-laki? (Opsi: true/false)");
        boolean isMale = scan.nextBoolean();
        person1.setGender(isMale);

        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Gender: " + person1.getGender());

        scan.close();
    }
}