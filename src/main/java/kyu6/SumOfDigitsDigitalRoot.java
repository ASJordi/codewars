package kyu6;

public class SumOfDigitsDigitalRoot {

    public static int digital_root(int n) {

        int root = 0;

        while (n > 0 || root > 9) {
            if (n == 0) {
                n = root;
                root = 0;
            }

            root += n % 10;
            n /= 10;
        }

        return root;
        // return (n != 0 && n%9 == 0) ? 9 : n % 9;

    }

}
