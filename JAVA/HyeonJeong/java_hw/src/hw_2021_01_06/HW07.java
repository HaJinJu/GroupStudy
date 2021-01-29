package hw_2021_01_06;

public class HW07 {
    public static void main(String[] args) {
        // 총 17명의 사람이 있다.
        // 17명의 사람에게 5, 4, 4, 4 랜덤으로
        // 팀을 배치해주는 프로그램을 작성해보자!
        // 이름순으로 번호를 주고
        // 번호를 랜덤으로 배치하는 형식으로 가면 됩니다.

        String[] name = {"최현정", "장해솔", "박재민", "고동영",
                         "이정현", "류슬기", "조진형", "한다은",
                         "오진욱", "노찬욱", "박소현", "박기범",
                         "최임식", "탁성진", "하진주", "이승윤", "이범진"};
        final int STUDENT = name.length;
        int randomNum;
        int[] checkDup = new int[STUDENT];
        int count = 0;

        for (int i = 0; i < checkDup.length; i++) {
            checkDup[i] = 0;
        }

        for ( ; ; ) {
            randomNum = (int) (Math.random() * STUDENT);

            if (checkDup[randomNum] != 0) {
                continue;
            }
            checkDup[randomNum] = 1;
            count++;
//          System.out.printf("%d 번 = %d\n", count, randomNum);


            System.out.print("<"+name[randomNum]+">");
            if(count % 4 == 0){
                System.out.println("");
            } else if (count == STUDENT) {
                break;
            }
        }
    }
}

