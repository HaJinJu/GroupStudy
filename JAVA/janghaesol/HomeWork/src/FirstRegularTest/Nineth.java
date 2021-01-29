package FirstRegularTest;

class factory {
    private int randomAllSize;
    private int[] factoryArr;
    private final int eachArrMax = 4096;
    private int res;
    private final int pickUp;
    int build;

    public factory(int pickUp){
        this.pickUp = pickUp;
    }

    public void randomAllSize() {
        randomAllSize = (int) (Math.random() * 50000) + 50000;
    }

    public void muchInside() {
        build = randomAllSize / eachArrMax;
        res = randomAllSize % eachArrMax;
        factoryArr = new int[build];

        System.out.println("[공장에 놓인 물품의 개수는 : " + randomAllSize);
        System.out.println("공장안에 나뉜 배열공간의 개수는 : " +factoryArr.length);
        System.out.println("공장안에 물품을 4096개로 분류한 후 남은 물품의 개수는 : " + res +"]");
    }

    public void uselessSpace(){
        int useless;
        useless = eachArrMax - res;
        System.out.println("");
        System.out.println("[마지막 공간에 낭비되는 물품공간 : " + useless + "]");
        System.out.println("");
    }

    public void fillItUp(){
        int[] newfactoryArr;
        int newres;
        System.out.println("[빼고싶은 물품 갯수 : " + pickUp);

        if(pickUp < res) {
            res -= pickUp;
            System.out.println("물품을 뺀 후의 공장 안 공간의 수 : " + factoryArr.length);
            System.out.println("물품을 뺀 후의 남는 물품 수 : " + res + "]");
        }else if(pickUp > res){
                build -= 1;
                newfactoryArr = new int[build];
                newres = eachArrMax + (res - pickUp) ;
                System.out.println("물품을 뺀 후의 공장 안 공간의 수 :" + newfactoryArr.length);
                System.out.println("물품을 뺀 후 마지막 공간에 남는 물품 수 :" + newres +"]");
        }
    }
}

public class Nineth {
    public static void main(String[] args) {
        //위의 문제에서 낭비되는 공간은 얼마인지 파악해보자!
        //또한 배치된 물품에서 물건을 꺼낼 경우 어떤식으로 공간을
        //관리할지 전략을 구성하여 해당 전략에 대해 프로그래밍 해보도록 한다.
        factory fs = new factory(3000);
        fs.randomAllSize();
        fs.muchInside();
        fs.uselessSpace();
        fs.fillItUp();
    }

}
