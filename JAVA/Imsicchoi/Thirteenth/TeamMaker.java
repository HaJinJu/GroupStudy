package Thirteenth;

public class TeamMaker {
    public static void main(String[] args) {

        final String ONE = "최현정";
        final String TWO = "장해솔";
        final String THREE = "박재민";
        final String FOUR = "고동영";
        final String FIVE = "이정현";
        final String SIX = "류슬기";
        final String SEVEN = "조진형";
        final String EIGHT = "한다은";
        final String NINE = "오진욱";
        final String TEN = "노찬욱";
        final String ELEVEN = "박소현";
        final String TWELVE = "박기범";
        final String THIRTEEN = "최임식";
        final String FOURTEEN = "탁성진";
        final String FIFTEEN = "하진주";
        final String SIXTEEN = "이승윤";
        final String SEVENTEEN = "이범진";


        int i, randNum, cnt = 0;
        int[] checkDup = new int[17];


        for(i = 0; i < 17; i++) {
            checkDup[i] = 0;
        }

        System.out.println("A조 입니다.");

        for(i = 1; ;) {

            randNum = (int)(Math.random() * 4) + 1;


            if(checkDup[randNum - 1] != 0)
                continue;

            cnt++;


            checkDup[randNum - 1] = 1;
            System.out.printf("%d 번 = %d\n", i++, randNum);

            if(cnt == 5) {
                break;
            }
        }

        System.out.println("B조 입니다.");

        for(;;) {

            randNum = (int)(Math.random() * 5) + 5;

            if(checkDup[randNum - 1] != 0) {
                System.out.println("중복발생");
                continue;
            }

            cnt++;

            checkDup[randNum - 1] = 1;
            System.out.printf("%d 번 = %d\n", i++, randNum);


            if(cnt == 10) {
                break;
            }
        }
        for(i = 0; i < 17; i++) {
            checkDup[i] = 0;
        }

        System.out.println("C조 입니다.");

        for(; ;) {

            randNum = (int)(Math.random() * 5) + 10;


            if(checkDup[randNum - 1] != 0)
                continue;

            cnt++;


            checkDup[randNum - 1] = 1;
            System.out.printf("%d 번 = %d\n", i++, randNum);

            if(cnt == 15) {
                break;
            }
        }
        for(i = 0; i < 17; i++) {
            checkDup[i] = 0;
        }

        System.out.println("D조 입니다.");

        for(; ;) {

            randNum = (int)(Math.random() * 5) + 15;


            if(checkDup[randNum - 1] != 0)
                continue;

            cnt++;


            checkDup[randNum - 1] = 1;
            System.out.printf("%d 번 = %d\n", i++, randNum);

            if(cnt == 17) {
                break;
            }
        }
    }
}