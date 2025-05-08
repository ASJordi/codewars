package kyu7;

public class LinkedListsAppend {

    int data;
    LinkedListsAppend next = null;

    LinkedListsAppend(final int data) {
        this.data = data;
    }

    public LinkedListsAppend(int data, LinkedListsAppend next) {
        this.data = data;
        this.next = next;
    }

    public static LinkedListsAppend append(LinkedListsAppend listA, LinkedListsAppend listB) {
        if (listA == null && listB == null) return null;
        if (listA == null) return listB;
        if (listB == null) return listA;

        return new LinkedListsAppend(listA.data, append(listA.next, listB));
    }

}
