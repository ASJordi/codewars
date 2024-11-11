package kyu7;

import java.util.HashMap;

public class FourSeven {

    public static int fourSeven(int n){
        HashMap<Integer, Integer> nums = new HashMap<>();
        nums.put(7, 4);
        nums.put(4, 7);
        return  nums.getOrDefault(n, 0);
    }

}
