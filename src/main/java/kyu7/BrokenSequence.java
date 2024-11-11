package kyu7;

import java.util.stream.Stream;

public class BrokenSequence {

    public int findMissingNumber(String sequence) {
        var nums = Stream.of(sequence.split(" ")).filter(num -> num.matches("\\d+")).map(Integer::parseInt).toList();

        if (!sequence.replaceAll("[\\d ]", "").isEmpty()) return 1;

        for (int i = 0; i < nums.size(); i++) if (i + 1 != nums.get(i)) return i + 1;

        return 0;
    }

}
