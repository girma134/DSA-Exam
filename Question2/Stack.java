package Question2;
public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack overflow. Cannot push element.");
            return;
        }
        top++;
        stackArray[top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow. Cannot pop element.");
            return -1;
        }
        int value = stackArray[top];
        top--;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No top element.");
            return -1;
        }
        return stackArray[top];
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5); // Create a stack with maximum size 5
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popping elements:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
