package Eighth;


class AvgStanDeviVariance {
    int student;
    int sum;
    float avg;
    int studentNum;
    int [] score;
    float variance;
    float stdDeviation;

   public void setScore(int student) {
       this.student =student;
      int[] score = new int[student];
      for (int i = 0; i < student; i++) {
         score[i] = (int) (Math.random() * 100);
         System.out.printf("학생[%d] = %d\n", i, score[i]);
          sum +=score[i];

      }
      System.out.println("총합은 =" + sum);

   }

    public void getAverage() {
       float avg = sum / student;
       this.avg = avg;
       System.out.println("평균은 =" + avg );

   }
   public void getCalcVariance(){
       int sum = 0;
       //sigma (샘플 -평균)^2 / 전체숫자 = 분산
       for (int i = 0;i<studentNum;i++){
           sum += Math.pow(score[i] -avg,2);
       }
       variance = sum /(float)studentNum;
   }
    public float getVariance() {
        return variance;
    }
    public void calcStdDeviation() {
        // 루트
        stdDeviation = (float)Math.sqrt(variance);
    }

    public float getStdDeviation() {
        return stdDeviation;
    }


   //---------------------------------------------------------------------------------
    //강사님 코드
    public void scoreCalculator(int studentNum){
        System.out.println("안녕 나는 생성자야!");
        this.studentNum = studentNum;
        score = new int[studentNum];
        for (int i =0; i<studentNum;i++){
            score[i] = (int) (Math.random()*50)+50;
        }
    }




}
