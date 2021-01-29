package Eighth;

class NumberStudy {
    int multiOfThree;
    int multiOfFive;
    int num;
    public void setNum(int num) {
        for(int i =0;i<num+1;i++){
            if(i %3 ==0){
                multiOfThree += i;
            }

            if(i %5 ==0){
                multiOfFive -= i;
            }
        }

        System.out.println("총 합 값 = " + multiOfThree);
        System.out.println("총 뺄셈 값 = " + multiOfFive);
        num = multiOfFive +multiOfThree;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setTotalSum(){
        getNum();
        System.out.println("두 값의 합: "+ getNum());
    }


}
