class Test {

    // private 클래스 범주내에서는 자유롭게 접근 가능 외부에서는 접근 불가
    // 정보 은닉 - 데이터는 private
    // 캡슐화 = 데이터를 가공하는 메소드 public

    private int age;
    private String name;
    private String major;

    public Test(int a, String n, String m) {
        age = a;
        name = n;
        major = m;
    }

    public void camoutFlage(int a, String n, String m) {
        age = a;
        name = n;
        major = m;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "{" +
            " age='" + getAge() + "'" +
            ", name='" + getName() + "'" +
            ", major='" + getMajor() + "'" +
            "}";
    }
}

public class FirePrivate {
    public static void main(String[] args) {

        Test t = new Test(1, "seulgi", "mediaContents");

        // t.age = "3";
        // t.name = "나";
        // t.major = "몰라";
        t.camoutFlage(41, "john", "science");
        System.out.println(t);
    }
}
