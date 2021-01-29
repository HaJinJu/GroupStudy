package Seventh;

import java.util.Arrays;

class DuplicateNumber{
    int[] randomarr = new int[20];

    public void setArr(){
        for(int i = 0; i < randomarr.length; i++){
            randomarr[i] = (int)(Math.random() * 20) + 1;
        }
    }

    @Override
    public String toString() {
        return "20명 사원 번호 = " + Arrays.toString(randomarr);
    }
}

public class HW7 {
    public static void main(String[] args) {
        // 20명 사원 모두에게 랜덤한 번호 할당되도록 만든다(중복 허용)

        DuplicateNumber du = new DuplicateNumber();
        du.setArr();

        System.out.println(du);
    }
}
