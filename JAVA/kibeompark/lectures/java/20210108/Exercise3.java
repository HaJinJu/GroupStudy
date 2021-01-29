package Eighth;

class ScoreCalculator {
    int studentNum;
    int[] score;
    float mean;
    float variance;
    float stdDeviation;

    // 생성자 (Constructor)
    // 사실은 new 를 할 때 이 코드가 눈에 보이지 않게 내부적으로 동작한다.
    // 그러나 이와 같이 명시를 해주면 사용자가 생성자를 호출할 수 있게 된다.

    /*
    생성자를 사용하는 이유
    1) 편리해서
    2) 생성자를 대체할 수 있는 녀석은 Setter 이다.

    그러면 왜 Setter 도 있고 생성자도 따로 있을까 ?
    Setter 는 값을 바꿔야 하는 경우에 보통 사용하고
    데이터 오염도를 낮추기 위해서는 최대한 Setter 사용을 자제해야 한다.

    초기에 값을 할당하는 목적으로 생성자를 보통 사용한다.

    ex)
    String name;
    int age;
    String major;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMajor(String Major) {
        this.major = major;
    }

    ClassName cn = new ClassName();
    cn.setName("아무개");
    cn.setAge(15);
    cn.setMajor("프로게이머");

    ***************************   vs   ***************************

    public Classname(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    ClassName cn = new ClassName("아무개", 15, "프로게이머");

    위 쪽의 코드를 사용할 것인지 vs 아래쪽의 코드를 사용할 것인지를 보면 된다.
    결국 생성자를 사용하는 이유는 누가 더 편리한가 이다.

    * Q : 생성자가 있는데 굳이 Setter 를 써야 하나 ?
      A : 넵

    생성자는 초기화(초기값을 할당하는 작업)에만 사용이 가능하다.
    반면 Setter 는 초기화가 된 이후에도
    언제든지 값을 변경할 수 있다.
    (그러나 남발하면 위에서 언급한 데이터 오염도가 높아

    * Q : 추가 질문 사항

    Test t1 = new Test(1, 2, 3);
    Test t2 = new Test(4, 5, 6);

    t1 과 t2 가 서로에게 영향을 줄 수 있을까 ?
    t1 은 별도의 메모리 공간을 제어
    t2 도 별개의 메모리 공간을 제어하는 것임
    그러므로 현재 상황에서 t1 과 t2 가 서로 영향을 주는 일은 없다.

    t1.add(1);
    t1.print();

    t2.print();

    ------------------      ------------------
    | Test 클래스 정보 |       | Test 클래스 정보 |
    ------------------      ------------------
            t1                      t2

            위의 두 개는 서로 독립적이다.
    */

    // 생성자를 작성하는 방법
    // 1) 클래스 내부에서 메서드를 작성하는 방법과 아래의 사항을 제외하고 동일하다.
    // 2) 왜 유사하냐면 return 타입이 없기 때문이다.
    // 3) 그리고 메서드 이름이 클래스 이름과 같아야 한다.
    public ScoreCalculator(int studentNum) {
        System.out.println("안녕 ~ 나는 생성자야 !");
        this.studentNum = studentNum;

        score = new int[studentNum];

        for (int i = 0; i < studentNum; i++) {
            score[i] = (int)(Math.random() * 51) + 50;
        }
    }

    public void calcMean() {
        int sum = 0;

        for (int i = 0; i < studentNum; i++) {
            sum += score[i];
        }

        mean = sum / (float)studentNum;
    }

    public float getMean() {
        return mean;
    }

    public void calcVariance() {
        int sum = 0;

        // sigma (샘플 - 평균)^2 / 전체 숫자 = 분산
        for (int i = 0; i < studentNum; i++) {
            // 제곱
            sum += Math.pow(score[i] - mean, 2);
        }

        variance = sum / (float)studentNum;
    }

    public float getVariance() {
        return variance;
    }

    public void calcStdDeviation() {
        // 루트
        stdDeviation = (float)(Math.sqrt(variance));
    }

    public float getStdDeviation() {
        return stdDeviation;
    }

    public void printScores() {
        int cnt = 1;

        for (int i = 0; i < studentNum; i++) {
            System.out.printf("%4d", score[i]);

            if (cnt % 10 == 0) {
                System.out.println("");
            }

            cnt++;
        }
    }
}
public class Exercise3 {
    public static void main(String[] args) {
        // 3) 학급에 학생이 20명 있다.
        //    각 학생의 성적을 랜덤으로 기록해 준다. (입력으로 받으면 힘드니까)
        //    전체 학생들의 평균을 구하고 표준편차와 분산을 구해 보자.
        //    (분산과 표준편차 공식을 잘 모른다면 패스해도 OK)
        ScoreCalculator sc = new ScoreCalculator(20);

        System.out.println("학생들의 점수를 출력합니다.");
        sc.printScores();
        sc.calcMean();;
        System.out.println("이 반의 평균 = " + sc.getMean());

        sc.calcVariance();
        System.out.println("이 반의 분산 = " + sc.getVariance());

        sc.calcStdDeviation();
        System.out.println("이 반의 표준편차 = " + sc.getStdDeviation());
    }
}

/*
package Eighth;

class Score {
    final int STUDENT = 20;
    int studentScore[];
    float avg, stdev, var;

    public void setStudentScore() {
        studentScore = new int[STUDENT];

        for (int i = 0; i < STUDENT; i++) {
            studentScore[i] = (int) (Math.random() * 101);
        }
    }

    public void calcAvg() {
        int sum = 0;

        for (int i = 0; i < STUDENT; i++) {
            sum += studentScore[i];
        }
        avg = sum / (float)STUDENT;
    }

    public float getAvg() {
        return avg;
    }

    public void calcVar() {
        int sum = 0;

        for (int i = 0; i < STUDENT; i++) {
            sum += Math.pow(studentScore[i] - avg, 2);
        }

        var = sum / (float)STUDENT;
    }

    public float getVar() {
        return var;
    }

    public void calcStdev() {
        stdev = (float)Math.sqrt(var);
    }

    public float getStdev() {
        return stdev;
    }

    public void printScore() {
        int cnt = 1;

        for (int i = 0; i < STUDENT; i++) {
            System.out.printf("%3d", studentScore[i]);

            if (cnt % 10 == 0) {
                System.out.println("");
            }
            cnt++;
        }
    }
}

public class Quiz3 {
    public static void main(String[] args) {
        // 3) 학급에 학생이 20명 있다.
        //    각 학생의 성적을 랜덤으로 기록해 준다. (입력으로 받으면 힘드니까)
        //    전체 학생들의 평균을 구하고 표춘편차와 분산을 구해 보자.
        //    (분산과 표준편차 공식을 잘 모른다면 패스해도 OK)
        Score sc = new Score();

        System.out.println("점수");
        sc.setStudentScore();
        sc.printScore();

        sc.calcAvg();
        System.out.println("평균 : " + sc.getAvg());

        sc.calcVar();
        System.out.println("분산 : " + sc.getVar());

        sc.calcStdev();
        System.out.println("표준편차 : " + sc.getStdev());
    }
}
 */