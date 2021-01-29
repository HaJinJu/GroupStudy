public class Number {
    int start;
    int end;

    public Number(int start, int end){
        this.start = start;
        this.end = end;
    }

    public void setNumber(){
        for(int i =start; i <= end; i++){
            System.out.println(i);
        }
    }

    public void multiple7(){
        
        for(int i =start; i <= end; i++){
            if( i % 7 == 0){
                System.out.println(i);
            }
        }
    }

    public void odd(){
        
        int sum = 0;

        for(int i =start; i <= end; i++){
            if( i % 2 != 0){
                sum += i;
            }        
        }
        System.out.println(sum);
    }

}
