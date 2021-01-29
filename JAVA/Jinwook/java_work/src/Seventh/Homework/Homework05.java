package Seventh.Homework;
class Con1 {
    int num;

    public void setNum(){

        for(int i = 1 ; i < 21 ; i ++){
            if(( i % 2 == 0) || (i % 3 == 0)) {

                num = i;
                System.out.println("number="+num);
            }
            num++;
        }

    }
}

public class Homework05 {
    public static void main(String[] args) {
        Con1 co = new Con1();
        co.setNum();
        System.out.println(co);

    }
}