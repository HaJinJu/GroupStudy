/*
        < Question 20 >
기존에 랜덤하게 스터디 팀원을 편성하는 프로그램을 만들었다.
현재 구현된 코드에서 부족한 부분이 무엇인지 기술하고
이를 개선할 수 있도록 프로그래밍을 해보자!
*/


package Question20;

import ClassList.DivideTeams;

public class Question20 {
    public static void main(String[] args) {
        System.out.println("************* A 그룹 *************");
        DivideTeams TeamA = new DivideTeams(1, 11, 4);
        TeamA.makeTeams();

        System.out.println("\n\n************* B 그룹 *************");
        DivideTeams TeamB = new DivideTeams(10, 8, 3);
        TeamB.makeTeams();
    }
}