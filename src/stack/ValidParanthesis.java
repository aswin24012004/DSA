package stack;

import java.util.Stack;

public class ValidParanthesis {
    static void main() {
        String string = "([])";
        System.out.println(isValid(string));
    }

    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()) {
            if (ch == '(') stack.push(')');
            else if (ch == '{') stack.push('}');
            else if (ch == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != ch) return false;
        }
        return true;
    }
}
