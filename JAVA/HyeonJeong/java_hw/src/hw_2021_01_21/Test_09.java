package hw_2021_01_21;

public class Test_09 {
    public static void main(String[] args) {
        System.out.println(
                "위의 문제에서 낭비되는 공간은 얼마인지 파악해보자!\n" +
                "또한 배치된 물품에서 물건을 꺼낼 경우 어떤식으로 공간을 관리할지\n" +
                "전략을 구성하여 해당 전략에 대해 프로그래밍 해보도록 한다.\n");

        StorageFacilities sf = new StorageFacilities(4096, 50000, 50001);

        int storage = sf.storageAvailable();
        System.out.println("최대 저장 크기 = " + storage);

        int stuffBox = storage / sf.getUnit();
        System.out.println("저장공간 칸의 개수 = " + stuffBox);

        int remainSpace = sf.getStorageSpace() - storage;
        System.out.println("낭비되는 공간 = " + remainSpace);
    }
}
// 1. (랜덤으로 받은)전체 공간에서 물품의 개수(Scanner 사용)를 뺀다.
// 2. 물품을 뺀 저장공간 & ~(4096 - 1) = 저장 가능한 공간을 구한다.
// 3. 물품을 뺀 저장공간 - 저장 가능한 공간 = 낭비되는 공간
// 4. 낭비되는 공간 > 4096 일 경우 남은 공간 없이 물건을 채울 수 있다.
// 5. 물건을 몇개 더 뺄 경우 낭비되는 공간없이 채울 수 있는지 메시지 출력
