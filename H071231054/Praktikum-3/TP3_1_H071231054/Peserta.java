package TP3_1_H071231054;

public class Peserta {
    String name;
    int age;
    String city;
    double distance;

    public Peserta() {
    }

    public Peserta(String name, int age, String city, double distance) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.distance = distance;
    }

    public void displayPesertaInfo() {
        System.out.println("=========== Participant Information ===========");
        System.out.println("Name    : " + this.getName());
        System.out.println("Age     : " + this.getAge());
        System.out.println("City    : " + this.getCity());
        System.out.println("Distance   : " + this.getDistance());
    }

    public void upgradeDistance(double distance) {
        this.setDistance(distance);
        System.out.printf("%s has upgraded distance to: %.1f in final \n", this.getName(), distance);
    }

    public void winnerDistance() {
        if (this.getDistance() >= 900) {
            System.out.println(this.getName() + " is the winner of the olympiad.");
        } else if (this.getDistance() >= 800) {
            System.out.println(this.getName() + " achieved the 2nd place.");
        } else if (this.getDistance() >= 700) {
            System.out.println(this.getName() + " achieved the 3rd place.");
        } else {
            System.out.println(this.getName() + " did not make it to the top 3.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}