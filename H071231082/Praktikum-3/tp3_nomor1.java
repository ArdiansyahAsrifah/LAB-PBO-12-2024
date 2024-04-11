class Engine {
    private String type;

    public Engine() {
        this.type = "";
    }

    public Engine(String type) {
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}

class Motor {
    private String nama;
    private String jenis;
    private int harga;
    private Engine engine;

    public Motor() {
        this.nama = "";
        this.jenis = "";
        this.harga = 0;
        this.engine = new Engine();
    }

    public Motor(String nama, String jenis, int harga, Engine engine) {
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
        this.engine = engine;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenis() {
        return this.jenis;
    }

    public int getHarga() {
        return this.harga;
    }

    public Engine getEngine() {
        return this.engine;
    }
}

public class tp3_nomor1 {
    public static void main(String[] args) {
        Motor motor = new Motor("Honda", "Mobil", 1000000, new Engine());
        motor.setNama("Suzuki");
        motor.setJenis("Motor");
        motor.setHarga(500000);
        motor.setEngine(new Engine("turbo"));

        System.out.println("Nama Motor: " + motor.getNama());
        System.out.println("Jenis Motor: " + motor.getJenis());
        System.out.println("Harga Motor: " + motor.getHarga());
        System.out.println("Tipe Engine: " + motor.getEngine().getType());
    }
}
