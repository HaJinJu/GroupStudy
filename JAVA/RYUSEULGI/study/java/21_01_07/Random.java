public class Random {

    public final int DUPLICATE = 1;
    public final int NONDUPLICATE = 2;

    int[] member;

    public void setMember(int num) {
		member = new int[num];
    }
    
    public void setArr(){
        int randomNumber = (int)(Math.random() * 11) + 5;
        member = new int[randomNumber];
    }

    public void setRandomArr(){
        for(int i = 0; i < member.length; i++){
            member[i] = (int)(Math.random() * 10) +1;
        }
    }

    public void printRandomArr(){
        for(int i = 0; i < member.length; i++) {
            System.out.println(member[i]);
        }
    }

    public int getRandomArr(){
        int cnt = 0;

        for(int i = 0; i < member.length; i++){
            if(member[i] % 2 == 0){
                cnt++;
            }
        }
        return cnt;
    }

    public void setRandom(final int ORDER){
        int [] check = new int[member.length];

        // 중복 체크용으로 배열 생성
        for(int i = 0; i < member.length; i++){
            check[i] = 0;
        }

        // 중복체크는 멤버의 배열 만큼으로 정해져 있는데
        // 중복시에도 계속 randNum의 수가 하나씩 차감되기 때문에
        // 멤버의 배열 수 안에 중복 없는 배열을 완성시키지 못할 수 있음
        // 그래서 작업이 끝났음을 알려주는 변수가 필요
        boolean finish = false;
        int cnt = 0;

        for(int i = 0; ;) {
            if(finish) {
                break;
            }

            switch (ORDER) {
                case DUPLICATE:
                    cnt++;
                    if( cnt == 20 ){
                        finish = true;
                    }
                    member[i++] = (int)(Math.random() * 20) + 1;
                    break;
                    
                case NONDUPLICATE:
                    int randNum = (int)(Math.random() * 20) + 1;

                    // 0이 아니라면 다시 0이면 넘어가
                    if(check[randNum -1] != 0){
                        System.out.println(randNum);
                        continue;
                    }
                    member[cnt++] = randNum;
                    check[randNum -1] = 1;

                    if( cnt == 20 ){
                        finish = true;
                    }
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }
    }
    
    public void printPrice() {

        for(int i = 0; i < member.length; i++){
            if( member[i] % 7 == 0){
                System.out.println("당첨");
            }else{
                System.out.println("꽝");
            }
        }
    }
}
