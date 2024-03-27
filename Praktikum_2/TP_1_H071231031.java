package Praktikum_2;

public class TP_1_H071231031 {
    public static class Orang {
        public String name;
        public int age;
        public boolean isMale;

        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return this.name;
        }
        public void setAge(int age){
            this.age = age;
        }
        public int getAge(){
            return this.age;
        }
        public void setMale(boolean isMale){
            this.isMale = isMale;
        }
        public boolean getMale(){
            return this.isMale;
        }
    }

    public static void main(String[] args){
        Orang Orang1 = new Orang();
        Orang1.setName("Budi");
        Orang1.setAge(19);
        Orang1.setMale(true);

        System.out.println("Nama: " + Orang1.getName());
        System.out.println("Umur: " + Orang1.getAge());
        System.out.println("Pria?: " + Orang1.getMale());
    } 
}
