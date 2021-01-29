package Eg;

class Renn{
    int[] Stu = new int[20];
    float Avg =0;
    int sum =0;

    //생성자(Constructor)
    //사실은 new 를 할 때 이 코드가 눈에 보이지 않게 내부적으로 동작한다.
    //그러나 이와 같이 명시를 해주면 사용자가 생성자를 호줄할 수 있게 된다.

    //생성자를 작성하는 방법
    //1) 클래스 내부에서 매서드를 작성하는 방법과 아래의 사항을 제외하고 동일하다.
    //2) return 타입이 없다.
    //3) 그리고 매서드 이름이 클래스 이름과 같아야 한다.

    public void Gru(){
       for(int i=0; i <Stu.length; i++){
           Stu[i] = (int)(Math.random() * 101);
           sum += Stu[i];
           Avg = (float) sum / Stu.length;
           System.out.printf("Stu[%d] = %d\n",i,Stu[i]);
       }
        System.out.println("전체 학생들의 합 = "+sum);
        System.out.println("전체 학생들의 평균 = "+Avg);

    }
}

public class Ex_3 {
    public static void main(String[] args) {
        //3) 학급에 학생이 20 명 있다.
        //   각 학생의 성적을 랜덤으로 기록해준다(입력으로 받으면 힘드니까)
        //   전체 학생들의 평균을 구하고 표준편차와 분산을 구해보자
        //   (분산과 표준편차 공식을 잘 모른다면 패스해도 OK)
        Renn re = new Renn();
        re.Gru();
    }
}
