package Project0107;

class StartUp {
    int[] startMemberAccount;

    public void setRandomPayment(int num) {
        int i;

        startMemberAccount = new int[num];

        for(i=0; i<num; i++) {
            startMemberAccount[i] = (int)(Math.random()*1201) + 2400;
        }

    }

}
public class Quiz02 {

    public static void main(String[] args) {
        //Quiz01_class써서

        StartUp su = new StartUp();
        su.setRandomPayment(4);

        System.out.println(su);
    }
}
