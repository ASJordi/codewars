package kyu7;

import java.util.List;

public class OnesAndZeros {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        StringBuilder num = new StringBuilder();
        binary.forEach(num::append);
        return Integer.parseInt(num.toString(), 2);
    }

}
