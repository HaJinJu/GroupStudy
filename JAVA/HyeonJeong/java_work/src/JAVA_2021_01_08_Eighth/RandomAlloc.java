package JAVA_2021_01_08_Eighth;

public class RandomAlloc {
    public final int DUPLICATE = 1;
    public final int NONDUPLICATE = 2;

    int[] employee;

    public void prepareArray() {                      // 배열의 크기를 랜덤
        int randNum = (int) (Math.random() * 11) + 5;
        employee = new int[randNum];
    }

    public void setRandomArray() {                    // 배열에 저장하는 값을 랜덤으로
        for (int i = 0; i < employee.length; i++) {
            employee[i] = ((int) (Math.random() * 10) + 3) * 333;
        }
    }

    public int getArrayEvenNumberCount() {            // 배열에 저장한 짝수의 갯수가 몇개인
        int count = 0;

        for (int i = 0; i < employee.length; i++) {
            if (employee[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public void prepareArray(int num) {
        employee = new int[num];
    }

    public void setRandomNumber(final int ORDER) {   //상수를 사용하여 중복허용과 중복불가를 설정한다.
        int[] dupCheck;                              //중복불가를 설정할때 필요한 빈 배열생성

        dupCheck = new int[employee.length];         //employee의 길이만큼

        for (int i = 0; i < employee.length; i++) {
            dupCheck[i] = 0;                         //배열에 0을 넣어준다.
        }

        // 루프를 20번만 돌게 되므로
        // 중복시 continue 를 하게되면 반복 횟수가 차감되므로
        // 모든 값을 할당하지 못함!
        // 작업이 종료되었음을 알려주는 변수가 필요하다.
        boolean finish = false;                      //무한 루프 탈출 열쇠!
        // 중복되지 않는 케이스에서는 20 개의 할당이면 끝임을 알려야 한다.
        int cnt = 0;                                 //중복불가에서 사용할 count값
        // for(int i = 0; i < employee.length; i++) {
        // 아래쪽의 employee[i] = randNum; 부분에서 배열 크기 문제 발생!
        // for(int i = 0; ; i++) {
        for (int i = 0; ; ) {                          // 무한 루프
            if (finish) {
                break;
            }

            switch (ORDER) {
                case DUPLICATE:                      // 중복허용 ver.
                    cnt++;
                    if (cnt == 20) {                  //count가 20이 되면 무한루프 탈출!
                        finish = true;
                    }
                    //System.out.println("I'm DUPLICATE");
                    employee[i++] = (int) (Math.random() * 20) + 1;
                    //employee[1] = 랜덤숫자, employee[2] = 랜덤숫자... employee[20] = 랜덤숫자 => 탈출~
                    break;

                case NONDUPLICATE:
                    //System.out.println("I'm NON-DUPLICATE");
                    int randNum = (int) (Math.random() * 20) + 1;
                    //랜덤한 숫자를 뽑는다.

                    if (dupCheck[randNum - 1] != 0) { // randNum-1 번째가 0이 아니면 중복이므로 continue
                        System.out.println("중복 발생! = " + randNum);
                        // 어떤 숫자가 중복이 되는지 출력해보자!
                        continue;
                    }

                    employee[cnt++] = randNum;       // 중복이 아닐경우 그 배열에 랜덤숫자를 저장한다.
                    dupCheck[randNum - 1] = 1;       // 그리고 0 => 1로 바꿔준다.

                    if (cnt == 20) {                  // count가 20이 되면 무한루프 탈출!
                        finish = true;
                    }

                    break;

                default:                             // 다른 값을 입력했을 경우에 출력된다.
                    System.out.println("잘못된 요청입니다!");
                    break;
            }
        }
    }

    public void printEmployee() {
        int cnt = 1;

        for (int i = 0; i < employee.length; i++) {   // 저장한 employee[i] 값을 불러오기 위해 i를 0 ~ 길이 만큼
            System.out.printf("%3d", employee[i]);
            //System.out.printf("%3d", i);

            if (cnt % 5 == 0) {
                System.out.println("");
            }
            cnt++;
        }
    }

    public void printPrice() {
        // 규칙: 꽝 - 짝수
        //      7의 배수 - 1000만원
        //      3의 배수 - 100만원
        for(int i = 0; i < employee.length; i++) {
            if(employee[i] % 2 == 0) {
                System.out.println("내년을 기약하세요 ㅠㅠ 꽝입니다.");
            } else if(employee[i] % 7 == 0) {
                System.out.println(
                        "당첨입니다 - 통장으로 1000만원이 입금되었습니다.");
            } else if(employee[i] % 3 == 0) {
                System.out.println(
                        "당첨입니다 - 통장으로 100만원이 입금되었습니다.");
            }
        }
    }
}
