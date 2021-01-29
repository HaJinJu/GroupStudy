package Seventh.Homework;

class Multiple{

    int num;

    public void setNum(){

        for(int i = 1 ; i < 21 ; i ++){
            if( i % 2 == 0) {

                num = i;
                System.out.println("number="+num);
            }
        num++;
    }

    }
}
public class Homework03 {
    public static void main(String[] args) {
        Multiple mu = new Multiple();
        mu.setNum();
        System.out.println(mu);

    }
}
