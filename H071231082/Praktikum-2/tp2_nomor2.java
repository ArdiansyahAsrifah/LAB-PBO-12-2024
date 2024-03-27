class Produk {
    String id;
    String nama;
    int stok;
    double harga;

    void setId(String inputId) {
        id = inputId;
    }
    void setNama(String inputNama) {
        nama = inputNama;
    }
    void setStok(int inputStok) {
        stok = inputStok;
    }
    void setHarga(double inputHarga) {
        harga = inputHarga;
    }

    String getId() {
        return id;
    }
    String getNama() {
        return nama;
    }
    int getStok() {
        return stok;
    }
    double getHarga() {
        return harga;
    }

    String isTersedia() {
        if (stok > 0) {
            return "Tersedia";
        } else {
            return "Tidak Tersedia";
        }
    }
}

public class tp2_nomor2 {
    public static void main(String[] args) {
        Produk input = new Produk();
        input.setId("001");
        input.setNama("Produk A");
        input.setStok(10);
        input.setHarga(5000);
        System.out.println("id Produk = " + input.getId() + "\n" + 
                            "Nama Produk = " + input.getNama() + "\n" + 
                            "Stok = " + input.getStok() + "\n" + 
                            "Harga Produk = " + input.getHarga() + "\n" + 
                            "Ketersediaan Produk = " + input.isTersedia());
    }
}

