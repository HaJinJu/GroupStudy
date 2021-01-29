package Class20210112;

class Test{
    private int age;
    private String name;
    private String major;

    //int age;
    //String name;
    //String major;

    public Test(int a, String n, String m){
        age = a;
        name = n;
        major = m;

    }
    public void camouflageTest(int a, String n, String m){

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

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    // 클래스 객체가 println()의 입력으로 넘어올때
    // 만약 클래스 내부에 toString()dl 구현되어 있다면
    // println()은 클래스 내부에있는 toString()을 실행하게 된다.
    @Override
    public String toString(){
     return "Test{"+ "age=" +age+ ", name = "+name+'\'' + ",major" + major + '\''+ '}';


    }
}


public class FirstPrivate {
    public static void main(String[] args) {
        Test te = new Test(30, "abc", "alpgabet");
        System.out.println(te);

        // private 으로 지정한 데이터는 현재와 같이 클래스 외부('중괄호 열기 닫기)에서 접근할 수 없다
        // 문약 외부에서 접근해서 값을 바꾸려면 setter 혹은 별도의 변경 매서드가 필요하
//        te.age =3;
//        te.name = "wow";
//        te.major = "hi";
        te.camouflageTest(41, "john", "Phy");

        System.out.println(te);
        //
    }
}
