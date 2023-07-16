package kyu8;

public class ConvertNumberToReversedArrayOfDigits {

    public static int[] digitize(long n) {

        StringBuilder s = new StringBuilder(String.valueOf(n));
        String number = s.reverse().toString();

        int[] nums = new int[number.length()];

        for (int i = 0; i < number.length(); i++) {
            nums[i] = Integer.parseInt(Character.toString(number.charAt(i)));
        }

        return nums;

//        return new StringBuilder().append(n)
//                .reverse()
//                .chars()
//                .map(Character::getNumericValue)
//                .toArray();

    }

}
