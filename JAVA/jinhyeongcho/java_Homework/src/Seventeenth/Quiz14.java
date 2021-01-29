package Seventeenth;

public class Quiz14 {
    //현재 차량을 타고 운전중이다.
    //기름이 떨어져서 주유소에 들려야 한다.
    //우리가 사는 세계가 아닌 다른 4차원의 세계라
    //지도상에 주유소의 x 좌표, y 좌표가 랜덤하게 출력된다.
    //한 번 나타난 좌표는 사라지지 않는다.
    //이 정보를 기반으로 가장 가까운 거리의 주유소를 찾도록 프로그램을 작성해보자!
    //(현재 내 좌표도 랜덤으로 설정하도록 한다)

    // 현재 내좌표 구하기 (X.Y)
    // 주유소 좌표 구하기 (x.y)
    // 거리는 루트((X-x)^2+(Y-y)^2)
    // 이렇게 나타나는데 코드로 표현이 어렵습니다...
    public static void main(String[] args) {
        GasSt gas = new GasSt();
        GasSt gasSt = new GasSt();

        gas.myCoordinates();
        System.out.println("");
        gasSt.gasStCoordinates();
        gas.distanceCal(gasSt);


    }
}
