public class Pemain {
        // Atribut
        private String nama;
        private int nomorPunggung;
        private String posisi;
    
        // Constructor
        public Pemain(String nama, int nomorPunggung, String posisi) {
            this.nama = nama;
            this.nomorPunggung = nomorPunggung;
            this.posisi = posisi;
        }
    
        // Getter dan setter
        public String getNama() {
            return nama;
        }
    
        public void setNama(String nama) {
            this.nama = nama;
        }
    
        public int getNomorPunggung() {
            return nomorPunggung;
        }
    
        public void setNomorPunggung(int nomorPunggung) {
            this.nomorPunggung = nomorPunggung;
        }
    
        public String getPosisi() {
            return posisi;
        }
    
        public void setPosisi(String posisi) {
            this.posisi = posisi;
        }
}
