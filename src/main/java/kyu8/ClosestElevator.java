package kyu8;

public class ClosestElevator {

    public static String call(int left, int right, int call) {
        return Math.abs(left - call) < Math.abs(right - call) ? "left" : "right";
    }

}
