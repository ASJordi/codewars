package kyu7;

public class ConvertALinkedListToAString {

    public static String stringify(Node list) {
        StringBuilder res = new StringBuilder();
        Node current = list;

        while (current != null) {
            res.append(current.getData()).append(" -> ");
            current = current.getNext();
        }

        res.append("null");

        return res.toString();
    }

    static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }
    }

}
