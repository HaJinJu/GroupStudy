import java.util.HashSet;

// 랜덤으로 그룹별 팀을 만든 뒤 만들어진 팀별로 멤버들의 이름을 출력함
public class OrganizeGroup extends ManageName {
    private int aGroupPersonNum, bGroupPersonNum;
    private int aDividePersonNum, bDividePersonNum, aDivideTeamNum, bDivideTeamNum;
    private int randNum;
    HashSet<Integer> personNumSet;

    public OrganizeGroup(int aGroupPersonNum, int bGroupPersonNum, int aDivideTeamNum, int bDivideTeamNum) {
        this.aGroupPersonNum = aGroupPersonNum;
        this.bGroupPersonNum = bGroupPersonNum;
        this.aDivideTeamNum = aDivideTeamNum;
        this.bDivideTeamNum = bDivideTeamNum;
        personNumSet = new HashSet<Integer>();

        setDividePersonNum();
    }

    // 중복되지 않는 랜덤한 번호를 뽑아 팀을 나눈 뒤 출력함
    public void randomNumbering(int startNum, int groupPersonNum, int dividePersonNum) {
        int cnt = 1;

        while(cnt <= groupPersonNum) {
            randNum = (int)(Math.random() * groupPersonNum) + startNum;

            // 중복되는 번호인지 확인
            if(personNumSet.contains(randNum)) {
                continue;
            } else {
                personNumSet.add(randNum);

                setName(randNum);
                System.out.printf("%s ", getName());

                if(cnt % dividePersonNum == 0) {
                    System.out.println("");
                }

                cnt++;
            }
        }
    }

    // 각 그룹 내 팀을 나눔
    public void divideTeams() {
        // A 그룹 내 팀 배정
        randomNumbering(1, aGroupPersonNum, aDividePersonNum);
        System.out.println("\n******************************");
        // B 그룹 내 팀 배정
        randomNumbering(aGroupPersonNum + 1, bGroupPersonNum, bDividePersonNum);
    }

    // 나눠야 할 그룹 내 팀별 인원수를 세팅함
    public void setDividePersonNum() {
        // A 그룹이 팀별로 인원이 딱 맞게 떨어지지 않으면 한명 더 추가 배정함
        if(aGroupPersonNum % aDivideTeamNum != 0) {
            aDividePersonNum = aGroupPersonNum / aDivideTeamNum + 1;
        } else {
            aDividePersonNum = aGroupPersonNum / aDivideTeamNum;
        }

        // B 그룹이 팀별로 인원이 딱 맞게 떨어지지 않으면 한명 더 추가 배정함
        if(bGroupPersonNum % bDivideTeamNum != 0) {
            bDividePersonNum = bGroupPersonNum / bDivideTeamNum + 1;
        } else {
            bDividePersonNum = bGroupPersonNum / bDivideTeamNum;
        }
    }
}