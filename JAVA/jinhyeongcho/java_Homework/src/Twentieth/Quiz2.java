package Twentieth;

public class Quiz2 {
    //2. 랜덤한 숫자를 200개 생성한다.
    //               숫자의 범위는 20 ~ 60 까지로 제한한다.
    //               각각의 숫자들이 몇 개씩 중복되었는지 검사하는 프로그램을 작성해보자!
    public static void main(String[] args) {
        DupInspection Dup = new DupInspection();
        Dup.numberSet(200);
        System.out.println("");
        Dup.hashDup();

    }
}
