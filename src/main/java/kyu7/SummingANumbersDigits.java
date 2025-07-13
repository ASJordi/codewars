package kyu7;

public class SummingANumbersDigits {

    public static int sumDigits(int number){
        return String.valueOf(Math.abs(number)).chars().map(Character::getNumericValue).reduce(0, Integer::sum);
    }

}
