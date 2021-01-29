package Eleventh;

// extends 키워드는 상속 키워드이다.
// class Student2 extends Person2는
// Student2 클래스에 Person2 클래스의 정보를 상속하겠다는 의미
class Student2 extends Person2 {
    private String major;

    public Student2(String name, int age, String major) {
        // super() 는 부모 클래스를 의미한다.
        // this 는 자기 자신을 의미한다.
        super(name, age);
        this.major = major;
    }

    // 상속을 했어도 접근제한자가 private 인 데이터는 접근할 수 없다.
    // 부모 클래스에서 getter 를 만들고
    // super.getName() 을 호출해서 데이터에 접근해야 한다.
    @Override
    public String toString() {
        return "Student2{" + "name='" + super.getName() +
                "', age=" + super.getAge() +
                ", major='" + major + '\'' +
                '}';
    }
}

class Person2 {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Q: 결국 상속을 사용하는 이유는 무엇인가?
// A: 짧게 쓰기위해 ==
//    메모리를 아낄려고 ==
//    원할한 유지보수를 위해 ==
//    야근 안할라고
public class InheritanceTest {
    public static void main(String[] args) {
        Person2 p = new Person2("Tom", 33);
        System.out.println(p);

        Student2 s = new Student2(
                "Kevin", 52, "Farmer");
        System.out.println(s);
    }
}
