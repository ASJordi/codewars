package kyu7;

public class SwapPairsInArray {

    public Object[][][] swapp(Object[][] input) {
        Object[][] out = new Object[input.length][];

        for (int i = 0; i < input.length; i++) {
            out[i] = input[i].clone();
        }

        for (Object[] o : out) {
            var temp = o[0];
            o[0] = o[1];
            o[1] = temp;
        }

        return new Object[][][]{input, out};
    }

}
