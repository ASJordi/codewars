package kyu7;

public class ExcelSheetColumnNumbers {

    public static long titleToNumber(String title) {
        long result = 0;

        for (char c : title.toCharArray()) result = result * 26 + (c - 'A' + 1);

        return result;
    }

}
