package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;
    private int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int showTop() {
        if (isEmpty())
            return -1;
        return last.value;
    }

    public int popAndShowLast() {
        if (isEmpty())
            return -1;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

    public Node getLast() {
        return last;
    }

    public int getI() {
        return i;
    }
}
