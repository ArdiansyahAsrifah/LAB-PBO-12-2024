package TP4_1_H071231031.Models;

public class Profile {
    private String namaLengkap;
    private String namaPanggil;
    private int Umur;
    private String Hobby;

    public Profile(String hobby, int umur) {
        this.namaLengkap = namaLengkap;
        this.namaPanggil = namaPanggil;
        Umur = umur;
        Hobby = hobby;
    }
    public Profile() {
        //TODO Auto-generated constructor stub
    }
    public String getNamaLengkap() {
        return namaLengkap;
    }
    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }
    public String getNamaPanggil() {
        return namaPanggil;
    }
    public void setNamaPanggil(String namaPanggil) {
        this.namaPanggil = namaPanggil;
    }
    public int getUmur() {
        return Umur;
    }
    public void setUmur(int umur) {
        Umur = umur;
    }
    public String getHobby() {
        return Hobby;
    }
    public void setHobby(String hobby) {
        Hobby = hobby;
    }
}
