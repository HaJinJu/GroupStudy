public class PrintNum {
    int startNum, endNum;

    public PrintNum(int startNum, int endNum) {
        this.startNum = startNum;
        this.endNum = endNum;
    }

    public void printSeries() {
        for(int i = startNum; i <= endNum; i++) {
            System.out.printf("%d ~ %d 까지 출력한다.", startNum, endNum);
            System.out.printf("%d ", i);
        }
    }
}
