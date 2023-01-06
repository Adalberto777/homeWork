package homeWorkFour;

import java.util.Arrays;
import java.util.LinkedList;

import static java.util.Arrays.*;

public class MyStack {
    private static LinkedList<String> stack = new LinkedList<>();

    public static void main(String[] args) {
        push("hi");
        System.out.println(peek());
        System.out.println(pop());
    }

    private static String pop() {
        return stack.removeLast();
    }

    private static String peek() {
        return stack.getLast();
    }

    private static void push(String str) {

        stack.push(str);
    }
}
