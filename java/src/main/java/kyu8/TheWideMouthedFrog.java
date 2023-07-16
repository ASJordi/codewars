package kyu8;

import java.util.Objects;

public class TheWideMouthedFrog {

    public static String mouthSize(String animal) {

        return Objects.equals(animal.toLowerCase(), "alligator") ? "small" : "wide";

    }

}
