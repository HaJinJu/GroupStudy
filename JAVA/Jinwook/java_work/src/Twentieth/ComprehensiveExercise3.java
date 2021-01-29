package Twentieth;
class Ex3{
    final int ONE = 1;

    private int dataStart;
    private int dataEnd;
    private int numOfData;
    private int maxThreadNum;

    public Ex3(int start, int end, int maxThreadNum) {

}
    public class SpeedThread extends Ex3 implements Runnable {
        private int localStart;
        private int localEnd;
        private int threadId;

        public SpeedThread(int start, int end, int maxThreadNum, int id) {
            super(start, end, maxThreadNum);
            for(int i = start; i <= end; i++){

            }


        }

        @Override
        public void run() {
        }

    }

    // 3. 1~1000000까지의 숫자에 아래 연산을 고속으로 적용해보도록 한다
    //    1~1000000의 숫자는 표기상 n0~ n10000000으로 표기하겠다.
    //    nX*0.0001 + n(X-1) * 0.0002 + n(X + 2) * 0.0003 ......
    //    위 계싼의 결과를 빠르게 계산할 수 있도록 프로그래밍 해보자

    // for(int i = 1; i < 1000000; i++){
    //     1 * 0.0001 + 1-1
    public static void main(String[] args) {


    }
}