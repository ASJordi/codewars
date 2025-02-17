package kyu7;

public class DontGiveMeFive {

    public static int dontGiveMeFive(int start, int end) {
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (!String.valueOf(i).contains("5")) count++;
        }

        return count;
//        return IntStream.range(start, end + 1).filter(i -> !String.valueOf(i).contains("5")).toArray().length;
    }

}
