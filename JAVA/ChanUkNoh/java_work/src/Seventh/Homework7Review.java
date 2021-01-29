package Seventh;

class RandomAlloc {
    int[] employee;
    final int DUPLICATE = 0;
    final int NONDUPLICATE = 1;

    public void prepareArray(int num) {
        employee = new int[num];
    }

    public void setRandomNumber(final int ORDER) {


        int[] dupCheck = new int[employee.length];

        for (int i = 0; i < employee.length; i++) {
            dupCheck[i] = 0;
        }

        boolean finish = false;
        int cnt = 0;

        for (int i = 0;;) {
            if (finish) break;

            switch (ORDER) {
                case DUPLICATE:
                    cnt++;
                    if (cnt == 20) finish = true;

                    employee[i] = (int)(Math.random() * 20) + 1;
                    i++;
                    break;

                case NONDUPLICATE:
                    cnt++;
                    if (cnt == 20) break;

                    int randNum = (int)(Math.random() * 20) + 1;

                    if (dupCheck[randNum - 1] != 0) continue;

                    employee[i] = randNum;
                    dupCheck[randNum - 1] = 1;

                    break;

                default:
                    System.out.println("잘못된 요청입니다.");
                    break;
            }
        }
    }
}

public class Homework7Review {
    public static void main(String[] args) {

        RandomAlloc ra = new RandomAlloc();

        ra.prepareArray(20);
        ra.setRandomNumber(ra.DUPLICATE);
    }
}
