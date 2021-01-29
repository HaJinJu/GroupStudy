//import java.util.Scanner;
//public class Homework_20210111 {
//
//    1) 오늘 문제 풀었던 것들중 이해하기 어려웠던 부분이나 코드를 정리한다.
//
//세부사항: 몇 번 코드의 몇 번째 줄 for 문에서 '!' 부분이 이해가 안됩니다.
//        와 같은 형식으로 첨삭 노트를 만듭니다.
//}
//
//
//public class RockPaperScissors {
//    final int SCISSORS = 1;
//    final int ROCK = 2;
//    final int PAPER = 3;
//
//    Scanner scan;
//    int computerNum;
//    int playerNum;
//
//    boolean duel;
// --------------------------------------------------------------------------------------
// Q:boolean 의 존재의의 * 왜 필요한지 모르겠다 , 코딩 중 테스트용으로 연습모드 구분을 위한것인가?
//---------------------------------------------------------------------------------------
//    RockPaperScissors() {
//        scan = new Scanner(System.in);
//        duel = false;
//
//        System.out.printf("연습 대련입니다.\n");
//    }
//
//    RockPaperScissors(boolean duel) {
//        scan = new Scanner(System.in);
//        if(duel != true) {
//            System.out.println("결투 모드입니다. 다음부턴 true 설정을 해주세요!");
//        }
//        this.duel = true;
//
//        System.out.printf("결투 모드입니다.\n");
//    }
//
//----------------------------------------
// 8: 자신을 제외한 모든 플레이어의 주사위 값을 3 상승시킨다.
//                        case 8:
//                                for(int j = 0; j <= 2; j++) {
//                                if(j == i) {
//                                continue;
//                                }
//
//                                sumOfDice[j] += 3;
//--------------------------------------------------------------------------
//Q: 이 코드가 왜 자신을 제외한 모든 플레이어를 대상으로 하는 지 모르겠다.
//--------------------------------------------------------------------------
//public void printRandomArr() {
//        int cnt = 1;
//
//        for(int i = 0; i < randArr.length; i++) {
//            if(randArr[i] == -1) {
//                continue;
//            }
//
//            System.out.printf("%4d", randArr[i]);
//
//            if(cnt % 5 == 0) {
//                System.out.println("");
//            }
//
//            cnt++;
//        }
//        System.out.println("");
//    }
//------------------------------------------------------------------------------
//Q: for 문에서 length를 적용하는 예와 그렇지 않은 예의 구분을 못하겠다
//------------------------------------------------------------------------------
//Q: 생성자와 메소드의 차이를 정확히 구분하지 못하고, 참조할만한 메소드나 생성자 없이참조할만한
// 메소드나 생성자 없이 스스로 작문하기에는 개념의 이해도가 스스로 작문하기에는 개념의 이해도가 너무 낮습니다.
//------------------------------------------------------------------------------
//        for(int i = 0; i < len; i++) {
//        classArr[i] = i + 1;
//        mean[i] = arr[i].getMean();
//        stdDev[i] = arr[i].getStdDeviation();
//-----------------------------------------------------------------------------
// Q:ScoreCalculator[] arr  를 참조해서 getMean , getStdDeviation 이 가능한가? 그렇다면
// 다른 해당 참조 클라스에 다른 인자들도 get 으로 불러들일 수 있는지 있다면 그 조건은 무엇일까?
//-----------------------------------------------------------------------------
//insertSort(mean, classArr);
//        System.out.printf(
//        "\n%d 반이 평균 최고점(%f)을 받았습니다.\n\n",
//        classArr[len - 1], mean[len - 1]);
//
//        for(int i = 0; i < len; i++) {
//        classArr[i] = i + 1;
//        }
//
//        insertSort(stdDev, classArr);
//        System.out.printf(
//        "\n%d 반이 표준편차 최저점(%f)을 받았습니다.\n\n",
//        classArr[0], stdDev[0]);
//--------------------------------------------------------------------------------------
//Q: 왜  classArr[len - 1], mean[len - 1]);이 최고점이고   classArr[0], stdDev[0]);이 최저점인지 이해가 안됩니다.
//--------------------------------------------------------------------------------------