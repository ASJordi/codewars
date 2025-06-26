package kyu7;

import java.util.*;
import java.util.stream.Collectors;

public class SillyAddition {

    public static int add(int num1, int num2) {
		Deque<Integer> stackA = addToStack(num1);
		Deque<Integer> stackB = addToStack(num2);
		List<Integer> list = new ArrayList<>();
		int size = Math.min(stackA.size(), stackB.size());

		for (int i = 0; i < size; i++) {
			var a = stackA.pop();
			var b = stackB.pop();
			list.add(a + b);
		}

		if (!stackA.isEmpty()) addToList(stackA, list);
		if (!stackB.isEmpty()) addToList(stackB, list);
		Collections.reverse(list);

		var str = list.stream().map(String::valueOf).collect(Collectors.joining());

		return Integer.parseInt(str);
    }

    private static Deque<Integer> addToStack(int n) {
		Deque<Integer> stack = new LinkedList<>();

		for (char c : String.valueOf(n).toCharArray()) {
			stack.push(Character.getNumericValue(c));
		}

		return stack;
    }

    private static void addToList(Deque<Integer> stack, List<Integer> list) {
		while (!stack.isEmpty()) {
			list.add(stack.pop());
		}
    }

}
