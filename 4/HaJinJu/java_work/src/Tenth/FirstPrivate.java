package Tenth;
class Test {
    private int age;
    private String name;
    private String major;

    /*
    int age;
    String name;
    String major;
     */

    public Test(int a, String n, String m) {
        age = a;
        name = n;
        major = m;
    }

    // 클래스 내부에서만 공유할 수 있는 방법이 없을까요 ?
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

    // 클래스 객체가 println() 의 입력으로 넘어올때
    // 만약 클래스 내부에 toString()이 구현되어 있다면
    // println()은 클래스 내부에 있는 toString()을 실행하게 된다.
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
    class Test {
        private int age;
        private String name;
        private String major;

    /*
    int age;
    String name;
    String major;
     */

        public Test(int a, String n, String m) {
            age = a;
            name = n;
            major = m;
        }

        // 클래스 내부에서만 공유할 수 있는 방법이 없을까요 ?
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

        // 클래스 객체가 println() 의 입력으로 넘어올때
        // 만약 클래스 내부에 toString()이 구현되어 있다면
        // println()은 클래스 내부에 있는 toString()을 실행하게 된다.
        @Override
        public String toString() {
            return "Test{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    ", major='" + major + '\'' +
                    '}';
        }
    }
}