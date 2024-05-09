package Praktikum6;

public class GermanSheperd extends Dog {
    GermanSheperd(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void describe() {
        System.out.println("Anjing German Shepherd merupakan anjing Cerdas, berani, dan setia.");
    }

    @Override
    void move() {
        position += 3;
        System.out.println("German Sheperd bergerak sejauh " + position + " meter");    
    }
}
