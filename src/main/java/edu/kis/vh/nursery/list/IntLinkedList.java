package edu.kis.vh.nursery.list;

/**
 * A stack implemented as a doubly linked list.
 * Stack's top is contained in the last node of the said list.
 *
 * @see #lastNode
 * @see #size
 **/
public class IntLinkedList {

    /**
     * Last node of the list. Top of the stack.
     */
    private Node lastNode;

    /**
     * Size of the list.
     */
    private int size;

    /**
     * Adds a new node with the value i and adds it to the list.
     *
     * @param i The value of a newly created node.
     **/
    public void push(int i) {
        if (lastNode == null)
            lastNode = new Node(i);
        else {
            lastNode.setNext(new Node(i));
            lastNode.getNext().setPrev(lastNode);
            lastNode = lastNode.getNext();
        }
    }

    /**
     * Checks if the list is empty.
     *
     * @return TRUE when list is empty, FALSE otherwise.
     **/
    public boolean isEmpty() {
        return lastNode == null;
    }

    /**
     * Checks if the list is full.
     *
     * @return FALSE no matter of the list state.
     **/
    public boolean isFull() {
        return false;
    }

    /**
     * Returns the value at the end of the list, without removing the node from the list.
     *
     * @return Value -1 if the list is empty, the last node's value otherwise.
     **/
    public int top() {
        if (isEmpty())
            return -1;
        return lastNode.getValue();
    }

    /**
     * Returns the value at the end of the list, while removing the node from the list.
     *
     * @return Value -1 if the list is empty, the last node's value otherwise.
     **/
    public int pop() {
        if (isEmpty())
            return -1;
        int ret = lastNode.getValue();
        lastNode = lastNode.getPrev();
        return ret;
    }

    /**
     * Node class used in the {@link IntLinkedList}
     *
     * @see #value
     * @see #prev
     * @see #next
     **/
    private class Node {

        /**
         * The value of the node.
         */
        private int value;

        /**
         * Link to the previous node.
         */
        private Node prev;

        /**
         * Link to the next node.
         */
        private Node next;

        public Node(int i) {
            value = i;
        }

        /**
         * Returns the value of the node.
         *
         * @return Value of the node.
         **/
        public int getValue() {
            return value;
        }

        /**
         * Gets the link to the previous node.
         *
         * @return Previous node.
         **/
        public Node getPrev() {
            return prev;
        }

        /**
         * Sets the link to the previous node.
         *
         * @param prev Node to be set as a previous node.
         **/
        public void setPrev(Node prev) {
            this.prev = prev;
        }

        /**
         * Gets the link to the next node.
         *
         * @return Next node.
         **/
        public Node getNext() {
            return next;
        }

        /**
         * Sets the link to the next node.
         *
         * @param next Node to be set as a next node.
         **/
        public void setNext(Node next) {
            this.next = next;
        }
    }
}
