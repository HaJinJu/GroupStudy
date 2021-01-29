package JAVA_2021_01_07_Seventh;

public class Homework04_Q1 {
    public static void main(String[] args) {
        final int FIXVALUE = 3;

        double[] testArr = new double[FIXVALUE];
        float[] testArr2 = new float[FIXVALUE];

        for(int i = 0; i < FIXVALUE; i++) {
            testArr[i] = Math.random();
            System.out.println(testArr[i]);
        }

        for(int i = 0; i < FIXVALUE; i++) {
            testArr2[i] = (float)(Math.random());
            System.out.println(testArr2[i]);
        }
    }
}
