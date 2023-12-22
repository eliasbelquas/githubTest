import java.util.Arrays;
import java.util.Random;

public class SLList {
    static class Node {
        Node next;
        int data;
    }

    Node head, tail;
    int listSize;

    public SLList() {
        listSize = 0;
    }

    public SLList(int n) {
        Random rand = new Random();
        for (int i = 0; i<n; i++){
            this.add(rand.nextInt(n*2));
        }
        System.out.println(Arrays.toString(this.toArray()));
    }

    public void add(int x) {
        Node u = new Node();
        u.data = x;

        if (this.listSize == 0) {
            head = u;
        }
        else {
            tail.next = u;
        }

        tail = u;
        this.listSize++;
    }

    public int secondLast(){
        Node u = head;
        while (u.next != null) {
            if (u.next == tail) {
                return u.data;
            }
            u = u.next;
        }
        return u.data;
    }

    public int[] toArray() {
        int[] SLLarray = new int[this.listSize];
        Node u = head;
        int i = 0;
        while (u.next != null) {
            SLLarray[i] = u.data;
            u = u.next;
            i++;
        }
        return SLLarray;
    }
}
