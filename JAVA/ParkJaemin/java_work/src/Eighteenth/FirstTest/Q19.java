package Eighteenth.FirstTest;

class ranArr {
    int[] numarr = new int[(int) (Math.random() * 10)];
    int[] evenarr = numarr;
    int[] oddarr = numarr;


    public void setNumarr() {
        for (int i = 0; i < numarr.length; i++) {
            numarr[i] = (int) (Math.random() * 10) + 1;
            System.out.printf("arr[%d] = %d%n", i, numarr[i]);
        }


        System.out.println("[짝수 입니다!]");
        for (int i = 0; i < evenarr.length; i++) {
            if (evenarr[i] % 2 == 0) {
                System.out.printf("evenarr [%d] = %d%n", i, evenarr[i]);

            }

        }
        System.out.println("[홀수 입니다!]");
        for (int j = 0; j < oddarr.length; j++) {
            if (oddarr[j] % 2 == 1) {
                System.out.printf("oddarr [%d] = %d%n", j, oddarr[j]);
            }
        }
    }

}


public class Q19 {
    public static void main(String[] args) {
        ranArr ran = new ranArr();

        ran.setNumarr();


    }
}
