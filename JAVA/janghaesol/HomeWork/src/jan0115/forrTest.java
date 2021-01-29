package jan0115;

import java.util.ArrayList;

public class forrTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();    //String 타입을 받는 ArrayList 생성
        list.add("가을");                                       //요소를 추가한다.
        list.add("하늘");                                       //요소를 추가한다.

        for(int i=0; i<list.size(); i++)                          //요소의 크기만큼 돌면서
            System.out.println(list.get(i));                    //요소를 출력한다.


        System.out.println("#####################");

        ArrayList<String[]> list2 = new ArrayList<String[]>();  //String[] 타입을 받는 ArrayList 생성
        list2.add(new String[]{"가을", "하늘"});                 //요소를 추가한다.

        for(int t=0; t<list2.size(); t++)                            //요소의 크기만큼 돌면서
            System.out.println(list2.get(t)[0]);                   //요소를 출력한다.


        System.out.println("#####################");
        String[][] strArr = new String[][] {{"1번", "1가을", "1하늘"}, {"2번", "2가을", "2하늘"}};
        ArrayList<String[]> list3 = new ArrayList<String[]>();

        for(int i=0; i<strArr.length; i++)                          //입력
            list3.add(new String[]{strArr[i][0], strArr[i][1], strArr[i][2]});

        for(int i=0; i<list3.size(); i++)                            //출력
            System.out.println(list3.get(i)[0] + "\t" + list3.get(i)[1] + "\t" + list3.get(i)[2]);

        String[][] array2d = new String[list3.size()][];

        for(int i=0; i<list3.size(); i++)
        {
            String[] row = list3.get(i);
            array2d[i] = new String[row.length];

            for(int j=0; j<row.length; j++)
                array2d[i][j] = row[j];
        }


    }
}
