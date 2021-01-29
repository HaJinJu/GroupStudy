package Eighth.Quiz;
// 여기는 A사의 B-23 물류 창고이다
// 이 물류 창고에는 많은 수의 화물이 적재되는데
// 화믈을 적재하는 기준이 64개 단위다.
// 어떤 수량의 화물이 오던지
// 화물을 창고에 저장할 수 있게 프로그래밍 해보자
// (화물 크기는 같다고 가정)
// 물류 창고로 들어오는 화물의 개수는 1000~50000 개 사이로 들어온다 가정
// AND NOT 사용(&~)
class ContainerManager{
    int base;
    int start;
    int range;
    int container;

    public void manage(int base, int start, int range) {
        this.base = base;
        this.start = start;
        this.range = range;
    }

    public int processContainer() {
        container = (int)(Math.random() * range) + start;

        System.out.println("물류 창고로 넘어온 화물의 개수 = " + container);

        //AND NOT = 부정 후 AND
        //결국 base 값인 64의 배수로 container를 강제 정렬함을 의미한다
        //이 결과는 무조건적으로 base 값인 64 의 배수로만 나오게됨.
        // 연산 순서는 ~()이 먼저 -> 이후 AND가 진행
        // 이 트릭은 이진수에서만 됨
        // 어떤수 & ~(2^n - 1) = 2^n 의 배수
        // 2^n의 배수에서 1을 빼서 앤드 낫을 하면 어떤수 안에서의 2^n의 배수의 최대값이 나온다
        // 밑을 보면 base -1 = 64 -1 63, container = random
        // -> ~63 AND cantainer = random 값 안에서 64의 최대 배수 값 출력
        return container & ~(base - 1);
    }

    public boolean isBaseOf64() {
        if((container & ~(base - 1)) % 64 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getBase() {
        return base;
    }

    public int getFinalContainerCount() {
        return (container & ~(base - 1)) / base;
    }
}
public class QuizAnswer02 {
    public static void main(String[] args) {
        ContainerManager cm = new ContainerManager();

        cm.manage(64, 1000, 49001);
        int res = cm.processContainer();
        System.out.println(
                "AND NOT 결과 = " + res);

        if(cm.isBaseOf64()) {
            System.out.printf("결과는 %d의 배수가 맞습니다.\n", cm.getBase());
        } else {
            System.out.printf("결과는 %d의 배수가 아닙니다.\n", cm.getBase());
        }

        System.out.println("결과 + 64 = " + (res + 64));

        System.out.println(
                "최종적으로 선적할 컨테이너 개수는 = " +
                        cm.getFinalContainerCount());

        System.out.println("검산 = " +
                cm.getFinalContainerCount() * cm.getBase());
    }
}