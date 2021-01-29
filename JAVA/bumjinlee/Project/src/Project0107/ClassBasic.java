package Project0107;

//클래스를 만드는 방법
//1.class 를 적고 뒤쪽에 클래스 이름을 적고 중괄호를 열고 닫는다.
//  클래스 명은 변수명과 같이 자유롭게 적는다. 변수와 마찬가지로 어떤 목적으로 만드는지 알 수 있게 만든다.
//2.중괄호 내부에는 클래스가 가져야할 속성을 변수로 만든다.
//  현재 케이스에서는 사람이므로 이름, 나이가 이에 해당한다.
//3.해당 속성들을 제어할 수 있는 메서드로 구성된다.
class Person{
    String name;
    int age;

    //메서드 작성법
    //1.일단은 무조건 public을 적는다.
    //2.뒤쪽에는 메서드가 넘겨줄 데이터 타입을 적는다.
    //  int, string, float, double, void(공허한,텅 빈)
    //  만약 이 부분에 void가 적혀있으면 넘겨줄 데이터가 없음을 의미한다.
    //3.메서드 이름을 작성한다.
    //  마음대로 작명해도 되지만 역시 무엇을 하는건지 이름을 보고 알 수 있는 것이 좋다.
    //4.소괄호 내부에는 입력받을 인자를 기입한다.
    //  주의사항: 입력은 키보드 입력이 아니다.
    //5.메서드의 기본 골격을 갖췄으므로 실제 메서드가 어떤 작업을 할 것인지 내용을 작성한다.
    public void setName(String name) {
        //이름이 같은경우 혼동을 방지하기 위해 this를 사용한다.
        this.name = name;
    }
    public void setAge(int a) {
        age = a;
    }
    //void면 리턴이 없다.
    //그러나 return이 있다면 넘겨주는 데이터 타입과
    //return 옆에 오는 클래스 내 변수의 데이터 타입이 같아야 한다
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

public class ClassBasic {
    public static void main(String[] args) {
        Person p = new Person();

        //메서드를 사용하는 이유
        //1.편리성 - 재활용, 전제조건 - 메서드를 잘 설계하고 유지보수가 쉽도록 만들었을 경우우
       //
        p.setName("아무개");
        p.setAge(12);

        System.out.println("이름 : " + p.getName());
        System.out.println("나이 : " + p.getAge());
    }
}