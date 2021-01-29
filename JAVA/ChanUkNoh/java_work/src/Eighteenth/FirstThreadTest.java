package Eighteenth;

import java.util.Random;


class Worker implements Runnable {
    String name;
    private int sleepTime;
    private final static Random generator = new Random();

    public Worker(String name) {
        this.name = name;
        sleepTime = generator.nextInt(3000) + 10000;
    }

    @Override
    public void run() {
        try {
            // sleep()에 들어가는 숫자는 ms 단위다.
            // 그러므로 1 / 1000 초를 의미함

            // 운영체제: 시분할 스케쥴링(제어권 위임)
            // 근데 sleep()이랑 무슨 관계일까?
            // 기본적으로 시분할 스케쥴링에서 아직 일 처ㅣ할 것들이 많은데
            // 시간이 만료되어 제어권이 다른 녀석에게 양도되었다면
            // 제어권을 양도한 녀석은 어디에 있을까?
            // Wait Queue라는 대기열에서 자신의 차례가 올때 까지
            // 대가히고 있다.
            // 스케쥴링할때는 이 Wait Queue 에서 스케쥴링을 하게된다.
            // 스케쥴링에서 현재 프로세스를 제외합니다란 뜻을
            // 내부적으로 내포하고 있다.
            // 자바는 sleep을 통해 제어권 양도의 시간약속을 보장한다.
            // 즉, 정해진 시간 이후 반드시 제어권을 받는다.
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {

        }

        System.out.println(name + "SCV가 미네랄을 채취했습니다.");
    }
}

public class FirstThreadTest {
    // main은 프로세스 - 메인을 실행시키면 프로세스에 올라간다.
    public static void main(String[] args) {
        // ps -ef 혹은 ps -alx 등을 통해서 프로세스를 볼 수 있다.
        // Thread가 구동되는 것을 보고자 한다면
        // ps -eLf 를 통해 여러 스레드가 존재함을 확인할 수 있다.
        // 윈도우의 경우에는 프로세스 내부에 여러 스레드가 존재한다.
        // 반면 유닉스(맥)나 리눅스는 이 부분에서 차이가 있는데
        // 프로세스도 별개이며 스레드도 별개로 관리한다.
        // 다만 스레드는 프로세스에 소속된 대원 정도로 관리한다
        // 결국 프로세스는 해당 소속의 대빵을 의미하게 된다.


        // new Thread를 하여 Runnable을 implements한 객체를 생성하면
        // 무조건 Thread가 CPU를 흭득하기 위해 경쟁하며 run()이 구동되게 된다.

        // Runnable을 implements한 Worker라는 파일을 스레드로 만든다.
        // 스레드가 CPU로부터 시분할을 받으면 Runnable 인터페이스의
        // run()이 구동된다.
        Thread t1 = new Thread(new Worker("대머리 독수"));
        Thread t2 = new Thread(new Worker("대갈장군"));
        Thread t3 = new Thread(new Worker("뿌뿌뿡"));

        // 만들어진 스레드를 프로세스 리스트에 올린다.
        // 여기서 실제로 시작되지는 않고 CPU가 프로세스에게 할당한 시간이
        // 끝나면 그 때부터 CPU 경쟁을 통해 CPU에게 선택받으면
        // 스레드가 실행된다.
        t1.start();
        t2.start();
        t3.start();

        // 현 시점(리눅스)에서 스레드는 모두 독립적인 각각의 테스크이다.
        // 수업 중에 프로세스는 무엇의 추상화라고 했는지 기억이 나는가?
        // CPU의 추상화이다.
        // 왜 ? CPU가 기계어를 구동시켜야지만 프로그램 코드가 돌아가니까

        // 정상적인 프로그래머라면 반드시 알아야 하는 4가지 VM영역
        // Stack(스택): 지역 변수 영역
        // Heap(힙): 동적할당(new, malloc)
        // Data(데이터): static, 전역변수
        // Text(텍스트): 기계어, 메서드, 함수

        // 프로세스가 되는 조건이 무엇일까?
        // 우리가 만든 프로그램 코드들이 VM 메모리 영역으로 올라갈때(load)
        // 실행할 때 ps 명령어로 보면 존재하다가 실행이 끝나면 ps 명령어로 보이지 않음

        // 초등학교 간다: 구체화
        // 중학교 갑니다: 구체화
        // 고등학교 갑니다: 구체화
        // 학교 갑니다: 추상화

        // CPU는 한 순간에 한 가지 일만 할 수 있다: 구체
        // CPU가 여러 프로세스들을 동시에 돌아가는 것처럼
        // 보이게 만들기 위해 시분할 방식으로 우선순위를 줘서 돌립니다: 구체화
        // 여러 프로세스들이 실행됩니다: 추상화

        // 추상화를 잘 한다는 것은 해당 라이브러리(메서드)를 만든 사람은
        // 구체 사항 또한 잘 알고 있어야 하지만
        // 이 것을 사용하는 신입 개발자나 팀원은 상세 사항을 몰라도
        // 사용하는데 큰 문제가 없게 만드는 것을 의미한다.
        // 이것이 잘 되면 생산성이 올라가고 유지보수성이 올라간다.

        // 직원이 많아질 수록 생산성이 떨어지는 이유가 이에 해당한다.
        // 추상화된 라이브러리들을 모든 사람이 이해하기 어렵기 때문
        // 그니깐 추상화를 잘하자
    }
}
