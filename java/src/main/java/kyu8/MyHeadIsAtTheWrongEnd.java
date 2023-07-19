package kyu8;

public class MyHeadIsAtTheWrongEnd {

    public static String[] fixTheMeerkat(String[] arr) {
        String[] temp = arr.clone();
        arr[0] = temp[temp.length - 1];
        arr[arr.length - 1] = temp[0];
        return arr;
//        return new String[] {arr[2], arr[1], arr[0]};
    }

}
