package kyu7;

import java.util.*;

public class UltimateArrayReverser {

    public static String[] reverse(String[] a) {
	String[] res = new String[a.length];
	List<String> list = new ArrayList<>();

	for (String w : a) list.add(new StringBuilder(w).reverse().toString());

	Collections.reverse(list);
	String word = String.join("", list);
	int c = 0;

	for (int i = 0; i < a.length; i++) {
	    int len = a[i].length();
	    String newWord = word.substring(c, len + c);
	    res[i] = newWord;
	    c += len;
	}

	return res;
    }

}
