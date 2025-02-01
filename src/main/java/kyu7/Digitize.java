package kyu7;

public class Digitize {

    public static int[] digitize(int n) {
        String[] arr = String.valueOf(n).split("");
        int[] nums = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }

        return nums;
        // return Integer.toString(n).chars().map(Character::getNumericValue).toArray();
    }

}
