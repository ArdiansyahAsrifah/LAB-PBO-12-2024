public class Sepakbola {
        // Atribut
        private String namaTim;
        private int jumlahPemain;
        private Pemain kapten;
    
        // Constructor
        public Sepakbola(String namaTim, int jumlahPemain, Pemain kapten) {
            this.namaTim = namaTim;
            this.jumlahPemain = jumlahPemain;
            this.kapten = kapten;
        }
    
        public Sepakbola(String namaTim, int jumlahPemain) {
            this.namaTim = namaTim;
            this.jumlahPemain = jumlahPemain;
        }
    
        // Behaviour
        public void tampilkanInfoTim() {
            System.out.println("Nama Tim: " + namaTim);
            System.out.println("Jumlah Pemain: " + jumlahPemain);
            if (kapten != null) {
                System.out.println("Kapten: " + kapten.getNama());
            } else {
                System.out.println("Belum ada kapten.");
            }
        }
    
        public void setKapten(Pemain kapten) {
            this.kapten = kapten;
        }
    
        // Getter dan setter
        public String getNamaTim() {
            return namaTim;
        }
    
        public void setNamaTim(String namaTim) {
            this.namaTim = namaTim;
        }
    
        public int getJumlahPemain() {
            return jumlahPemain;
        }
    
        public void setJumlahPemain(int jumlahPemain) {
            this.jumlahPemain = jumlahPemain;
        }
    
        public Pemain getKapten() {
            return kapten;
        }
}
    
