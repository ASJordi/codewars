package kyu7;

public class PreviousMultipleOfThree { // Previous multiple of three

    public static Integer prevMultOfThree(int n) {
        while (n % 3 != 0) {
            String temp = String.valueOf(n);
            temp = temp.substring(0, temp.length() - 1);
            if (temp.isBlank()) return null;
            n = Integer.parseInt(temp);
        }

        return n;
    }

}
