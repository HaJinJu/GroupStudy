package Eleventh;

class Student {
    String name;
    int age;
    String major;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, String major, int age) {
        this.name = name;
        this.major = major;
        this.age = age;
    }
}

class Person {
    String name;
    int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class NonInheritanceTest {
    public static void main(String[] args) {
        Person p = new Person("John", 20);
        System.out.println(p);

        Student s = new Student("David", "Art", 22);
        System.out.println(s);
    }
}
