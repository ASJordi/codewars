package kyu8;

public class DoIGetABonus {

    public static String bonusTime(final int salary, final boolean bonus) {
        return bonus ? "£" + salary * 10 : "£" + salary;
    }

}
