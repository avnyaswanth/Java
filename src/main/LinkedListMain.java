package main;

public class LinkedListMain {

    ListImpl head = null;

    void insert(ListImpl l) {
        if(head == null)
        {
            head = l;
        }
        else {
            ListImpl temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = l;
        }
    }

    void print() {
        ListImpl temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListMain listMain = new LinkedListMain();
        for(int i=0;i<5;++i) {
            ListImpl l1 = new ListImpl(i, null);
            listMain.insert(l1);
        }
        listMain.print();
    }
}

