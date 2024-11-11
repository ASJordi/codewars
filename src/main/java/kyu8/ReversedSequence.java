package kyu8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReversedSequence {

    public static int[] reverse(int n){

        List<Integer> list = IntStream.rangeClosed(1, n)
                .boxed()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toCollection(ArrayList::new));

        return list.stream().mapToInt(Integer::intValue).toArray();

        /*
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = n; i >= 1; i--) {
            list.add(i);
        }

        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
         */
    }

}
