public class no1p2 {
    private String name;
    private int age;
    private boolean isMale;

    public no1p2(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public String getGender() {
        return isMale ? "Male" : "Female";
    }

    public static void main(String[] args) {
        
        no1p2 person = new no1p2("Neb", 20, true);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
    }
}
