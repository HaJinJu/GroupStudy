package ClassList;

public class ArrangeFreight {
    private final String PRINTSTORAGESIZE = "화물 창고의 크기 = ";
    private final String PRINTUNIT = "적재한 화물의 단위 = ";
    private final String PRINTUNITNUM = "적재한 화물 단위의 수 = ";
    private final String PRINTCAPACITY = ", 적재한 화물의 총 수량 = ";
    private final String PRINTREMAIN = "현재 화물 창고의 남은 공간의 크기 = ";
    private final String PRINTPULLFREIGHT = "\n꺼낼 화물의 수 = ";
    private final int ONE = 1;
    // 화물 창고 크기는 5 ~ 10만
    private final int RANGESTART = 50000;
    private final int RANGEEND = 100000;
    private final int FREIGHTUNIT = 4096;

    // 화물 창고의 크기
    private int storageSize;
    // 화물 적재 후 화물 창고의 남은 공간의 크기
    private int storageRemain;
    // 적재한 화물 총 수량, 단위 수
    private int freightCapacity, freightUnitNum;
    // 꺼내는 화물 총 수량, 단위 수
    private int pullFreightNum, pullFreightUnitNum;


    public ArrangeFreight() {
        int storageRange = RANGEEND - RANGESTART + ONE;
        storageSize = (int)(Math.random() * storageRange) + RANGESTART;
    }

    public void calcFreightUnitNum() {
        freightUnitNum = (storageSize & ~(FREIGHTUNIT - ONE)) / FREIGHTUNIT;
    }

    public void calcFreightCapacity() {
        freightCapacity = FREIGHTUNIT * freightUnitNum;
    }

    public void calcStorageRemain() {
        calcFreightCapacity();
        storageRemain = storageSize - freightCapacity;
    }

    /*
            < 적재된 화물 꺼내는 방법 >
    1. 꺼내는 화물의 수를 기존 화물 적재 방법에서의 화물 창고의 크기로 보고 같은 방법으로 연산
    2. 화물을 적재 단위만큼씩만 꺼내면 단위에 맞지 않아 꺼내지 못하는 화물이 생길 수 있음
       이때, 화물 창고에 적재하는 화물 단위는 그대로 지켜야 하므로
       꺼낼 남은 화물 수와 상관없이 적재한 화물 단위 하나를 통째로 꺼낸다고 생각해야 함
    3. 따라서 꺼내는 화물이 적재 화물 단위로 나누어 떨어지지 않으면
       꺼낸 화물 단위의 수에서 1을 더한 만큼 적재한 화물 단위의 수에서 빼준다.
    */

    public void pullFreight() {
        // 1 ~ 적재량 만큼 꺼냄
        pullFreightNum = (int)(Math.random() * freightCapacity) + ONE;

        int temp = (pullFreightNum & ~(FREIGHTUNIT - ONE)) / FREIGHTUNIT;

        if(pullFreightNum != FREIGHTUNIT * temp) {
            pullFreightUnitNum = temp + ONE;
        } else {
            pullFreightUnitNum = temp;
        }

        freightUnitNum -= pullFreightUnitNum;
    }

    public void printStorageSize() {
        System.out.println(PRINTSTORAGESIZE + storageSize);
    }

    public void printFreightCapacity() {
        System.out.println(PRINTUNIT + FREIGHTUNIT);
        System.out.print(PRINTUNITNUM + freightUnitNum);
        System.out.println(PRINTCAPACITY + freightCapacity);
    }

    public void printStorageRemain() {
        System.out.println(PRINTREMAIN + storageRemain);
    }

    public void printPullFreightNum() {
        System.out.println(PRINTPULLFREIGHT + pullFreightNum);
    }
}