package lecture09.section09.DataStructures;

import java.util.Stack;

// Stack means LIFO - LAST IN FIRST OUT.
public class StackDataStructure {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // push method is for adding to stack.
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Stack original " + stack);
        // peek just look at top of stack
        System.out.println(". peek --> " + stack.peek());

        // for removing top of stack use method .pop also return the top element.
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("Stack after .pop " + stack);
    }
}
