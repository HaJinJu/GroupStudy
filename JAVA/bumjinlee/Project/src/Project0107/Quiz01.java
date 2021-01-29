package Project0107;

import java.util.Random;

public class Quiz01 {
    public static void main(String[] args) {
        /* 스타트업 회사에 4명의 직원이 있다
            이 직원들의 급여는 최소 2400이상이며, 이들간의 차이는 최대 1200 정도라고 가정한다.
            각각의 랜덤한 연봉을 출력해보도록 만들어보자.
            노 클래스 버전으로..
         */

        final int MEMBER = 4;
        int arr[] = new int[MEMBER];

        for(int i = 0; i < MEMBER; i++) {
            arr[i] = (int) (Math.random() * 1201) + 2400;

            System.out.println("연봉 : " + arr[i]);
        }
    }
}

