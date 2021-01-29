package Test;

public class Test20 {
    public static void main(String[] args) {
        // 기존에 랜덤하게 스터디 팀원을 편성하는 프로그램을 만들었다.
        // 현재 구현된 코드에서 부족한 부분이 무엇인지 기술하고
        // 이를 개선할 수 있도록 프로그래밍을 해 보자 !

        // 부족한 부분
        // 하드 코딩된 부분이 있어
        // 인원 수나 팀 수 변경 시 적용이 되지 않는다는 점이 있었다.

        final int TEAMNUMBER = 7;
        System.out.println("지금부터 랜덤 팀 구성을 시작합니다.");

        String[] nameA = {
                "고동영", "장해솔", "류슬기", "박재민", "한다은",
                "최현정", "오진욱", "조진형", "이정현"
        };
        String[] nameB = {
                "이범진", "박소현", "탁성진", "노찬욱",
                "박기범", "하진주", "이승윤", "최임식"
        };

        String[] nameC = {
                "가가가", "나나나", "다다다", "라라라", "마마마",
                "바바바", "사사사", "아아아", "자자자", "차차차",
                "카카카", "타타타", "파파파", "하하하", "가나다",
                "라마바", "사아자", "차카타", "파하가", "나다라",
                "마바사", "아자차", "카타파", "하가나", "다라마",
                "바사아", "자차카", "타파하"
        };

        CreateTeamOfTest20 ct = new CreateTeamOfTest20(nameA, nameB, TEAMNUMBER);
        CreateTeamOfTest20 ct2 = new CreateTeamOfTest20(nameC, TEAMNUMBER);

        ct.allocRandomTeam2();
        ct.printArrayList(ct.getAteamArrayList());
        ct.printArrayList(ct.getBteamArrayList());

        ct2.allocRandomTeam1();
        ct2.printArrayList(ct2.getTeamArrayList());
    }
}
