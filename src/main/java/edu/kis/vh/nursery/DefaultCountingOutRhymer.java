package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int SIZE = 12;

	private static final int START = -1;

	private int[] numbers = new int[SIZE];

    public int index = START;

    public void countIn(int in) {
        if (!isFull())
            numbers[++index] = in;
    }

    public boolean callCheck() {
        return index == START;
    }

    public boolean isFull() {
        return index == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return START;
        return numbers[index];
    }

    public int countOut() {
        if (callCheck())
            return START;
        return numbers[index--];
    }

}
