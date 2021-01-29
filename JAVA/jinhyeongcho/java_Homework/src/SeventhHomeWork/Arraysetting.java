package SeventhHomeWork;

class Arraysetting {

    int[] employee;


    public void prepareArray() {//배열크기 랜덤
        int randNum = (int) (Math.random() * 11) + 5;
        employee = new int[randNum];
    }


    public void setRandomarray() {
        //배열에 대입하는 값 랜덤
        for (int i = 0; i < employee.length; i++) {
            employee[i] = ((int) (Math.random() * 10) + 3) * 55;
        }

    }

    public int getArrayEvenNumberCount() {
        int cnt = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] % 2 == 0) {
                cnt++;
            }
        }
        return cnt;
    }

    public void printArray() {
        int cnt = 1;

        for (int i = 0; i < employee.length; i++) {
            System.out.printf("%5d", employee[i]);
            //System.out.printf("%3d", i);

            if (cnt % 5 == 0) {
                System.out.println("");
            }
            cnt++;
        }
    }


}
