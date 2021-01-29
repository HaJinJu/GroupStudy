import java.util.Scanner;

// Gameplay 클래스 : 실질적인 게임 내 여러 작업들이 이루어짐
public class Gameplay {
    Scanner scan;
    Adventurer adv;
    private int selectWork, selectSkill, selectJob;

    public void setScan() {
        scan = new Scanner(System.in);
    }

    public void setAdventurer() {
        adv = new Adventurer();
    }

    // 사용자 입력 설정 및 새 캐릭터 생성
    public void gameStart() {
        System.out.println("*** 자바스토리에 오신 것을 환영합니다 ***");
        System.out.println("새로운 캐릭터를 생성합니다.");

        setScan();
        setAdventurer();
    }

    // 게임 진행
    public void gameWork() {
        while(selectWork != 4) {
            System.out.print("캐릭터의 직업을 확인하려면 1, 공격하려면 2" +
                    ", 전직하려면 3, 종료하려면 4를 입력하세요 : ");
            selectWork = scan.nextInt();

            switch (selectWork) {

                // 캐릭터의 직업 확인
                case 1:
                    System.out.printf("\n당신의 직업은 '%s' 입니다.\n\n", adv.getJob());
                    break;

                // 공격 스킬 사용
                case 2:
                    System.out.print("첫 번째 스킬 사용은 1, 두 번째 스킬 사용은 2를 입력하세요 : ");
                    selectSkill = scan.nextInt();

                    // 첫 번째 스킬 사용
                    if(selectSkill == 1)
                        adv.skill1();
                    // 두 번째 스킬 사용
                    else if(selectSkill == 2)
                        adv.skill2();
                    // 잘못된 입력 예외 처리
                    else
                        System.out.println("\n잘못 입력하셨습니다. 공격 MISS ㅠㅠ\n");
                    break;

                // 현재 직업의 상위 레벨 직업으로 전직
                case 3:
                    // 누적 데미지(경험치) 30 이상이면 전직 가능
                    if(adv.getAttackDamage() >= 30) {
                        System.out.print("전사로 전직하려면 1, 도적은 2, 마법사는 3을 입력하세요 : ");
                        selectJob = scan.nextInt();

                        adv.changeJob(selectJob);
                    }
                    // 누적 데미지(경험치) 30 미만이면 전직 불가능
                    else {
                        System.out.println("\n30 이상의 데미지를 입혀야 전직할 수 있습니다.");
                        System.out.println("경험을 더 쌓고 오세요.\n");
                    }
                    break;

                // 게임 종료
                case 4:
                    System.out.println("\n*** 자바스토리를 종료합니다 ***");
                    System.out.println("다음에 꼭 다시 만나요~");
                    break;

                // 잘못된 입력 예외 처리
                default:
                    System.out.println("\n잘못 입력하셨습니다.\n");
                    break;
            }
        }
    }
}