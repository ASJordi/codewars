package kyu7;

public class EvenOrOddWhichIsGreater {

    public static String evenOrOdd(String str) {
        var evenSum = str.chars().map(Character::getNumericValue).filter(digit -> digit % 2 == 0).sum();
        var oddSum = str.chars().map(Character::getNumericValue).filter(digit -> digit % 2 != 0).sum();

        return evenSum > oddSum ? "Even is greater than Odd" :
                evenSum < oddSum ? "Odd is greater than Even" :
                        "Even and Odd are the same";
    }

}
