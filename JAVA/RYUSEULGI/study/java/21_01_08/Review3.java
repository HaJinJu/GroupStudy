// 각 학생의 성적을 랜덤으로 기록해준다(입력으로 받으면 힘드니까)
// 전체 학생들의 평균을 구하고 표준편차와 분산을 구해보자
// 생성자 활용하기

class StudentGrade {
    
    int student;
    int [] grade;
    float avg;
    float variance;
    float stdDeviation;

    public StudentGrade(int student){
        this.student = student;

        // grade 배열의 길이는 student 수 만큼 만든다
        grade = new int[student];

        // 배열에는 0~100의 랜덤한 수를 넣는다
        for(int i = 0; i < student; i++){
            grade[i] = (int)(Math.random() * 100);
        }
    }

    public float clacAvg(){
        int sum = 0;

        for(int i = 0; i < student; i++){
            sum += grade[i];
        }

        avg = sum / student;
        return avg;
    }

    // 분산 = ((점수 - 평균)한 것의 합) ^2 / 전체숫자
    public float clacVariation(){
        float pow = 0;

        for(int i = 0; i < student; i++){
            pow += Math.pow(grade[i] - avg, 2);
        }

        variance = pow / student;
        return variance;
    }

    // math.sqrt 루트 메소드
    public float clacStdDeviation(){
        stdDeviation = (float)Math.sqrt(variance);
        return stdDeviation;
    }
}

public class Review3{
    public static void main(String[] args) {
        
        StudentGrade studentGrade = new StudentGrade(10);
        System.out.println(studentGrade.clacAvg());
        System.out.println(studentGrade.clacVariation());
        System.out.println(studentGrade.clacStdDeviation());
    }
}
