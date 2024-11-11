package kyu7;

public class ReverseTheBitsInAnInteger {

    public static int reverse_bits(int n){
        String nBinary = Integer.toBinaryString(n);
        StringBuilder reverseNum = new StringBuilder();
        reverseNum.append(nBinary);
        reverseNum.reverse();
        return Integer.parseInt(reverseNum.toString(), 2);
//        return parseInt(new StringBuilder(toBinaryString(n)).reverse() + "", 2);
    }
}
