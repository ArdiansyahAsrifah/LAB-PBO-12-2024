package Praktikum3.TP3_2_H071231074;

public class HotWheels {
    String name;
    double speed, cash;
    int winningAmount;

    //TODO1: Create a constructor according to your needs in Main.java
    public HotWheels(String name, double speed, double cash) {
        this.name = name;
        this.speed = speed;
        this.cash = cash;
    }

    public HotWheels() {
        this.name = "";
        this.speed = 0;
        this.cash = 0;
    }

    public void showSpec() {
    //TODO 2: Call all the getter methods and print the output according to the format
    System.out.println("==========Specification==========");
    System.out.printf("%-15s: %s\n", "Name", this.getName());
    System.out.printf("%-15s: %.1f\n", "Speed", this.getSpeed());
    System.out.printf("%-15s: %d\n", "WinningAmount", this.getWinningAmount());
    System.out.printf("%-15s: Rp.%.1f\n\n", "Cash", this.getCash());
}


    // Method to upgrade speed
    public void upgrade(int budget) {
        if (budget > this.getCash()) {
            System.out.printf("%s cannot be upgraded, not enough money...\n", this.getName());
        } else {
            // Every Rp.50,000 increases speed by 1
            int increaseSpeed = budget / 50000;
            //TODO3: Increase the speed of the car
            speed += increaseSpeed;

            this.setCash(this.getCash()-budget+(budget%50000));
            System.out.printf("Increases the speed of %s by %d...\n", this.getName(), increaseSpeed);
        }
    }

    public void raceTo(HotWheels enemy) {
        //TODO4: Validate if the speed of this car is greater than the enemy's speed
        if (speed > enemy.speed) {
            //TODO5: Increase the winning amount
             this.setWinningAmount(1);
            //TODO6: Increase the cash of this car by 40000
            this.setCash(this.getCash() + 40000);
            //TODO7: Call all the getter methods and print the output according to the format
            System.out.printf("%s Wins! The number of Wins from %s reaches %d wins...\n", name, name, winningAmount);
        } else if (speed == enemy.speed) { // If the speed is equal
            System.out.printf("%s with %s are equally strong! The match ended in a draw...\n", name, enemy.name);
        } else { // If the speed of this car is less than the enemy's speed
            //TODO8: Increase the winning amount of the enemy
            enemy.winningAmount++;
            //TODO9: Increase the cash of the enemy by 40000
            enemy.setCash(enemy.getCash() + 40000);
            System.out.printf("%s Wins! The number of Wins from %s reaches %d wins...\n", enemy.getName(), enemy.getName(), enemy.getWinningAmount());
        }
    }

    // Getter and setter methods
    //TODO10: Create getter and setter methods for all the attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public int getWinningAmount() {
        return winningAmount;
    }

    public void setWinningAmount(int winningAmount) {
        this.winningAmount = winningAmount;
    }
}
