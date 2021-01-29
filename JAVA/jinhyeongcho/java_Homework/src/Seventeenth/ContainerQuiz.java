package Seventeenth;

import java.util.Scanner;

public class ContainerQuiz {
    private int conNum;
    private int size = 4096;
    public int remainPack;
    int[] pick;
    Scanner scan = new Scanner(System.in);


     public void PackageCon(){
         int pack =(int)(Math.random()*50001)+50000;
         conNum = pack/ size;
         remainPack = pack % size;
         System.out.println("물품의 갯수는 =" + pack);
         System.out.println("컨테이너의 수는 =" + conNum);
         System.out.println("컨테이너에 싣지 못한 물품 " + remainPack);
     }
        // 9번문제는 좀더 고민해봐야겠습니다....
    //     컨테이너 중 특정한 컨테이너를 빼는건지... 특정 컨테이너에서 지정갯수의 물품을 빼는건지..
    //     좀더 생각해보겠습니다..
     public void pickCon(){
         pick = new int[size];
         System.out.println("4096개 물건중 몇번 물품을 뺄것인가요? =");
         int num = scan.nextInt();
         for (int i = 0;i <4096;i++){
             pick[i]=i;
             if(i==num){
                 System.out.printf("컨테이너에서 %d번 물품을 뺐습니다\n",pick[i]);
             }
         }
     }


}
