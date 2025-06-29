package kyu7;

import java.util.*;

public class StatusArrays {

    public static int[] status(int[] nums){
        List<Status> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            var n = nums[i];
            var e = (int) Arrays.stream(nums).filter(x -> x < n).count();
            list.add(new Status(n, i + e, i));
        }

        list.sort((a, b) -> a.status == b.status ? a.i - b.i : a.status - b.status);

        return list.stream().mapToInt(s -> s.n).toArray();
    }

    private record Status(int n, int status, int i) {}

}
