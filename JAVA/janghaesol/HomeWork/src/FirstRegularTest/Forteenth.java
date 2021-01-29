package FirstRegularTest;


class location {
    int myx;
    int myy;
    int farx;
    int fary;
    int sum;
    float first = 0;
    float second = 0;
    float third = 0;
    float forth = 0;
    int[] gasstationx;
    int[] gasstationy;
    float farFromHere;
    final int gasNum = 4;

    public location() {
        gasstationx = new int[gasNum];
        gasstationy = new int[gasNum];

        for (int i = 0; i < gasNum; i++) {
            gasstationx[i] = (int) (Math.random() * 100);
            gasstationy[i] = (int) (Math.random() * 100);
        }
    }

    public void myLocation() {
        myx = (int) (Math.random() * 100);
        myy = (int) (Math.random() * 100);
        System.out.printf("나의 현재좌표 : (%2d,%2d)\n", myx, myy);
    }

    public void gasLocation() {
        for (int i = 0; i < gasNum; i++) {
            System.out.printf("[%d]번째 주유소의 위치는 : (%2d, %2d)\n", i + 1, gasstationx[i], gasstationy[i]);
        }
    }

    public void howFar() {
        for (int i = 0; i < gasNum; i++) {
            farx = myx - gasstationx[i];
            fary = myy - gasstationy[i];
            if ((farx) < 0) {
                farx = farx * -1;
            } else if ((fary) < 0) {
                fary = fary * -1;
            }
            sum = ((int) Math.pow(farx, 2)) + ((int) Math.pow(fary, 2));
            farFromHere = (float) Math.sqrt(sum);
            System.out.printf("[%d}번 주유소까지 거리는 :" + farFromHere + "\n", i + 1);
            if (i == 0) {
                first += farFromHere;
            } else if (i == 1) {
                second += farFromHere;
            } else if (i == 2) {
                third += farFromHere;
            } else if (i == 3) {
                forth += farFromHere;
            }
        }
    }
        public void closeOne(){
        if(first < second && first < third && first < forth){
            System.out.println("1번째 주유소로 가자");
        }else if(second < first && second < third && second < forth ){
            System.out.println("2번째 주유소로 가자");
        }else if(third < first && third < second && third < forth ){
            System.out.println("3번째 주유소로 가자");
        }else if(forth < first && forth < second && forth < third ){
            System.out.println("4번째 주유소로 가자");
        }
    }

}
    public class Forteenth {
        //현재 차량을 타고 운전중이다.
        //기름이 떨어져서 주유소에 들려야 한다.
        //우리가 사는 세계가 아닌 다른 4차원의 세계라 지도상에 주유소의 x 좌표, y 좌표가 랜덤하게 출력된다.
        //한 번 나타난 좌표는 사라지지 않는다.
        //이 정보를 기반으로 가장 가까운 거리의 주유소를 찾도록 프로그램을 작성해보자! (현재 내 좌표도 랜덤으로 설정하도록 한다)
        public static void main(String[] args) {
            location xy = new location();

            xy.myLocation();
            xy.gasLocation();
            xy.howFar();
            xy.closeOne();
        }
}

