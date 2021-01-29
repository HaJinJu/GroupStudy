package hw_2021_01_07;

public class RandomNumber {
    public final short DUPLICATE = 1;
    public final short NONDUPLICATE = 2;
    public final short JOB_DONE = 1;
    public final short JOB_RUNNING = 0;
    public int[] employee;
    int alpha = 15;
    int randNum;

    public void prepareArray(int num) {
        employee = new int[num];
    }

    public void prepareRandomArray() {
        randNum = (int)(Math.random() * alpha) + alpha;
        employee = new int[randNum];
    }

    public void setRandomArray() {
        for(int i = 0; i < employee.length; i++) {
            randNum = (int)((Math.random() * employee.length) + alpha) * alpha;
            employee[i] = randNum;
        }
    }

    public void setRandomNumber(final int ORDER) {

        int[] dupCheck = new int[employee.length];
        for(int i = 0; i < employee.length; i ++) {
            dupCheck[i] = 0;
        }

        int count = 0;
        short  state = JOB_RUNNING;

        for(int i = 0; ; ) {
            randNum = (int) (Math.random() * employee.length) + alpha;

            if(state == JOB_DONE) {
                break;
            }

            switch (ORDER) {
                case DUPLICATE:
                    count++;

                    if(count == 20) {
                        state = JOB_DONE;
                    }

                    employee[i] = randNum;
                    i++;
                    break;

                case NONDUPLICATE:
                    if(dupCheck[randNum - alpha] != 0) {
                        continue;
                    }

                    employee[count] = randNum;
                    dupCheck[randNum - alpha] = 1;
                    count++;

                    if(count == employee.length){
                        state = JOB_DONE;
                    }
                    break;

                default:
                    System.out.println("중복유무를 확인하세요.");
                    break;
            }
        }
    }

    public void printEmployee() {
        Series series = new Series();

        int count = 1;
        for(int i = 0; i < employee.length; i++) {

            System.out.printf("%5d", employee[i]);
            series.insertNewline(count, 5, 0);
            count++;
        }
    }

    public int getCountEvenNumber() {
        int count = 0;

        for(int i = 0; i < employee.length; i++) {
            if(employee[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public void printPrice() {
        for(int i = 0; i < employee.length; i++) {
            if(employee[i] % 2 == 0) {

                System.out.println("아쉽네요 ~ 다음에 재도전을!");
            } else if(employee[i] % 7 == 0) {

                System.out.println("상금을 1,000만원 받았습니다.");
            } else if(employee[i] % 3 == 0) {

                System.out.println("상금을 100만원 받았습니다.");
            } else {
                System.out.println("아쉽네요 ~ 다음에 재도전을!");
            }
        }
    }
}
