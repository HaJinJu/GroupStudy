package hw_2021_01_21;

public class Test_08 {
    public static void main(String[] args) {
        System.out.println(
                "어떤 임의의 공간 크기가 5만 ~ 10만이다.\n" +
                "이 공간에 어떤 물품을 4096 단위로 정렬하여 배치하고자 한다.\n" +
                "이를 프로그래밍 해보자!\n");

        StorageFacilities sf = new StorageFacilities(4096, 50000, 50001);

        int storage = sf.storageAvailable();
        System.out.println("최대 저장 크기 = " + storage);

        int stuffBox = storage / sf.getUnit();
        System.out.println("저장공간 칸의 개수 = " + stuffBox);
    }
}
