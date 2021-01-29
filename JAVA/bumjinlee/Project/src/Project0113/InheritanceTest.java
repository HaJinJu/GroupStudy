package Project0113;

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
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

//extends 키워드는 상속 키워드다.
//class Student2 extends Person2는
//Student2 클래스에 Person2 클래스의 정보를 상속하겠다는 의미

class Student2 extends Person2 {
    private String major;

    public Student2(String name, int age, String major) {
        //super() 는 부모 클래스를 의미한다.
        //this 는 자기 자신을 의미한다.
        super(name, age);
        this.major = major;
    }

    @Override
    public String toString() {
        //super.getName() 부모 클래스에 있는 get.Name()을 호출해주세요
        return "Student2{" + "name = " + super.getName() +
                ", age = " + super.getAge() +
                ", major = " + major + '\'' +
                '}';
    }
}

//상속을 사용하는 이유는?
//메모리를 아끼고, 유지보수가 쉬워짐

public class InheritanceTest {
    public static void main(String[] args) {
        Person2 p = new Person2("Tom", 33);
        System.out.println(p);

        Student2 s = new Student2("Kevin", 26, "Singer");
        System.out.println(s);
    }
}
