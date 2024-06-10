class Manusia{
    String name;
    int usia;
    int tinggi;
    void turu(){
        System.out.println("zzz");
    }
    void show(){
        System.out.println("\nnama\t: " + this.name);
        System.out.println("usia\t: " + this.usia);
        System.out.println("tinggi\t: " + this.tinggi);
    }

}

class Adi extends Manusia{
    void nari(){
        System.out.println("tantrum");
    }
}

class Ipunk extends Manusia{
    void belajar(){
        System.out.println("iyekeh");
    }
}

public class apalahdia{
    public static void main(String[] args) {
        Manusia hooh = new Manusia();
        hooh.name = "komang";
        hooh.usia = 109;
        hooh.tinggi = 50;
        hooh.turu();
        hooh.show();

        Adi adiii = new Adi();
        adiii.name = "AADII";
        adiii.usia = 100;
        adiii.tinggi = 200;
        adiii.nari();
        adiii.turu();
        adiii.show();

        Ipunk pratama = new Ipunk();
        pratama.name = "Aipun";
        pratama.usia = 100;
        pratama.tinggi = 200;
        pratama.turu();
        pratama.belajar();
        pratama.show();
    }
}

