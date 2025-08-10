package kyu7;

import java.util.*;

public class ValidParentheses {

    public static boolean validParentheses(String parenStr) {	
	Deque<Character> stack = new ArrayDeque<>();
	
	for (char c : parenStr.toCharArray()) {
	    if (c == '(') stack.push(')');
	    else {
		if (stack.isEmpty() || stack.pop() != c) return false;
	    }
	}
	
	return stack.isEmpty();
    }

}
