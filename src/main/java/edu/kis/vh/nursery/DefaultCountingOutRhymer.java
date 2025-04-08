package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int MAX_SIZE = 12;
    private static final int DEFAULT_VALUE = -1;
	  private static final int INITIAL = -1;

    public int getIndex() {
        return index;
    }

	  private final int[] numbers = new int[MAX_SIZE];

    private int index = INITIAL;

    public void countIn(int in) {
        if (!isFull())
            numbers[++index] = in;
    }

    public boolean callCheck() {
        return index == INITIAL;
    }

    public boolean isFull() {
        return index == MAX_SIZE-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[index];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[index--];
    }

}
