package Seventh.Seventh_Quiz;

public class SeventhQuiz1 {
    public static void main(String[] args) {
        // 1) 노클래스 버전으로 만들어보자!
        //    스타트업 회사에서 4명의 직원이 있다.
        //    이 직원들의 급여는 최소 2400 이상이며
        //    이들간의 차이는 최대 1200 정도라고 가정한다.
        //    각각의 랜덤한 연봉을 출력해보도록 만들어보자!

        final int staff = 4;

        int[] startMemberAccount = new int[staff];
        for(int i= 0;i< staff;i++) {
            startMemberAccount[i] = (int) (Math.random() * 1201) + 2400;
            System.out.printf("arr[%d] = %d\n", i, startMemberAccount[i]);
        }




    }
}
