public class Number {

    private int start;
    private int end;

    public Number(int start, int end){
        this.start = start;
        this.end = end;
    }

    public void chageRange(int start, int end){
        this.start = start;
        this.end = end;
    }

    public void printNumber(){
        for(int i =start; i <= end; i++){
            System.out.println(i);
        }
    }

    public void printmMultiple(int orderNum){
        
        for(int i =start; i <= end; i++){
            if( i % orderNum == 0){
                System.out.println(i);
            }
        }
    }
}