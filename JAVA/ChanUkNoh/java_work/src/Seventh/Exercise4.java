package Seventh;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        //   4) 사용자 입력으로 시작값을 받고 사용자 입력으로 끝값을 받고 또다른 사용자 입력을 받는다.
        //    마지막에 입력된 사용자 입력값으로 나눠 떨어지는 숫자들을 시작값과 끝값 사이에서
        //    찾아서 출력하는 메서드 만들어보자
        Exercise4 e4 = new Exercise4();

        e4.a();
    }

    public void a() {
        Scanner sc = new Scanner(System.in);

        System.out.println("start를 입력해주세요");
        int startNum = sc.nextInt();
        System.out.println("end를 입력해주세요");
        int endNum = sc.nextInt();
        System.out.println("anyNum을 입력해주세요");
        int anyNum = sc.nextInt();

        for (int i = startNum; i <= endNum; i++) {
            if (i % anyNum == 0) {
                System.out.println("anyNum으로 나눠 떨어지는 숫자: " + i);
            }
        }
    }
}