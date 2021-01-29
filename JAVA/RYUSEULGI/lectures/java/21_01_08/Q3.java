// 학급에 학생이 20 명 있다.
// 각 학생의 성적을 랜덤으로 기록해준다(입력으로 받으면 힘드니까)
// 전체 학생들의 평균을 구하고 표준편차와 분산을 구해보자

// 생성자 활용하기

class StudentNum{

    int student;
    int [] grade;
    float avg;
    float variance;
    float stdDeviation;
    
    // 생성자: 사용자가 생성자 호출 가능
    // class와 이름 동일하게 하기
    
    public StudentNum(int student){

        System.out.println("생성자");
        this.student = student;

        grade = new int[student];

        for(int i =0; i< student; i++){
            grade[i] = (int)(Math.random() * 100) + 1;
        }
    }

    public float getAvg(){
        int sum = 0;

        for(int i = 0; i < student; i++) {
            sum += grade[i];
        }
        avg = sum / student;
        return avg;
    }

    public float getVariance(){
        float pow = 0;
        for(int i = 0; i < student; i++){
            pow += Math.pow(grade[i] - avg, 2);
        }
        variance = pow / student -1;
        return variance;
    }

    public float GetStandardDeviation(){

        stdDeviation = (float)Math.sqrt(variance);
        return stdDeviation;
        
    }

    public void printGrade(){
        int cnt = 1;

        for(int i = 0; i < student; i++){
            System.out.println(grade[i]);
        }

        if( cnt % 10 == 0){
            System.out.println("");
        }
        cnt++;
    }
}

public class Q3 {
    public static void main(String[] args) {
        
        StudentNum studentnum = new StudentNum(5);

        studentnum.printGrade();
        System.out.println(studentnum.getAvg());
        System.out.println(studentnum.getVariance());
        System.out.println(studentnum.GetStandardDeviation());
    }
}