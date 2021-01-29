package Eleventh;

class Person2 {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Student2 extends Person2 {
    private String major;

    public Student2(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", major='" + major + '\'' +
                '}';
    }
}

public class InheritanceTest {
    public static void main(String[] args) {
        Person2 p = new Person2("Tom", 33);
        System.out.println(p);

        Student2 s = new Student2("Kevin", 52, "Farmer");
        System.out.println(s);
    }
}