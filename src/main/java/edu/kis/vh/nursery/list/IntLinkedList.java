package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int EMPTY_LINKED_LIST = -1;
	Node lastNode;
    int size;

    public void push(int i) {
        if (lastNode == null)
            lastNode = new Node(i);
        else {
            lastNode.next = new Node(i);
            lastNode.next.prev = lastNode;
            lastNode = lastNode.next;
        }
    }

    public boolean isEmpty() {
        return lastNode == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return EMPTY_LINKED_LIST;
        return lastNode.value;
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_LINKED_LIST;
        int ret = lastNode.value;
        lastNode = lastNode.prev;
        return ret;
    }

}
