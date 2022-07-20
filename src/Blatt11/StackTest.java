package Blatt11;

public class StackTest {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(15);
        stack.push(22);
        stack.printStack();
        System.out.println();
        for(int i = 0; i < 10; i++){
            int value = (int)(Math.random() * 100);
            stack.push(value);
        }
        System.out.println();
        stack.printStack();
        System.out.println();
        System.out.println(stack.size() + "\n");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop() + "\n");
        System.out.println(stack.size());
        System.out.println();
        stack.printStack();
        System.out.println();
        for(int i = 0; i < 10; i++){
            System.out.println(stack.pop());
        }
    }
    
}
