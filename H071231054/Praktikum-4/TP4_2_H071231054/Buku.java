package TP4_2_H071231054;

public class Buku {
    String judul;
    int durasi;
    String pengarang;
    String genre;
    String sinopsis;
    
    public Buku() {
        this.judul = "Bumi";
        this.durasi = 2;
        this.pengarang = "Elys";
        this.genre = "Drama";
        this.sinopsis = "Keindahan yang tertutup";
    }
    public Buku(String judul, int durasi, String pengarang, String genre, String sinopsis) {
        this.judul = judul;
        this.durasi = durasi;
        this.pengarang = pengarang;
        this.genre = genre;
        this.sinopsis = sinopsis;
    }
    public String getjudul() {
        return judul;
    }
    public void setjudul(String judul) {
        this.judul = judul;
    }
    public int getDurasi() {
        return durasi;
    }
    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }
    public String getPengarang() {
        return pengarang;
    }
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getSinopsis() {
        return sinopsis;
    }
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void displayInfo(){
        System.out.println("judul\t\t: " + judul);
        System.out.println("Durasi\t\t: " + durasi + " jam");
        System.out.println("Pengarang\t: " + pengarang);
        System.out.println("Genre\t\t: " + genre);
        System.out.println("Sinopsis\t: " + sinopsis);
    }
}
