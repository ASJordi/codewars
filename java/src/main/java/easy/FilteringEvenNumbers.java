package easy;

import java.util.List;

public class FilteringEvenNumbers {

    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {

        listOfNumbers.removeIf(num -> num % 2 == 0);
        return listOfNumbers;

    }

}
