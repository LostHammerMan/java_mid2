package sec9.test.stack.ex1;

import java.util.Stack;

public class SimpleHistoryTest {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("youbute.com");
        stack.push("google.com");
        stack.push("facebook.com");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
