package Seventh;

class noDuNumber{
    int randNum = 0;
    int [] checkDup = new int[20];

    public void setArr2() {

        for (int i = 0; i < 20; i++) {
            checkDup[i] = 0;
        }

        for (int i = 1; ; ) {
            randNum = (int)(Math.random() * 20)+1;

            if (checkDup[randNum - 1] != 0)
                continue;

            checkDup[randNum - 1] = 1;
            System.out.printf("%d번 = %d\n", i++, randNum);
        }
    }
}

public class HW8 {
    public static void main(String[] args) {
        // 20명 사원에게 랜덤한 번호 할당 ( 중복 허용 X)

        noDuNumber noDu = new noDuNumber();
        noDu.setArr2();

    }
}