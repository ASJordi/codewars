package kyu7;

public class LinkedListsGetNthNode {

    public int data;
    public LinkedListsGetNthNode next = null;

    public static int getNth(LinkedListsGetNthNode n, int index) throws Exception {
        int pos = 0;
        LinkedListsGetNthNode current = n;

        while (current != null && pos <= index) {
            if (pos == index) return current.data;
            pos++;
            current = current.next;
        }

        throw new Exception("Index out of bounds");
    }

}
