package kyu7;

public class FunWithListsLength {

    static int length(Node head) {
        if (head == null) return 0;
        return length(head.next) + 1;
    }

    class Node {
        public Object data;
        public Node next;


        Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }

        Node(Object data) {
            this(data, null);
        }
    }

}
