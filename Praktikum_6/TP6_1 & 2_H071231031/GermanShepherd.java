public class GermanShepherd extends Anjing {
    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        System.out.println("German Shepherd bergerak maju 3 langkah");
        position += 3;
    }

    @Override
    public void describe() {
        System.out.println("========== German Shepherd Info ==========");
        System.out.println("Nama: German Shepherd");
        System.out.println("Ciri-ciri: Berbadan besar, cerdas, dan setia.");
        System.out.println("Panjang Rata-rata: " + averageLength + " cm");
        System.out.println("Posisi: " + position );
        System.out.println("==================================");
    }
}