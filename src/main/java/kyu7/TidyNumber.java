package kyu7;

public class TidyNumber {

    public static boolean tidyNumber(int number) {
        String[] nums = String.valueOf(number).split("");
        int n = Integer.parseInt(nums[0]);

        for (String num : nums) {
            if (n <= Integer.parseInt(num)) n = Integer.parseInt(num);
            else return false;
        }

        return true;
    }

}
