package collections.deque;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * this interface implements collection interface
 */

public class DoubleQueueExample {


    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();

        stack.push("one");
        stack.push("2");
        stack.push("3");

        int size = stack.size() - 1;
        while (size >= 0){
            System.out.println(stack.pop());
            size--;
        }
    }


}
