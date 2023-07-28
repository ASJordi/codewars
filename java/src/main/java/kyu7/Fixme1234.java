package kyu7;

import java.util.*;

public class Fixme1234 {

    private static final Map<String, MyNumber> cache = new HashMap<>();

    enum MyNumber {
        ONE(1, "one", "ichi", "un"),
        TWO(2, "two", "ni", "deux"),
        THREE(3, "three", "san", "trois"),
        FOUR(4, "four", "shi", "quatre")
        ;

        private final int val;

        MyNumber(int val, String ...names) {
            this.val = val;
            for (final String n : names) cache.put(n, this);
        }

        public int intValue() {
            return this.val;
        }

    }

    static MyNumber e = MyNumber.ONE;

    static MyNumber getNumber(final String name) {
        return cache.get(name);
    }

}
