package kyu8;

public class FindTheFirstNonConsecutiveNumber {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};

        for (int i = 0; i < array.length + 1; i++) {
            if (i  == array.length - 1) System.out.println("null");
            int current = array[i];
            int next = array[i + 1];

            if (next - current != 1) {
                System.out.println(next);
                break;
            }
        }
    }

    public static Integer find(final int[] array) {

        if (array.length < 2) return null;

        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            int prev = array[i + 1];

            if (current - prev != 1) return prev;
        }

        return null;

    }

}
