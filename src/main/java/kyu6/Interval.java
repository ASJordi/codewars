package kyu6;

import java.util.stream.IntStream;

public class Interval {

    public static int[] Interval(int[] arr, String str) {
        if (arr.length == 0 || str.isBlank()) return new int[]{};
        String cLeft = Character.toString(str.charAt(0));
        String cRight = Character.toString(str.charAt(str.length() - 1));

        str = str.replace("(", "")
                .replace(")", "")
                .replace("[", "")
                .replace("]", "");

        String[] numbers = str.split(",");
        int n1 = Integer.parseInt(numbers[0]);
        int n2 = Integer.parseInt(numbers[1]);

        if (cLeft.equals("(") && cRight.equals(")"))
            return IntStream.of(arr).filter(i -> i > n1 && i < n2).sorted().toArray();
        if (cLeft.equals("[") && cRight.equals("]"))
            return IntStream.of(arr).filter(i -> i >= n1 && i <= n2).sorted().toArray();
        if (cLeft.equals("(") && cRight.equals("]"))
            return IntStream.of(arr).filter(i -> i > n1 && i <= n2).sorted().toArray();
        if (cLeft.equals("[") && cRight.equals(")"))
            return IntStream.of(arr).filter(i -> i >= n1 && i < n2).sorted().toArray();

        return new int[]{};
    }

}
