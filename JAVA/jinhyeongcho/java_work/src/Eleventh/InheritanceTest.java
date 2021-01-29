package Eleventh;
class Person2{
    private String name;    //이름 부여
    private int age;        // 숫자특성  나이를 부여


    //생성자 생성!
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
            // extends 키워드는 상속키워드 입니다.
            // class Student2 extends Person2 는
            // Student2 클래스에 Person2 클래스의 정보를 상속하겠다는 의미
class Student2 extends Person2{
    String major;

    public Student2(String name, int age, String major) {
        // super() 는 부모 클래스를 의미한다.
        // this 는 자기 자신을 의미한다.
        super(name, age);
        this.major = major;
    }
    public  void test(){
        System.out.println(super.getName());
    }
    @Override
    public String toString() {
        // super.getName() 부모 클래스에 있는 getName()을 호출해주세요.
        return "Student2{" +"name='"+ super.getName() +
                "', age=" + super.getAge() +
        ", major='" + major + '\'' +
        '}';
    }
}


public class InheritanceTest {
    public static void main(String[] args) {
        Person2 p=  new Person2("Tom",33);
        System.out.println(p);

        Student2 s = new Student2(
                "Kevin",52,"Farmer"
        );
        System.out.println(s);
        s.test();
    }
}
