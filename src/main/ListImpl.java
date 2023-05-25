package main;

public class ListImpl {
    public int data;
    public ListImpl next;

    public ListImpl(int data, ListImpl next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListImpl getNext() {
        return next;
    }

    public void setNext(ListImpl next) {
        this.next = next;
    }
}
