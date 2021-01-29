package Eleventh;
        //상속
class Student{
    String name;     //이름부여
    int age;         // 숫자특성  나이를 부여
    String major;    // 전공부여

    public Student(String name, int age, String major) {
                this.name = name;
                this.age = age;
                this.major = major;
    }
    @Override
    public String toString() {
                return "Student{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        ", major='" + major + '\'' +
                        '}';
    }
}

class Person{
    String name;    //이름 부여
    int age;        // 숫자특성  나이를 부여


    //생성자 생성!
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class NonInheritanceTest {
    public static void main(String[] args) {
        Person p = new Person("Jhon",20);
        System.out.println(p);

        Student s = new Student("David",21,"Art");
        System.out.println(s);
    }
}
