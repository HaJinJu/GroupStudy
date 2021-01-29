package Twentieth.Homework;

public class Q1_DICE {
    public static void main(String[] args) {
        DICEgame game = new DICEgame();

        game.ROLLdice();

        game.Checkdicenumber();
    }
}

class DICEgame {
    int usersum = 0;
    int comssum = 0;
    int[] userdice;
    int[] comsdice;


    public void ROLLdice() {
        System.out.println("[지금부터 주사위 게임을 시작합니다]");

        int[] userdice = new int[2];

        for (int i = 0; i < userdice.length; i++) {
            userdice[i] = (int) ((Math.random() * 6 + 1));

            System.out.printf("userdice = %d%n", userdice[i]);

            usersum += userdice[i];
        }

        int[] comsdice = new int[2];

        for (int i = 0; i < comsdice.length; i++) {
            comsdice[i] = (int) ((Math.random() * 6 + 1));

            comssum += comsdice[i];

            System.out.printf("comsdice = %d%n", comsdice[i]);


        }

        System.out.println(" ");
        System.out.println("[user VS coms의 두 주사위 합은?]");


        System.out.println("user의 주사위 숫자 합은 =  " + usersum);
        System.out.println("coms의 주사위 숫자 합은 =  " + comssum);


    }

    public void Checkdicenumber() {

        if (comssum < usersum) {
            System.out.println("user가 승리했습니다.");
        } else if (comssum > usersum) {
            System.out.println("coms가 승리했습니다.");
        } else if (comssum == usersum) {
            System.out.println("무승부 입니다");
        }

    }
}

