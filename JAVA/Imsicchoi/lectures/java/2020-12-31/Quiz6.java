public class Quiz6 {
    public static void main(String[] args) {
//        - 규칙
//첫번쨰 항 + 세번쨰 항 = 네번째
//두번쨰 항 + 네번째 항 = 다섯번째
        final int TARGET = 20;
        final int ALREADY = 3;
        int loop = 0;
        int first = 1, second = 1,  third = 3 ,res = 0;

        while (loop < TARGET - ALREADY) {
           res = first + third;
           third = res;

            loop++;
//        first    secoend    res
//          1         1         2
//          1          2        3
//          3          1        4
//          4          1        5
//          5          3        8
//          8          4        12
//          first = res
//                res = first + second;

//          //
//
//

            {
                first = res;
                    res= first + second;

                    loop++;}
                System.out.println("20번쨰 항은 :" + res);
            }
        }

    }

