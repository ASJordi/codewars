package kyu7;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

enum Color {
    RED, GREEN, BLUE, YELLOW, ORANGE, PURPLE, WHITE, BLACK
}

interface MysteryColorAnalyzer {
    /**
     * This method will determine how many distinct colors are in the given list
     *
     * <p>
     * Colors are defined via the {@link Color} enum.
     * </p>
     *
     * @param mysteryColors list of colors from which to determine the number of distinct colors
     * @return number of distinct colors
     */
    int numberOfDistinctColors(List<Color> mysteryColors);

    /**
     * This method will count how often a specific color is in the given list
     *
     * <p>
     * Colors are defined via the {@link Color} enum.
     * </p>
     *
     * @param mysteryColors list of colors from which to determine the count of a specific color
     * @param color         color to count
     * @return number of occurrence of the color in the list
     */
    int colorOccurrence(List<Color> mysteryColors, Color color);
}

public class MysteryColorAnalyzerImpl implements MysteryColorAnalyzer {
    @Override
    public int numberOfDistinctColors(List<Color> mysteryColors) {
        return new HashSet<>(mysteryColors).size();
    }

    @Override
    public int colorOccurrence(List<Color> mysteryColors, Color color) {
        return Collections.frequency(mysteryColors, color);
    }
}
