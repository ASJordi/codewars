package kyu8;

public class SaleHotdogs {

    public static int saleHotdogs(final int n) {

        return n < 5 ? 100 * n : n >= 5 && n < 10 ? 95 * n : 90 * n;
        // return ( n < 5 ? 100 : n >= 5 && n < 10 ? 95 : 90 ) * n;

    }

}
