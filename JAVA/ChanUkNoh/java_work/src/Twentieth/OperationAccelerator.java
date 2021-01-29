package Twentieth;

public class OperationAccelerator {
    final int ONE = 1;

    private int dataStart;
    private int dataEnd;
    private int numOfData;
    private int maxThreadNum;

    public OperationAccelerator(int start, int end, int maxThreadNum) {
        dataStart = start;
        dataEnd = end;

        this.maxThreadNum = maxThreadNum;

        numOfData = end - start + ONE;
    }
}
