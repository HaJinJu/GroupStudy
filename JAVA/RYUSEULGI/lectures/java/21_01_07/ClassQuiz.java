/* 
math.pow() 제곱을 구하는 메소드
*/

import java.util.Scanner;

/// 문제 2번

class StartUp {

    int[] members;

    public void payRoll(int num){
        members = new int[num];
        for(int i =0; i< num; i++){
            members[i]= (int)(Math.random() * 1201) + 2400;
        }
    }
}

// 문제 3번

class Triangle {
    float bottom;
    float height;

    public void setBottom(float bottom) {
        this.bottom = bottom;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getArea(){
        return bottom * height * 0.5f;  //float 이기 때문에 f 추가
    }

    // public float getArea2(){
    //     return 0.5f * a * b * (float)Math.sin(theta);
    // }
}

// 문제 4번

// 사용자 입력으로 시작값을 받고
// 사용자 입력으로 끝값을 받는다.
// 그리고 또 다른 사용자 입력을 받는다.
// 마지막에 입력된 사용자 입력값으로 나눠 떨어지는 숫자들을
// 시작값과 끝값 사이에서 찾아서 출력하는 매서드를 만들어보자!

class StartEndNumber {

    int start;
    int end;
    int add;

    Scanner scan;

    public void setScan(){
        scan = new Scanner(System.in);
    }

    public void setStart(){
        System.out.println("시작숫자");
        start = scan.nextInt();
    }

    public void setEnd(){
        System.out.println("끝숫자");
        end = scan.nextInt();
    }

    public void setAdd(){
        System.out.println("추가입력숫자(나누는 수)");
        add = scan.nextInt();
    }

    public void calcNumber(){
        System.out.printf("%d ~ %d 숫자 중 %d로 나누어 떨어지는 수는\n", start, end, add);

        for(int i = start; i < end; i++){
            if ( i % add == 0){
                System.out.println(i);
            }            
        }
    }
} 

// 문제 5번

class Fibonacci {
    int [] arr;
    int number;
    Scanner scan;


    public void setScan(){
        scan = new Scanner(System.in);
    }

    public void setArr(){
        System.out.println("찾으려고 하는 항은?");
        number = scan.nextInt();

        if( number <= 0){
            System.out.println("error");
            return;
        }

        arr = new int[number];
    }

    public int getNumber(){

        arr[0] = 1;
        arr[1] = 1;

        for(int i =2; i < arr.length; i++){
            arr[i] = arr[i -2] + arr[i -1];
        }
        return arr[number -1];
    }
}

public class ClassQuiz {
    public static void main(String[] args) {
        
        // 문제 1번
        
        int member [] = new int[4];

        for(int i =0; i < member.length; i++){
            member[i]= (int)(Math.random() * 1201) + 2400;
            System.out.println(member[i]);
        }

        // 문제 2번

        StartUp su = new StartUp();
        su.payRoll(4);

        // 문제 3번

        Triangle triangle = new Triangle();
        triangle.setBottom(2.0f);
        triangle.setHeight(3.5f);
        System.out.println(triangle.getArea());

        // 문제 4번

        StartEndNumber calc = new StartEndNumber();
        calc.setScan();
        calc.setStart();
        calc.setEnd();
        calc.setAdd();
        calc.calcNumber();

        // 문제 5번

        Fibonacci fibo = new Fibonacci();
        fibo.setScan();
        fibo.setArr();

    }
}