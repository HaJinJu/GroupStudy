package Seventh;

import java.util.Arrays;

class Salary {
    int[] Salary;

    public void setSalary(int Num){
        int i;

        Salary = new int[Num];

        for (i = 0; i < 4; i++){
            Salary[i] = (int)(Math.random() * 1201) + 2400;
        }
    }

    // toString을 사용하면
    // 클래스 변수의 내부 정보를 System.out.println으로 확인할 수 있게 된다.
    public String toString() {
        return "StartUp{" + "StartMemberAccount = " + Arrays.toString(Salary) + '}';
    }

}

public class Quiz2 {
    public static void main(String[] args) {
        //SalryEx1을 클래스를 활용하여 만들어보자

        // 변수의 정의 : 특정 데이터타입을 저장할 수 있는 공간
        // 클래스란 결국? 일종의 데이터타입
        // new를 하면서 실제 클래스를 활용할 수 있게 된다.
        Salary sa = new Salary();

        sa.setSalary(4);
        System.out.println(sa);
    }
}
