package kyu7;

import java.util.List;

public class DescribeAList {

    public static String describeList(final List list) {
        return list.size() == 0 ? "empty" : list.size() == 1 ? "singleton" : "longer";
    }

}
