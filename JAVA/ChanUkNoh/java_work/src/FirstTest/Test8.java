package FirstTest;

class OrganizeContainerByBase {
    // Test 8번 9번

    private final int MINIMAL = 50000;

    private int containerSize;
    private int base;
    private int organizedContainer;
    private int remainContainerSize;
    private int unit;


    public OrganizeContainerByBase(int base) {
        containerSize = (int)(Math.random() * (MINIMAL + 1)) + MINIMAL;
        this.base = base;

        System.out.println("물류창고 크기: " + containerSize);
    }

    public void organize() {
        organizedContainer = containerSize & ~(base - 1);
        unit = organizedContainer / base;
        remainContainerSize = containerSize - organizedContainer;
    }

    public void minusContainer(int minusNum) {
        int availableContainer;
        int availableContainUnit;
        int expectedRemainContainerSize;

        System.out.printf("%d개의 화물을 빼냈습니다.\n", minusNum);

        unit -= (minusNum / base);
        remainContainerSize += minusNum;
        organizedContainer -= minusNum;

        System.out.println("남은 공간: " + remainContainerSize);

        availableContainer = remainContainerSize & ~(base - 1);
        System.out.println("넣을 수 있는 화물: " + availableContainer);

        availableContainUnit = availableContainer / base;
        System.out.println("넣을 수 있는 화물 단위: " + availableContainUnit);

        expectedRemainContainerSize = remainContainerSize - availableContainer;
        System.out.println("예상 남은 공간: " + expectedRemainContainerSize);
    }

    public void print() {
        System.out.println("정리된 화물: " + organizedContainer);
        System.out.println("정리 단위: " + unit);
        System.out.println("남은 공간: " + remainContainerSize);

    }
}

public class Test8 {
    public static void main(String[] args) {
        OrganizeContainerByBase scb = new OrganizeContainerByBase(4096);

        scb.organize();

        scb.print();

        scb.minusContainer(10000);

    }
}
