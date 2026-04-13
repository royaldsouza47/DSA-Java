import java.util.Stack;
public class SortStack {

    public static void sortstack(Stack<Integer> stack){
if(stack.isEmpty()) return;

int top=stack.pop();
sortstack(stack);
insertSorted(stack, top);

    }
    public static void insertSorted(Stack<Integer> stack, int element){
        if(stack.isEmpty()||stack.peek()<=element){
            stack.push(element);
            return;
        }
        int top=stack.pop();
        insertSorted(stack, element);
        stack.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(2);
        stack.push(1);
        stack.push(3);
        stack.push(4);
        System.out.println("Before"+ stack);
        sortstack(stack);
        System.out.println("After"+ stack);
    }
}