package Fourtheenth;

import java.util.ArrayList;

class RandomTeamSelection {
    private int memberFixnum;
    private int numOfTeamMember;
    private int i = 0;
    private int randNum;
    private int choiceMember;


    private int[] teamMemberArr;
    private int[] checkDup;


    public RandomTeamSelection(int numOfTeamMember) {
        memberFixnum = numOfTeamMember;

        this.numOfTeamMember = numOfTeamMember;

        // 1차열 배열 17개 배열을 생성
        teamMemberArr = new int[memberFixnum];

    }


    public void allocArrTeamMemberZeroValue() {
        checkDup = new int[memberFixnum];

        while (i < checkDup.length) {
            checkDup[i] = 0;
            System.out.printf("checkDup[%d] = %d\n", i, checkDup[i]);
            i++;
        }

    }

    // 해당 배열에 value값을 넣어주자
    public void allocArrTeamChoice() {

        boolean choiceDup = false;
        int randNum;
        // checkDup[i] 배열의 모든 값은 0이다
        // 그럼 choiceMember에게 값을 넘겨주면 0을 할당하게 된다.
        choiceMember = checkDup[i];
        // choiceDup 을 false 로 설정한다.

        do {
            // 랜덤 번호 할당한다.
            // randNum 에 랜덤번호를 할당해준다.
            randNum = (int) (Math.random() * memberFixnum) + 1;

            //System.out.println(randNum);
            //System.out.println("----------------------------");

            // checkDup[i - 1] 배열안의 값이 0이 아닐때 while문으로 인해
            // 다시 반복한다. else 문에서 checkDup[i - 1] 안의 값에다가
            // 0 이 아닌 수를 할당하기 위해서다.

            if (teamMemberArr[randNum -1] != 0) {
                System.out.println( teamMemberArr[choiceMember] );
                choiceDup = true;
            } else {
                choiceDup = false;
                //teamMemberArr[randNum - 1] = checkDup;
                System.out.printf("checkDup[%d] = %3\n", checkDup[i - 1], randNum);

            }
        } while (choiceDup);
    }


    public void printRandomTeamArr() {
        int cnt = 1;

        // 입력받은 배열의 길만큼 반복한다.
        for(int i = 0; i < checkDup.length; i++) {
            // 입력되는 배열자리의 + 1 값만큼 표시한다.
            System.out.printf("%3d", checkDup[i] );

            if (cnt % 5 == 0) {
                System.out.println("");
            }

            cnt++;
        }
    }
}