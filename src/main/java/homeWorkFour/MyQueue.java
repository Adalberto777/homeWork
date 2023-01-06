package homeWorkFour;

import java.util.LinkedList;

public class MyQueue {
    private static LinkedList<String> queue = new LinkedList<>();
    public static void main(String[] args) {
        add("hi");
        System.out.println(top());
        System.out.println(remove());
    }

    private static String remove() {
        return queue.removeFirst();
    }

    private static String top() {
        return queue.getFirst();
    }

    private static boolean add(String str){
        return queue.add(str);
    }
}
