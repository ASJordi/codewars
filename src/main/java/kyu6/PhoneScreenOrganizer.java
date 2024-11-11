package kyu6;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PhoneScreenOrganizer {

    public static Object[] moveOver(Object[] a) {
        List<Object> list = new LinkedList<>(Arrays.asList(a));
        while (list.contains(null)){
            int index = list.indexOf(null);
            list.remove(null);
            if (list.isEmpty()) return new Object[0];
            Object[] values = getLastItem(list);
            list.add(index, values[0]);
            list.remove((int) values[1] + 1);
        }

        return list.toArray();
    }

    public static Object[] getLastItem(List<Object> list) {
        Object[] result = {-1, -1};

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) != null) {
                result[0] = list.get(i);
                result[1] = i;
                break;
            }
        }

        return result;
    }

}
