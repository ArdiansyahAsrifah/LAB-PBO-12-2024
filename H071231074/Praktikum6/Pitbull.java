package Praktikum6;

public class Pitbull extends Dog {
    Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void describe() {
        System.out.println("Seekor anjing petarung yang memiliki tubuh kekar dan rahang yang kuat");
    }

    @Override
    void move() {
        position += 3;
        System.out.println("Pitbull bergerak sejauh " + position + " meter");
    }
}
