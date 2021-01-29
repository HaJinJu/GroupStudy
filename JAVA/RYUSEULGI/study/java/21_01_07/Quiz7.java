// 총 20명의 사원이 있다고 가정한다.
// 20명 모두에게 랜덤한 번호가 할당되도록 만든다(중복 허용)

import java.util.Arrays;

class Sawon {
    int [] person;

    public void random(int num){
        person = new int[num];

        for(int i= 0; i < num; i++){
            person[i] = (int)(Math.random() * 21);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(person);
    }
}


public class Quiz7 {
    public static void main(String[] args) {
        
        Sawon sawon = new Sawon();
        sawon.random(20);
        System.out.println(sawon);

        // Random method 활용
        Random random = new Random();

        random.setMember(20);
        random.setRandom(random.DUPLICATE);
    }
}
