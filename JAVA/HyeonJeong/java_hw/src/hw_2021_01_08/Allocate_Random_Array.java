package hw_2021_01_08;

public class Allocate_Random_Array {
    final int RANGE_ARRAY = 6;
    final int BIAS_ARRAY = 5;

    final int RANGE_VALUE = 101;
    final int BIAS_VALUE = 10;

    int number_of_random;
    int[] random_array;
    int[] index_array;

    int random_pick;

    public Allocate_Random_Array() {
        number_of_random = (int)(Math.random() * RANGE_ARRAY) + BIAS_ARRAY;

        random_array = new int[number_of_random];
        index_array = new int[number_of_random];
    }

    public void allocate_random_number_to_array() {
        for(int i = 0; i < random_array.length; i++) {
            random_array[i] = (int)(Math.random() * RANGE_VALUE) + BIAS_VALUE;
            index_array[i] = i; // index_array[i]가 왜 i가 되는가??
            //
        }
    }

    public void delete_random_number_value() {
        random_pick = (int)(Math.random() * number_of_random);

        System.out.println("지워진 값 = " + random_array[random_pick]);

        random_array[random_pick] = -1; // -1을 왜하는거지?
    }

    public void print_random_array() {
        int count = 1;

        for(int i = 0; i < random_array.length; i++) {
            if(random_array[i] == -1) {
                // 프린트할때 제외하려고 -1을 사용한건가?
                continue;
            }
            System.out.printf("%4d", random_array[i]);

            if(count % 5 == 0) {
                System.out.println("");
            }
            count++;
        }
        System.out.println("");
    }
}
