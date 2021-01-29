// 컴퓨터와 가위 바위 보 게임

import java.util.Scanner;

class VsComputer{

    Scanner scan;
    String rockSissorsPeper;
    String userChoice;
    int random = (int)(Math.random() * 3);

    public String setUser(){
        scan = new Scanner(System.in);
        String user = scan.nextLine();

        switch (user) {
            case "가위":
                userChoice = "가위";
                break;
            case "바위":
                userChoice = "바위";
                break;            
            case "보":
                userChoice = "보";
                break;
            default:
                System.out.println("error");
                break;
        }
        return userChoice;
    }

    public String setComputer(){
        switch(random) {
            case 0:
                rockSissorsPeper = "가위";
                System.out.println(rockSissorsPeper);
                break;
            case 1:
                rockSissorsPeper = "바위";
                System.out.println(rockSissorsPeper);
                break;        
            case 2:
                rockSissorsPeper = "보";
                System.out.println(rockSissorsPeper);
                break;
            default:
                System.out.println("error");
        }
        return rockSissorsPeper;
    }

    // public String printWinner(){
    //     // 승자 찾기
    // }
}
public class Q5 {
    public static void main(String[] args) {
        // VsComputer vsComputer = new VsComputer();

        // System.out.println("가위바위보!");

        // vsComputer.setUser();
        // vsComputer.setComputer();
        // vsComputer.printWinner();

        RockSissosPaper rsp = new RockSissosPaper();

        rsp.playGame();
    }
}
