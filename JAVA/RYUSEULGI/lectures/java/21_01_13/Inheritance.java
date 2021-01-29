// 상속 받아도 private 선언된 것은 사용 불가
class Person2 {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "{" + " name='" + name + "'" + ", age='" + age + "'" + "}";
    }

}

class Student2 extends Person2{
    private String major;

    public Student2(String name, int age, String major) {
        // super 은 부모 클래스를 의미
        super(name, age);
        this.major = major;
    }

    public void test() {
        System.out.println(super.getName());
    }

    @Override
    public String toString() {
        // super.get() 부모 클래스에 있는 내용 호출
        return "{" +
            " name='" + super.getName() + "'" +
            ", age='" + super.getAge() + "'" +
            ", major='" + major + "'" +
            "}";
    }

}
public class Inheritance {
    public static void main(String[] args) {
        Person2 p = new Person2("Tom", 10);
        System.out.println(p);

        Student2 s = new Student2("Kevin", 20, "Farmer");
        System.out.println(s);
        s.test();
    }
}
