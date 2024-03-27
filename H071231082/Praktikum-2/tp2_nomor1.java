class Orang {
    String name;
    int age;
    boolean isMale;

    void setName(String inputName) {
        name = inputName;
    }
    void setAge(int inputAge) {
        age = inputAge;
    }
    void setGender(boolean InputIsMale) {
        isMale = InputIsMale;
    }

    String getName() {
        return name;
    }
    int getAge() {
        return age;
    }
    String getGender() {
        if (isMale) {
            return "Male"; 
        } else {
            return "Female";
        }
    }
}

public class tp2_nomor1 {
    public static void main(String[] args) {
        Orang imam = new Orang();
        imam.setName("Imam");
        imam.setAge(19);
        imam.setGender(true);

        System.out.println(imam.getName() + "\n" + imam.getAge() + "\n" + imam.getGender());
    }
}



