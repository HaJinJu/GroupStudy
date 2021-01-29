package ClassList;

import java.util.HashSet;

// 랜덤으로 중복되는 사람 없이 팀을 나눈 뒤 팀별로 이름을 출력함
public class DivideTeams extends NameList {
    // NameList 에 있는 이름들 중 몇 번째부터 필요한지 확인함
    private int startNumOfNameList;
    // 총 인원수, 팀수
    private int totalPersonNum, totalTeamNum;
    // 팀당 인원수
    private int[] personNumOfTeam;

    // 팀 배정이 완료된 사람들의 번호 목록
    HashSet<Integer> selectedNameNum;


    // 생성자 : 초기화
    public DivideTeams(int startNumOfNameList, int totalPersonNum, int totalTeamNum) {
        this.startNumOfNameList = startNumOfNameList;
        this.totalPersonNum = totalPersonNum;
        this.totalTeamNum = totalTeamNum;
        selectedNameNum = new HashSet<>();

        setName();

        personNumOfTeam = new int[totalTeamNum];
        setPersonNumOfTeam();
    }

    // 중복되지 않는 랜덤한 사람의 번호를 뽑아 팀을 나눈 뒤 출력함
    public void makeTeams() {
        // 각 팀의 배정이 완료된 인원수, 모든 팀의 배정이 완료된 인원수
        int selectedPersonNum = 0, selectedSumPersonNum = 0;
        // 랜덤하게 뽑은 사람의 번호
        int randNameNum;
        // 배정중인 팀의 번호
        int selectedTeamNum = 1;

        System.out.printf("\n < %d팀 > : ", selectedTeamNum);


        // 모든 팀의 배정이 완료된 인원수가 총 인원수와 같아질 때까지 실행
        while(selectedSumPersonNum < totalPersonNum) {
            // 랜덤한 사람의 번호를 뽑음
            randNameNum = (int)(Math.random() * totalPersonNum) + startNumOfNameList;

            // 팀 배정이 되지 않은 사람인 경우
            if(!selectedNameNum.contains(randNameNum)) {
                // NameList 에서 해당 사람의 이름을 출력
                System.out.printf("%s ", getName(randNameNum));

                // 팀 배정이 완료된 사람들의 번호 목록에 추가하고 인원수도 추가
                selectedNameNum.add(randNameNum);
                selectedPersonNum++;

                // 팀당 인원수를 채우게 되면 다음 팀 배정
                if(selectedPersonNum % personNumOfTeam[selectedTeamNum - 1] == 0) {
                    if(selectedTeamNum < totalTeamNum) {
                        System.out.printf("\n < %d팀 > : ", ++selectedTeamNum);
                    }

                    // 현재 팀 배정이 완료된 인원수를 총 인원수에 더하고
                    // 다음 팀 배정을 위해 0으로 초기화
                    selectedSumPersonNum += selectedPersonNum;
                    selectedPersonNum = 0;
                }
            }
        }
    }

    // 팀당 인원수를 세팅함
    public void setPersonNumOfTeam() {
        // (남는 인원수 고려하지 않고) 각 팀에 동일하게 배정한 인원수
        int defaultPersonNumOfTeam = totalPersonNum / totalTeamNum;
        // 각 팀에 동일한 인원을 배정하고 남는 인원수
        int restOfPersonNum = totalPersonNum % totalTeamNum;
        // 추가 배정 인원을 조정할 랜덤한 팀의 번호
        int randTeamNum;
        // 남은 인원 중 팀에 추가 배정할 인원수(0 ~ 1)
        int[] addPersonNumOfTeam = new int[totalTeamNum];


        // 추가 배정할 인원수를 0으로 초기화
        for(int i = 0; i < totalTeamNum; i++) {
            addPersonNumOfTeam[i] = 0;
        }

        // 팀별로 인원이 딱 맞게 나눠지지 않는 경우
        if(restOfPersonNum != 0) {
            // 남는 인원수만큼 실행
            for(int i = 0; i < restOfPersonNum; ) {
                // 어느 팀에 추가 인원을 배정할지를 랜덤으로 결정함
                randTeamNum = (int)(Math.random() * totalTeamNum);

                // 추가 배정 인원이 없던 팀이면 추가 인원 배정함
                if(addPersonNumOfTeam[randTeamNum] == 0) {
                    addPersonNumOfTeam[randTeamNum]++;
                    i++;
                }
            }
        }

        // 필요한 팀의 수만큼 팀당 인원수를 저장함
        for(int i = 0; i < totalTeamNum; i++) {
            personNumOfTeam[i] = defaultPersonNumOfTeam + addPersonNumOfTeam[i];
        }
    }
}