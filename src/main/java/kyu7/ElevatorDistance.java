package kyu7;

public class ElevatorDistance {

    public static int elevatorDistance(int[] arr) {
        int distance = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            distance += Math.abs(arr[i] - arr[i + 1]);
        }

        return distance;
    }

}
