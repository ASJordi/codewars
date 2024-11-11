package kyu7;

public class EliminateTheIntrudersBitManipulation {

    public static long eliminateUnsetBits(String number) {
        number = number.replace("0", "");
        return number.isEmpty() ? 0 : Long.parseLong(number, 2);
    }

}
