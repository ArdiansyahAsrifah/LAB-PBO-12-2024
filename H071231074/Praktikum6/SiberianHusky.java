package Praktikum6;

public class SiberianHusky extends Dog {
    SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void describe() {
        System.out.println("Anjing yang sekilas mirip serigala. Memiliki bulu tebal dan lebat yang cocok untuk iklim dingin");        
    }

    @Override
    void move() {
        position += 2;
        System.out.println("Siberian Husky bergerak sejauh " + position + " meter");
    }
    
}
