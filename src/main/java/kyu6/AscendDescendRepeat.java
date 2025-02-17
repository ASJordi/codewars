package kyu6;

public class AscendDescendRepeat {

    public static String ascendDescend(int length, int minimum, int maximum) {
        StringBuilder s = new StringBuilder();

        for (int i = minimum; i <= maximum; i++) s.append(i);
        for (int i = maximum - 1; i > minimum; i--) s.append(i);

        if (s.length() == 0) return s.toString();

        s = new StringBuilder(s.toString().repeat(length / s.length() + 1));

        return s.substring(0, length);
//        String s = IntStream.range(minimum, maximum + 1).mapToObj(i -> i + "").collect(joining())
//                + IntStream.range(minimum + 1, maximum).boxed().sorted(reverseOrder()).map(i -> i + "").collect(joining());
//
//        return s.isEmpty() ? s : s.repeat(length / s.length() + 1).substring(0, length);
    }

}
