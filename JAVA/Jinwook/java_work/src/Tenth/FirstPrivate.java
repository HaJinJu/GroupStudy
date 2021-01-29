package Tenth;
class Test {
    private int age;
    private String name;
    private String major;

//    int age;
//    String name;
//    String major;

    public Test(int a, String n, String m) {
        age = a;
        name = n;
        major = m;
    }

    public void camouflageTest(int a, String n, String m) {
        age = a;
        name = n;
        major = m;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return "Test{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}



public class FirstPrivate {
    public static void main(String[] args) {
        Test t = new Test(1, "abc", "alphabet");
        System.out.println(t);


        // private  으로 지정한 데이터는
        // 현재와 같이 클래스 외부에서 접근할 수 없다
        // 만약 외부에서 접근해서 값을 바꾸려면
        // setter 혹은 별도의 변경 메서드가 필요하다


//        t.age = 3;
//        t.name "wow";
//        t.major = "hi";
        t.camouflageTest(41,"Jhon", "Physics");


        System.out.println(t);


    }
}
