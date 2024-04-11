package tp3_nomor2;

public class HotWheels {
    String name;
    double speed, cash;
    int winningAmount;

    public HotWheels(String n, double s, double c, int w) {
        this.name = n;
        this.speed = s;
        this.cash = c;
        this.winningAmount = w;
    }

    public HotWheels(String name, int speed, int cash) {
        this.name = name;
        this.speed = speed;
        this.cash = cash;
    }

    public HotWheels() {
        this("", 0, 0);
    }

    public void showSpec() {
        System.out.println("========== Specification ==========");
        System.out.println("Name : " + this.name);
        System.out.println("Speed : " + this.speed);
        System.out.println("Winning Amount : " + this.winningAmount);
        System.out.println("Cash : Rp. " + this.cash + "\n");
    }

    public void upgrade(int budget) {
        if (budget > this.cash) {
            System.out.printf("%s cannot be upgraded, not enough money...\n", this.name);
        } else {
            int increaseSpeed = budget / 50000;
            this.speed += increaseSpeed;
            this.cash -= budget + (budget % 50000);
            System.out.printf("Increases the speed of %s by %d...\n", this.name, increaseSpeed);
        }
    }

    public void raceTo(HotWheels enemy) {
        if (this.speed > enemy.speed) {
            this.winningAmount++;
            this.cash += 40000;
            System.out.printf("%s Wins! The number of Wins from %s reaches %d wins...\n", this.name,
                    enemy.name, this.winningAmount);
        } else if (this.speed == enemy.speed) {
            System.out.printf("%s with %s are equally strong! The match ended in a draw...\n", this.name,
                    enemy.name);
        } else {
            enemy.winningAmount++;
            enemy.cash += 40000;
            System.out.printf("%s Wins! The number of Wins from %s reaches %d wins...\n", enemy.name,
                    enemy.name, enemy.winningAmount);
        }
    }

    public String getName() {
        return this.name;
    }

    public double getSpeed() {
        return this.speed;
    }

    public double getCash() {
        return this.cash;
    }

    public int getWinningAmount() {
        return this.winningAmount;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setSpeed(double s) {
        this.speed = s;
    }

    public void setCash(double c) {
        this.cash = c;
    }

    public void setWinningAmount(int w) {
        this.winningAmount = w;
    }
}