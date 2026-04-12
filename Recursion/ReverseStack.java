import java.util.Stack;

public class ReverseStack {

    // Step 1: Reverse stack using recursion
    public static void reverseStack(Stack<Integer> stack) {

        // Base case: empty or one element
        if (stack.isEmpty()) return;

        // Step 2: Remove top element
        int top = stack.pop();

        // Step 3: Reverse remaining stack
        reverseStack(stack);

        // Step 4: Insert top at bottom
        insertAtBottom(stack, top);
    }

    // Insert element at the very bottom of stack
    public static void insertAtBottom(Stack<Integer> stack, int element) {

        // Base case: stack empty → push at bottom
        if (stack.isEmpty()) {
            stack.push(element);
            return;
        }

        // Remove top
        int top = stack.pop();

        // Recurse deeper toward bottom
        insertAtBottom(stack, element);

        // Put top back
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);  // bottom
        stack.push(1);
        stack.push(3);
        stack.push(2);  // top

        System.out.println("Before: " + stack);  // [4, 1, 3, 2]
        reverseStack(stack);
        System.out.println("After:  " + stack);  // [2, 3, 1, 4]
    }
}