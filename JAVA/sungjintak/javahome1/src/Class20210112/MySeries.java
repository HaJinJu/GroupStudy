package Class20210112;

public class MySeries {
    private final int start;
    private final int end;

    public MySeries (int start, int end){
        this.start = start;
        this.end = end;
    }
    public void For(){
        for(int i = start; i <= end; i++){
            System.out.printf("%d ~ %d 숫자출력 = %d\n",start,end,i);
        }
    }
    public void For(int Nb){
        for(int i = start; i <= end; i++){
            if(i % Nb==0){
                System.out.printf("%d ~ %d 사이의 7의 배수 = %d\n",start,end,i);
            }

        }
    }
}

