package FirstRegularTest;

class wareHouse {
    private int randFullSize;


    public void randpickfullsize() {
        randFullSize = (int) (Math.random() * 50000) + 50000;
    }

    public void muchInside() {
        int build;
        int res;
        int maxInside = 4096;
        build = randFullSize / maxInside;
        res = randFullSize % maxInside;
        int[] insidearr = new int[build];


        System.out.println("공장에 놓인 물품의 개수는 : " + randFullSize);
        System.out.println("공장안에 필요한 배열 공간의 개수는 :" + build);
        System.out.println("공장안에 나뉜 배열공간의 개수는 : " + insidearr.length);
        System.out.println("공장안에 물품을 4096개로 분류한 후 남은 물품의 개수는 : " + res);

    }
}


public class Eighth {
    public static void main(String[] args) {
        //어떤 임의의 공간 크기가 5만 ~ 10만이다.
        //이 공간에 어떤 물품을 4096 단위로 정렬하여 배치하고자 한다. 이를 프로그래밍 해보자!
        wareHouse st = new wareHouse();
        st.randpickfullsize();
        st.muchInside();

    }
}
