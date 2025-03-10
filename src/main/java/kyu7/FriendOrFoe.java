package kyu7;

import java.util.*;

public class FriendOrFoe {

    public static List<String> friend(List<String> x){
        return x.stream().filter(s -> s.length() == 4).toList();
    }

}
