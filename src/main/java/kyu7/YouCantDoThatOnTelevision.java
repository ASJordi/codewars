package kyu7;

import java.util.Arrays;
import java.util.List;

public class YouCantDoThatOnTelevision {

    public static String bucketOf(String said) {
        List<String> waterList = Arrays.asList(
                "water", "waters", "watered", "watering", "wet", "wets", "wetted", "wetting", "wash", "washes", "washed", "washing"
        );
        boolean isWater = false;
        boolean isSlime = false;
        said = said.toLowerCase();

        for (var word : waterList) {
            if (said.contains(word)) {
                isWater = true;
                break;
            }
        }

        if (said.contains("i don't know") || said.contains("slime")) isSlime = true;

        return (isWater && isSlime) ? "sludge" :
                isWater ? "water" :
                        isSlime ? "slime" :
                                "air";
    }

}
