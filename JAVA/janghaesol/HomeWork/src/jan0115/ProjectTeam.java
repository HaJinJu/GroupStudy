package jan0115;

import java.util.ArrayList;

public class ProjectTeam {
    public static void main(String[] args) {
        //우선 총 맴버의 arraylist 스트링을 만든다.
        //이중배열은 만들어서 각 배열에 A조와 B조가 들어가게 만든다.
        //반복을 확인하고 출력.
        ArrayList<String> memberList1 = new ArrayList<String>();
        ArrayList<String> memberList2 = new ArrayList<String>();

        memberList1.add("최현정");
        memberList1.add("장해솔");
        memberList1.add("박재민");
        memberList1.add("고동영");
        memberList1.add("이정현");
        memberList1.add("류슬기");
        memberList1.add("조진형");
        memberList1.add("한다은");
        memberList1.add("오진욱");
        memberList2.add("노찬욱");
        memberList2.add("박소현");
        memberList2.add("박기범");
        memberList2.add("최임식");
        memberList2.add("탁성진");
        memberList2.add("하진주");
        memberList2.add("이승윤");
        memberList2.add("이범진");

        /*
        ArrayList<String> randomComplete = new ArrayList<String>();

        int randomA = (int) (Math.random() * memberList1.size());
        while ( memberList1.size() != 0 ) {
            int random = (int)(Math.random()*memberList1.size());
            randomComplete.add( memberList1.get(random) );
            memberList1.remove(random); //remove 로 인해서 카운터가 변화

        }


        for(String s : randomComplete){
            System.out.println(s);
        }
        */
        int randomB = (int) (Math.random() * memberList2.size());
        ArrayList<String> randomComplete = new ArrayList<String>();
        for(int i = 0; i < memberList1.size(); i++){
            System.out.printf("%d",i+1);
            if(i%5 == 4)
            System.out.println();
        }

/*
        while ( memberList1.size() != 0 ) {
            int random = (int)(Math.random()*memberList1.size());
            randomComplete.add( memberList1.get(random) );
            memberList1.remove(random); //remove 로 인해서 카운터가 변화

        }


        for(String s : randomComplete){
            System.out.println(s);
        }

        int[][] arrA = {
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1}
                };
        for(int i = 0; i < randomA;i++){
            for(int j = 0; j < randomA; j++){
                System.out.printf("2d", arrA[i][j]);
            }
            System.out.println("");
        }

 */

//        String [][] arr1 = {
//                {"r", "r", "rr", "r", "r"},
//                {"r", "r", "r", "rr"},
//        };
//
//        for (int i = 0; i < randomA; i++) {
//            for (int j = 0; j < arr1[i][j].length(); i++) {
//                System.out.printf("%2d",randomA);
//            }
//        }


    }
}
        /*
        ArrayList<String[]> list3 = new ArrayList<String[]>();

        ArrayList<String> randomComplete = new ArrayList<String>();
        while (memberList1.size() != 0) {
            System.out.println(memberList1.size()); //루프내에서 변화함
            int random = (int) (Math.random() * memberList1.size());
            randomComplete.add(memberList1.get(random));
            memberList1.remove(random); //remove 로 인해서 카운터가 변화
            for(int i = 0; i < random1; i++) {
                list3.add(new String[]{String.valueOf(arr1[i][0]), String.valueOf(arr1[i][1]), String.valueOf(arr1[i][2]), String.valueOf(arr1[i][3]), String.valueOf(arr1[i][4])});
            }
            for(int i = 0; i < random1; i ++){
                System.out.println(list3.get(i)[0] + "\t" + list3.get(i)[1] + "\t" + list3.get(i)[2] +
                        "\t" + list3.get(i)[3] +"\t" + list3.get(i)[4] );
            }
        }
        for (String s : randomComplete) {
            System.out.println(s);
        }



        for(int i = 0; i < random1; i++) {
            list3.add(new String[]{String.valueOf(arr1[i][0]), String.valueOf(arr1[i][1]), String.valueOf(arr1[i][2]), String.valueOf(arr1[i][3]), String.valueOf(arr1[i][4])});
        }
        for(int i = 0; i < random1; i ++){
            System.out.println(list3.get(i)[0] + "\t" + list3.get(i)[1] + "\t" + list3.get(i)[2] +
                    "\t" + list3.get(i)[3] +"\t" + list3.get(i)[4] );
        }
        }


        for(int i=0; i<arr1.length; i++)       {                   //입력
            list3.add(new String[]{arr1[i][0], arr1[i][1], arr1[i][2], arr1[i][3], arr1[i][4]);

        for(int i=0; i<list3.size(); i++)      {                      //출력
            System.out.println(list3.get(i)[0] + "\t" + list3.get(i)[1] + "\t" + list3.get(i)[2]
                    "\t" + list3.get(i)[3] +"\t" + list3.get(i)[4] +);

    }
}


    }

         */






