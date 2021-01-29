package Eighth.HomeworkReview;

public class AllocRandom {
    final int RANGEARR = 6;
    final int BIASARR = 5;

    final int RANGEVALUE = 101;
    final int BIASVALUE = 10;

    int numOfRandom;
    int[] randArr;
    int[] idxArr;
    //idxArr 로 배열을 관리해주는 데이터 생성해야함 그러고 배열을 관리해서 빼는 전략을 진행할것임

    int randPick; //random 배열의 픽을 빼줄 값 입력을 위한 데이터


    //재활용이 용이하게 만들라면 딱 필요한 기능만 구현하고 빠져야한다
    //부가적으로 더 덕지덕지 붙일려고 하는 순간 오염도 상승
    //결국 나중에 재활욜을 못하게되고 유지보수가 힘들어진다
    //그럼 야근각임;;;;
    // 생성자에는 초기화만 입력하도록 하자ㅏㅏㅏㅏㅏㅏ
    public AllocRandom() {
        numOfRandom = (int)(Math.random() * RANGEARR) + BIASARR;

        randArr = new int[numOfRandom];
        idxArr = new int[numOfRandom];
    }

    //  Random Number(랜덤번호) -> Array(배열) to
    public void allocRandomNumber2Arr() {
        for(int i = 0; i < randArr.length; i++) {
            randArr[i] = (int)(Math.random() * RANGEVALUE) + BIASVALUE;
            idxArr[i] = i;
        }
    }

    public void deleteRandomNumberValue() {
        randPick = (int)(Math.random() * numOfRandom);

        System.out.println("지워진 값 = " + randArr[randPick]);

        randArr[randPick] = -1;
    }

    public void printRandomArr() {
        int cnt = 1;

        for(int i = 0; i < randArr.length; i++) {
            if(randArr[i] == -1) {
                continue;
            }

            System.out.printf("%4d", randArr[i]);

            if(cnt % 5 == 0) {
                System.out.println("");
            }

            cnt++;
        }
        System.out.println("");
    }
}