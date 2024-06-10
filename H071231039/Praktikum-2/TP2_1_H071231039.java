class Person{
    String name;
    int age;
    boolean isMale;

    void setName(String name){
        this.name = name;
    }

    String getname(){
        return name;
    }

    void setAge(int age){
        this.age = age;
    }

    int getAge(){
        return age;
    }

    void setGender(boolean isMale){
        this.isMale = isMale;
    }

    String getGender(){
        if(isMale == true){
            return "Laki-laki";
        } else{
            return "Perempuan";
        }
    }

}

public class TP2_1_H071231039 {
    public static void main(String[] args){
    Person person = new Person();

    person.setName("Muhammad Dirga Dian Nugraha");
    person.setAge(19);
    person.setGender(true);

    System.out.println("Name : " + person.getname());
    System.out.println("Age : " + person.getAge());
    System.out.println("Gender : " + person.getGender());

    }
 }