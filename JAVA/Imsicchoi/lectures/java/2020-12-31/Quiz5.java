    public class Quiz5 {
        public static void main(String[] args) {
            final int TARGET = 13;
            final int ALREADY = 2;
            int Loop = 0;
            int first = 1, second = 1, res = 0;

            while (Loop < TARGET - ALREADY) {
                res = first + second;

//          first second res
//            1     1     2
//            1     2     3
//            2     3     5
//            3     5     8


//            2는 왜 빼나요?
//            첫번째 항 + 두번째 항 = 결과


                first = second;
                second = res;
                Loop++;
            }


            System.out.println("13번쨰 항은 : " + res);


        }

    }

