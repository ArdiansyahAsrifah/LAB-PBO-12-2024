

public class Pitbull extends Anjing {
    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position += 3;
    }

    @Override
    public void describe() {
        System.out.println("========== Pitbull Info ==========");
        System.out.println("Nama: Pitbull");
        System.out.println("Ciri-ciri: Berotot, kuat, dan ganas.");
        System.out.println("Panjang Rata-rata: " + averageLength + " cm");
        System.out.println("Posisi: " + position );
        System.out.println("==================================");
    }
}