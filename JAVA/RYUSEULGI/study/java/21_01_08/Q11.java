// 웹 페이지에서 게시판 글을 관리하는 것과 유사한 케이스의 문제다.
// 랜덤을 활용해서 n 개의 글을 작성한다고 가정한다.
// 해당 게시물에서 랜덤한 횟수로 랜덤수를 생성한다.
// (이때 랜덤한 횟수는 n 보다 작아야 한다)
// 이때 랜덤수로 생성한 숫자의 게시물을 지우고
// 각각의 게시물 번호를 1, 2, 3, 4, 5 형태로 만들어준다.
// (배열을 활용해서 문제를 풀어보자!)

// ex) 1, 2, 3, 4, 5, ... 10, 11, 12
// 3, 5, 7 을 삭제했다고 가정
// 1, 2, 4, 6, 8, 9, 10, 11, 12 와 같이 보여질텐데
// 이것을 다시 1, 2, 3, 4, 5, 6, 7, 8, 9 형태로 보이게 만든다.

// 1. 랜덤 배열에 랜덤 개수 배치
// 2. 랜덤 개수를 랜덤으로 지우기

class AllocRandom{

    public static final int RANGEARR = 6;
    public static final int BIASARR = 5;

    public static final int RANGEVALUE = 101; 
    public static final int BIASVAULE = 10;

    int numOfRandom;
    int [] randomArr;
    
    int randomPick;

    // 초기화만 해주는 생성자가 나중에 유지보수하기 좋다
    public AllocRandom() {
        numOfRandom = (int) (Math.random() * RANGEARR) + BIASARR; // 배열의 개수 6~10
        
        randomArr = new int[numOfRandom];
    }

    public void randomNum2Arr(){
        for(int i = 0; i < randomArr.length; i++){            
            randomArr[i] = (int)(Math.random() * RANGEVALUE ) + BIASVAULE;  // 배열 안에 랜덤한 수 10~100
        }
    } 

    public void dltRandomNumValue(){
        randomPick = (int)(Math.random() * numOfRandom);   // 배열 중 어떤 숫자를 고를지 배열의 개수만큼 랜덤

        System.out.println("delete number is " + randomArr[randomPick]);
        // dltNumber
        randomArr[randomPick] = -1;
    }

    public void printRandomArr() {
        for (int i = 0; i < randomArr.length; i++) {

            if (randomArr[i] == -1) {
                continue;
            }
            System.out.println(randomArr[i]);
        }
    }
}

public class Q11 {
    public static void main(String[] args) {
        
        AllocRandom allocRandom = new AllocRandom();
        
        allocRandom.randomNum2Arr();
        allocRandom.printRandomArr();

        allocRandom.dltRandomNumValue();
        allocRandom.printRandomArr();

    }
}
