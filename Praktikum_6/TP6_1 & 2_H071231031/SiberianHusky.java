public class SiberianHusky extends Anjing {
    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position += 2;
    }

    @Override
    public void describe() {
        System.out.println("========== Siberian Husky Info ==========");
        System.out.println("Nama: Siberian Husky");
        System.out.println("Ciri-ciri: Berbulu tebal, matanya berwarna biru, dan kuat.");
        System.out.println("Panjang Rata-rata: " + averageLength + " cm");
        System.out.println("Posisi: " + position );
        System.out.println("==================================");
    }
}