import java.util.Stack;

public class SortStack {

    // Step 1: Sort the stack using recursion
    public static void sortStack(Stack<Integer> stack) {

        // Base case: stack empty or one element
        if (stack.isEmpty()) return;

        // Step 2: Remove top element
        int top = stack.pop();

        // Step 3: Sort remaining stack recursively
        sortStack(stack);

        // Step 4: Insert top back in correct position
        insertSorted(stack, top);
    }

    // Insert element in correct sorted position
    public static void insertSorted(Stack<Integer> stack, int element) {

        // Base case: stack empty OR top is smaller than element
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        // Remove top (it is greater than element)
        int top = stack.pop();

        // Recurse to find correct position
        insertSorted(stack, element);

        // Put top back
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);  // bottom
        stack.push(3);
        stack.push(1);
        stack.push(4);  // top

        System.out.println("Before: " + stack);  // [2, 3, 1, 4]
        sortStack(stack);
        System.out.println("After:  " + stack);  // [1, 2, 3, 4]
        // top = 4 (greatest) ✅
    }
}