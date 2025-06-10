package kyu7;

public class PushAndBuildOneTwoThree {

    int data;
    PushAndBuildOneTwoThree next = null;

    PushAndBuildOneTwoThree(final int data) {
        this.data = data;
    }

    public static PushAndBuildOneTwoThree push(final PushAndBuildOneTwoThree head, final int data) {
        final PushAndBuildOneTwoThree newNode = new PushAndBuildOneTwoThree(data);
        newNode.next = head;
        return newNode;
    }

    public static PushAndBuildOneTwoThree buildOneTwoThree() {
        return push(push(push(null, 3), 2), 1);
    }

}
