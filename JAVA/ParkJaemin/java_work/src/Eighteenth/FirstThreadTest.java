package Eighteenth;

import java.util.Random;

// new Thread를 하여 Runnable을 implement한 객체를 생성하면
// 무조건 Thread가 CPU를 획득하기위해 경쟁하며 run()이 구동하게 된다.
class Worker implements Runnable {
    // Runnable - 구현할 메소드가 run() 하나 뿐인 함수형 인터페이스
    // 워커 클래스에서 러너블 인터페이스(실행가능한 상태)를 구현
    String name;
    private int sleepTime; // 슬립타임 (일정시간을 기다리게하는 메서드)
    private final static Random generator = new Random(); //새로운 랜덤 값을 발생

    public Worker(String name) { // 생성자 호출
        this.name = name;
        sleepTime = generator.nextInt(3000) + 500; // 3.5초후 실행
    }

    @Override
    public void run() { //Runnable 인터페이스를 구현할 메소드 run()의 오버라이딩
        System.out.println("시작");
        try {
            // sleep()에 들어가는 숫자는 ms단위다
            // 그러므로 1/1000 초를 의미함.

            // 운영체제 : 시분할 스케줄링(제어권 위임)
            // Q. 근데 sleep()이랑 이게(시분할) 무슨 관계일까?
            // A. 기본적으로 시분할 스케줄링에서 아직 일 처리할 것들이 많은데
            //    시간이 만료되어 제어권이 다른녀석에게 양도되었다.
            //    그러면 제어권을 양도한 녀석은 어디에 있을까?
            //    Wait Queue라는 대기열에서
            //    자신의 차례가 올 때까지 대기하고 있다.
            //    스케줄링할때는 이 Wait Queue에서 스케줄링을 하게 된다.
            //    스케줄링에서 현재 프로세스를 제외합니다란 뜻을
            //    내부적으로 내포하고 있다.
            Thread.sleep(sleepTime); // 위에서 딜레이 타임을 실행
        } catch (InterruptedException e) {
        }
        System.out.println(name + "SCV가 미네랄을 채취했습니다.");
        // 트라이 캐치에서 오류가 없다면 try문에서 벗어나 출력
    }
}

public class FirstThreadTest {
    public static void main(String[] args) {
        // ps -ef 혹은 ps -alx 등을 통해서 프로세스를 볼 수 있다.
        // Thread가 구동 되는 것을 보고자 한다면
        // ps -eLf를 통해 여러 스레드가 존재함을 확인 할 수 있다.
        // 윈도우의 경우에는 프로세스 내부에 여러 스레드가 존재함.
        // 반면 유닉스(맥)나 리눅스는 이 부분에 차이가 있는데
        // 프로세스도 별개 이며 스레드도 별개로 관리한다.
        // 다만, 스레드는 프로세스에 소속된 대원 정도로 관리한다.
        // 결국 프로세스는 해당 소속의 대빵을 의미하게 된다.

        // new Thread(new Worker()) 부분에서
        // 프로세스에 소속된 스레드가 하나 생성
        // main()은 프로세스(스레드들의 대장)가 된다.

        Thread t1 = new Thread(new Worker("대가리장군"));
        System.out.println("준비");
        Thread t2 = new Thread(new Worker("대갈장군"));
        Thread t3 = new Thread(new Worker("뿌뿌"));

        // 현 시점(리눅스)에서 스레드는
        // 모두 독립적인 각각의 Task(테스크)라고 한다.
        // 수업중에 프로세스는 무엇의 추상화라고 했었는지 기억이 나는가?
        // CPU의 추상화라고 하였다.
        // 왜? CPU가 기계어를 구동시켜야지만 프로그램 코드가 돌아가니까
        // (운영체제개론)

        // | 음악듣기 | 게임하기 | 프로그래밍하기 |

        // 정상적인 프로그래머라면 반드시 알아야하는 4가지 VM 영역
        // Stack(스택) : 지역 변수 영역
        // Heap(힙) : 동적할당 (new, malloc)
        // Data(데이터) : static, 전역변수
        // Text(텍스트) : 기계어, 메서드, 함수

        // 프로세스가 되는 조건이 무엇인지?
        // 우리가 만든 프로그램 코드들이 VM 메모리 영역으로 올라갈때(load)
        // 실행할 때 ps 명령어로 보면 존재하다가
        // 실행이 끝나면 ps 명령어로 봐도 보이지 않았음.

        // 초등학교 갑니다 : 구체적
        // 중학교 갑니다 : 구체적
        // 고등학교 갑니다 : 구체적
        // 학교 갑니다 : 추상화

        // CPU가 프로그램을 실행합니다 : 구체적
        // 프로세스 : 추상화

        // Q: 인터페이스가 추상화를 잘해야 한다는 것이
        //    인터페이스를 대충 훌터봐도
        //    이게 뭘 하는구나란 생각이 들어야 하는건가요?
        // A: 추상화와 가독성은 다소 차이가 있다.
        //    추상화가 잘 되었다는 것은 이런 의미다.
        //    println()
        //    출력 : 콘솔 출력
        //    출력 : 네트워크 출력
        //    내부의 상세 사항을 잘 몰라도 사용하는데 지장이 없다.

        //    추상화를 잘 한다는 것은 해당 라이브러리(매서드)를 만든 사람은
        //    구체 사항 또한 잘 알고 있어야 하지만
        //    이것을 사용하는 신입 개발자나 팀원은 상세 사항을 몰라도
        //    사용하는데 큰 문제가 없게 만드는 것을 의미한다.
        //    이것이 잘 되면 생산성이 올라가고 유지보수성이 올라간다.

        //    직원이 많아 질수록 생산성이 떨어지는 이유는?
        //    할일도 많고 사람도 많다
        //    오염도가 높아서 그렇다(1명의 코드가 잘못된다면 그걸 참고한 사람들의 코드도 다시 바꿔야 하기때문)


        // 실질적으로 run()을 수행하는 시점은
        // 여기서 start()를 하는 케이스에 해당한다.
        t1.start();
        t2.start();
        t3.start();
    }
}
