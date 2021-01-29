package Seventh.Seventh_Quiz;
import java.util.Arrays;
class  startMemberAccount {
    int[] member;

    public void account(int loop) {

        member = new int[loop];

        for (int i = 0; i < loop; i++) {
            member[i] = (int) (Math.random() * 1201 + 2400);

        }
    }

    @Override
    public String toString() {
        return "StartUp{" +
                "직원의 연봉은= " + Arrays.toString(member) +
                '}';
    }


}

public class SeventhQuiz2 {
    public static void main(String[] args) {

        // 변수의 정의: 특정 데이터타입을 저장할 수 있는 공간.
        // 클래스란 결국 ? 일종의 데이터타입
        // new 를 하면서 실제 클래스를 활용할 수 있게된다.
        //startUp su = new startUp()
//
//
//
//        노 클래스 버전으로 만들어보자!
//         스타트업 회사에 4명의 직원이 있다.
//         이 직원들의 급여는 최소 2400 이상이며
//        이들간의 차이는 최대 1200 정도라고 가정한다.
//        각각의 랜덤한 연봉을 출력해보도록 만들어보자!
        //2) 위의 1 번 문제를 이젠 클래스를 활용하여 만들어보자!


        startMemberAccount ma = new startMemberAccount();
        ma.account(4);
        System.out.println(ma);
    }
}
