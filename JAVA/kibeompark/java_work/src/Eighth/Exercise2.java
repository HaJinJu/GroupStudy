package Eighth;

class ContainerManager {
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

        // AND NOT : 부정 후 AND
        // 결국 base 값인 64 의 배수로 container 를 강제 정렬함을 의미한다.
        // 이 결과는 무조건적으로 base 값인 64 의 배수로만 나오게 됨
        // 연산 순위는 ~(NOT)이 먼저 계산되고
        // 이후에 AND 연산이 진행된다.

        // 어떤 수 & ~(2^n - 1) = 2^n 의 배수수
       return container & ~(base - 1);
    }

    public boolean isBaseOf64() {
        if ((container & ~(base - 1)) % 64 == 0) {
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

public class Exercise2 {
    public static void main(String[] args) {
        // 2) 여기는 A 사의 B-23 물류 창고다.
        //    이 물류 창고에는 많은 수의 화물이 적재되는데
        //    화물을 적재하는 기준이 64개 단위다.
        //    어떤 수량의 화물이 오든지
        //    화물을 창고에 저장할 수 있게 프로그래밍 해 보자.
        //    (화물의 크기는 균일하다고 가정한다.)
        //    물류 창고로 들어오는 화물의 개수는
        //    1000 ~ 50000 개 사이로 들어온다 가정한다.
        ContainerManager cm = new ContainerManager();

        cm.manage(64, 1000, 49001);
        int res = cm.processContainer();
        System.out.println("AND NOT 결과 = " + res);

        if(cm.isBaseOf64()) {
            System.out.printf("결과는 %d의 배수가 맞습니다.\n", cm.getBase());
        } else {
            System.out.printf("결과는 %d의 배수가 아닙니다.\n", cm.getBase());
        }

        System.out.println("결과 + 64 = " + (res + 64));

        System.out.println("최종적으로 선적할 컨테이너 개수는 " + cm.getFinalContainerCount());

        System.out.println("검산 = " + cm.getFinalContainerCount() * cm.getBase());
    }
}

/*
package Eighth;

class Warehouse {
    final int UNIT = 64;
    int[] wareArr;
    int randNum, wareCount;

    public void prepareWarehouse() {
        randNum = (int)(Math.random() * 49001) + 1000;
        wareArr = new int[randNum / UNIT + 1];
    }

    public void setWarehouse() {
        wareCount = randNum / UNIT + 1;

        for (int i = 0; i < wareCount; i++) {
            if (i != wareCount - 1) {
                wareArr[i] = 64;
            } else {
                wareArr[i] = randNum % UNIT;
            }
        }
    }

    public void printWarehouse() {
        System.out.print("각 창고 당 화물 개수 : ");
        for (int i = 0; i < wareCount; i++) {
            System.out.printf("%3d", wareArr[i]);
        }
    }
}

public class Quiz2 {
    public static void main(String[] args) {
        // 2) 여기는 A 사의 B-23 물류 창고다.
        //    이 물류 창고에는 많은 수의 화물이 적재되는데
        //    화물을 적재하는 기준이 64개 단위다.
        //    어떤 수량의 화물이 오든지
        //    화물을 창고에 저장할 수 있게 프로그래밍 해 보자.
        //    (화물의 크기는 균일하다고 가정한다.)
        //    물류 창고로 들어오는 화물의 개수는
        //    1000 ~ 50000 개 사이로 들어온다 가정한다.
        Warehouse wh = new Warehouse();

        wh.prepareWarehouse();
        wh.setWarehouse();
        wh.printWarehouse();
    }
}
 */