package FirstRegularTest;
class arrayRnd{
    int[] rdArr;
    int rdPick;
    int cnt;

    public void preArray() {
        rdPick = (int)(Math.random()*10);
        int randNum = rdPick;

        rdArr = new int[randNum];
    }
    public void doRandArr() {
        for(int i = 0; i < rdArr.length; i++) {
            rdArr[i] = ((int)(Math.random()*10));
        }
    }
    public void printit() {
        cnt = 1;
        for(int i = 0; i < rdArr.length; i++) {
            System.out.printf("%2d", rdArr[i]);
            if(cnt % 5 == 0) {
                System.out.println("");
            }
            cnt++;
        }
    }
}

public class Third {
    public static void main(String[] args) {
        //클래스를 사용하여 임의의 난수 배열을 생성하도록 프로그램을 작성한다.,
        arrayRnd randArr = new arrayRnd();

        randArr.preArray();
        randArr.doRandArr();
        randArr.printit();

    }
}
