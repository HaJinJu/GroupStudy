public class Quiz {
    public static void main(String[] args){

        // 문제 1번

        int[] array = new int[7];

        for(int i =0; i< array.length; i++){
            array[i] = i + 1;
            System.out.println(array[i]);
        }

        // 문제 2번

        int[] arr = new int[7];

        for(int i=0; i<arr.length; i++){
            arr[i] = (int)(Math.random() * 7);
            System.out.println(arr[i]);
        }

        // 문제 3번 

        int[]similarPivonachi = new int[20];

        similarPivonachi[0] =1;
        similarPivonachi[1] =1;
        similarPivonachi[2] =3;

        for(int i =3; i< similarPivonachi.length; i++){
            similarPivonachi[i] = similarPivonachi[i - 3] + similarPivonachi[i - 1];
        }
        System.out.println(similarPivonachi[19]);

        // 문제 4번

        float[] Arr = new float[3];

        for(int i=0; i<Arr.length; i++){
            Arr[i] = (float)(Math.random() * 10);
            System.out.println(Arr[i]);
        }

        // 문제 5번

        int[] hundred = new int[100];

        for(int i =0; i < hundred.length; i++){

            hundred[i] = i + 1;

            if( hundred[i] % 3 == 0){
                System.out.println(hundred[i]);
            }
        }

        // 문제 6번 

        //내풀이

        int[] save = new int[100];

        for(int i =0; i < save.length; i++){

            save[i] = i;

            if( save[i] % 3 == 0){
                System.out.println(save[i]);
            }

        // 강사님 풀이
        // int cnt = 0;
        // int[] save = new int[100];

        // for(int i =1; i < save.length; i++){

        //     if( i % 3 == 0){
        //         save[cnt] = i;
        //         System.out.println(save[cnt++]);
        //     }
        // }

        // 문제 7번 

        int k, randNum, count = 0;    // randNum 랜덤번호를 할당받기 위함 count 중복검토
        int[] checkDup = new int[9];

        for(k = 0; k < 9; k++) {
            checkDup[k] = 0;
        }

        System.out.println("A조 입니다.");

        for(k = 1; ;) {
            randNum = (int)(Math.random() * 9) + 1; 
            if(checkDup[randNum - 1] != 0)
                continue;

            count++;

            checkDup[randNum - 1] = 1;  
            // 중복이라면 randNum은 1이 되고 
            // continue때문에 재할당을 받게됨
            System.out.printf("%d 번 = %d\n", k++, randNum);

            if(count == 9) {
                break;
            }
        }

    }
}
}
