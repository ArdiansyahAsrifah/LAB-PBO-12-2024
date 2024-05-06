public class Bulldog extends Anjing {
    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position += 1;
    }
    
    @Override
    public void describe() {
        System.out.println("========== Bulldog Info ==========");
        System.out.println("Nama: Bulldog");
        System.out.println("Ciri-ciri: Bertubuh kekar, hidungnya datar.");
        System.out.println("Panjang Rata-rata: " + averageLength + " cm");
        System.out.println("Posisi: " + position );
        System.out.println("==================================");
    }
}