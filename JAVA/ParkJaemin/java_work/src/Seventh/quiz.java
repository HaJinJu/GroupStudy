package Seventh;

import java.util.Random;

public class quiz {
    public static void main(String[] args) {
        final int MEMBERNUM = 4;
      int [] startMemberAccount = new int[MEMBERNUM];

      for (int i = 0; i<MEMBERNUM; i++){
          startMemberAccount[i] = (int)(Math.random()*1201)+2400;
          System.out.println("스타트업 멤버의 연봉 = " + startMemberAccount[i]);
        }
    }
}
