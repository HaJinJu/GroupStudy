package Eighth;

class ContainerManger{
    int base;
    int start;
    int range;
    int container;

    public void manage(int base, int start, int range){
        this.base = base;
        this.start = start;
        this.range = range;
    }

    public int processContainer(){
        container = (int)(Math.random() * range) + start;

        System.out.println("물류 창고로 넘어온 화물의 개수 = " + container);

        // AND NOT : 부정 후 AND
        // 결국 base 값인 64의 배수로 container 를 강제 정렬함을 의미한다.
        // 이 결과는 무조건적으로 base 값인 64 의 배수로만 나오게 됨
        // 연산 순위는 ~(NOT)이 먼저 계산되고
        // 이후에 AND 연산이 진행된다.

        // 공식 : 어떤 수 & ~(2^n - 1) = 2^n의 배수
        return container & ~(base - 1);
    }

    public boolean isBaseOf64(){
        if((container & ~(base - 1)) % 64 == 0){
            return true;
        } else {
            return false;
        }

    }

    public int getBase() {
        return base;
    }

    public int getFinalContainerCount(){
        return (container & ~(base-1)) / base;
    }
}

public class QUIZ2 {
    public static void main(String[] args) {
        // 화물을 적재하는 기준 : 64개 단위
        // 어떤 수량의 화물이 오던지 화물을 창고에 저장할 수 있도록 프로그래밍 해보자
        // (화물의 크기는 균일하다고 가정)
        // 화물 개수 : 1000 ~ 50000개 사이로 들어온다고 가정한다.
        ContainerManger cm = new ContainerManger();

        cm.manage(64, 1000, 49001);
        int res = cm.processContainer();
        System.out.println("AND NOT 결과 = " + res);

        if(cm.isBaseOf64()){
            System.out.printf("결과는 %d의 배수가 맞습니다.\n", cm.getBase());
        } else {
            System.out.printf("결과는 %d의 배수가 아닙니다.\n", cm.getBase());
        }
        System.out.println("결과 + 64 = " + (res +64));

        System.out.println("최종적으로 선적할 컨테이너 수 = " + cm.getFinalContainerCount());

        System.out.println("검산 = " + cm.getFinalContainerCount() * cm.getBase());
    }
}
