package Praktikum_3;
class Ultraman {
    String name;
    int health = 30; 
    String ultraAttack = "Pukul Ultra"; 
    String spaciumBeam = "Siraman Rohani"; 


    public Ultraman(String name) {
        this.name = name;
    }

    public void checkStatus() {
        System.out.println("===== Status Ultraman =====");
        System.out.println("Name            : " + this.getName());
        System.out.println("Health          : " + this.getHealth());
    }

    public void launchUltraAttackTo(Zetton enemy) {
        System.out.printf("%s Mengeluarkan %s kepada %s ... \n", this.getName(), this.getUltraAttack(), enemy.getName());
        double damage = 0.15 * enemy.getHealth(); 
        enemy.health -= (int) damage;
    }

    public void launchSpaciumBeamTo(Zetton enemy) {
        System.out.printf("%s Mengeluarkan %s kepada %s ... \n", this.getName(), this.getSpaciumBeam(), enemy.getName());
        enemy.health -= 0.5 * enemy.getHealth(); 
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getUltraAttack() {
        return ultraAttack;
    }

    public void setUltraAttack(String ultraAttack) {
        this.ultraAttack = ultraAttack;
    }

    public String getSpaciumBeam() {
        return spaciumBeam;
    }

    public void setSpaciumBeam(String spaciumBeam) {
        this.spaciumBeam = spaciumBeam;
    }
}

class Zetton {
    String name;
    int health = 40; 
    String zettonBreaker = "Pemecah Z-Ton"; 
    String oneTrillionFireball = "Kelereng Berapi";

    public Zetton() {
    }

    public Zetton(String name) {
        this.name = name;
    }

    public void checkStatus() {
        System.out.println("===== Status Zetton =====");
        System.out.println("Name            : " + this.getName());
        System.out.println("Health          : " + this.getHealth());
    }

    public void launchZettonBreakerTo(Ultraman enemy) {
        System.out.printf("%s Mengeluarkan %s kepada %s ... \n", this.getName(), this.getZettonBreaker(), enemy.getName());
        double damage = 0.15 * enemy.getHealth(); 
        enemy.health -= (int) damage;
    }

    public void launchOneTrillionFireballTo(Ultraman enemy) {
        System.out.printf("%s Mengeluarkan %s kepada %s ... \n", this.getName(), this.getOneTrillionFireball(), enemy.getName());
        enemy.health -= 0.5 * enemy.getHealth();
    }

  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getZettonBreaker() {
        return zettonBreaker;
    }

    public void setZettonBreaker(String zettonBreaker) {
        this.zettonBreaker = zettonBreaker;
    }

    public String getOneTrillionFireball() {
        return oneTrillionFireball;
    }

    public void setOneTrillionFireball(String oneTrillionFireball) {
        this.oneTrillionFireball = oneTrillionFireball;
    }
}

public class TP_1_H071230131 {
    public static void main(String[] args) {
        Ultraman ultraman = new Ultraman("Ultraman");
        Zetton zetton = new Zetton("Zetton");

        System.out.println("========== Ultra Fight ==========");
        System.out.println("Pertarungan: Ultraman vs Zetton");
        System.out.println("----------------------------------------");
        System.out.println("Status Awal:");
        System.out.println("----------------------------------------");
        System.out.println("Ultraman");
        ultraman.checkStatus();
        System.out.println();
        System.out.println("Zetton");
        zetton.checkStatus();
        System.out.println("----------------------------------------");
        System.out.println();

        int round = 1;
        while 
        (round < 4) {
            System.out.println("Putaran " + round + ":");
            System.out.println("----------------------------------------");

            ultraman.launchUltraAttackTo(zetton);
            zetton.checkStatus();
            System.out.println();

            zetton.launchZettonBreakerTo(ultraman);
            ultraman.checkStatus();
            System.out.println();
            
            ultraman.launchSpaciumBeamTo(zetton);
            zetton.checkStatus();
            System.out.println();

            zetton.launchOneTrillionFireballTo(ultraman);
            ultraman.checkStatus();
            System.out.println("----------------------------------------");
            System.out.println();
            round++;
        }

        System.out.println("========================================");
        System.out.println("Hasil Pertarungan:");
        System.out.println("----------------------------------------");
        System.out.println("Ultraman");
        ultraman.checkStatus();
        System.out.println();
        System.out.println("Zetton");
        zetton.checkStatus();
        System.out.println("----------------------------------------");

        if (ultraman.getHealth() <= 0 && zetton.getHealth() <= 0) {
            System.out.println("Pertarungan seri!");
        } else if (ultraman.getHealth() <= 0) {
            System.out.println("Zetton menang!");
        } else if (zetton.getHealth() <= 0) {
            System.out.println("Ultraman menang!");
        } else {
            System.out.println("Keduanya masih berdiri!, pertarungan seri!");
        }
        System.out.println("========================================");

    } 
}
