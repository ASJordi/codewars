package kyu6;

import static java.util.stream.Stream.of;

public class ConsonantValue {

    public static int solve(final String s) {
        return of(s.split("[aeiou]")).mapToInt(con -> con.chars().map(c -> c - 96).sum()).max().orElse(0);
    }

}
