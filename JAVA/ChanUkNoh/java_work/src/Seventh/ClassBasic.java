package Seventh;

// 클래스 만드는 방법
// 1) class를 적고 뒤쪽에 클래스 이름을 적고 중괄호를 열고 닫는다.
//    클래스 명은 변수명과 같이 자유롭게 적는다.
//    단, 변수와 마찬가지로 어떤 목적으로 만드는지 직관적이어야 한다.
// 2) 중괄호 내부에는 클래스가 가져야할 속성을 변수로 만든다.
//    ex) 현재 케이스에서는 사람이므로 이름과 나이가 이에 해당한다.
// 3) 해당 속성들을 제어할 수 있는 메서드로 구성된다.

class Person {
    String name;
    int age;

    // 메서드 작성법
    // 1) public을 적는다.
    // 2) 뒤쪽에 메서드가 넘겨줄 데이터 타입을 적는다. (메서드 리턴 타입)
    //    int, String, float, double, void ...
    //    메서드 리턴 타입이 void인 경우 반환할 데이터가 없음을 의미한다.
    // 3) 메서드 이름도 직관적으로
    // 4) 소괄호 내부에는 입력 받을 인자를 기입한다.
    //    주의사항: 키보드입력이 아님!!

    //     3  입력
    //     |
    //   --------
    //   |      |    매서드 본체
    //   --------
    //        |
    //        9   출력

    // 5) 메서드 기본 골격을 갖췄으므로 실제 메서드의 동작을 작성한다.

    public void setName(String name) {
        this.name = name;
    }
    // 인자와 클래스 내부의 변수의 이름이 같으면 혼동을 방지하기 위해 this를 사용한다.
    public void setAge(int a) {
        age = a;
    }

    // void면 return이 없다.
    // 그러나, return이 있다면 넘겨주는 데이터타입과 return값의 데이타입이 같아야 한다.
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

        // 메서드를 사용하는 이유가 무엇일까?
        // 1) 편리성 - 재활용
        //    전제조건: 메서드를 잘 설계하여 유지보수를 쉽도록 만든 경우

       p.setName("아무개");
        p.setAge(12);

        System.out.println("이름: " + p.getName());
        System.out.println("나이: " + p.getAge());
    }
}
