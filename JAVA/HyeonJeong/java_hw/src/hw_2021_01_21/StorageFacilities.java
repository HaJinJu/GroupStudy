package hw_2021_01_21;

import java.util.Scanner;

public class StorageFacilities {
    private int unit;
    private int rangeStart;
    private int range;
    private int storageSpace;

    Scanner scan;

    public StorageFacilities(int unit, int rangeStart, int range) {
        this.unit = unit;
        this.rangeStart = rangeStart;
        this.range = range;

        storageSpace = (int)(Math.random() * range) + rangeStart;
        System.out.println("물품을 넣을 공간의 크기 = " + storageSpace);
    }

    public int storageAvailable() {
        int storage = (storageSpace & ~(unit - 1));

        return storage;
    }

    public int storageAvailable(int stuffspace) {
        int subStuffNumstorage = storageSpace - stuffspace;
        int storage = (subStuffNumstorage & ~(unit - 1));

        return storage;
    }

    public int pickStuff() {
        scan = new Scanner(System.in);

        int stuffNum = scan.nextInt();

        return stuffNum;
    }

    public void remainSpace() {

    }




    public int getUnit() {
        return unit;
    }

    public int getStorageSpace() {
        return storageSpace;
    }
}
// 1. (랜덤으로 받은)전체 공간에서 물품의 개수(Scanner 사용)를 뺀다.
// 2. 물품을 뺀 저장공간 & ~(4096 - 1) = 저장 가능한 공간을 구한다.
// 3. 물품을 뺀 저장공간 - 저장 가능한 공간 = 낭비되는 공간
// 4. 낭비되는 공간 > 4096 일 경우 남은 공간 없이 물건을 채울 수 있다.
// 5. 물건을 몇개 더 뺄 경우 낭비되는 공간없이 채울 수 있는지 메시지 출력