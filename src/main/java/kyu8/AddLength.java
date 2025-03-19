package kyu8;

public class AddLength {

    public static String[] addLength(String str) {
        var arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + " " + arr[i].length();
        }

        return arr;
    }

}
