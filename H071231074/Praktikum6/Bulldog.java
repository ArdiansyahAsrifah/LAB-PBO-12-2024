package Praktikum6;

public class Bulldog extends Dog {
    Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void describe() {
        System.out.println("Bulldog: Berkepala besar, badan yang padat dan kuat.");        
    }

    @Override
    void move() {
        position += 1;
        System.out.println("Bulldog bergerak maju sejauh 1 langkah.");
    }

    
}
