package Homework.Thirteenth;

public class RandomPick {
    // A조 : 9명, B조 : 8명
    public static final int COUNTA = 9;
    public static final int COUNTB = 8;

    public static void main(String[] args) {
        // 이전에 작성했던 예제 중 스터디 팀을 만들기 위해
        // 랜덤으로 사람 이름과 번호를 부여했던 프로그램이 있다.
        // 당시에는 구현에 필요한 내용을 아직 배우지 않아 꼼수로 구현했다.
        // 이번에는 배운 내용들을 활용하여 이 프로그램의 완성도를 높여 보도록 한다.
        AllMemberArrayList amal = new AllMemberArrayList();

        // 전체 수강 인원 출력
        System.out.printf("전체 수강 인원 : %d명\n", COUNTA + COUNTB);
        System.out.println(amal.name);

        RandomTeam rt1 = new RandomTeam(amal.name, COUNTA);
        RandomTeam rt2 = new RandomTeam(amal.name, COUNTB);

        // A조 출력
        System.out.println("\n[A조]");
        rt1.setTeam();
        rt1.printTeam();

        // 전체 수강 인원 중 A조 인원 삭제
        rt1.removeName();

        // B조 출력
        System.out.println("\n[B조]");
        rt2.setTeam();
        rt2.printTeam();
    }
}
