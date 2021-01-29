package Eighth;

class Seven {

    public Seven(int start, int end){
        for (int i = start; i < end; i ++){
            if(i % 7 == 0){
                System.out.printf("%3d", i);
            }
        }
    }


}

public class HW3 {
    public static void main(String[] args) {
        // 생성자를 사용하여 5 ~ 55 까지 숫자 중 7의 배수만 출력해보자
        Seven se = new Seven(5, 55);
    }
}
