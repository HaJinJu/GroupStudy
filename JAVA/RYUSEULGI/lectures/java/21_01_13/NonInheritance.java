class Student {
    private String name;
    private int age;
    private String major;

    public Student(String name, int age, String major){
        this.name = name;
        this.age = age;
        this.major = major;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + name + "'" +
            ", age='" + age + "'" +
            ", major='" + major + "'" +
            "}";
    }
}

class Personn {
    private String name;
    private int age;

    public Personn(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + name + "'" +
            ", age='" + age + "'" +
            "}";
    }

}


public class NonInheritance {
    public static void main(String[] args) {
        Personn p = new Personn("john", 10);
        System.out.println(p);

        Student s = new Student("bob", 20, "art");
        System.out.println(s);
    }
}
