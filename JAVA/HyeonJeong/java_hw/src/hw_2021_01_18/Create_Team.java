package hw_2021_01_18;

public class Create_Team {
    public static void main(String[] args) {
        final int NUMBER_OF_JO = 2;
        System.out.println("지금부터 랜덤 팀 구성을 시작합니다.\n");

        String[] jo_A = {
                "고동영", "장해솔", "류슬기", "박재민", "한다은",
                "최현정", "오진욱", "조진형", "이정현"
        };
        String[] jo_B = {
                "이범진", "박소현", "탁성진", "노찬욱",
                "박기범", "하진주", "이승윤", "최임식"
        };
        Set_Random_Member srm = new Set_Random_Member(jo_A, jo_B, NUMBER_OF_JO);

        srm.set_Random_jo();
        System.out.println("------------A조-----------\n");
        srm.print_arraylist(srm.getJo_A_arraylist());

        System.out.println("------------B조-----------\n");
        srm.print_arraylist(srm.getJo_B_arraylist());
    }
}
