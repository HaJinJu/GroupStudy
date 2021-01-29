package SeventhHomeWork;

class Lotto {
    int[] staff;
    int[] noduplicate;
    int cnt, cn;
    int[] LOTTO;


    public void setStaff(int num) {
        int i;
        staff = new int[num];

        for (i = 0; i < num; i++) {
            staff[i] = (int) (Math.random() * 25 + 1);
            System.out.printf("직원[%d] = %d\n", i, staff[i]);
        }
        //this.staff= staff;


    }


    public void setNoduplicate(int num) {
        int i, randNum;
        noduplicate = new int[num];
        for (i = 0; i < num; i++) {
            noduplicate[i] = 0;
        }
        //staff = new int[num];
        for (i = 1; ; ) {
            randNum = (int) (Math.random() * num) + 1;
            if (noduplicate[randNum - 1] != 0)
                continue;
            cnt++;
            noduplicate[randNum - 1] = 1;
            System.out.printf("%d번 직원 = %d\n", i++, randNum);
            if (cnt == num) {
                break;
            }


        }
        //this.noduplicate = noduplicate;
    }


    public void setLOTTO(int num2) {
        int ii, randNum2;
        LOTTO = new int[num2];
        for (ii = 0; ii < num2; ii++) {
            LOTTO[ii] = 0;
        }


        for (ii = 1; ; ) {
            randNum2 = (int) (Math.random() * num2) + 1;

            if (LOTTO[randNum2 - 1] != 0)
                continue;


            cn++;
            LOTTO[randNum2 - 1] = 1;


            if (randNum2 % 6 == 0) {
                System.out.printf("%d번 직원 = %d 당첨된 번호입니다 축하합니다\n", ii++, randNum2);

            } else {
                System.out.printf("%d번 직원 = %d\n", ii++, randNum2, "아쉽습니다. 다음에 재도전해주세요!");
                //System.out.println("아쉽습니다. 다음에 재도전해주세요!");
            }

            if (cn == num2) {
                System.out.println("cnt" + cn);
                break;
            }


            //this.noduplicate = noduplicate;
        }

    }
}
