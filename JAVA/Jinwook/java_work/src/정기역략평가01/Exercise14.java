package 정기역략평가01;
class LocationGasStation {
    //현재 차량을 타고 운전중이다.
    //기름이 떨어져서 주유소에 들려야 한다.
    //우리가 사는 세계가 아닌 다른 4차원의 세계라 지도상에 주유소의 x 좌표, y 좌표가 랜덤하게 출력된다.
    //한 번 나타난 좌표는 사라지지 않는다.
    //이 정보를 기반으로 가장 가까운 거리의 주유소를 찾도록 프로그램을 작성해보자! (현재 내 좌표도 랜덤으로 설정하도록 한다)
    private int gasNum;
    private int myX;
    private int myY;
    private int gasX;
    private int gasY;
    private float distance;
    private int minusX;
    private int minusY;


    public LocationGasStation(int gasNum) {
        this.gasNum = gasNum;
        myX = (int) (Math.random() * 50) + 1;
        myY = (int) (Math.random() * 50) + 1;
        System.out.printf("나의 좌표: [X: %2d, Y: %2d]\n\n", myX, myY);
    }
    public void distanceLocation(){
        for (int i = 0; i < gasNum; i++) {
            gasX = (int) (Math.random() * 50) + 1;
            gasY = (int) (Math.random() * 50) + 1;
            System.out.printf("주유소 좌표: [X: %2d, Y: %2d]\n", gasX, gasY);

           minusX = (myX - gasX);
           minusY = (myY - gasY);

           if(minusX < 0 || minusY < 0){
               minusX = (Math.abs(minusX)); // 또는 -1 곱하기
               minusY = (Math.abs(minusY));
               System.out.printf("좌표 차이(길이): " +
                               "[X: %d, Y: %d]\n",minusX, minusY);
           }else {
               System.out.printf("좌표 차이(길): 이" +
                               "[X: %d, Y: %d]\n",minusX, minusY);

           }
            distance = (float) (Math.sqrt(Math.pow(minusX,2)+(Math.pow(minusY,2))));
            System.out.printf("현재 나와의 거리 = %f\n",distance);
            System.out.println("");

        }
    }

    public void mostClosed(){

        //각 주유소의 거리는 계산하였지만,
        //가장 가까운 지역을 알려주는 식을 하고 싶었었는데 여기서 막혔습니다.

    }
}



public class Exercise14 {
    public static void main(String[] args) {
        LocationGasStation lgs = new LocationGasStation(3);
        lgs.distanceLocation();
        lgs.mostClosed();

    }
}
