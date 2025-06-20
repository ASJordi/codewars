package kyu7;

public class RunningOutOfSpace {

    public static String[] spacey(String[] array) {
        StringBuilder sb = new StringBuilder();
        String[] result = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            result[i] = sb.toString();
        }

        return result;
    }

}
