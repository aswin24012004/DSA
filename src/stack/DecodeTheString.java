package stack;

import java.util.Stack;

public class DecodeTheString {
    static void main() {
        String string = "3[a2[e]]";
        System.out.println(string);
        System.out.println(decodeIt(string));
    }

    static String decodeIt(String s) {
        Stack<String> stack = new Stack<>();
        for (char ch: s.toCharArray()) {
            if(ch != ']') {
                stack.push(String.valueOf(ch));
            } else {
                StringBuilder temp = new StringBuilder();
                while (!stack.peek().equals("[")) {
                    temp.insert(0,stack.pop());
                }
                stack.pop();

                StringBuilder num = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
                    num.insert(0,stack.pop());
                }

                StringBuilder sb = new StringBuilder(
                        temp.toString().repeat(Integer.parseInt(num.toString())));
                stack.push(String.valueOf(sb));

//                stack.push(String.valueOf(temp.toString().repeat(Integer.parseInt(num.toString()))));
            }
        }
        StringBuilder result = new StringBuilder();
        for (String str: stack) {
            result.append(str);
        }
        return result.toString();
    }
}
