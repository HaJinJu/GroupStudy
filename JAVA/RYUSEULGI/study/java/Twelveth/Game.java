// 시작 ---> 1차 전직 ---> 2차 전직

// 모험가 ---> 전사 ------> 워 로드
//       ---> 도적 ------> 어쌔신
//      ---> 마법사 ------> 위자드

// 각각의 캐릭터들은 공격 스킬을 두 개씩 가지고 있다.
// 전직을 할 때마다 추가적인 전직 스킬 두 개를 얻게 된다.

// 스킬을 사용할 때 모두가 일관되게
// skill1(), skill2(), skill3() 형식으로
// 데미지가 계산되도록 만들어보자!

interface Customize {
    public void name(String nickName);
}

interface Attack {
    public int skill1(int number);
    // public void skill2(int num);
    // 공격 스킬을 2개씩 가지게 하는 것은 감이 오지 않음
}

interface FirstLevelUp {
    public void level(int choice);
}

class FightGame implements Customize, Attack {

    private String a = "전사";
    private String b = "도적";
    private String c = "마법사";

    public void name(String nickName) {
        System.out.println(nickName + " 현재 당신은 모험가입니다.");
    }

    public int skill1(int power) {
        System.out.println("1번 공격사용");
        int number = 0;

        switch (power) {
            case 1:
                number = 30;
                break;
            case 2:
                number = 60;
                break;
            case 3:
                number = 100;
                break;
            default:
                break;
        }
        return number;
    }

    public void level(int choice) {
        System.out.println("전직가능");

        switch (choice) {
            case 1:
                System.out.println(a);
                break;
            case 2:
                System.out.println(b);
                break;
            case 3:
                System.out.println(c);
                break;
            default:
                System.out.println("1,2,3 중 다시 선택하세요");
                break;
        }
    }

}

public class Game {
    public static void main(String[] args) {
        FightGame fg = new FightGame();

        fg.name("닉네임뭘로하지");
        System.out.println("데미지를" + fg.skill1(2) + "만큼 입혔습니다");
        fg.level(2);
    }
}