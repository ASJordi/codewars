package kyu7;

import java.util.Arrays;

public class SortTheGiftCode {

    public String sortGiftCode(String code) {
        char[] codeArr = code.toCharArray();
        Arrays.sort(codeArr);
        return new String(codeArr);
    }

}
