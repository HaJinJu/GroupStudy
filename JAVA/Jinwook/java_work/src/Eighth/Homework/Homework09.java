package Eighth.Homework;
//오늘 풀었던 평균, 분산, 표준편차를 활용해서
//   점수 관리 시스템을 만들어보자!
//   학급을 3개 정도 만들고 랜덤한 점수를 준다. ---->생성자 통해 학생수 설정, 배열로 3개 반 생성 배열안에 랜덤 넣
//   평균이 가장 높은 학급,
//   표준편차가 가장 낮은 학급,
//   표준편차가 가장 큰 학급을 선별하도록 프로그래밍 해보자!
class ClassGrade{
    int studentNums;
    int [] class1;
    int [] class2;
    int [] class3;


    public ClassGrade(int studentNums){
        this.studentNums = studentNums;
        class1  = new int[studentNums];
        class2  = new int[studentNums];
        class3  = new int[studentNums];
        for(int i = 0; i <= studentNums; i++){
//            class1 [i] = new

        }



    }

}
public class Homework09 {
    public static void main(String[] args) {

    }
}
