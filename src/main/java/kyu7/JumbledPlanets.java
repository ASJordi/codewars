package kyu7;

import java.util.Map;
import static java.util.Map.entry;

public class JumbledPlanets {

    private final Map<String, Integer> map = Map.ofEntries(
            entry("Asteroid", 0),
            entry("Pluto", 1),
            entry("Mercury", 2),
            entry("Mars", 3),
            entry("Venus", 4),
            entry("Earth", 5),
            entry("Neptune", 6),
            entry("Uranus", 7),
            entry("Saturn", 8),
            entry("Jupiter", 9)
    );

    public char[] annotate(String[] celestialBodies) {

        if (celestialBodies.length == 0) return new char[0];

        char[] result = new char[celestialBodies.length - 1];

        for (int i = 1; i < celestialBodies.length; i++) {
            var current = map.get(celestialBodies[i]);
            var left = map.get(celestialBodies[i - 1]);

            if (current > left) result[i - 1] = '>';
            else if (current < left) result[i - 1] = '<';
            else result[i - 1] = '=';
        }

        return result;
    }

}
