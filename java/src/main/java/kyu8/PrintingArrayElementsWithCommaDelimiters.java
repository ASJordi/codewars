package kyu8;

public class PrintingArrayElementsWithCommaDelimiters {

    public static String printArray(Object array[]) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                res.append(array[i]);
                continue;
            }
            res.append(array[i]).append(",");
        }

        return res.toString();
//        return Arrays.stream(array).map(Object::toString).collect(Collectors.joining(","));
    }

}
