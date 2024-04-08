package Praktikum_3;
    class HotWheels {
        String name;
        double speed, cash;
        int winningAmount;

        public HotWheels(String name, double speed, int winningAmount, double cash) {
            this.name = name;
            this.speed = speed;
            this.winningAmount = winningAmount;
            this.cash = cash;
        }

        public String getName() {
            return name;
        }

        public double getSpeed() {
            return speed;
        }

        public double getCash() {
            return cash;
        }

        public int getWinningAmount() {
            return winningAmount;
        }

        public void setCash(double cash) {
            this.cash = cash;
        }

        public void setWinningAmount(int winningAmount) {
            this.winningAmount = winningAmount;
        }

        public void showSpec() {
            System.out.println("========== Specification ==========");
            System.out.println("Name            : " + getName());
            System.out.println("Speed           : " + getSpeed());
            System.out.println("Winning Amount  : " + getWinningAmount());
            System.out.println("Cash            : Rp. " + getCash() + "\n");
        }

        public void upgrade(int budget) {
            if (budget > this.getCash()) {
                System.out.printf("%s cannot be upgraded, not enough money...\n", this.getName());
            } else {
                int increaseSpeed = budget / 50000;
                this.speed += increaseSpeed;
                this.setCash(this.getCash() - budget + (budget % 50000));
                System.out.printf("Increases the speed of %s by %d...\n", this.getName(), increaseSpeed);
            }
        }

        public void raceTo(HotWheels enemy) {
            if (this.getSpeed() > enemy.getSpeed()) {
                this.setWinningAmount(this.getWinningAmount() + 1);
                this.setCash(this.getCash() + 40000);
                System.out.printf("%s Wins! The number of Wins from %s reaches %d wins...\n", this.getName(), enemy.getName(), this.getWinningAmount());
            } else if (this.getSpeed() == enemy.getSpeed()) {
                System.out.printf("%s with %s are equally strong! The match ended in a draw...\n", this.getName(), enemy.getName());
            } else {
                enemy.setWinningAmount(enemy.getWinningAmount() + 1);
                enemy.setCash(enemy.getCash() + 40000);
                System.out.printf("%s Wins! The number of Wins from %s reaches %d wins...\n", enemy.getName(), enemy.getName(), enemy.getWinningAmount());
            }
        }
    }

public class TP_2_H071231031 {
    public static void main(String[] args) {
        HotWheels mercebesDenz = new HotWheels("Mercebes-Denz", 4, 0, 20000);
        HotWheels ferharri = new HotWheels("Ferharri", 4, 0, 50000);
    
        System.out.println();
        mercebesDenz.showSpec();
        ferharri.showSpec();
        printBarriers();
    
        mercebesDenz.upgrade(50000);
        printBarriers();
    
        ferharri.upgrade(50000);
        printBarriers();
    
        System.out.println();
        ferharri.showSpec();
        printBarriers();
    
        ferharri.raceTo(mercebesDenz);
        printBarriers();
    
        mercebesDenz.raceTo(ferharri);
        printBarriers();
    
        System.out.println();
        mercebesDenz.showSpec();
        ferharri.showSpec();
    }
    
    public static void printBarriers() {
        System.out.println("================================");
    } 
}