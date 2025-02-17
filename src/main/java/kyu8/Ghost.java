package kyu8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ghost {

    private final List<String> colors = new ArrayList<>(Arrays.asList("white", "yellow", "purple", "red"));
    private final Random r = new Random();

    public Ghost() {
    }

    public String getColor() {

        return colors.get(r.nextInt(4));
    }

}
